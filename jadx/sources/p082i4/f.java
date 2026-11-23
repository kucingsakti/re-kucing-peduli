package p082i4;

import com.google.android.gms.tasks.TaskCompletionSource;
import p092j4.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    public final TaskCompletionSource a;

    public f(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // p082i4.h
    public final boolean a(a aVar) {
        int i10 = aVar.f12498b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.a.d(aVar.a);
        return true;
    }

    @Override // p082i4.h
    public final boolean b(Exception exc) {
        return false;
    }
}
