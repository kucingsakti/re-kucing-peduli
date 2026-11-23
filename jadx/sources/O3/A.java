package O3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Continuation {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3509t;

    public /* synthetic */ A(TaskCompletionSource taskCompletionSource, int i10) {
        this.f3508s = i10;
        this.f3509t = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object C(Task task) {
        switch (this.f3508s) {
            case 0:
                boolean zK = task.k();
                TaskCompletionSource taskCompletionSource = this.f3509t;
                if (zK) {
                    taskCompletionSource.d(task.g());
                } else if (task.f() != null) {
                    taskCompletionSource.c(task.f());
                }
                break;
            case 1:
                boolean zK2 = task.k();
                TaskCompletionSource taskCompletionSource2 = this.f3509t;
                if (zK2) {
                    taskCompletionSource2.d(task.g());
                } else if (task.f() != null) {
                    taskCompletionSource2.c(task.f());
                }
                break;
            default:
                boolean zK3 = task.k();
                TaskCompletionSource taskCompletionSource3 = this.f3509t;
                if (zK3) {
                    taskCompletionSource3.b(task.g());
                } else if (task.f() != null) {
                    taskCompletionSource3.a(task.f());
                }
                break;
        }
        return null;
    }
}
