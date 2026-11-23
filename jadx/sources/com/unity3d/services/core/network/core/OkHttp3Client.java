package com.unity3d.services.core.network.core;

import N9.AbstractC0342z;
import N9.C0324g;
import N9.InterfaceC0341y;
import X9.A;
import X9.D;
import X9.E;
import X9.G;
import X9.InterfaceC0464j;
import X9.InterfaceC0465k;
import X9.L;
import X9.O;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ma.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;
import p210v8.i;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "LX9/E;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;LX9/E;)V", "LX9/G;", "request", "", "connectTimeout", "readTimeout", "LX9/L;", "makeRequest", "(LX9/G;JJLm8/d;)Ljava/lang/Object;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lm8/d;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "LX9/E;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHttp3Client implements HttpClient {
    private final E client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(LN9/y;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {47}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends g implements c {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$request, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super HttpResponse> dVar) {
            return ((AnonymousClass2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) throws IOException {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                G okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = okHttp3Client.makeRequest(okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            L l4 = (L) obj;
            int i11 = l4.f5534v;
            TreeMap treeMapK = l4.f5536x.k();
            String str = l4.f5531s.a.f5663i;
            String strU = null;
            Charset charsetA = null;
            O o10 = l4.f5537y;
            if (o10 != null) {
                h hVarC = o10.c();
                try {
                    A aB = o10.b();
                    if (aB != null) {
                        charsetA = aB.a(L9.a.a);
                    }
                    if (charsetA == null) {
                        charsetA = L9.a.a;
                    }
                    strU = hVarC.U(Y9.c.s(hVarC, charsetA));
                    hVarC.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.bumptech.glide.c.c(hVarC, th);
                        throw th2;
                    }
                }
            }
            if (strU == null) {
                strU = "";
            }
            return new HttpResponse(strU, i11, treeMapK, str);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(LN9/y;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {36}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends g implements c {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            return OkHttp3Client.this.new AnonymousClass1(this.$request, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                return obj;
            }
            J7.a.v(obj);
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = okHttp3Client.execute(httpRequest, this);
            return objExecute == aVar ? aVar : objExecute;
        }
    }

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, E e10) {
        i.f(iSDKDispatchers, "dispatchers");
        i.f(e10, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(G g8, long j, long j10, d<? super L> dVar) {
        final C0324g c0324g = new C0324g(1, b.q(dVar));
        c0324g.w();
        D dA = this.client.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i.f(timeUnit, "unit");
        dA.f5465w = Y9.c.b(j, timeUnit);
        dA.f5466x = Y9.c.b(j10, timeUnit);
        new E(dA).c(g8).e(new InterfaceC0465k() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // X9.InterfaceC0465k
            public void onFailure(InterfaceC0464j call, IOException e10) {
                i.f(call, "call");
                i.f(e10, "e");
                c0324g.resumeWith(J7.a.d(e10));
            }

            @Override // X9.InterfaceC0465k
            public void onResponse(InterfaceC0464j call, L response) {
                i.f(call, "call");
                i.f(response, "response");
                c0324g.resumeWith(response);
            }
        });
        return c0324g.v();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return AbstractC0342z.w(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, this, null), dVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        i.f(request, "request");
        return (HttpResponse) AbstractC0342z.q(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }
}
