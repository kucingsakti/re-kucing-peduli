package P2;

import N1.t;
import O3.A;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Task {
    public final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3854b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f3856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f3858f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(F3.c cVar, OnCanceledListener onCanceledListener) {
        this.f3854b.h(new d(cVar, onCanceledListener));
        s();
    }

    @Override // com.google.android.gms.tasks.Task
    public final f b(Executor executor, OnFailureListener onFailureListener) {
        this.f3854b.h(new d(executor, onFailureListener));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final f c(Executor executor, OnSuccessListener onSuccessListener) {
        this.f3854b.h(new d(executor, onSuccessListener));
        s();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Executor executor, Continuation continuation) {
        f fVar = new f();
        this.f3854b.h(new c(executor, continuation, fVar, 0));
        s();
        return fVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, Continuation continuation) {
        f fVar = new f();
        this.f3854b.h(new c(executor, continuation, fVar, 1));
        s();
        return fVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f3858f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object g() {
        Object obj;
        synchronized (this.a) {
            try {
                Preconditions.k("Task is not yet complete", this.f3855c);
                if (this.f3856d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f3858f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f3857e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                Preconditions.k("Task is not yet complete", this.f3855c);
                if (this.f3856d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f3858f)) {
                    throw ((Throwable) IOException.class.cast(this.f3858f));
                }
                Exception exc = this.f3858f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f3857e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        return this.f3856d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean j() {
        boolean z6;
        synchronized (this.a) {
            z6 = this.f3855c;
        }
        return z6;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        boolean z6;
        synchronized (this.a) {
            try {
                z6 = false;
                if (this.f3855c && !this.f3856d && this.f3858f == null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task l(Executor executor, SuccessContinuation successContinuation) {
        f fVar = new f();
        this.f3854b.h(new d(executor, successContinuation, fVar));
        s();
        return fVar;
    }

    public final void m(Executor executor, OnCompleteListener onCompleteListener) {
        this.f3854b.h(new d(executor, onCompleteListener));
        s();
    }

    public final void n(A a) {
        d(TaskExecutors.a, a);
    }

    public final void o(Exception exc) {
        Preconditions.j(exc, "Exception must not be null");
        synchronized (this.a) {
            r();
            this.f3855c = true;
            this.f3858f = exc;
        }
        this.f3854b.i(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            r();
            this.f3855c = true;
            this.f3857e = obj;
        }
        this.f3854b.i(this);
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.f3855c) {
                    return;
                }
                this.f3855c = true;
                this.f3856d = true;
                this.f3854b.i(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        String strConcat;
        if (this.f3855c) {
            int i10 = DuplicateTaskCompletionException.f9396s;
            if (!j()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excF = f();
            if (excF != null) {
                strConcat = "failure";
            } else if (k()) {
                strConcat = "result ".concat(String.valueOf(g()));
            } else {
                strConcat = this.f3856d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.f3855c) {
                    this.f3854b.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
