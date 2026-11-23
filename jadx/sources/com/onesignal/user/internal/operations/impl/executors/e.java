package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.exceptions.BackendException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p086i8.t;
import p086i8.y;
import p086i8.z;
import p173r6.o;
import p173r6.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p064g5.d {
    public static final a Companion = new a(null);
    public static final String LOGIN_USER = "login-user";
    private final X4.f _application;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p025c5.c _deviceService;
    private final p162q6.b _identityModelStore;
    private final com.onesignal.user.internal.operations.impl.executors.a _identityOperationExecutor;
    private final p043e5.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final p208v6.e _subscriptionsModelStore;
    private final p132n6.d _userBackend;

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
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.createUser(null, null, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.loginUser(null, null, this);
        }
    }

    public e(com.onesignal.user.internal.operations.impl.executors.a aVar, X4.f fVar, p025c5.c cVar, p132n6.d dVar, p162q6.b bVar, com.onesignal.user.internal.properties.b bVar2, p208v6.e eVar, com.onesignal.core.internal.config.b bVar3, p043e5.a aVar2) {
        p210v8.i.f(aVar, "_identityOperationExecutor");
        p210v8.i.f(fVar, "_application");
        p210v8.i.f(cVar, "_deviceService");
        p210v8.i.f(dVar, "_userBackend");
        p210v8.i.f(bVar, "_identityModelStore");
        p210v8.i.f(bVar2, "_propertiesModelStore");
        p210v8.i.f(eVar, "_subscriptionsModelStore");
        p210v8.i.f(bVar3, "_configModelStore");
        p210v8.i.f(aVar2, "_languageContext");
        this._identityOperationExecutor = aVar;
        this._application = fVar;
        this._deviceService = cVar;
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._languageContext = aVar2;
    }

    private final Map<String, p132n6.h> createSubscriptionsFromOperation(o oVar, Map<String, p132n6.h> map) {
        LinkedHashMap linkedHashMapC = y.C(map);
        if (!linkedHashMapC.containsKey(oVar.getSubscriptionId())) {
            linkedHashMapC.put(oVar.getSubscriptionId(), new p132n6.h(oVar.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
            return linkedHashMapC;
        }
        String subscriptionId = oVar.getSubscriptionId();
        String subscriptionId2 = oVar.getSubscriptionId();
        p132n6.h hVar = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar);
        p132n6.j type = hVar.getType();
        p132n6.h hVar2 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar2);
        String token = hVar2.getToken();
        p132n6.h hVar3 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar3);
        Boolean enabled = hVar3.getEnabled();
        p132n6.h hVar4 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar4);
        Integer notificationTypes = hVar4.getNotificationTypes();
        p132n6.h hVar5 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar5);
        String sdk = hVar5.getSdk();
        p132n6.h hVar6 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar6);
        String deviceModel = hVar6.getDeviceModel();
        p132n6.h hVar7 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar7);
        String deviceOS = hVar7.getDeviceOS();
        p132n6.h hVar8 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar8);
        Boolean rooted = hVar8.getRooted();
        p132n6.h hVar9 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar9);
        Integer netType = hVar9.getNetType();
        p132n6.h hVar10 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar10);
        String carrier = hVar10.getCarrier();
        p132n6.h hVar11 = map.get(oVar.getSubscriptionId());
        p210v8.i.c(hVar11);
        linkedHashMapC.put(subscriptionId, new p132n6.h(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar11.getAppVersion()));
        return linkedHashMapC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object createUser(p173r6.f fVar, List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        b bVar;
        Map map;
        List list2;
        Map map2;
        p173r6.f fVar2;
        e eVar;
        String str;
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
        b bVar2 = bVar;
        Object obj = bVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar2.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                Map<String, p132n6.h> mapCreateSubscriptionsFromOperation = t.f12329s;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String timeZoneId = com.onesignal.common.k.INSTANCE.getTimeZoneId();
                p210v8.i.c(timeZoneId);
                linkedHashMap.put("timezone_id", timeZoneId);
                linkedHashMap.put("language", this._languageContext.getLanguage());
                if (fVar.getExternalId() != null) {
                    LinkedHashMap linkedHashMapC = y.C(mapCreateSubscriptionsFromOperation);
                    String externalId = fVar.getExternalId();
                    p210v8.i.c(externalId);
                    linkedHashMapC.put("external_id", externalId);
                    map = linkedHashMapC;
                } else {
                    map = mapCreateSubscriptionsFromOperation;
                }
                for (p064g5.g gVar : list) {
                    if (gVar instanceof p173r6.a) {
                        mapCreateSubscriptionsFromOperation = createSubscriptionsFromOperation((p173r6.a) gVar, mapCreateSubscriptionsFromOperation);
                    } else if (gVar instanceof o) {
                        mapCreateSubscriptionsFromOperation = createSubscriptionsFromOperation((o) gVar, mapCreateSubscriptionsFromOperation);
                    } else if (gVar instanceof p) {
                        mapCreateSubscriptionsFromOperation = createSubscriptionsFromOperation((p) gVar, mapCreateSubscriptionsFromOperation);
                    } else {
                        if (!(gVar instanceof p173r6.c)) {
                            throw new Exception("Unrecognized operation: " + gVar);
                        }
                        mapCreateSubscriptionsFromOperation = createSubscriptionsFromOperation((p173r6.c) gVar, mapCreateSubscriptionsFromOperation);
                    }
                }
                List listY = y.y(mapCreateSubscriptionsFromOperation);
                p132n6.d dVar2 = this._userBackend;
                String appId = fVar.getAppId();
                List list3 = listY;
                ArrayList arrayList = new ArrayList(p086i8.m.H(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add((p132n6.h) ((p076h8.f) it.next()).f11790t);
                }
                String jwtToken = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
                bVar2.L$0 = this;
                bVar2.L$1 = fVar;
                bVar2.L$2 = map;
                bVar2.L$3 = listY;
                bVar2.label = 1;
                Object objCreateUser = dVar2.createUser(appId, map, arrayList, linkedHashMap, jwtToken, bVar2);
                if (objCreateUser == aVar) {
                    return aVar;
                }
                list2 = listY;
                obj = objCreateUser;
                map2 = map;
                fVar2 = fVar;
                eVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) bVar2.L$3;
                map2 = (Map) bVar2.L$2;
                fVar2 = (p173r6.f) bVar2.L$1;
                eVar = (e) bVar2.L$0;
                J7.a.v(obj);
            }
            p132n6.a aVar2 = (p132n6.a) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str2 = aVar2.getIdentities().get("onesignal_id");
            p210v8.i.c(str2);
            String str3 = str2;
            linkedHashMap2.put(fVar2.getOnesignalId(), str3);
            p162q6.a aVar3 = (p162q6.a) eVar._identityModelStore.getModel();
            com.onesignal.user.internal.properties.a aVar4 = (com.onesignal.user.internal.properties.a) eVar._propertiesModelStore.getModel();
            if (p210v8.i.a(aVar3.getOnesignalId(), fVar2.getOnesignalId())) {
                str = str3;
                com.onesignal.common.modeling.i.setStringProperty$default(aVar3, "onesignal_id", str, "HYDRATE", false, 8, null);
            } else {
                str = str3;
            }
            if (p210v8.i.a(aVar4.getOnesignalId(), fVar2.getOnesignalId())) {
                com.onesignal.common.modeling.i.setStringProperty$default(aVar4, "onesignalId", str, "HYDRATE", false, 8, null);
            }
            int size = list2.size();
            for (int i12 = 0; i12 < size && i12 < aVar2.getSubscriptions().size(); i12++) {
                p132n6.h hVar = aVar2.getSubscriptions().get(i12);
                Object obj2 = ((p076h8.f) list2.get(i12)).f11789s;
                String id = hVar.getId();
                p210v8.i.c(id);
                linkedHashMap2.put(obj2, id);
                if (p210v8.i.a(((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).getPushSubscriptionId(), ((p076h8.f) list2.get(i12)).f11789s)) {
                    ((com.onesignal.core.internal.config.a) eVar._configModelStore.getModel()).setPushSubscriptionId(hVar.getId());
                }
                p208v6.d dVar3 = (p208v6.d) eVar._subscriptionsModelStore.get((String) ((p076h8.f) list2.get(i12)).f11789s);
                if (dVar3 != null) {
                    com.onesignal.common.modeling.i.setStringProperty$default(dVar3, "id", hVar.getId(), "HYDRATE", false, 8, null);
                }
            }
            return new p064g5.a(p064g5.b.SUCCESS, linkedHashMap2, !map2.isEmpty() ? com.bumptech.glide.d.u(new p173r6.h(fVar2.getAppId(), str)) : null, null, 8, null);
        } catch (BackendException e10) {
            int i13 = f.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()];
            if (i13 != 1) {
                return i13 != 2 ? new p064g5.a(p064g5.b.FAIL_PAUSE_OPREPO, null, null, null, 14, null) : new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
            }
            return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e10.getRetryAfterSeconds(), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object loginUser(p173r6.f fVar, List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        c cVar;
        e eVar;
        String str;
        p173r6.f fVar2 = fVar;
        List<? extends p064g5.g> list2 = list;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objExecute = cVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = cVar.label;
        if (i11 == 0) {
            J7.a.v(objExecute);
            if (fVar2.getExistingOnesignalId() == null || fVar2.getExternalId() == null) {
                cVar.label = 1;
                Object objCreateUser = createUser(fVar2, list2, cVar);
                if (objCreateUser != aVar) {
                    return objCreateUser;
                }
            } else {
                com.onesignal.user.internal.operations.impl.executors.a aVar2 = this._identityOperationExecutor;
                String appId = fVar2.getAppId();
                String existingOnesignalId = fVar2.getExistingOnesignalId();
                p210v8.i.c(existingOnesignalId);
                String externalId = fVar2.getExternalId();
                p210v8.i.c(externalId);
                List<? extends p064g5.g> listU = com.bumptech.glide.d.u(new p173r6.i(appId, existingOnesignalId, "external_id", externalId));
                cVar.L$0 = this;
                cVar.L$1 = fVar2;
                cVar.L$2 = list2;
                cVar.label = 2;
                objExecute = aVar2.execute(listU, cVar);
                if (objExecute != aVar) {
                    eVar = this;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            J7.a.v(objExecute);
            return objExecute;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                J7.a.v(objExecute);
                return objExecute;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objExecute);
            return objExecute;
        }
        List<? extends p064g5.g> list3 = (List) cVar.L$2;
        p173r6.f fVar3 = (p173r6.f) cVar.L$1;
        eVar = (e) cVar.L$0;
        J7.a.v(objExecute);
        list2 = list3;
        fVar2 = fVar3;
        p064g5.a aVar3 = (p064g5.a) objExecute;
        int i12 = f.$EnumSwitchMapping$0[aVar3.getResult().ordinal()];
        if (i12 == 1) {
            String existingOnesignalId2 = fVar2.getExistingOnesignalId();
            p210v8.i.c(existingOnesignalId2);
            if (p210v8.i.a(((p162q6.a) eVar._identityModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                str = existingOnesignalId2;
                com.onesignal.common.modeling.i.setStringProperty$default(eVar._identityModelStore.getModel(), "onesignal_id", str, "HYDRATE", false, 8, null);
            } else {
                str = existingOnesignalId2;
            }
            if (p210v8.i.a(((com.onesignal.user.internal.properties.a) eVar._propertiesModelStore.getModel()).getOnesignalId(), fVar2.getOnesignalId())) {
                String str2 = str;
                com.onesignal.common.modeling.i.setStringProperty$default(eVar._propertiesModelStore.getModel(), "onesignalId", str2, "HYDRATE", false, 8, null);
                str = str2;
            }
            return new p064g5.a(p064g5.b.SUCCESS_STARTING_ONLY, z.t(new p076h8.f(fVar2.getOnesignalId(), str)), null, null, 12, null);
        }
        if (i12 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 3;
            Object objCreateUser2 = eVar.createUser(fVar2, list2, cVar);
            if (objCreateUser2 != aVar) {
                return objCreateUser2;
            }
        } else {
            if (i12 != 3) {
                return i12 != 4 ? new p064g5.a(aVar3.getResult(), null, null, null, 14, null) : new p064g5.a(aVar3.getResult(), null, null, null, 14, null);
            }
            com.onesignal.debug.internal.logging.b.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + fVar2.getExternalId() + '\"', null, 2, null);
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 4;
            Object objCreateUser3 = eVar.createUser(fVar2, list2, cVar);
            if (objCreateUser3 != aVar) {
                return objCreateUser3;
            }
        }
        return aVar;
    }

    @Override // p064g5.d
    public Object execute(List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        com.onesignal.debug.internal.logging.b.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        p064g5.g gVar = (p064g5.g) p086i8.k.T(list);
        if (gVar instanceof p173r6.f) {
            return loginUser((p173r6.f) gVar, p086i8.k.P(list), dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return com.bumptech.glide.d.u(LOGIN_USER);
    }

    private final Map<String, p132n6.h> createSubscriptionsFromOperation(p173r6.a aVar, Map<String, p132n6.h> map) {
        p132n6.j jVarFromDeviceType;
        LinkedHashMap linkedHashMapC = y.C(map);
        int i10 = f.$EnumSwitchMapping$2[aVar.getType().ordinal()];
        if (i10 == 1) {
            jVarFromDeviceType = p132n6.j.SMS;
        } else if (i10 != 2) {
            jVarFromDeviceType = p132n6.j.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            jVarFromDeviceType = p132n6.j.EMAIL;
        }
        p132n6.j jVar = jVarFromDeviceType;
        String subscriptionId = aVar.getSubscriptionId();
        String address = aVar.getAddress();
        Boolean boolValueOf = Boolean.valueOf(aVar.getEnabled());
        Integer numValueOf = Integer.valueOf(aVar.getStatus().getValue());
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean boolValueOf2 = Boolean.valueOf(com.onesignal.common.j.INSTANCE.isRooted());
        com.onesignal.common.c cVar = com.onesignal.common.c.INSTANCE;
        linkedHashMapC.put(subscriptionId, new p132n6.h(null, jVar, address, boolValueOf, numValueOf, com.onesignal.common.h.SDK_VERSION, str, str2, boolValueOf2, cVar.getNetType(this._application.getAppContext()), cVar.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return linkedHashMapC;
    }

    private final Map<String, p132n6.h> createSubscriptionsFromOperation(p pVar, Map<String, p132n6.h> map) {
        LinkedHashMap linkedHashMapC = y.C(map);
        if (linkedHashMapC.containsKey(pVar.getSubscriptionId())) {
            String subscriptionId = pVar.getSubscriptionId();
            p132n6.h hVar = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar);
            String id = hVar.getId();
            p132n6.h hVar2 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar2);
            p132n6.j type = hVar2.getType();
            String address = pVar.getAddress();
            Boolean boolValueOf = Boolean.valueOf(pVar.getEnabled());
            Integer numValueOf = Integer.valueOf(pVar.getStatus().getValue());
            p132n6.h hVar3 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar3);
            String sdk = hVar3.getSdk();
            p132n6.h hVar4 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar4);
            String deviceModel = hVar4.getDeviceModel();
            p132n6.h hVar5 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar5);
            String deviceOS = hVar5.getDeviceOS();
            p132n6.h hVar6 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar6);
            Boolean rooted = hVar6.getRooted();
            p132n6.h hVar7 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar7);
            Integer netType = hVar7.getNetType();
            p132n6.h hVar8 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar8);
            String carrier = hVar8.getCarrier();
            p132n6.h hVar9 = map.get(pVar.getSubscriptionId());
            p210v8.i.c(hVar9);
            linkedHashMapC.put(subscriptionId, new p132n6.h(id, type, address, boolValueOf, numValueOf, sdk, deviceModel, deviceOS, rooted, netType, carrier, hVar9.getAppVersion()));
        }
        return linkedHashMapC;
    }

    private final Map<String, p132n6.h> createSubscriptionsFromOperation(p173r6.c cVar, Map<String, p132n6.h> map) {
        LinkedHashMap linkedHashMapC = y.C(map);
        linkedHashMapC.remove(cVar.getSubscriptionId());
        return linkedHashMapC;
    }
}
