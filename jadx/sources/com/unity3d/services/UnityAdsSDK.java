package com.unity3d.services;

import D3.b;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import N9.c0;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import kotlin.Metadata;
import p076h8.d;
import p076h8.h;
import p076h8.m;
import p134n8.a;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "LN9/c0;", MobileAdsBridgeBase.initializeMethodName, "()LN9/c0;", "LN9/y;", "sdkScope$delegate", "Lh8/d;", "getSdkScope", "()LN9/y;", "sdkScope", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeSDK$delegate", "getInitializeSDK", "()Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeSDK", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsSDK implements IServiceComponent {
    public static final UnityAdsSDK INSTANCE;

    /* JADX INFO: renamed from: initializeSDK$delegate, reason: from kotlin metadata */
    private static final d initializeSDK;

    /* JADX INFO: renamed from: sdkScope$delegate, reason: from kotlin metadata */
    private static final d sdkScope;

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lh8/m;", "<anonymous>", "(LN9/y;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends g implements c {
        int label;

        public AnonymousClass1(p123m8.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((AnonymousClass1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                InitializeSDK initializeSDK = UnityAdsSDK.INSTANCE.getInitializeSDK();
                EmptyParams emptyParams = EmptyParams.INSTANCE;
                this.label = 1;
                if (initializeSDK.mo46invokegIAlus(emptyParams, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                ((h) obj).getClass();
            }
            return m.a;
        }
    }

    static {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        INSTANCE = unityAdsSDK;
        p076h8.e eVar = p076h8.e.f11787t;
        sdkScope = b.r(eVar, new UnityAdsSDK$special$$inlined$inject$default$1(unityAdsSDK, ServiceProvider.NAMED_SDK));
        initializeSDK = b.r(eVar, new UnityAdsSDK$special$$inlined$inject$default$2(unityAdsSDK, ""));
    }

    private UnityAdsSDK() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InitializeSDK getInitializeSDK() {
        return (InitializeSDK) initializeSDK.getValue();
    }

    private final InterfaceC0341y getSdkScope() {
        return (InterfaceC0341y) sdkScope.getValue();
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final c0 initialize() {
        return AbstractC0342z.n(getSdkScope(), null, new AnonymousClass1(null), 3);
    }
}
