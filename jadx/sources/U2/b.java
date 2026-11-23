package U2;

import J4.c;
import U.U;
import android.view.View;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.tonyodev.fetch2.Download;
import java.util.WeakHashMap;
import p032d0.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4885s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4888v;

    public b(c cVar, Download download, boolean z6) {
        this.f4887u = cVar;
        this.f4888v = download;
        this.f4886t = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p081i3.b bVar;
        Object obj = this.f4888v;
        Object obj2 = this.f4887u;
        switch (this.f4885s) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                f fVar = swipeDismissBehavior.f9480s;
                View view = (View) obj2;
                if (fVar != null && fVar.g()) {
                    WeakHashMap weakHashMap = U.a;
                    view.postOnAnimation(this);
                    break;
                } else if (this.f4886t && (bVar = swipeDismissBehavior.f9481t) != null) {
                    bVar.E(view);
                    break;
                }
                break;
            case 1:
                if (!this.f4886t) {
                    ((C0525u) obj2).d((EnumC0518m) obj);
                    this.f4886t = true;
                }
                break;
            default:
                ((c) obj2).h((Download) obj, this.f4886t);
                break;
        }
    }

    public b(C0525u c0525u, EnumC0518m enumC0518m) {
        i.f(c0525u, "registry");
        i.f(enumC0518m, "event");
        this.f4887u = c0525u;
        this.f4888v = enumC0518m;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z6) {
        this.f4888v = swipeDismissBehavior;
        this.f4887u = view;
        this.f4886t = z6;
    }
}
