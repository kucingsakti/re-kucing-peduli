package com.unity3d.services.core.di;

import C8.InterfaceC0175c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p076h8.d;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "<init>", "()V", "T", "", "named", "Lkotlin/Function0;", "instance", "Lcom/unity3d/services/core/di/ServiceKey;", "single", "(Ljava/lang/String;Lu8/a;)Lcom/unity3d/services/core/di/ServiceKey;", "factory", "key", "Lh8/d;", "Lh8/m;", "updateService", "(Lcom/unity3d/services/core/di/ServiceKey;Lh8/d;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "LC8/c;", "getService", "(Ljava/lang/String;LC8/c;)Ljava/lang/Object;", "getOrNull", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "Ljava/util/concurrent/ConcurrentHashMap;", "_services", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getServices", "()Ljava/util/Map;", "services", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap<ServiceKey, d> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        i.f(str, "named");
        i.f(aVar, "instance");
        i.m();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        i.f(str, "named");
        i.m();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        i.f(str, "named");
        i.m();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        i.f(str, "named");
        i.f(aVar, "instance");
        i.m();
        throw null;
    }

    public final <T> ServiceKey factory(String named, a instance) {
        i.f(named, "named");
        i.f(instance, "instance");
        i.m();
        throw null;
    }

    public final <T> T get(String named) {
        i.f(named, "named");
        i.m();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        i.f(named, "named");
        i.m();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(String named, InterfaceC0175c instance) {
        i.f(named, "named");
        i.f(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public Map<ServiceKey, d> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(ServiceKey key) {
        i.f(key, "key");
        d dVar = getServices().get(key);
        if (dVar != null) {
            return (T) dVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveServiceOrNull(ServiceKey key) {
        i.f(key, "key");
        d dVar = getServices().get(key);
        if (dVar == null) {
            return null;
        }
        return (T) dVar.getValue();
    }

    public final <T> ServiceKey single(String named, a instance) {
        i.f(named, "named");
        i.f(instance, "instance");
        i.m();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(ServiceKey key, d instance) {
        i.f(key, "key");
        i.f(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have multiple identical services");
        }
        this._services.put(key, instance);
    }
}
