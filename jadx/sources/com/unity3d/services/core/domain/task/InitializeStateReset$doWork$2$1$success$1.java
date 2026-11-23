package com.unity3d.services.core.domain.task;

import J7.a;
import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lh8/m;", "<anonymous>", "(LN9/y;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1", f = "InitializeStateReset.kt", l = {40}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2$1$success$1 extends g implements c {
    final /* synthetic */ WebViewApp $currentApp;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lh8/m;", "<anonymous>", "(LN9/y;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1$1", f = "InitializeStateReset.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends g implements c {
        final /* synthetic */ WebViewApp $currentApp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewApp webViewApp, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentApp = webViewApp;
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentApp, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
            return ((AnonymousClass1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.v(obj);
            WebView webView = this.$currentApp.getWebView();
            if (webView != null) {
                webView.destroy();
            }
            this.$currentApp.setWebView(null);
            return m.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2$1$success$1(InitializeStateReset initializeStateReset, WebViewApp webViewApp, d<? super InitializeStateReset$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateReset;
        this.$currentApp = webViewApp;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2$1$success$1(this.this$0, this.$currentApp, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
        return ((InitializeStateReset$doWork$2$1$success$1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.label;
        if (i10 == 0) {
            a.v(obj);
            AbstractC0337u main = this.this$0.dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentApp, null);
            this.label = 1;
            if (AbstractC0342z.w(main, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.v(obj);
        }
        return m.a;
    }
}
