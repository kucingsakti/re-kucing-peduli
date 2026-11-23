package com.unity3d.services.core.domain.task;

import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.e;
import p144o8.g;
import p200u8.c;
import p210v8.t;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {53, 96, 104}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader.Params params, InitializeStateConfigWithLoader initializeStateConfigWithLoader, d<? super InitializeStateConfigWithLoader$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.$params, this.this$0, dVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0179 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #6 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x001a, B:56:0x01a3, B:62:0x01d4, B:50:0x0175, B:52:0x0179, B:57:0x01ad, B:58:0x01bf, B:49:0x0170, B:37:0x0136, B:39:0x013a, B:59:0x01c0, B:60:0x01cd, B:61:0x01ce, B:36:0x0131, B:27:0x007f), top: B:82:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ad A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #6 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x001a, B:56:0x01a3, B:62:0x01d4, B:50:0x0175, B:52:0x0179, B:57:0x01ad, B:58:0x01bf, B:49:0x0170, B:37:0x0136, B:39:0x013a, B:59:0x01c0, B:60:0x01cd, B:61:0x01ce, B:36:0x0131, B:27:0x007f), top: B:82:0x000a }] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        t tVar;
        InitializeStateConfigWithLoader.Params params;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        t tVar2;
        Object objD2;
        InitializeStateConfigWithLoader.Params params2;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        t tVar3;
        Configuration configuration;
        t tVar4;
        t tVar5;
        Object objMo46invokegIAlus;
        Object objD3;
        t tVar6;
        t tVar7;
        t tVar8;
        AbstractC0337u io2;
        InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        t tVar9;
        a aVar = a.f13404s;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.L$0;
                InitializeStateConfigWithLoader.Params params3 = this.$params;
                InitializeStateConfigWithLoader initializeStateConfigWithLoader3 = this.this$0;
                PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
                DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory();
                t tVar10 = new t();
                ConfigurationLoader configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(params3.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), (SDKMetricsSender) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", u.a.b(SDKMetricsSender.class)));
                tVar10.f15466s = configurationLoader;
                tVar10.f15466s = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(params3.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage);
                t tVar11 = new t();
                tVar11.f15466s = new Configuration();
                try {
                    int maxRetries = params3.getConfig().getMaxRetries();
                    double retryScalingFactor = params3.getConfig().getRetryScalingFactor();
                    long retryDelay = params3.getConfig().getRetryDelay();
                    InitializationException initializationException = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), params3.getConfig());
                    InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader3, tVar10, tVar11, null);
                    this.L$0 = interfaceC0341y;
                    this.L$1 = params3;
                    this.L$2 = initializeStateConfigWithLoader3;
                    this.L$3 = tVar10;
                    this.L$4 = tVar11;
                    this.label = 1;
                    if (TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) != aVar) {
                        tVar = tVar11;
                        params = params3;
                        initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                        tVar2 = tVar10;
                    }
                } catch (Throwable th) {
                    th = th;
                    tVar = tVar11;
                    params = params3;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                    tVar2 = tVar10;
                    objD2 = J7.a.d(th);
                }
                return aVar;
            }
            if (i10 == 1) {
                tVar = (t) this.L$4;
                tVar2 = (t) this.L$3;
                initializeStateConfigWithLoader = (InitializeStateConfigWithLoader) this.L$2;
                params = (InitializeStateConfigWithLoader.Params) this.L$1;
                try {
                    J7.a.v(obj);
                } catch (Throwable th2) {
                    th = th2;
                    objD2 = J7.a.d(th);
                }
            } else {
                if (i10 == 2) {
                    tVar = (t) this.L$4;
                    tVar5 = (t) this.L$3;
                    tVar3 = (t) this.L$2;
                    initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader) this.L$1;
                    params2 = (InitializeStateConfigWithLoader.Params) this.L$0;
                    try {
                        J7.a.v(obj);
                        objMo46invokegIAlus = ((h) obj).f11792s;
                        objD3 = new h(objMo46invokegIAlus);
                    } catch (Throwable th3) {
                        th = th3;
                        objD3 = J7.a.d(th);
                    }
                    tVar6 = tVar3;
                    tVar7 = tVar5;
                    tVar8 = tVar;
                    if (!(objD3 instanceof p076h8.g)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params2.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io2 = initializeStateConfigWithLoader2.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(tVar6, tVar7, initializeStateConfigWithLoader2, params2, null);
                    this.L$0 = tVar7;
                    this.L$1 = tVar8;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (AbstractC0342z.w(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) != aVar) {
                        tVar9 = tVar7;
                    }
                    return aVar;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar8 = (t) this.L$1;
                tVar9 = (t) this.L$0;
                J7.a.v(obj);
            }
            configuration = (Configuration) tVar9.f15466s;
            t tVar12 = tVar9;
            tVar = tVar8;
            tVar4 = tVar12;
            tVar.f15466s = configuration;
            objD = (Configuration) tVar4.f15466s;
            if ((objD instanceof p076h8.g) && (thA = h.a(objD)) != null) {
                objD = J7.a.d(thA);
            }
            return new h(objD);
            objD2 = m.a;
            params2 = params;
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            tVar3 = tVar2;
            if (objD2 instanceof p076h8.g) {
                Throwable thA2 = h.a(objD2);
                if (thA2 instanceof AbortRetryException) {
                    throw new InitializationException(ErrorState.NetworkConfigRequest, (Exception) thA2, params2.getConfig());
                }
                try {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params4 = new InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = params2;
                    this.L$1 = initializeStateConfigWithLoader2;
                    this.L$2 = tVar3;
                    this.L$3 = tVar;
                    this.L$4 = tVar;
                    this.label = 2;
                    objMo46invokegIAlus = initializeStateNetworkError.mo46invokegIAlus(params4, this);
                    if (objMo46invokegIAlus != aVar) {
                        tVar5 = tVar;
                        objD3 = new h(objMo46invokegIAlus);
                        tVar6 = tVar3;
                        tVar7 = tVar5;
                        tVar8 = tVar;
                        if (!(objD3 instanceof p076h8.g)) {
                            throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params2.getConfig());
                        }
                        InitializeEventsMetricSender.getInstance().onRetryConfig();
                        io2 = initializeStateConfigWithLoader2.dispatchers.getIo();
                        initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(tVar6, tVar7, initializeStateConfigWithLoader2, params2, null);
                        this.L$0 = tVar7;
                        this.L$1 = tVar8;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (AbstractC0342z.w(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) != aVar) {
                            tVar9 = tVar7;
                            configuration = (Configuration) tVar9.f15466s;
                            t tVar13 = tVar9;
                            tVar = tVar8;
                            tVar4 = tVar13;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    tVar5 = tVar;
                    objD3 = J7.a.d(th);
                }
                return aVar;
            }
            configuration = (Configuration) tVar.f15466s;
            tVar4 = tVar;
            tVar.f15466s = configuration;
            objD = (Configuration) tVar4.f15466s;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th5) {
            objD = J7.a.d(th5);
        }
        if (objD instanceof p076h8.g) {
            objD = J7.a.d(thA);
        }
        return new h(objD);
    }
}
