package com.onesignal.notifications.internal.registration.impl;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import p076h8.m;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p036d6.b, com.onesignal.notifications.internal.registration.impl.b {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final X4.f _applicationService;
    private final p025c5.c _deviceService;
    private com.onesignal.common.threading.c waiter;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
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
            return f.this.getHMSTokenTask(null, this);
        }
    }

    public static final class c extends p144o8.g implements p200u8.c {
        final /* synthetic */ t $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, f fVar, p123m8.d<? super c> dVar) {
            super(2, dVar);
            this.$pushToken = tVar;
            this.this$0 = fVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new c(this.$pushToken, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            String str;
            t tVar2;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                tVar = this.$pushToken;
                com.onesignal.common.threading.c cVar = this.this$0.waiter;
                if (cVar != null) {
                    this.L$0 = tVar;
                    this.label = 1;
                    Object objWaitForWake = cVar.waitForWake(this);
                    if (objWaitForWake == aVar) {
                        return aVar;
                    }
                    tVar2 = tVar;
                    obj = objWaitForWake;
                } else {
                    str = null;
                }
                tVar.f15466s = str;
                return m.a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar2 = (t) this.L$0;
            J7.a.v(obj);
            t tVar3 = tVar2;
            str = (String) obj;
            tVar = tVar3;
            tVar.f15466s = str;
            return m.a;
        }
    }

    public static final class d extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f.this.registerForPush(this);
        }
    }

    public f(p025c5.c cVar, X4.f fVar) {
        i.f(cVar, "_deviceService");
        i.f(fVar, "_applicationService");
        this._deviceService = cVar;
        this._applicationService = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:15:0x002d, B:33:0x00ae, B:35:0x00b2, B:36:0x00d1, B:16:0x0036, B:17:0x003d, B:18:0x003e, B:20:0x0049, B:23:0x0052, B:25:0x007a, B:28:0x009a, B:11:0x001b), top: B:41:0x0005 }] */
    public final synchronized Object getHMSTokenTask(Context context, p123m8.d<? super p036d6.a> dVar) throws ApiException {
        b bVar;
        t tVar;
        p036d6.a aVar;
        try {
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
            p134n8.a aVar2 = p134n8.a.f13404s;
            int i11 = bVar.label;
            if (i11 == 0) {
                J7.a.v(obj);
                if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                    return new p036d6.a(null, p208v6.f.MISSING_HMS_PUSHKIT_LIBRARY);
                }
                this.waiter = new com.onesignal.common.threading.c();
                String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                t tVar2 = new t();
                String token = hmsInstanceId.getToken(string, "HCM");
                tVar2.f15466s = token;
                if (!TextUtils.isEmpty(token)) {
                    com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) tVar2.f15466s), null, 2, null);
                    return new p036d6.a((String) tVar2.f15466s, p208v6.f.SUBSCRIBED);
                }
                c cVar = new c(tVar2, this, null);
                bVar.L$0 = tVar2;
                bVar.label = 1;
                if (AbstractC0342z.x(30000L, cVar, bVar) == aVar2) {
                    return aVar2;
                }
                tVar = tVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) bVar.L$0;
                J7.a.v(obj);
            }
            if (tVar.f15466s != null) {
                com.onesignal.debug.internal.logging.b.error$default("HMS registered with ID:" + ((String) tVar.f15466s), null, 2, null);
                aVar = new p036d6.a((String) tVar.f15466s, p208v6.f.SUBSCRIBED);
            } else {
                com.onesignal.debug.internal.logging.b.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                aVar = new p036d6.a(null, p208v6.f.HMS_TOKEN_TIMEOUT);
            }
            return aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.b
    public Object fireCallback(String str, p123m8.d<? super m> dVar) {
        com.onesignal.common.threading.c cVar = this.waiter;
        if (cVar != null) {
            cVar.wake(str);
        }
        return m.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.huawei.hms.common.ApiException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p036d6.b
    public Object registerForPush(p123m8.d<? super p036d6.a> dVar) {
        d dVar2;
        p036d6.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object hMSTokenTask = dVar2.result;
        Object obj = p134n8.a.f13404s;
        int i11 = dVar2.label;
        try {
            if (i11 == 0) {
                J7.a.v(hMSTokenTask);
                Context appContext = this._applicationService.getAppContext();
                dVar2.label = 1;
                hMSTokenTask = getHMSTokenTask(appContext, dVar2);
                if (hMSTokenTask == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(hMSTokenTask);
            }
            aVar = (p036d6.a) hMSTokenTask;
        } catch (ApiException e10) {
            com.onesignal.debug.internal.logging.b.error("HMS ApiException getting Huawei push token!", e10);
            aVar = new p036d6.a(null, e10.getStatusCode() == 907135000 ? p208v6.f.HMS_ARGUMENTS_INVALID : p208v6.f.HMS_API_EXCEPTION_OTHER);
        }
        i.c(aVar);
        return aVar;
    }
}
