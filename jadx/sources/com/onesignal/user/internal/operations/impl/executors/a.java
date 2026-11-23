package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.exceptions.BackendException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p064g5.d {
    public static final C0084a Companion = new C0084a(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final p142o6.a _buildUserService;
    private final p132n6.b _identityBackend;
    private final p162q6.b _identityModelStore;
    private final p193t6.a _newRecordState;

    /* JADX INFO: renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0084a {
        public /* synthetic */ C0084a(p210v8.e eVar) {
            this();
        }

        private C0084a() {
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
            return a.this.execute(null, this);
        }
    }

    public a(p132n6.b bVar, p162q6.b bVar2, p142o6.a aVar, p193t6.a aVar2) {
        p210v8.i.f(bVar, "_identityBackend");
        p210v8.i.f(bVar2, "_identityModelStore");
        p210v8.i.f(aVar, "_buildUserService");
        p210v8.i.f(aVar2, "_newRecordState");
        this._identityBackend = bVar;
        this._identityModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0213  */
    /* JADX WARN: Code duplicated, block: B:102:0x0219  */
    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x0237  */
    /* JADX WARN: Code duplicated, block: B:106:0x0246  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9 A[Catch: BackendException -> 0x02c5, TRY_LEAVE, TryCatch #4 {BackendException -> 0x02c5, blocks: (B:114:0x0290, B:116:0x02a9), top: B:153:0x0290 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x031b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0321  */
    /* JADX WARN: Code duplicated, block: B:139:0x032f  */
    /* JADX WARN: Code duplicated, block: B:140:0x033d  */
    /* JADX WARN: Code duplicated, block: B:141:0x034c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174 A[Catch: BackendException -> 0x0195, TRY_LEAVE, TryCatch #3 {BackendException -> 0x0195, blocks: (B:70:0x015b, B:72:0x0174), top: B:151:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    @Override // p064g5.d
    public Object execute(List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        b bVar;
        int i10;
        a aVar;
        p064g5.g gVar;
        int i11;
        a aVar2;
        p064g5.g gVar2;
        int i12;
        int i13;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.label = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i15 = bVar2.label;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar2 = (p064g5.g) bVar2.L$1;
                aVar2 = (a) bVar2.L$0;
                try {
                    J7.a.v(obj);
                    i11 = 2;
                    try {
                        if (p210v8.i.a(((p162q6.a) aVar2._identityModelStore.getModel()).getOnesignalId(), ((p173r6.b) gVar2).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setOptStringProperty$default(aVar2._identityModelStore.getModel(), ((p173r6.b) gVar2).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                        return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                    } catch (BackendException e10) {
                        e = e10;
                        i13 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i13 == 1) {
                            return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i13 == i11) {
                            return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i13 == 3) {
                            return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                        }
                        if (i13 == 4) {
                            return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                        }
                        if (i13 == 5) {
                            if (e.getStatusCode() == 404) {
                            }
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } catch (BackendException e11) {
                    e = e11;
                    i11 = 2;
                    i13 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i13 == 1) {
                        return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i13 == i11) {
                        return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i13 == 3) {
                        return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                    }
                    if (i13 == 4) {
                        return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                    }
                    if (i13 == 5) {
                        return (e.getStatusCode() == 404 || !aVar2._newRecordState.isInMissingRetryWindow(((p173r6.b) gVar2).getOnesignalId())) ? new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null) : new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            gVar = (p064g5.g) bVar2.L$1;
            aVar = (a) bVar2.L$0;
            try {
                J7.a.v(obj);
                i10 = 2;
                try {
                    if (p210v8.i.a(((p162q6.a) aVar._identityModelStore.getModel()).getOnesignalId(), ((p173r6.i) gVar).getOnesignalId())) {
                        com.onesignal.common.modeling.i.setStringProperty$default(aVar._identityModelStore.getModel(), ((p173r6.i) gVar).getLabel(), ((p173r6.i) gVar).getValue(), "HYDRATE", false, 8, null);
                    }
                    return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                } catch (BackendException e12) {
                    e = e12;
                    i12 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i12 == 1) {
                        return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i12 == i10) {
                        return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i12 == 3) {
                        return new p064g5.a(p064g5.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i12 == 4) {
                        return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                    }
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e.getStatusCode() != 404) {
                    }
                    p173r6.i iVar = (p173r6.i) gVar;
                    List<p064g5.g> rebuildOperationsIfCurrentUser = aVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar.getAppId(), iVar.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null) : new p064g5.a(p064g5.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
            } catch (BackendException e13) {
                e = e13;
                i10 = 2;
                i12 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i12 == 1) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i12 == i10) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (i12 == 3) {
                    return new p064g5.a(p064g5.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i12 == 4) {
                    return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                }
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (e.getStatusCode() != 404 && aVar._newRecordState.isInMissingRetryWindow(((p173r6.i) gVar).getOnesignalId())) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                p173r6.i iVar2 = (p173r6.i) gVar;
                List<p064g5.g> rebuildOperationsIfCurrentUser2 = aVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar2.getAppId(), iVar2.getOnesignalId());
                if (rebuildOperationsIfCurrentUser2 == null) {
                }
            }
        }
        J7.a.v(obj);
        com.onesignal.debug.internal.logging.b.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
        List<? extends p064g5.g> list2 = list;
        boolean z6 = list2 instanceof Collection;
        if (!z6 || !list2.isEmpty()) {
            for (p064g5.g gVar3 : list2) {
                if (!(gVar3 instanceof p173r6.i) && !(gVar3 instanceof p173r6.b)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        if (!z6 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((p064g5.g) it.next()) instanceof p173r6.i) {
                    if (!z6 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((p064g5.g) it2.next()) instanceof p173r6.b) {
                                throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        p064g5.g gVar4 = (p064g5.g) p086i8.k.b0(list);
        if (!(gVar4 instanceof p173r6.i)) {
            i11 = 2;
            if (gVar4 instanceof p173r6.b) {
                try {
                    p132n6.b bVar3 = this._identityBackend;
                    String appId = ((p173r6.b) gVar4).getAppId();
                    String onesignalId = ((p173r6.b) gVar4).getOnesignalId();
                    String label = ((p173r6.b) gVar4).getLabel();
                    String jwtToken = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
                    bVar2.L$0 = this;
                    bVar2.L$1 = gVar4;
                    bVar2.label = 2;
                    if (bVar3.deleteAlias(appId, "onesignal_id", onesignalId, label, jwtToken, bVar2) != aVar3) {
                        aVar2 = this;
                        gVar2 = gVar4;
                        if (p210v8.i.a(((p162q6.a) aVar2._identityModelStore.getModel()).getOnesignalId(), ((p173r6.b) gVar2).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setOptStringProperty$default(aVar2._identityModelStore.getModel(), ((p173r6.b) gVar2).getLabel(), null, "HYDRATE", false, 8, null);
                        }
                    }
                } catch (BackendException e14) {
                    e = e14;
                    aVar2 = this;
                    gVar2 = gVar4;
                    i13 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i13 == 1) {
                        return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i13 == i11) {
                        return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i13 == 3) {
                        return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                    }
                    if (i13 == 4) {
                        return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                    }
                    if (i13 == 5) {
                        if (e.getStatusCode() == 404) {
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
        }
        try {
            p076h8.f identityAlias = this._identityModelStore.getIdentityAlias();
            p132n6.b bVar4 = this._identityBackend;
            String appId2 = ((p173r6.i) gVar4).getAppId();
            String str = (String) identityAlias.f11789s;
            String str2 = (String) identityAlias.f11790t;
            try {
                Map<String, String> mapT = z.t(new p076h8.f(((p173r6.i) gVar4).getLabel(), ((p173r6.i) gVar4).getValue()));
                String jwtToken2 = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
                bVar2.L$0 = this;
                bVar2.L$1 = gVar4;
                bVar2.label = 1;
                i10 = 2;
                try {
                    if (bVar4.setAlias(appId2, str, str2, mapT, jwtToken2, bVar2) != aVar3) {
                        aVar = this;
                        gVar = gVar4;
                        if (p210v8.i.a(((p162q6.a) aVar._identityModelStore.getModel()).getOnesignalId(), ((p173r6.i) gVar).getOnesignalId())) {
                            com.onesignal.common.modeling.i.setStringProperty$default(aVar._identityModelStore.getModel(), ((p173r6.i) gVar).getLabel(), ((p173r6.i) gVar).getValue(), "HYDRATE", false, 8, null);
                        }
                        return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                    }
                } catch (BackendException e15) {
                    e = e15;
                    aVar = this;
                    gVar = gVar4;
                    i12 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i12 == 1) {
                        return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i12 == i10) {
                        return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i12 == 3) {
                        return new p064g5.a(p064g5.b.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i12 == 4) {
                        return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                    }
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e.getStatusCode() != 404) {
                    }
                    p173r6.i iVar3 = (p173r6.i) gVar;
                    List<p064g5.g> rebuildOperationsIfCurrentUser3 = aVar._buildUserService.getRebuildOperationsIfCurrentUser(iVar3.getAppId(), iVar3.getOnesignalId());
                    if (rebuildOperationsIfCurrentUser3 == null) {
                    }
                }
            } catch (BackendException e16) {
                e = e16;
                i10 = 2;
            }
        } catch (BackendException e17) {
            e = e17;
            i10 = 2;
        }
        return aVar3;
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return p086i8.l.C(SET_ALIAS, DELETE_ALIAS);
    }
}
