package com.onesignal.notifications.internal.registration.impl;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.amazon.device.messaging.ADM;
import p076h8.m;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p036d6.b, com.onesignal.notifications.internal.registration.impl.b {
    private final X4.f _applicationService;
    private com.onesignal.common.threading.c waiter;

    public static final class a extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.registerForPush(this);
        }
    }

    public static final class b extends p144o8.g implements p200u8.c {
        final /* synthetic */ t $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, c cVar, p123m8.d<? super b> dVar) {
            super(2, dVar);
            this.$registrationId = tVar;
            this.this$0 = cVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new b(this.$registrationId, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
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
                tVar = this.$registrationId;
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

    public c(X4.f fVar) {
        i.f(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.b
    public Object fireCallback(String str, p123m8.d<? super m> dVar) {
        com.onesignal.common.threading.c cVar = this.waiter;
        if (cVar != null) {
            cVar.wake(str);
        }
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p036d6.b
    public Object registerForPush(p123m8.d<? super p036d6.a> dVar) {
        a aVar;
        t tVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            this.waiter = new com.onesignal.common.threading.c();
            ADM adm = new ADM(this._applicationService.getAppContext());
            t tVar2 = new t();
            String registrationId = adm.getRegistrationId();
            tVar2.f15466s = registrationId;
            if (registrationId != null) {
                com.onesignal.debug.internal.logging.b.debug$default("ADM Already registered with ID:" + ((String) tVar2.f15466s), null, 2, null);
                return new p036d6.a((String) tVar2.f15466s, p208v6.f.SUBSCRIBED);
            }
            adm.startRegister();
            b bVar = new b(tVar2, this, null);
            aVar.L$0 = tVar2;
            aVar.label = 1;
            if (AbstractC0342z.x(30000L, bVar, aVar) == aVar2) {
                return aVar2;
            }
            tVar = tVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) aVar.L$0;
            J7.a.v(obj);
        }
        if (tVar.f15466s == null) {
            com.onesignal.debug.internal.logging.b.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
            return new p036d6.a(null, p208v6.f.ERROR);
        }
        com.onesignal.debug.internal.logging.b.error$default("ADM registered with ID:" + ((String) tVar.f15466s), null, 2, null);
        return new p036d6.a((String) tVar.f15466s, p208v6.f.SUBSCRIBED);
    }
}
