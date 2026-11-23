package com.unity3d.services.core.di;

import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LN9/y;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LN9/y;)Lcom/unity3d/services/core/configuration/Configuration;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.di.ServiceProvider$provideHttpClient$config$1", f = "ServiceProvider.kt", l = {134}, m = "invokeSuspend")
public final class ServiceProvider$provideHttpClient$config$1 extends g implements c {
    final /* synthetic */ ConfigFileFromLocalStorage $configFileFromLocalStorage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceProvider$provideHttpClient$config$1(ConfigFileFromLocalStorage configFileFromLocalStorage, d<? super ServiceProvider$provideHttpClient$config$1> dVar) {
        super(2, dVar);
        this.$configFileFromLocalStorage = configFileFromLocalStorage;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new ServiceProvider$provideHttpClient$config$1(this.$configFileFromLocalStorage, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super Configuration> dVar) {
        return ((ServiceProvider$provideHttpClient$config$1) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objMo46invokegIAlus;
        a aVar = a.f13404s;
        int i10 = this.label;
        if (i10 == 0) {
            J7.a.v(obj);
            ConfigFileFromLocalStorage configFileFromLocalStorage = this.$configFileFromLocalStorage;
            ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params();
            this.label = 1;
            objMo46invokegIAlus = configFileFromLocalStorage.mo46invokegIAlus(params, this);
            if (objMo46invokegIAlus == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            objMo46invokegIAlus = ((h) obj).f11792s;
        }
        if (objMo46invokegIAlus instanceof p076h8.g) {
            return null;
        }
        return objMo46invokegIAlus;
    }
}
