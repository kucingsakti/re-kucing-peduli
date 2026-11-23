package com.unity3d.services.core.domain.task;

import J7.a;
import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.json.JSONObject;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
public final class ConfigFileFromLocalStorage$doWork$2 extends g implements c {
    int label;

    public ConfigFileFromLocalStorage$doWork$2(d<? super ConfigFileFromLocalStorage$doWork$2> dVar) {
        super(2, dVar);
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new ConfigFileFromLocalStorage$doWork$2(dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.v(obj);
        try {
            objD = new Configuration(new JSONObject(s8.h.D(new File(SdkProperties.getLocalConfigurationFilepath()))));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objD = a.d(th);
        }
        if ((objD instanceof p076h8.g) && (thA = h.a(objD)) != null) {
            objD = a.d(thA);
        }
        return new h(objD);
    }
}
