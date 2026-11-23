package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(Result result) {
        Status statusN = result.n();
        if (statusN.f7880s <= 0) {
            c();
            return;
        }
        b(statusN);
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(result)), e10);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c();
}
