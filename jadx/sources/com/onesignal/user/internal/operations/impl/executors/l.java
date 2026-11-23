package com.onesignal.user.internal.operations.impl.executors;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p064g5.d {
    public static final a Companion = new a(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final p142o6.a _buildUserService;
    private final S4.c _consistencyManager;
    private final p162q6.b _identityModelStore;
    private final p193t6.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
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
            return l.this.execute(null, this);
        }
    }

    public l(p132n6.d dVar, p162q6.b bVar, com.onesignal.user.internal.properties.b bVar2, p142o6.a aVar, p193t6.a aVar2, S4.c cVar) {
        p210v8.i.f(dVar, "_userBackend");
        p210v8.i.f(bVar, "_identityModelStore");
        p210v8.i.f(bVar2, "_propertiesModelStore");
        p210v8.i.f(aVar, "_buildUserService");
        p210v8.i.f(aVar2, "_newRecordState");
        p210v8.i.f(cVar, "_consistencyManager");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
        this._consistencyManager = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e0 A[Catch: BackendException -> 0x0048, TryCatch #2 {BackendException -> 0x0048, blocks: (B:15:0x0043, B:99:0x02ce, B:101:0x02e0, B:102:0x02e4, B:104:0x02ea, B:106:0x02f4, B:107:0x0317, B:109:0x031b, B:110:0x0338, B:112:0x033c), top: B:145:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ea A[Catch: BackendException -> 0x0048, TryCatch #2 {BackendException -> 0x0048, blocks: (B:15:0x0043, B:99:0x02ce, B:101:0x02e0, B:102:0x02e4, B:104:0x02ea, B:106:0x02f4, B:107:0x0317, B:109:0x031b, B:110:0x0338, B:112:0x033c), top: B:145:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0376  */
    /* JADX WARN: Code duplicated, block: B:122:0x0379  */
    /* JADX WARN: Code duplicated, block: B:124:0x037c  */
    /* JADX WARN: Code duplicated, block: B:125:0x038a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0392  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x029e A[Catch: BackendException -> 0x007d, TryCatch #0 {BackendException -> 0x007d, blocks: (B:23:0x0078, B:90:0x029a, B:92:0x029e, B:96:0x02b8), top: B:142:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b8 A[Catch: BackendException -> 0x007d, TRY_LEAVE, TryCatch #0 {BackendException -> 0x007d, blocks: (B:23:0x0078, B:90:0x029a, B:92:0x029e, B:96:0x02b8), top: B:142:0x0078 }] */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02cb, code lost:
    
        if (r2.resolveConditionsWithID(Q4.a.ID, r12) == r3) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p064g5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(java.util.List<? extends p064g5.g> r27, p123m8.d<? super p064g5.a> r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.operations.impl.executors.l.execute(java.util.List, m8.d):java.lang.Object");
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return p086i8.l.C(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
