package com.unity3d.services.core.domain.task;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.log.DeviceLog;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lh8/m;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", l = {39}, m = "invokeSuspend")
public final class InitializeStateNetworkError$doWork$2 extends g implements c {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, d<? super InitializeStateNetworkError$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeStateNetworkError$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Throwable thA;
        InitializeStateNetworkError initializeStateNetworkError;
        a aVar = a.f13404s;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objY = AbstractC0342z.y(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objY == aVar) {
                    return aVar;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objY;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                J7.a.v(obj);
            }
            if (((m) obj) == null) {
                ConnectivityMonitor.removeListener(initializeStateNetworkError);
                throw new Exception("No connected events within the timeout!");
            }
            objD = m.a;
            if ((objD instanceof p076h8.g) && (thA = h.a(objD)) != null) {
                objD = J7.a.d(thA);
            }
            return new h(objD);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
    }
}
