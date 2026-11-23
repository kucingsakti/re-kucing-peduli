package com.unity3d.services.core.domain.task;

import J7.a;
import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote$doWork$2", f = "InitializeStateCreateWithRemote.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateCreateWithRemote$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateCreateWithRemote.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreateWithRemote$doWork$2(InitializeStateCreateWithRemote.Params params, d<? super InitializeStateCreateWithRemote$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateCreateWithRemote$doWork$2(this.$params, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateCreateWithRemote$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.v(obj);
        InitializeStateCreateWithRemote.Params params = this.$params;
        try {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration config = params.getConfig();
            try {
                ErrorState errorStateCreate = WebViewApp.create(config, true);
                objD = config;
                if (errorStateCreate != null) {
                    String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                    DeviceLog.error(webAppFailureMessage);
                    throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
                }
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                throw new InitializationException(ErrorState.CreateWebApp, e10, config);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th) {
            objD = a.d(th);
        }
        boolean z6 = objD instanceof p076h8.g;
        Object objD2 = objD;
        if (z6 && (thA = h.a(objD)) != null) {
            objD2 = objD;
            objD2 = a.d(thA);
        }
        objD2 = objD;
        return new h(objD2);
    }
}
