package y0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f15985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f15986t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15987u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f15989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15990x;

    public v(x xVar, Bundle bundle, boolean z6, int i10, boolean z10, int i11) {
        p210v8.i.f(xVar, "destination");
        this.f15985s = xVar;
        this.f15986t = bundle;
        this.f15987u = z6;
        this.f15988v = i10;
        this.f15989w = z10;
        this.f15990x = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(v vVar) {
        p210v8.i.f(vVar, "other");
        boolean z6 = vVar.f15987u;
        boolean z10 = this.f15987u;
        if (z10 && !z6) {
            return 1;
        }
        if (!z10 && z6) {
            return -1;
        }
        int i10 = this.f15988v - vVar.f15988v;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle = vVar.f15986t;
        Bundle bundle2 = this.f15986t;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            p210v8.i.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = vVar.f15989w;
        boolean z12 = this.f15989w;
        if (z12 && !z11) {
            return 1;
        }
        if (z12 || !z11) {
            return this.f15990x - vVar.f15990x;
        }
        return -1;
    }
}
