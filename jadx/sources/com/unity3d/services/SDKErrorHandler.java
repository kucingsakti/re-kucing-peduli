package com.unity3d.services;

import N9.C0338v;
import N9.InterfaceC0339w;
import com.bumptech.glide.e;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.Metadata;
import p123m8.g;
import p123m8.h;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "LN9/w;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "Lh8/m;", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "Lm8/i;", "context", "", "exception", "handleException", "(Lm8/i;Ljava/lang/Throwable;)V", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "LN9/v;", "key", "LN9/v;", "getKey", "()LN9/v;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SDKErrorHandler implements InterfaceC0339w {
    private final ISDKDispatchers dispatchers;
    private final C0338v key;
    private final SDKMetricsSender sdkMetricsSender;

    public SDKErrorHandler(ISDKDispatchers iSDKDispatchers, SDKMetricsSender sDKMetricsSender) {
        i.f(iSDKDispatchers, "dispatchers");
        i.f(sDKMetricsSender, "sdkMetricsSender");
        this.dispatchers = iSDKDispatchers;
        this.sdkMetricsSender = sDKMetricsSender;
        this.key = C0338v.f3487s;
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // p123m8.i
    public <R> R fold(R r10, c cVar) {
        i.f(cVar, "operation");
        return (R) cVar.invoke(r10, this);
    }

    @Override // p123m8.i
    public <E extends g> E get(h hVar) {
        return (E) e.g(this, hVar);
    }

    @Override // N9.InterfaceC0339w
    public void handleException(p123m8.i context, Throwable exception) {
        String str;
        i.f(context, "context");
        i.f(exception, "exception");
        StackTraceElement stackTraceElement = exception.getStackTrace()[0];
        String fileName = stackTraceElement != null ? stackTraceElement.getFileName() : null;
        if (fileName == null) {
            fileName = "unknown";
        }
        StackTraceElement stackTraceElement2 = exception.getStackTrace()[0];
        int lineNumber = stackTraceElement2 != null ? stackTraceElement2.getLineNumber() : 0;
        if (exception instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (exception instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (exception instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (exception instanceof SecurityException) {
            str = "native_exception_se";
        } else {
            str = exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        sendMetric(new Metric(str, fileName + '_' + lineNumber, null, 4, null));
    }

    @Override // p123m8.i
    public p123m8.i minusKey(h hVar) {
        return e.j(this, hVar);
    }

    @Override // p123m8.i
    public p123m8.i plus(p123m8.i iVar) {
        return e.l(this, iVar);
    }

    @Override // p123m8.g
    public C0338v getKey() {
        return this.key;
    }
}
