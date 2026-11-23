package p170r3;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f14553c;
    public boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14552b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f14554d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f14555e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        j jVar;
        RectF rectF = this.f14554d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (jVar = this.f14553c) == null) {
            return;
        }
        k.a.a(jVar, 1.0f, rectF, null, this.f14555e);
    }
}
