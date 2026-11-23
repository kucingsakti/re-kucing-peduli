package p104k9;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f12813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f12814u;

    public l(int i10, J j, boolean z6) {
        this.f12812s = i10;
        this.f12813t = j;
        this.f12814u = z6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12812s - ((l) obj).f12812s;
    }
}
