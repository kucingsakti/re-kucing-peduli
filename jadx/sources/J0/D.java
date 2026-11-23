package J0;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2231i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2235n;

    public final void a(int i10) {
        if ((this.f2226d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2226d));
    }

    public final int b() {
        return this.f2229g ? this.f2224b - this.f2225c : this.f2227e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=null, mItemCount=" + this.f2227e + ", mIsMeasuring=" + this.f2231i + ", mPreviousLayoutItemCount=" + this.f2224b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2225c + ", mStructureChanged=" + this.f2228f + ", mInPreLayout=" + this.f2229g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f2232k + '}';
    }
}
