package com.onesignal.location.internal;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import X4.f;
import com.onesignal.common.AndroidUtils;
import p076h8.m;
import p144o8.g;
import p210v8.i;
import p210v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements B5.a, p100k5.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final D5.a _capturer;
    private boolean _isShared;
    private final G5.a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final p093j5.b _prefs;

    /* JADX INFO: renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0052a extends g implements p200u8.b {
        int label;

        public C0052a(p123m8.d<? super C0052a> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return a.this.new C0052a(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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
            return ((C0052a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    public static final class c extends g implements p200u8.c {
        final /* synthetic */ q $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, p123m8.d<? super c> dVar) {
            super(2, dVar);
            this.$result = qVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new c(this.$result, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<Object> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L58;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.location.internal.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends g implements p200u8.b {
        int label;

        public d(p123m8.d<? super d> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return a.this.new d(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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
            return ((d) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class e extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f fVar, D5.a aVar, G5.a aVar2, com.onesignal.location.internal.permissions.b bVar, p093j5.b bVar2) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_capturer");
        i.f(aVar2, "_locationController");
        i.f(bVar, "_locationPermissionController");
        i.f(bVar2, "_prefs");
        this._applicationService = fVar;
        this._capturer = aVar;
        this._locationController = aVar2;
        this._locationPermissionController = bVar;
        this._prefs = bVar2;
        Boolean bool = bVar2.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        i.c(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z6, p123m8.d<? super Boolean> dVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z6, "android.permission.ACCESS_BACKGROUND_LOCATION", dVar) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startGetLocation(p123m8.d<? super m> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objStart = eVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = eVar.label;
        m mVar = m.a;
        try {
            if (i11 == 0) {
                J7.a.v(objStart);
                if (!isShared()) {
                    return mVar;
                }
                com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                G5.a aVar2 = this._locationController;
                eVar.label = 1;
                objStart = aVar2.start(eVar);
                if (objStart == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(objStart);
            }
            if (!((Boolean) objStart).booleanValue()) {
                com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", th);
        }
        return mVar;
    }

    @Override // B5.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z6) {
        if (z6) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0052a(null), 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // B5.a
    public Object requestPermission(p123m8.d<? super Boolean> dVar) {
        b bVar;
        q qVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "LocationManager.requestPermission()");
            q qVar2 = new q();
            U9.d dVar2 = I.a;
            O9.d dVar3 = n.a;
            c cVar = new c(qVar2, null);
            bVar.L$0 = qVar2;
            bVar.label = 1;
            if (AbstractC0342z.w(dVar3, cVar, bVar) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) bVar.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    @Override // B5.a
    public void setShared(boolean z6) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z6 + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z6));
        this._isShared = z6;
        onLocationPermissionChanged(z6);
    }

    @Override // p100k5.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (F5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(null), 1, null);
        }
    }
}
