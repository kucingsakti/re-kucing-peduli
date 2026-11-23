package com.unity3d.services.core.domain.task;

import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", f = "InitializeStateConfig.kt", l = {28}, m = "invokeSuspend")
public final class InitializeStateConfig$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateConfig.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, d<? super InitializeStateConfig$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateConfig$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        Object objMo46invokegIAlus;
        a aVar = a.f13404s;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InitializeStateConfig.Params params = this.$params;
                InitializeStateConfig initializeStateConfig = this.this$0;
                DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                Configuration configuration = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration);
                this.label = 1;
                objMo46invokegIAlus = initializeStateConfigWithLoader.mo46invokegIAlus((BaseParams) params2, (d) this);
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
            J7.a.v(objMo46invokegIAlus);
            objD = (Configuration) objMo46invokegIAlus;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
        if ((objD instanceof p076h8.g) && (thA = h.a(objD)) != null) {
            objD = J7.a.d(thA);
        }
        return new h(objD);
    }
}
