package p156q0;

import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0743b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0752k f14314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ U f14315u;

    public /* synthetic */ RunnableC0743b(C0752k c0752k, U u3, int i10) {
        this.f14313s = i10;
        this.f14314t = c0752k;
        this.f14315u = u3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14313s) {
            case 0:
                C0752k c0752k = this.f14314t;
                i.f(c0752k, "this$0");
                U u3 = this.f14315u;
                i.f(u3, "$operation");
                c0752k.a(u3);
                break;
            case 1:
                C0752k c0752k2 = this.f14314t;
                i.f(c0752k2, "this$0");
                U u10 = this.f14315u;
                if (c0752k2.f14329b.contains(u10)) {
                    int i10 = u10.a;
                    View view = u10.f14285c.c0;
                    i.e(view, "operation.fragment.mView");
                    AbstractC0487g.a(i10, view, c0752k2.a);
                }
                break;
            default:
                C0752k c0752k3 = this.f14314t;
                i.f(c0752k3, "this$0");
                U u11 = this.f14315u;
                c0752k3.f14329b.remove(u11);
                c0752k3.f14330c.remove(u11);
                break;
        }
    }
}
