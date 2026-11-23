package p082i4;

import com.google.android.gms.tasks.TaskCompletionSource;
import p092j4.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h {
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f12279b;

    public e(i iVar, TaskCompletionSource taskCompletionSource) {
        this.a = iVar;
        this.f12279b = taskCompletionSource;
    }

    @Override // p082i4.h
    public final boolean a(a aVar) {
        if (aVar.f12498b != 4 || this.a.a(aVar)) {
            return false;
        }
        String str = aVar.f12499c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12279b.b(new a(str, aVar.f12501e, aVar.f12502f));
        return true;
    }

    @Override // p082i4.h
    public final boolean b(Exception exc) {
        this.f12279b.c(exc);
        return true;
    }
}
