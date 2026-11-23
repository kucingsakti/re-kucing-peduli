package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.exceptions.BackendException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p064g5.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final p132n6.c _subscriptionBackend;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.loginUser(null, this);
        }
    }

    public c(p132n6.c cVar, p162q6.b bVar, com.onesignal.user.internal.properties.b bVar2, com.onesignal.core.internal.config.b bVar3) {
        p210v8.i.f(cVar, "_subscriptionBackend");
        p210v8.i.f(bVar, "_identityModelStore");
        p210v8.i.f(bVar2, "_propertiesModelStore");
        p210v8.i.f(bVar3, "_configModelStore");
        this._subscriptionBackend = cVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._configModelStore = bVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object loginUser(p173r6.e eVar, p123m8.d<? super p064g5.a> dVar) {
        b bVar;
        c cVar;
        p173r6.e eVar2;
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
        Object identityFromSubscription = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        try {
            if (i11 == 0) {
                J7.a.v(identityFromSubscription);
                if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUseIdentityVerification()) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                p132n6.c cVar2 = this._subscriptionBackend;
                String appId = eVar.getAppId();
                String subscriptionId = eVar.getSubscriptionId();
                bVar.L$0 = this;
                bVar.L$1 = eVar;
                bVar.label = 1;
                identityFromSubscription = cVar2.getIdentityFromSubscription(appId, subscriptionId, bVar);
                if (identityFromSubscription == aVar) {
                    return aVar;
                }
                cVar = this;
                eVar2 = eVar;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar2 = (p173r6.e) bVar.L$1;
                cVar = (c) bVar.L$0;
                J7.a.v(identityFromSubscription);
            }
            String str = (String) ((Map) identityFromSubscription).getOrDefault("onesignal_id", null);
            if (str == null) {
                com.onesignal.debug.internal.logging.b.warn$default("Subscription " + eVar2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(eVar2.getOnesignalId(), str);
            p162q6.a aVar2 = (p162q6.a) cVar._identityModelStore.getModel();
            com.onesignal.user.internal.properties.a aVar3 = (com.onesignal.user.internal.properties.a) cVar._propertiesModelStore.getModel();
            if (p210v8.i.a(aVar2.getOnesignalId(), eVar2.getOnesignalId())) {
                com.onesignal.common.modeling.i.setStringProperty$default(aVar2, "onesignal_id", str, "HYDRATE", false, 8, null);
            }
            if (p210v8.i.a(aVar3.getOnesignalId(), eVar2.getOnesignalId())) {
                com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignalId", str, "HYDRATE", false, 8, null);
            }
            return new p064g5.a(p064g5.b.SUCCESS, linkedHashMap, com.bumptech.glide.d.u(new p173r6.h(eVar2.getAppId(), str)), null, 8, null);
        } catch (BackendException e10) {
            int i12 = d.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()];
            if (i12 != 1) {
                return i12 != 2 ? new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null) : new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
            }
            return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, null, 14, null);
        }
    }

    @Override // p064g5.d
    public Object execute(List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        p064g5.g gVar = (p064g5.g) p086i8.k.T(list);
        if (gVar instanceof p173r6.e) {
            return loginUser((p173r6.e) gVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return com.bumptech.glide.d.u(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
