package com.unity3d.services.core.domain.task;

import N9.InterfaceC0341y;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {44, 62, 69}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, d<? super InitializeStateLoadWeb$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, dVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0139 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0158, B:54:0x017c, B:56:0x0186, B:59:0x0191, B:60:0x01a3, B:62:0x01a6, B:63:0x01b2, B:45:0x0135, B:47:0x0139, B:51:0x015c, B:52:0x016e, B:44:0x0130, B:37:0x0106, B:53:0x016f, B:36:0x0102, B:27:0x0072), top: B:77:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015c A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0158, B:54:0x017c, B:56:0x0186, B:59:0x0191, B:60:0x01a3, B:62:0x01a6, B:63:0x01b2, B:45:0x0135, B:47:0x0139, B:51:0x015c, B:52:0x016e, B:44:0x0130, B:37:0x0106, B:53:0x016f, B:36:0x0102, B:27:0x0072), top: B:77:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #5 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:50:0x0158, B:54:0x017c, B:56:0x0186, B:59:0x0191, B:60:0x01a3, B:62:0x01a6, B:63:0x01b2, B:45:0x0135, B:47:0x0139, B:51:0x015c, B:52:0x016e, B:44:0x0130, B:37:0x0106, B:53:0x016f, B:36:0x0102, B:27:0x0072), top: B:77:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r1 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.services.core.domain.task.InitializeStateLoadWeb] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    @Override // p144o8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
