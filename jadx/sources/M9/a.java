package M9;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f3247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f3248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f3249v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3250s;

    static {
        int i10 = b.a;
        f3247t = Long.MAX_VALUE;
        f3248u = -9223372036854775805L;
    }

    public static final void f(StringBuilder sb, int i10, int i11, int i12, String str, boolean z6) {
        CharSequence charSequenceSubSequence;
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i11);
            i.f(strValueOf, "<this>");
            if (i12 < 0) {
                throw new IllegalArgumentException(E0.a.g("Desired length ", i12, " is less than zero."));
            }
            if (i12 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i12);
                B8.b it = new B8.c(1, i12 - strValueOf.length(), 1).iterator();
                while (it.f774u) {
                    it.a();
                    sb2.append('0');
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i13 = -1;
            int length = string.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (string.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z6 || i15 >= 3) {
                sb.append((CharSequence) string, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i15);
            }
        }
        sb.append(str);
    }

    public static final boolean g(long j) {
        return j == f3247t || j == f3248u;
    }

    public static final long h(long j, c cVar) {
        i.f(cVar, "unit");
        if (j == f3247t) {
            return Long.MAX_VALUE;
        }
        if (j == f3248u) {
            return Long.MIN_VALUE;
        }
        long j10 = j >> 1;
        c cVar2 = (((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        i.f(cVar2, "sourceUnit");
        return cVar.f3258s.convert(j10, cVar2.f3258s);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((a) obj).f3250s;
        long j10 = this.f3250s;
        long j11 = j10 ^ j;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (((int) j) & 1);
            return j10 < 0 ? -i10 : i10;
        }
        if (j10 < j) {
            return -1;
        }
        return j10 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f3250s == ((a) obj).f3250s;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3250s;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        int i10;
        int i11;
        int i12;
        long j = this.f3250s;
        if (j == 0) {
            return "0s";
        }
        if (j == f3247t) {
            return "Infinity";
        }
        if (j == f3248u) {
            return "-Infinity";
        }
        boolean z6 = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append('-');
        }
        if (j < 0) {
            j = ((long) (((int) j) & 1)) + ((-(j >> 1)) << 1);
            int i13 = b.a;
        }
        long jH = h(j, c.DAYS);
        int iH = g(j) ? 0 : (int) (h(j, c.HOURS) % ((long) 24));
        int iH2 = g(j) ? 0 : (int) (h(j, c.MINUTES) % ((long) 60));
        int iH3 = g(j) ? 0 : (int) (h(j, c.SECONDS) % ((long) 60));
        if (g(j)) {
            i10 = 0;
        } else {
            i10 = (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
        }
        boolean z10 = jH != 0;
        boolean z11 = iH != 0;
        boolean z12 = iH2 != 0;
        boolean z13 = (iH3 == 0 && i10 == 0) ? false : true;
        if (z10) {
            sb.append(jH);
            sb.append('d');
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i11 = i14;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i15 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i11 = i15;
        }
        if (z13) {
            i12 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z10 || z11 || z12) {
                f(sb, iH3, i10, 9, "s", false);
            } else if (i10 >= 1000000) {
                f(sb, i10 / 1000000, i10 % 1000000, 6, "ms", false);
            } else if (i10 >= 1000) {
                f(sb, i10 / 1000, i10 % 1000, 3, "us", false);
            } else {
                sb.append(i10);
                sb.append("ns");
            }
        } else {
            i12 = i11;
        }
        if (z6 && i12 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        i.e(string, "toString(...)");
        return string;
    }
}
