package p212w;

import p086i8.w;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f15512t;

    public k(j jVar) {
        this.f15512t = jVar;
    }

    @Override // p086i8.w
    public final int a() {
        int i10 = this.f15511s;
        this.f15511s = i10 + 1;
        return this.f15512t.e(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15511s < this.f15512t.h();
    }
}
