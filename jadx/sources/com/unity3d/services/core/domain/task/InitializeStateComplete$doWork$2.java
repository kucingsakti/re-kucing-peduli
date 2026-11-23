package com.unity3d.services.core.domain.task;

import J7.a;
import N9.InterfaceC0341y;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lh8/m;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateComplete$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, d<? super InitializeStateComplete$doWork$2> dVar) {
        super(2, dVar);
        this.$params = params;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateComplete$doWork$2(this.$params, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateComplete$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.v(obj);
        InitializeStateComplete.Params params = this.$params;
        try {
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            i.e(moduleConfigurationList, "params.config.moduleConfigurationList");
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(params.getConfig());
                }
            }
            objD = m.a;
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
