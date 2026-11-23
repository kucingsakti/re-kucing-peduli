package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.exceptions.BackendException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p173r6.o;
import p173r6.p;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p064g5.d {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final a Companion = new a(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final X4.f _applicationService;
    private final p142o6.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final S4.c _consistencyManager;
    private final p025c5.c _deviceService;
    private final p162q6.b _identityModelStore;
    private final p193t6.a _newRecordState;
    private final p132n6.c _subscriptionBackend;
    private final p208v6.e _subscriptionModelStore;

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
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.createSubscription(null, null, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.deleteSubscription(null, this);
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
            return j.this.transferSubscription(null, this);
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.updateSubscription(null, null, this);
        }
    }

    public j(p132n6.c cVar, p025c5.c cVar2, X4.f fVar, p162q6.b bVar, p208v6.e eVar, com.onesignal.core.internal.config.b bVar2, p142o6.a aVar, p193t6.a aVar2, S4.c cVar3) {
        p210v8.i.f(cVar, "_subscriptionBackend");
        p210v8.i.f(cVar2, "_deviceService");
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(bVar, "_identityModelStore");
        p210v8.i.f(eVar, "_subscriptionModelStore");
        p210v8.i.f(bVar2, "_configModelStore");
        p210v8.i.f(aVar, "_buildUserService");
        p210v8.i.f(aVar2, "_newRecordState");
        p210v8.i.f(cVar3, "_consistencyManager");
        this._subscriptionBackend = cVar;
        this._deviceService = cVar2;
        this._applicationService = fVar;
        this._identityModelStore = bVar;
        this._subscriptionModelStore = eVar;
        this._configModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar3;
    }

    private final p132n6.j convert(p208v6.g gVar) {
        int i10 = k.$EnumSwitchMapping$1[gVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? p132n6.j.Companion.fromDeviceType(this._deviceService.getDeviceType()) : p132n6.j.EMAIL;
        }
        return p132n6.j.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:68:0x0177 A[Catch: BackendException -> 0x0189, TryCatch #5 {BackendException -> 0x0189, blocks: (B:66:0x0173, B:68:0x0177, B:72:0x018c, B:74:0x0196, B:79:0x01b2), top: B:132:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018c A[Catch: BackendException -> 0x0189, TryCatch #5 {BackendException -> 0x0189, blocks: (B:66:0x0173, B:68:0x0177, B:72:0x018c, B:74:0x0196, B:79:0x01b2), top: B:132:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0196 A[Catch: BackendException -> 0x0189, TryCatch #5 {BackendException -> 0x0189, blocks: (B:66:0x0173, B:68:0x0177, B:72:0x018c, B:74:0x0196, B:79:0x01b2), top: B:132:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b2 A[Catch: BackendException -> 0x0189, TRY_LEAVE, TryCatch #5 {BackendException -> 0x0189, blocks: (B:66:0x0173, B:68:0x0177, B:72:0x018c, B:74:0x0196, B:79:0x01b2), top: B:132:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4 A[Catch: BackendException -> 0x01e0, TryCatch #2 {BackendException -> 0x01e0, blocks: (B:82:0x01c5, B:84:0x01d4, B:87:0x01e4, B:89:0x01fa, B:90:0x0205), top: B:126:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01fa A[Catch: BackendException -> 0x01e0, TryCatch #2 {BackendException -> 0x01e0, blocks: (B:82:0x01c5, B:84:0x01d4, B:87:0x01e4, B:89:0x01fa, B:90:0x0205), top: B:126:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c2, code lost:
    
        if (r0.resolveConditionsWithID(Q4.a.ID, r10) == r3) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createSubscription(p173r6.a r28, java.util.List<? extends p064g5.g> r29, p123m8.d<? super p064g5.a> r30) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.j.createSubscription(r6.a, java.util.List, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:41:0x00d0->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object deleteSubscription(p173r6.c cVar, p123m8.d<? super p064g5.a> dVar) {
        c cVar2;
        BackendException backendException;
        j jVar;
        int i10;
        List listC;
        Iterator it;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i11 = cVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.label = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object obj = cVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = cVar2.label;
        if (i12 == 0) {
            J7.a.v(obj);
            try {
                p132n6.c cVar3 = this._subscriptionBackend;
                String appId = cVar.getAppId();
                String subscriptionId = cVar.getSubscriptionId();
                String jwtToken = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
                cVar2.L$0 = this;
                cVar2.L$1 = cVar;
                cVar2.label = 1;
                if (cVar3.deleteSubscription(appId, subscriptionId, jwtToken, cVar2) == aVar) {
                    return aVar;
                }
                jVar = this;
            } catch (BackendException e10) {
                backendException = e10;
                jVar = this;
                i10 = k.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(backendException.getStatusCode()).ordinal()];
                if (i10 != 1) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                }
                if (i10 != 5) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (backendException.getStatusCode() == 404) {
                    listC = p086i8.l.C(cVar.getOnesignalId(), cVar.getSubscriptionId());
                    if (listC instanceof Collection) {
                        it = listC.iterator();
                        while (it.hasNext()) {
                            if (jVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                            }
                        }
                    } else {
                        it = listC.iterator();
                        while (it.hasNext()) {
                            if (jVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                            }
                        }
                    }
                }
                return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (p173r6.c) cVar2.L$1;
            jVar = (j) cVar2.L$0;
            try {
                J7.a.v(obj);
            } catch (BackendException e11) {
                backendException = e11;
                i10 = k.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(backendException.getStatusCode()).ordinal()];
                if (i10 != 1) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                }
                if (i10 != 5) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (backendException.getStatusCode() == 404) {
                    listC = p086i8.l.C(cVar.getOnesignalId(), cVar.getSubscriptionId());
                    if ((listC instanceof Collection) || !listC.isEmpty()) {
                        it = listC.iterator();
                        while (it.hasNext()) {
                            if (jVar._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, backendException.getRetryAfterSeconds(), 6, null);
                            }
                        }
                    }
                }
                return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
            }
        }
        jVar._subscriptionModelStore.remove(cVar.getSubscriptionId(), "HYDRATE");
        return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object transferSubscription(o oVar, p123m8.d<? super p064g5.a> dVar) {
        d dVar2;
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
        d dVar3 = dVar2;
        Object obj = dVar3.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = dVar3.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                p132n6.c cVar = this._subscriptionBackend;
                String appId = oVar.getAppId();
                String subscriptionId = oVar.getSubscriptionId();
                String onesignalId = oVar.getOnesignalId();
                String jwtToken = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
                dVar3.label = 1;
                if (cVar.transferSubscription(appId, subscriptionId, "onesignal_id", onesignalId, jwtToken, dVar3) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e10) {
            return k.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e10.getStatusCode()).ordinal()] == 1 ? new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e10.getRetryAfterSeconds(), 6, null) : new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee A[Catch: BackendException -> 0x005f, TryCatch #0 {BackendException -> 0x005f, blocks: (B:22:0x005a, B:31:0x00e9, B:33:0x00ee, B:36:0x0105), top: B:65:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105 A[Catch: BackendException -> 0x005f, TRY_LEAVE, TryCatch #0 {BackendException -> 0x005f, blocks: (B:22:0x005a, B:31:0x00e9, B:33:0x00ee, B:36:0x0105), top: B:65:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (r0.resolveConditionsWithID(Q4.a.ID, r2) == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSubscription(p173r6.p r22, java.util.List<? extends p064g5.g> r23, p123m8.d<? super p064g5.a> r24) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.j.updateSubscription(r6.p, java.util.List, m8.d):java.lang.Object");
    }

    @Override // p064g5.d
    public Object execute(List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        p064g5.g gVar = (p064g5.g) p086i8.k.T(list);
        if (gVar instanceof p173r6.a) {
            return createSubscription((p173r6.a) gVar, list, dVar);
        }
        List<? extends p064g5.g> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((p064g5.g) it.next()) instanceof p173r6.c) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (obj instanceof p173r6.c) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((p173r6.c) p086i8.k.T(arrayList), dVar);
                }
            }
        }
        if (gVar instanceof p) {
            return updateSubscription((p) gVar, list, dVar);
        }
        if (!(gVar instanceof o)) {
            throw new Exception("Unrecognized operation: " + gVar);
        }
        if (list.size() <= 1) {
            return transferSubscription((o) gVar, dVar);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return p086i8.l.C(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
