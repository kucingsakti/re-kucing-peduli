package X9;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0471q {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f5626k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f5627l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f5628m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5636i;

    public C0471q(String str, String str2, long j10, String str3, String str4, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.a = str;
        this.f5629b = str2;
        this.f5630c = j10;
        this.f5631d = str3;
        this.f5632e = str4;
        this.f5633f = z6;
        this.f5634g = z10;
        this.f5635h = z11;
        this.f5636i = z12;
    }

    public final String a(boolean z6) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f5629b);
        if (this.f5635h) {
            long j10 = this.f5630c;
            if (j10 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) p030ca.c.a.get()).format(new Date(j10));
                p210v8.i.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f5636i) {
            sb.append("; domain=");
            if (z6) {
                sb.append(".");
            }
            sb.append(this.f5631d);
        }
        sb.append("; path=");
        sb.append(this.f5632e);
        if (this.f5633f) {
            sb.append("; secure");
        }
        if (this.f5634g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        p210v8.i.e(string, "toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0471q)) {
            return false;
        }
        C0471q c0471q = (C0471q) obj;
        return p210v8.i.a(c0471q.a, this.a) && p210v8.i.a(c0471q.f5629b, this.f5629b) && c0471q.f5630c == this.f5630c && p210v8.i.a(c0471q.f5631d, this.f5631d) && p210v8.i.a(c0471q.f5632e, this.f5632e) && c0471q.f5633f == this.f5633f && c0471q.f5634g == this.f5634g && c0471q.f5635h == this.f5635h && c0471q.f5636i == this.f5636i;
    }

    public final int hashCode() {
        int iA = p231y.a.a(p231y.a.a(527, this.a, 31), this.f5629b, 31);
        long j10 = this.f5630c;
        return ((((((p231y.a.a(p231y.a.a((iA + ((int) (j10 ^ (j10 >>> 32)))) * 31, this.f5631d, 31), this.f5632e, 31) + (this.f5633f ? 1231 : 1237)) * 31) + (this.f5634g ? 1231 : 1237)) * 31) + (this.f5635h ? 1231 : 1237)) * 31) + (this.f5636i ? 1231 : 1237);
    }

    public final String toString() {
        return a(false);
    }
}
