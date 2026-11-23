package com.google.android.gms.common.api.internal;

import P2.f;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends zac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f8016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f8017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ApiExceptionMapper f8018d;

    public zag(d dVar, TaskCompletionSource taskCompletionSource, ApiExceptionMapper apiExceptionMapper) {
        super(2);
        this.f8017c = taskCompletionSource;
        this.f8016b = dVar;
        this.f8018d = apiExceptionMapper;
        if (dVar.f7920b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        TaskCompletionSource taskCompletionSource = this.f8017c;
        this.f8018d.getClass();
        taskCompletionSource.c(status.f7882u != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        this.f8017c.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f8017c;
        try {
            this.f8016b.a(zabqVar.f7992c, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(zai.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.c(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Map map = zaadVar.f7935b;
        TaskCompletionSource taskCompletionSource = this.f8017c;
        map.put(taskCompletionSource, boolValueOf);
        S s9 = new S(zaadVar, 20, taskCompletionSource);
        f fVar = taskCompletionSource.a;
        fVar.getClass();
        fVar.f3854b.h(new P2.d(TaskExecutors.a, s9));
        fVar.s();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq zabqVar) {
        return this.f8016b.f7920b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq zabqVar) {
        return this.f8016b.a;
    }
}
