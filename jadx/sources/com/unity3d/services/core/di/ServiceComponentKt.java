package com.unity3d.services.core.di;

import kotlin.Metadata;
import p076h8.d;
import p076h8.e;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lcom/unity3d/services/core/di/ServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/ServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Lh8/e;", "mode", "Lh8/d;", "inject", "(Lcom/unity3d/services/core/di/ServiceComponent;Ljava/lang/String;Lh8/e;)Lh8/d;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ServiceComponentKt {

    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceComponentKt$inject$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1 extends k implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ ServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServiceComponent serviceComponent, String str) {
            super(0);
            this.$this_inject = serviceComponent;
            this.$named = str;
        }

        @Override // p200u8.a
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            i.m();
            throw null;
        }
    }

    public static final <T> T get(ServiceComponent serviceComponent, String str) {
        i.f(serviceComponent, "<this>");
        i.f(str, "named");
        serviceComponent.getServiceProvider().getRegistry();
        i.m();
        throw null;
    }

    public static Object get$default(ServiceComponent serviceComponent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        i.f(serviceComponent, "<this>");
        i.f(str, "named");
        serviceComponent.getServiceProvider().getRegistry();
        i.m();
        throw null;
    }

    public static final <T> d inject(ServiceComponent serviceComponent, String str, e eVar) {
        i.f(serviceComponent, "<this>");
        i.f(str, "named");
        i.f(eVar, "mode");
        i.m();
        throw null;
    }

    public static d inject$default(ServiceComponent serviceComponent, String str, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            eVar = e.f11787t;
        }
        i.f(serviceComponent, "<this>");
        i.f(str, "named");
        i.f(eVar, "mode");
        i.m();
        throw null;
    }
}
