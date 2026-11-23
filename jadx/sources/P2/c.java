package P2;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e, OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f3847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Continuation f3848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f3849v;

    public /* synthetic */ c(Executor executor, Continuation continuation, f fVar, int i10) {
        this.f3846s = i10;
        this.f3847t = executor;
        this.f3848u = continuation;
        this.f3849v = fVar;
    }

    @Override // P2.e
    public final void a(Task task) {
        switch (this.f3846s) {
            case 0:
                this.f3847t.execute(new C3.c(this, task, 24, false));
                break;
            default:
                this.f3847t.execute(new C3.c(this, task, 25, false));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void c(Object obj) {
        this.f3849v.p(obj);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void h() {
        this.f3849v.q();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f3849v.o(exc);
    }
}
