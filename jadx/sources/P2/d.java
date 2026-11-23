package P2;

import A1.RunnableC0094c;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e, OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Executor f3852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3853v;

    public d(F3.c cVar, OnCanceledListener onCanceledListener) {
        this.f3850s = 0;
        this.f3851t = new Object();
        this.f3852u = cVar;
        this.f3853v = onCanceledListener;
    }

    private final void b(Task task) {
        synchronized (this.f3851t) {
        }
        this.f3852u.execute(new C3.c(this, task, 26, false));
    }

    private final void d(Task task) {
        if (task.k() || task.i()) {
            return;
        }
        synchronized (this.f3851t) {
            try {
                if (((OnFailureListener) this.f3853v) == null) {
                    return;
                }
                this.f3852u.execute(new C3.c(this, task, 27, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Task task) {
        if (task.k()) {
            synchronized (this.f3851t) {
                try {
                    if (((OnSuccessListener) this.f3853v) == null) {
                        return;
                    }
                    this.f3852u.execute(new C3.c(this, task, 28, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // P2.e
    public final void a(Task task) {
        switch (this.f3850s) {
            case 0:
                if (task.i()) {
                    synchronized (this.f3851t) {
                        try {
                            if (((OnCanceledListener) this.f3853v) != null) {
                                F3.c cVar = (F3.c) this.f3852u;
                                RunnableC0094c runnableC0094c = new RunnableC0094c(this, 14);
                                cVar.getClass();
                                runnableC0094c.run();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                b(task);
                return;
            case 2:
                d(task);
                return;
            case 3:
                e(task);
                return;
            default:
                this.f3852u.execute(new C3.c(this, task, 29, false));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void c(Object obj) {
        ((f) this.f3853v).p(obj);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void h() {
        ((f) this.f3853v).q();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((f) this.f3853v).o(exc);
    }

    public d(Executor executor, OnCompleteListener onCompleteListener) {
        this.f3850s = 1;
        this.f3851t = new Object();
        this.f3852u = executor;
        this.f3853v = onCompleteListener;
    }

    public d(Executor executor, OnFailureListener onFailureListener) {
        this.f3850s = 2;
        this.f3851t = new Object();
        this.f3852u = executor;
        this.f3853v = onFailureListener;
    }

    public d(Executor executor, OnSuccessListener onSuccessListener) {
        this.f3850s = 3;
        this.f3851t = new Object();
        this.f3852u = executor;
        this.f3853v = onSuccessListener;
    }

    public d(Executor executor, SuccessContinuation successContinuation, f fVar) {
        this.f3850s = 4;
        this.f3852u = executor;
        this.f3851t = successContinuation;
        this.f3853v = fVar;
    }
}
