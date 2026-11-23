package com.onesignal.location.internal.controller.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import p076h8.m;
import p210v8.i;
import p210v8.k;
import p210v8.q;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements G5.a {
    private final X4.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final V9.a startStopMutex;

    public static final class a extends HandlerThread {
        private Handler mHandler;

        public a() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            i.f(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements X4.e, Closeable {
        private final X4.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d dVar, X4.f fVar, FusedLocationProviderClient fusedLocationProviderClient) {
            i.f(dVar, "_parent");
            i.f(fVar, "_applicationService");
            i.f(fusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = dVar;
            this._applicationService = fVar;
            this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // X4.e
        public void onFocus(boolean z6) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            i.f(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // X4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class c extends p144o8.g implements p200u8.b {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ t $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, t tVar, p123m8.d<? super c> dVar) {
            super(1, dVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = tVar;
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m25invokeSuspend$lambda0(t tVar, t tVar2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.b) tVar.f15466s).wake();
            } else {
                tVar2.f15466s = location;
                ((com.onesignal.common.threading.b) tVar.f15466s).wake();
            }
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        private static final void m26invokeSuspend$lambda1(t tVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.b) tVar.f15466s).wake();
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return new c(this.$locationClient, this.$retVal, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.common.threading.b bVar = new com.onesignal.common.threading.b();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.label = 1;
                if (bVar.waitForWake(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((c) create(dVar)).invokeSuspend(m.a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0055d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0055d(p123m8.d<? super C0055d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        final /* synthetic */ t $self;
        final /* synthetic */ q $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public static final class a extends k implements p200u8.b {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((G5.b) obj);
                return m.a;
            }

            public final void invoke(G5.b bVar) {
                i.f(bVar, "it");
                Location location = this.this$0.lastLocation;
                i.c(location);
                bVar.onLocationChanged(location);
            }
        }

        public static final class b extends k implements p200u8.b {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((G5.b) obj);
                return m.a;
            }

            public final void invoke(G5.b bVar) {
                i.f(bVar, "it");
                Location location = this.this$0.lastLocation;
                i.c(location);
                bVar.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q qVar, t tVar, p123m8.d<? super e> dVar) {
            super(2, dVar);
            this.$wasSuccessful = qVar;
            this.$self = tVar;
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-2$lambda-0, reason: not valid java name */
        private static final void m27invokeSuspend$lambda2$lambda0(t tVar, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.c) tVar.f15466s).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.c) tVar.f15466s).wake(Boolean.TRUE);
            }
        }

        /* JADX INFO: renamed from: invokeSuspend$lambda-2$lambda-1, reason: not valid java name */
        private static final void m28invokeSuspend$lambda2$lambda1(t tVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.c) tVar.f15466s).wake(Boolean.FALSE);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return d.this.new e(this.$wasSuccessful, this.$self, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a4 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:18:0x006e, B:20:0x0074, B:26:0x009e, B:28:0x00a4, B:29:0x00b1, B:25:0x008a), top: B:41:0x006e, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b1 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:18:0x006e, B:20:0x0074, B:26:0x009e, B:28:0x00a4, B:29:0x00b1, B:25:0x008a), top: B:41:0x006e, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:33:0x00eb, B:35:0x00f7), top: B:44:0x0023 }] */
        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            q qVar;
            d dVar;
            t tVar;
            V9.a aVar;
            V9.a aVar2;
            Throwable th;
            Object objWaitForWake;
            t tVar2;
            q qVar2;
            q qVar3;
            d dVar2;
            V9.a aVar3;
            p134n8.a aVar4 = p134n8.a.f13404s;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    J7.a.v(obj);
                    V9.a aVar5 = d.this.startStopMutex;
                    d dVar3 = d.this;
                    q qVar4 = this.$wasSuccessful;
                    t tVar3 = this.$self;
                    this.L$0 = aVar5;
                    this.L$1 = dVar3;
                    this.L$2 = qVar4;
                    this.L$3 = tVar3;
                    this.label = 1;
                    V9.d dVar4 = (V9.d) aVar5;
                    if (dVar4.d(this) != aVar4) {
                        qVar = qVar4;
                        dVar = dVar3;
                        tVar = tVar3;
                        aVar = dVar4;
                    }
                    return aVar4;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar2 = (q) this.L$4;
                    tVar2 = (t) this.L$3;
                    qVar3 = (q) this.L$2;
                    dVar2 = (d) this.L$1;
                    aVar2 = (V9.a) this.L$0;
                    try {
                        J7.a.v(obj);
                        aVar2 = aVar2;
                        qVar2.f15463s = ((Boolean) obj).booleanValue();
                        if (qVar3.f15463s) {
                            dVar2.event.fire(new b(dVar2));
                            d dVar5 = (d) tVar2.f15466s;
                            X4.f fVar = dVar2._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar2.hmsFusedLocationClient;
                            i.c(fusedLocationProviderClient);
                            dVar2.locationUpdateListener = new b(dVar5, fVar, fusedLocationProviderClient);
                        }
                        aVar3 = aVar2;
                        ((V9.d) aVar3).e(null);
                        return m.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((V9.d) aVar2).e(null);
                        throw th;
                    }
                }
                tVar = (t) this.L$3;
                qVar = (q) this.L$2;
                dVar = (d) this.L$1;
                V9.a aVar6 = (V9.a) this.L$0;
                J7.a.v(obj);
                aVar = aVar6;
                if (dVar.hmsFusedLocationClient == null) {
                    try {
                        dVar.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar._applicationService.getAppContext());
                        if (dVar.lastLocation != null) {
                            com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                            FusedLocationProviderClient fusedLocationProviderClient2 = dVar.hmsFusedLocationClient;
                            i.c(fusedLocationProviderClient2);
                            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                            this.L$0 = aVar;
                            this.L$1 = dVar;
                            this.L$2 = qVar;
                            this.L$3 = tVar;
                            this.L$4 = qVar;
                            this.label = 2;
                            objWaitForWake = cVar.waitForWake(this);
                            if (objWaitForWake != aVar4) {
                                aVar2 = aVar;
                                obj = objWaitForWake;
                                tVar2 = tVar;
                                qVar2 = qVar;
                                qVar3 = qVar2;
                                dVar2 = dVar;
                                qVar2.f15463s = ((Boolean) obj).booleanValue();
                                if (qVar3.f15463s) {
                                    dVar2.event.fire(new b(dVar2));
                                    d dVar6 = (d) tVar2.f15466s;
                                    X4.f fVar2 = dVar2._applicationService;
                                    FusedLocationProviderClient fusedLocationProviderClient3 = dVar2.hmsFusedLocationClient;
                                    i.c(fusedLocationProviderClient3);
                                    dVar2.locationUpdateListener = new b(dVar6, fVar2, fusedLocationProviderClient3);
                                }
                                aVar3 = aVar2;
                            }
                            return aVar4;
                        }
                        dVar.event.fire(new a(dVar));
                        aVar3 = aVar;
                    } catch (Exception e10) {
                        com.onesignal.debug.internal.logging.b.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e10, null, 2, null);
                        qVar.f15463s = false;
                        aVar3 = aVar;
                    }
                } else {
                    if (dVar.lastLocation != null) {
                        com.onesignal.common.threading.c cVar2 = new com.onesignal.common.threading.c();
                        FusedLocationProviderClient fusedLocationProviderClient4 = dVar.hmsFusedLocationClient;
                        i.c(fusedLocationProviderClient4);
                        fusedLocationProviderClient4.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                        this.L$0 = aVar;
                        this.L$1 = dVar;
                        this.L$2 = qVar;
                        this.L$3 = tVar;
                        this.L$4 = qVar;
                        this.label = 2;
                        objWaitForWake = cVar2.waitForWake(this);
                        if (objWaitForWake != aVar4) {
                            aVar2 = aVar;
                            obj = objWaitForWake;
                            tVar2 = tVar;
                            qVar2 = qVar;
                            qVar3 = qVar2;
                            dVar2 = dVar;
                            qVar2.f15463s = ((Boolean) obj).booleanValue();
                            if (qVar3.f15463s) {
                                dVar2.event.fire(new b(dVar2));
                                d dVar7 = (d) tVar2.f15466s;
                                X4.f fVar3 = dVar2._applicationService;
                                FusedLocationProviderClient fusedLocationProviderClient5 = dVar2.hmsFusedLocationClient;
                                i.c(fusedLocationProviderClient5);
                                dVar2.locationUpdateListener = new b(dVar7, fVar3, fusedLocationProviderClient5);
                            }
                            aVar3 = aVar2;
                        }
                        return aVar4;
                    }
                    dVar.event.fire(new a(dVar));
                    aVar3 = aVar;
                }
                ((V9.d) aVar3).e(null);
                return m.a;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                ((V9.d) aVar2).e(null);
                throw th;
            }
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(X4.f fVar) {
        i.f(fVar, "_applicationService");
        this._applicationService = fVar;
        this.locationHandlerThread = new a();
        this.startStopMutex = V9.e.a();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // G5.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // G5.a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        t tVar = new t();
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c(fusedLocationProviderClient, tVar, null), 1, null);
        return (Location) tVar.f15466s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // G5.a
    public Object start(p123m8.d<? super Boolean> dVar) {
        C0055d c0055d;
        q qVar;
        if (dVar instanceof C0055d) {
            c0055d = (C0055d) dVar;
            int i10 = c0055d.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0055d.label = i10 - Integer.MIN_VALUE;
            } else {
                c0055d = new C0055d(dVar);
            }
        } else {
            c0055d = new C0055d(dVar);
        }
        Object obj = c0055d.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0055d.label;
        if (i11 == 0) {
            J7.a.v(obj);
            t tVar = new t();
            tVar.f15466s = this;
            q qVar2 = new q();
            U9.c cVar = I.f3415c;
            e eVar = new e(qVar2, tVar, null);
            c0055d.L$0 = qVar2;
            c0055d.label = 1;
            if (AbstractC0342z.w(cVar, eVar, c0055d) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) c0055d.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // G5.a
    public Object stop(p123m8.d<? super m> dVar) {
        f fVar;
        d dVar2;
        V9.a aVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = fVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            V9.a aVar3 = this.startStopMutex;
            fVar.L$0 = this;
            fVar.L$1 = aVar3;
            fVar.label = 1;
            V9.d dVar3 = (V9.d) aVar3;
            if (dVar3.d(fVar) == aVar2) {
                return aVar2;
            }
            dVar2 = this;
            aVar = dVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (V9.a) fVar.L$1;
            dVar2 = (d) fVar.L$0;
            J7.a.v(obj);
        }
        try {
            b bVar = dVar2.locationUpdateListener;
            if (bVar != null) {
                bVar.close();
                dVar2.locationUpdateListener = null;
            }
            if (dVar2.hmsFusedLocationClient != null) {
                dVar2.hmsFusedLocationClient = null;
            }
            dVar2.lastLocation = null;
            return m.a;
        } finally {
            ((V9.d) aVar).e(null);
        }
    }

    @Override // G5.a, com.onesignal.common.events.d
    public void subscribe(G5.b bVar) {
        i.f(bVar, "handler");
        this.event.subscribe(bVar);
    }

    @Override // G5.a, com.onesignal.common.events.d
    public void unsubscribe(G5.b bVar) {
        i.f(bVar, "handler");
        this.event.unsubscribe(bVar);
    }
}
