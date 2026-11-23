package com.onesignal.notifications.internal.limiting.impl;

import V5.d;
import X4.f;
import p144o8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Z5.b {
    private final f _applicationService;
    private final d _dataController;
    private final p055f6.a _notificationSummaryManager;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.limiting.impl.a$a, reason: collision with other inner class name */
    public static final class C0068a extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0068a(p123m8.d<? super C0068a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearOldestOverLimit(0, this);
        }
    }

    public static final class b extends c {
        int I$0;
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
            return a.this.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(d dVar, f fVar, p055f6.a aVar) {
        i.f(dVar, "_dataController");
        i.f(fVar, "_applicationService");
        i.f(aVar, "_notificationSummaryManager");
        this._dataController = dVar;
        this._applicationService = fVar;
        this._notificationSummaryManager = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[PHI: r1 r4 r9
      0x00aa: PHI (r1v12 java.util.Iterator) = (r1v5 java.util.Iterator), (r1v14 java.util.Iterator) binds: [B:25:0x00a1, B:41:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r4v7 int) = (r4v5 int), (r4v9 int) binds: [B:25:0x00a1, B:41:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r9v8 com.onesignal.notifications.internal.limiting.impl.a) = 
      (r9v3 com.onesignal.notifications.internal.limiting.impl.a)
      (r9v10 com.onesignal.notifications.internal.limiting.impl.a)
     binds: [B:25:0x00a1, B:41:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0100 -> B:38:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0105 -> B:40:0x0107). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object clearOldestOverLimitStandard(int r18, p123m8.d<? super p076h8.m> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.limiting.impl.a.clearOldestOverLimitStandard(int, m8.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r1;
     */
    @Override // Z5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clearOldestOverLimit(int r6, p123m8.d<? super p076h8.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.notifications.internal.limiting.impl.a.C0068a
            if (r0 == 0) goto L13
            r0 = r7
            com.onesignal.notifications.internal.limiting.impl.a$a r0 = (com.onesignal.notifications.internal.limiting.impl.a.C0068a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.notifications.internal.limiting.impl.a$a r0 = new com.onesignal.notifications.internal.limiting.impl.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            r6 = 2
            if (r2 == r6) goto L35
            if (r2 != r3) goto L2d
            J7.a.v(r7)
            goto L64
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.limiting.impl.a r2 = (com.onesignal.notifications.internal.limiting.impl.a) r2
            J7.a.v(r7)     // Catch: java.lang.Throwable -> L50
            goto L64
        L3f:
            J7.a.v(r7)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L4f
            r0.label = r4     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.clearOldestOverLimitStandard(r6, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 != r1) goto L64
            goto L63
        L4f:
            r2 = r5
        L50:
            V5.d r7 = r2._dataController
            Z5.a r2 = Z5.a.INSTANCE
            int r2 = r2.getMaxNumberOfNotifications()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r7.clearOldestOverLimitFallback(r6, r2, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            h8.m r6 = p076h8.m.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.limiting.impl.a.clearOldestOverLimit(int, m8.d):java.lang.Object");
    }
}
