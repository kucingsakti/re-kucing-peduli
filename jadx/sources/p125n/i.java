package p125n;

import C8.E;
import U.C0417d0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseInterpolator f13282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f13283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13284e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13281b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f13285f = new h(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.f13284e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((C0417d0) it.next()).b();
            }
            this.f13284e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f13284e) {
            return;
        }
        for (C0417d0 c0417d0 : this.a) {
            long j = this.f13281b;
            if (j >= 0) {
                c0417d0.c(j);
            }
            BaseInterpolator baseInterpolator = this.f13282c;
            if (baseInterpolator != null && (view = (View) c0417d0.a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f13283d != null) {
                c0417d0.d(this.f13285f);
            }
            View view2 = (View) c0417d0.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f13284e = true;
    }
}
