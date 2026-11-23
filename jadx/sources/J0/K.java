package J0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2253g;

    public K(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2253g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.f2248b = Integer.MIN_VALUE;
        this.f2249c = false;
        this.f2250d = false;
        this.f2251e = false;
        int[] iArr = this.f2252f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
