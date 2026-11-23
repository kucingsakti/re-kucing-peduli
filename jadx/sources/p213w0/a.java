package p213w0;

import androidx.lifecycle.Q;
import p204v1.g;
import p212w.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f15513c = new g(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15514b = new j(0);

    @Override // androidx.lifecycle.Q
    public final void c() {
        j jVar = this.f15514b;
        if (jVar.h() > 0) {
            jVar.i(0).getClass();
            throw new ClassCastException();
        }
        int i10 = jVar.f15510v;
        Object[] objArr = jVar.f15509u;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        jVar.f15510v = 0;
        jVar.f15507s = false;
    }
}
