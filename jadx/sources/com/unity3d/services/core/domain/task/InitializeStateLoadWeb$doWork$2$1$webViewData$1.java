package com.unity3d.services.core.domain.task;

import N9.InterfaceC0341y;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "", "<anonymous>", "(LN9/y;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {69}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends g implements c {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, d<? super InitializeStateLoadWeb$doWork$2$1$webViewData$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super String> dVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.label;
        if (i10 == 0) {
            J7.a.v(obj);
            HttpClient httpClient = this.this$0.httpClient;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = httpClient.execute(httpRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        return ((HttpResponse) obj).getBody().toString();
    }
}
