package com.unity3d.services.core.di;

import C8.InterfaceC0175c;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/core/di/ServiceKey;", "", "", "named", "LC8/c;", "instanceClass", "<init>", "(Ljava/lang/String;LC8/c;)V", "component1", "()Ljava/lang/String;", "component2", "()LC8/c;", "copy", "(Ljava/lang/String;LC8/c;)Lcom/unity3d/services/core/di/ServiceKey;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNamed", "LC8/c;", "getInstanceClass", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ServiceKey {
    private final InterfaceC0175c instanceClass;
    private final String named;

    public ServiceKey(String str, InterfaceC0175c interfaceC0175c) {
        i.f(str, "named");
        i.f(interfaceC0175c, "instanceClass");
        this.named = str;
        this.instanceClass = interfaceC0175c;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, InterfaceC0175c interfaceC0175c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i10 & 2) != 0) {
            interfaceC0175c = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, interfaceC0175c);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamed() {
        return this.named;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InterfaceC0175c getInstanceClass() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String named, InterfaceC0175c instanceClass) {
        i.f(named, "named");
        i.f(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) other;
        return i.a(this.named, serviceKey.named) && i.a(this.instanceClass, serviceKey.instanceClass);
    }

    public final InterfaceC0175c getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, InterfaceC0175c interfaceC0175c, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, interfaceC0175c);
    }
}
