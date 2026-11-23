package X9;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f5586n = 0;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5594i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5597m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        p210v8.i.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C0462h(boolean z6, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.a = z6;
        this.f5587b = z10;
        this.f5588c = i10;
        this.f5589d = i11;
        this.f5590e = z11;
        this.f5591f = z12;
        this.f5592g = z13;
        this.f5593h = i12;
        this.f5594i = i13;
        this.j = z14;
        this.f5595k = z15;
        this.f5596l = z16;
        this.f5597m = str;
    }

    public final String toString() {
        String str = this.f5597m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.f5587b) {
            sb.append("no-store, ");
        }
        int i10 = this.f5588c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f5589d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f5590e) {
            sb.append("private, ");
        }
        if (this.f5591f) {
            sb.append("public, ");
        }
        if (this.f5592g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f5593h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f5594i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5595k) {
            sb.append("no-transform, ");
        }
        if (this.f5596l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f5597m = string;
        return string;
    }
}
