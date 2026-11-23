package com.unity3d.services.core.domain.task;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {39}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, d<? super InitializeStateReset$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateReset$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x0079, B:35:0x0087, B:36:0x0089, B:38:0x008c, B:40:0x0098, B:41:0x009f, B:42:0x00a2, B:43:0x00a7, B:44:0x00ae, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x0079, B:35:0x0087, B:36:0x0089, B:38:0x008c, B:40:0x0098, B:41:0x009f, B:42:0x00a2, B:43:0x00a7, B:44:0x00ae, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x0079, B:35:0x0087, B:36:0x0089, B:38:0x008c, B:40:0x0098, B:41:0x009f, B:42:0x00a2, B:43:0x00a7, B:44:0x00ae, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x0079, B:35:0x0087, B:36:0x0089, B:38:0x008c, B:40:0x0098, B:41:0x009f, B:42:0x00a2, B:43:0x00a7, B:44:0x00ae, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x0079, B:35:0x0087, B:36:0x0089, B:38:0x008c, B:40:0x0098, B:41:0x009f, B:42:0x00a2, B:43:0x00a7, B:44:0x00ae, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:55:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f A[SYNTHETIC] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        InitializeStateReset.Params params;
        InitializeStateReset initializeStateReset;
        InitializeStateReset initializeStateReset2;
        int i10;
        Class[] moduleConfigurationList;
        IModuleConfiguration moduleConfiguration;
        a aVar = a.f13404s;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                params = this.$params;
                initializeStateReset = this.this$0;
                DeviceLog.debug("Unity Ads init: starting init");
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                if (currentApp != null) {
                    currentApp.resetWebViewAppInitialization();
                }
                if ((currentApp != null ? currentApp.getWebView() : null) != null) {
                    long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                    InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                    this.L$0 = params;
                    this.L$1 = initializeStateReset;
                    this.label = 1;
                    Object objY = AbstractC0342z.y(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                    if (objY == aVar) {
                        return aVar;
                    }
                    initializeStateReset2 = initializeStateReset;
                    obj = objY;
                }
                initializeStateReset.unregisterLifecycleCallbacks();
                SdkProperties.setCacheDirectory(null);
                if (SdkProperties.getCacheDirectory() != null) {
                    throw new Exception("Cache directory is NULL");
                }
                SdkProperties.setInitialized(false);
                moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new Class[0];
                }
                for (Class cls : moduleConfigurationList) {
                    moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        moduleConfiguration.resetState(params.getConfig());
                    }
                }
                objD = params.getConfig();
                if ((objD instanceof p076h8.g) && (thA = h.a(objD)) != null) {
                    objD = J7.a.d(thA);
                }
                return new h(objD);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initializeStateReset2 = (InitializeStateReset) this.L$1;
            params = (InitializeStateReset.Params) this.L$0;
            J7.a.v(obj);
            if (((m) obj) == null) {
                throw new Exception("Reset failed on opening ConditionVariable");
            }
            initializeStateReset = initializeStateReset2;
            initializeStateReset.unregisterLifecycleCallbacks();
            SdkProperties.setCacheDirectory(null);
            if (SdkProperties.getCacheDirectory() != null) {
                throw new Exception("Cache directory is NULL");
            }
            SdkProperties.setInitialized(false);
            moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            while (i10 < r2) {
                moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(params.getConfig());
                }
            }
            objD = params.getConfig();
            if (objD instanceof p076h8.g) {
                objD = J7.a.d(thA);
            }
            return new h(objD);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
    }
}
