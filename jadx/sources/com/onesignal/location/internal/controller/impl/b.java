package com.onesignal.location.internal.controller.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.TimeoutCancellationException;
import p076h8.m;
import p210v8.i;
import p210v8.k;
import p210v8.q;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements G5.a {
    private final X4.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final V9.a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0053b implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private final b _parent;

        /* JADX INFO: renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends p144o8.g implements p200u8.b {
            int label;

            public a(p123m8.d<? super a> dVar) {
                super(1, dVar);
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(p123m8.d<?> dVar) {
                return C0053b.this.new a(dVar);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    b bVar = C0053b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == aVar) {
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
                return ((a) create(dVar)).invokeSuspend(m.a);
            }
        }

        public C0053b(b bVar) {
            i.f(bVar, "_parent");
            this._parent = bVar;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            i.f(connectionResult, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(null), 1, null);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i10) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10, null, 2, null);
        }
    }

    public static final class c extends HandlerThread {
        private Handler mHandler;

        public c() {
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

    public static final class d implements LocationListener, X4.e, Closeable {
        private final X4.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(X4.f fVar, b bVar, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g gVar) throws Exception {
            i.f(fVar, "_applicationService");
            i.f(bVar, "_parent");
            i.f(googleApiClient, "googleApiClient");
            i.f(gVar, "_fusedLocationApiWrapper");
            this._applicationService = fVar;
            this._parent = bVar;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = gVar;
            if (!googleApiClient.a()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.a()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            i.e(priority, "locationRequest");
            gVar.requestLocationUpdates(googleApiClient, priority, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // X4.e
        public void onFocus(boolean z6) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            i.f(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // X4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class e extends k implements p200u8.b {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((G5.b) obj);
            return m.a;
        }

        public final void invoke(G5.b bVar) {
            i.f(bVar, "it");
            bVar.onLocationChanged(this.$location);
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ t $self;
        final /* synthetic */ q $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final class a extends k implements p200u8.b {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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

        /* JADX INFO: renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0054b extends p144o8.g implements p200u8.c {
            final /* synthetic */ t $self;
            final /* synthetic */ q $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0054b(t tVar, b bVar, q qVar, p123m8.d<? super C0054b> dVar) {
                super(2, dVar);
                this.$self = tVar;
                this.this$0 = bVar;
                this.$wasSuccessful = qVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0054b(this.$self, this.this$0, this.$wasSuccessful, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0054b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                C0053b c0053b = new C0053b((b) this.$self.f15466s);
                GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.this$0._applicationService.getAppContext());
                Api api = LocationServices.API;
                Preconditions.j(api, "Api must not be null");
                builder.f7868g.put(api, null);
                Preconditions.j(api.a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                builder.f7863b.addAll(list);
                builder.a.addAll(list);
                builder.f7872l.add(c0053b);
                builder.f7873m.add(c0053b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                Preconditions.j(mHandler, "Handler must not be null");
                builder.f7870i = mHandler.getLooper();
                Preconditions.a("must call addApi() to add at least one API", !builder.f7868g.isEmpty());
                SignInOptions signInOptions = SignInOptions.f9365s;
                p212w.e eVar = builder.f7868g;
                Api api2 = zad.f9380b;
                if (eVar.containsKey(api2)) {
                    signInOptions = (SignInOptions) eVar.get(api2);
                }
                ClientSettings clientSettings = new ClientSettings(null, builder.a, builder.f7866e, builder.f7864c, builder.f7865d, signInOptions);
                Map map = clientSettings.f8078d;
                p212w.e eVar2 = new p212w.e(0);
                p212w.e eVar3 = new p212w.e(0);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((p212w.b) builder.f7868g.keySet()).iterator();
                while (true) {
                    p212w.a aVar = (p212w.a) it;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Api api3 = (Api) aVar.next();
                    Object obj2 = builder.f7868g.get(api3);
                    boolean z6 = map.get(api3) != null;
                    eVar2.put(api3, Boolean.valueOf(z6));
                    zat zatVar = new zat(api3, z6);
                    arrayList.add(zatVar);
                    Api.AbstractClientBuilder abstractClientBuilder = api3.a;
                    Preconditions.i(abstractClientBuilder);
                    ClientSettings clientSettings2 = clientSettings;
                    Api.Client clientA = abstractClientBuilder.a(builder.f7867f, builder.f7870i, clientSettings2, obj2, zatVar, zatVar);
                    eVar3.put(api3.f7847b, clientA);
                    clientA.getClass();
                    clientSettings = clientSettings2;
                }
                zabe zabeVar = new zabe(builder.f7867f, new ReentrantLock(), builder.f7870i, clientSettings, builder.j, builder.f7871k, eVar2, builder.f7872l, builder.f7873m, eVar3, builder.f7869h, zabe.b(eVar3.values(), true), arrayList);
                Set set = GoogleApiClient.f7862s;
                synchronized (set) {
                    set.add(zabeVar);
                }
                if (builder.f7869h >= 0) {
                    throw null;
                }
                com.onesignal.location.internal.controller.impl.c cVar = new com.onesignal.location.internal.controller.impl.c(zabeVar);
                ConnectionResult connectionResultBlockingConnect = cVar.blockingConnect();
                if (connectionResultBlockingConnect == null || !connectionResultBlockingConnect.T()) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(connectionResultBlockingConnect != null ? new Integer(connectionResultBlockingConnect.f7822t) : null);
                    sb.append(") ");
                    sb.append(connectionResultBlockingConnect != null ? connectionResultBlockingConnect.f7824v : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(zabeVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f15466s).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f15466s, cVar.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f15466s).googleApiClient = cVar;
                    this.$wasSuccessful.f15463s = true;
                }
                return m.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q qVar, t tVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$wasSuccessful = qVar;
            this.$self = tVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new g(this.$wasSuccessful, this.$self, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((g) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            q qVar;
            t tVar;
            V9.d dVar;
            V9.a aVar;
            V9.a aVar2;
            Throwable th;
            V9.a aVar3;
            V9.a aVar4;
            p134n8.a aVar5 = p134n8.a.f13404s;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    J7.a.v(obj);
                    V9.a aVar6 = b.this.startStopMutex;
                    bVar = b.this;
                    qVar = this.$wasSuccessful;
                    tVar = this.$self;
                    this.L$0 = aVar6;
                    this.L$1 = bVar;
                    this.L$2 = qVar;
                    this.L$3 = tVar;
                    this.label = 1;
                    dVar = (V9.d) aVar6;
                    if (dVar.d(this) != aVar5) {
                    }
                    aVar = dVar;
                    return aVar5;
                }
                if (i10 == 1) {
                    tVar = (t) this.L$3;
                    qVar = (q) this.L$2;
                    bVar = (b) this.L$1;
                    V9.a aVar7 = (V9.a) this.L$0;
                    J7.a.v(obj);
                    aVar = aVar7;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (V9.a) this.L$0;
                    try {
                        try {
                            J7.a.v(obj);
                            aVar3 = aVar2;
                        } catch (TimeoutCancellationException unused) {
                            com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                            aVar3 = aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ((V9.d) aVar2).e(null);
                        throw th;
                    }
                }
                aVar4 = aVar3;
                ((V9.d) aVar4).e(null);
                return m.a;
                aVar = dVar;
                if (bVar.googleApiClient != null) {
                    if (bVar.lastLocation != null) {
                        bVar.event.fire(new a(bVar));
                    } else {
                        Location lastLocation = bVar.getLastLocation();
                        if (lastLocation != null) {
                            bVar.setLocationAndFire(lastLocation);
                        }
                    }
                    qVar.f15463s = true;
                    aVar4 = aVar;
                } else {
                    try {
                        long api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                        C0054b c0054b = new C0054b(tVar, bVar, qVar, null);
                        this.L$0 = aVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (AbstractC0342z.x(api_fallback_time, c0054b, this) != aVar5) {
                            aVar3 = aVar;
                            aVar4 = aVar3;
                        }
                        aVar = dVar;
                        return aVar5;
                    } catch (TimeoutCancellationException unused2) {
                        aVar2 = aVar;
                        com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                        aVar3 = aVar2;
                    }
                }
                ((V9.d) aVar4).e(null);
                return m.a;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                ((V9.d) aVar2).e(null);
                throw th;
            }
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(X4.f fVar, com.onesignal.location.internal.controller.impl.g gVar) {
        i.f(fVar, "_applicationService");
        i.f(gVar, "_fusedLocationApiWrapper");
        this._applicationService = fVar;
        this._fusedLocationApiWrapper = gVar;
        this.locationHandlerThread = new c();
        this.startStopMutex = V9.e.a();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // G5.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // G5.a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.onesignal.location.internal.controller.impl.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // G5.a
    public Object start(p123m8.d<? super Boolean> dVar) {
        f fVar;
        q qVar;
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
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = fVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            t tVar = new t();
            tVar.f15466s = this;
            q qVar2 = new q();
            U9.c cVar = I.f3415c;
            g gVar = new g(qVar2, tVar, null);
            fVar.L$0 = qVar2;
            fVar.label = 1;
            if (AbstractC0342z.w(cVar, gVar, fVar) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) fVar.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // G5.a
    public Object stop(p123m8.d<? super m> dVar) {
        h hVar;
        b bVar;
        V9.a aVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = hVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            V9.a aVar3 = this.startStopMutex;
            hVar.L$0 = this;
            hVar.L$1 = aVar3;
            hVar.label = 1;
            V9.d dVar2 = (V9.d) aVar3;
            if (dVar2.d(hVar) == aVar2) {
                return aVar2;
            }
            bVar = this;
            aVar = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (V9.a) hVar.L$1;
            bVar = (b) hVar.L$0;
            J7.a.v(obj);
        }
        try {
            d dVar3 = bVar.locationUpdateListener;
            if (dVar3 != null) {
                dVar3.close();
                bVar.locationUpdateListener = null;
            }
            com.onesignal.location.internal.controller.impl.c cVar = bVar.googleApiClient;
            if (cVar != null) {
                cVar.disconnect();
                bVar.googleApiClient = null;
            }
            bVar.lastLocation = null;
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
