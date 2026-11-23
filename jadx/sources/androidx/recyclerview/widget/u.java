package androidx.recyclerview.widget;

import J0.C0252b;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public v a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f7116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7120f;

    public static void b(RecyclerView.a aVar) {
        RecyclerView recyclerView;
        int i10 = aVar.f6993B;
        if (aVar.h() || (i10 & 4) != 0 || (recyclerView = aVar.f7001J) == null) {
            return;
        }
        recyclerView.J(aVar);
    }

    public abstract boolean a(RecyclerView.a aVar, RecyclerView.a aVar2, t tVar, t tVar2);

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    public final void c(RecyclerView.a aVar) {
        v vVar = this.a;
        if (vVar != null) {
            boolean z6 = true;
            aVar.p(true);
            if (aVar.f7010z != null && aVar.f6992A == null) {
                aVar.f7010z = null;
            }
            aVar.f6992A = null;
            if ((aVar.f6993B & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = vVar.a;
            recyclerView.j0();
            C0529b c0529b = recyclerView.f6984x;
            C0252b c0252b = c0529b.f7052b;
            q qVar = c0529b.a;
            int i10 = c0529b.f7054d;
            View view = aVar.f7003s;
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0529b.f7054d = 2;
                    int iIndexOfChild = qVar.a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c0529b.k(view);
                    } else if (c0252b.d(iIndexOfChild)) {
                        c0252b.f(iIndexOfChild);
                        c0529b.k(view);
                        qVar.a(iIndexOfChild);
                    } else {
                        c0529b.f7054d = 0;
                    }
                    c0529b.f7054d = 0;
                    if (z6) {
                        RecyclerView.a aVarM = RecyclerView.M(view);
                        A a = recyclerView.f6978u;
                        a.l(aVarM);
                        a.i(aVarM);
                        if (RecyclerView.f6911T0) {
                            Objects.toString(view);
                            recyclerView.toString();
                        }
                    }
                    recyclerView.k0(!z6);
                    if (z6 && aVar.l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    c0529b.f7054d = 0;
                    throw th;
                }
            }
            if (c0529b.f7055e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z6 = false;
            if (z6) {
                RecyclerView.a aVarM2 = RecyclerView.M(view);
                A a10 = recyclerView.f6978u;
                a10.l(aVarM2);
                a10.i(aVarM2);
                if (RecyclerView.f6911T0) {
                    Objects.toString(view);
                    recyclerView.toString();
                }
            }
            recyclerView.k0(!z6);
            if (z6) {
            }
        }
    }

    public abstract void d(RecyclerView.a aVar);

    public abstract void e();

    public abstract boolean f();
}
