package com.google.android.gms.tasks;

import F3.c;
import P2.f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(c cVar, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public abstract f b(Executor executor, OnFailureListener onFailureListener);

    public abstract f c(Executor executor, OnSuccessListener onSuccessListener);

    public Task d(Executor executor, Continuation continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task e(Executor executor, Continuation continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception f();

    public abstract Object g();

    public abstract Object h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public Task l(Executor executor, SuccessContinuation successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
