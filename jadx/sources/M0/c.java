package M0;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f2870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2871v;

    public c(String str, int i10, String str2, int i11) {
        this.f2868s = i10;
        this.f2869t = i11;
        this.f2870u = str;
        this.f2871v = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        i.f(cVar, "other");
        int i10 = this.f2868s - cVar.f2868s;
        return i10 == 0 ? this.f2869t - cVar.f2869t : i10;
    }
}
