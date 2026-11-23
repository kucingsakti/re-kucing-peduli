package com.unity3d.services.core.di;

import N9.AbstractC0342z;
import N9.InterfaceC0339w;
import N9.InterfaceC0341y;
import N9.q0;
import X9.E;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import kotlin.Metadata;
import p076h8.m;
import p123m8.j;
import p200u8.a;
import p200u8.b;
import p210v8.i;
import p210v8.k;
import p210v8.u;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "<init>", "()V", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "provideSDKDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "LN9/w;", "provideSDKErrorHandler", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)LN9/w;", "errorHandler", "LN9/y;", "provideSDKScope", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;LN9/w;)LN9/y;", "provideSDKMetricSender", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/network/core/HttpClient;", "provideHttpClient", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;)Lcom/unity3d/services/core/network/core/HttpClient;", "Lcom/unity3d/services/core/di/IServicesRegistry;", MobileAdsBridgeBase.initializeMethodName, "()Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", "", "NAMED_SDK", "Ljava/lang/String;", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServiceProvider implements IServiceProvider {
    public static final ServiceProvider INSTANCE;
    public static final String NAMED_SDK = "sdk";
    private static final IServicesRegistry serviceRegistry;

    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lh8/m;", "invoke", "(Lcom/unity3d/services/core/di/ServicesRegistry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends k implements b {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00871 extends k implements a {
            public static final C00871 INSTANCE = new C00871();

            public C00871() {
                super(0);
            }

            @Override // p200u8.a
            public final SDKMetricsSender invoke() {
                return ServiceProvider.INSTANCE.provideSDKMetricSender();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass10 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateConfigWithLoader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", vVar.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", vVar.b(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass11 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateConfig invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateConfigWithLoader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass12 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass13 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateCreateWithRemote;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass14 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateCreateWithRemote invoke() {
                return new InitializeStateCreateWithRemote((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass15 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateLoadWeb invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", vVar.b(HttpClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass16 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass17 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", vVar.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateLoadCache.class))), (InitializeStateCreateWithRemote) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateCreateWithRemote.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", vVar.b(InitializeStateComplete.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/TokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass18 extends k implements a {
            public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

            public AnonymousClass18() {
                super(0);
            }

            @Override // p200u8.a
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass19 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final AsyncTokenStorage invoke() {
                return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), SDKMetrics.getInstance(), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", u.a.b(TokenStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass2 extends k implements a {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(0);
            }

            @Override // p200u8.a
            public final ISDKDispatchers invoke() {
                return ServiceProvider.INSTANCE.provideSDKDispatchers();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass20 extends k implements a {
            public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

            public AnonymousClass20() {
                super(0);
            }

            @Override // p200u8.a
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass21 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final VolumeChangeMonitor invoke() {
                return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), (VolumeChange) this.$this_registry.resolveService(new ServiceKey("", u.a.b(VolumeChange.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass22 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final MeasurementsService invoke() {
                Context applicationContext = ClientProperties.getApplicationContext();
                i.e(applicationContext, "getApplicationContext()");
                return new MeasurementsService(applicationContext, (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))), SharedInstances.INSTANCE.getWebViewEventSender());
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/topics/TopicsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass23 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final TopicsService invoke() {
                Context applicationContext = ClientProperties.getApplicationContext();
                i.e(applicationContext, "getApplicationContext()");
                return new TopicsService(applicationContext, (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))), SharedInstances.INSTANCE.getWebViewEventSender());
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN9/w;", "invoke", "()LN9/w;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InterfaceC0339w invoke() {
                ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return serviceProvider.provideSDKErrorHandler((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", vVar.b(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LN9/y;", "invoke", "()LN9/y;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InterfaceC0341y invoke() {
                ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return serviceProvider.provideSDKScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (InterfaceC0339w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, vVar.b(InterfaceC0339w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass5 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final HttpClient invoke() {
                ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
                ServicesRegistry servicesRegistry = this.$this_registry;
                v vVar = u.a;
                return serviceProvider.provideHttpClient((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", vVar.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", vVar.b(ConfigFileFromLocalStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass6 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass7 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass8 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass9 extends k implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // p200u8.a
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", u.a.b(ISDKDispatchers.class))));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return m.a;
        }

        public final void invoke(ServicesRegistry servicesRegistry) {
            i.f(servicesRegistry, "$this$registry");
            C00871 c00871 = C00871.INSTANCE;
            v vVar = u.a;
            servicesRegistry.updateService(new ServiceKey("", vVar.b(SDKMetricsSender.class)), D3.b.s(c00871));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(ISDKDispatchers.class)), D3.b.s(AnonymousClass2.INSTANCE));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, vVar.b(InterfaceC0339w.class)), D3.b.s(new AnonymousClass3(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, vVar.b(InterfaceC0341y.class)), D3.b.s(new AnonymousClass4(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(HttpClient.class)), D3.b.s(new AnonymousClass5(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass6(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(ConfigFileFromLocalStorage.class)), D3.b.s(new AnonymousClass7(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateReset.class)), D3.b.s(new AnonymousClass8(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateError.class)), D3.b.s(new AnonymousClass9(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateConfigWithLoader.class)), D3.b.s(new AnonymousClass10(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateConfig.class)), D3.b.s(new AnonymousClass11(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateCreate.class)), D3.b.s(new AnonymousClass12(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateLoadCache.class)), D3.b.s(new AnonymousClass13(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateCreateWithRemote.class)), D3.b.s(new AnonymousClass14(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateLoadWeb.class)), D3.b.s(new AnonymousClass15(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeStateComplete.class)), D3.b.s(new AnonymousClass16(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(InitializeSDK.class)), D3.b.s(new AnonymousClass17(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(TokenStorage.class)), D3.b.s(AnonymousClass18.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(AsyncTokenStorage.class)), D3.b.s(new AnonymousClass19(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(VolumeChange.class)), D3.b.s(AnonymousClass20.INSTANCE));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(VolumeChangeMonitor.class)), D3.b.s(new AnonymousClass21(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(MeasurementsService.class)), D3.b.s(new AnonymousClass22(servicesRegistry)));
            servicesRegistry.updateService(new ServiceKey("", vVar.b(TopicsService.class)), D3.b.s(new AnonymousClass23(servicesRegistry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpClient provideHttpClient(ISDKDispatchers dispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage) {
        IExperiments experiments;
        Configuration configuration = (Configuration) AbstractC0342z.q(j.f13164s, new ServiceProvider$provideHttpClient$config$1(configFileFromLocalStorage, null));
        return (configuration == null || (experiments = configuration.getExperiments()) == null || !experiments.isOkHttpEnabled()) ? new LegacyHttpClient(dispatchers) : new OkHttp3Client(dispatchers, new E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers provideSDKDispatchers() {
        return new SDKDispatchers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0339w provideSDKErrorHandler(ISDKDispatchers dispatchers, SDKMetricsSender sdkMetricsSender) {
        return new SDKErrorHandler(dispatchers, sdkMetricsSender);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SDKMetricsSender provideSDKMetricSender() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        i.e(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0341y provideSDKScope(ISDKDispatchers dispatchers, InterfaceC0339w errorHandler) {
        return AbstractC0342z.b(dispatchers.getDefault().plus(new q0()).plus(errorHandler));
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(AnonymousClass1.INSTANCE);
    }
}
