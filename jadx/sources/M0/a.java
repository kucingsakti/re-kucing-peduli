package M0;

import L9.f;
import java.util.Locale;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2863g;

    public a(String str, String str2, boolean z6, int i10, String str3, int i11) {
        this.a = str;
        this.f2858b = str2;
        this.f2859c = z6;
        this.f2860d = i10;
        this.f2861e = str3;
        this.f2862f = i11;
        Locale locale = Locale.US;
        i.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        i.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f2863g = f.J(upperCase, "INT", false) ? 3 : (f.J(upperCase, "CHAR", false) || f.J(upperCase, "CLOB", false) || f.J(upperCase, "TEXT", false)) ? 2 : f.J(upperCase, "BLOB", false) ? 5 : (f.J(upperCase, "REAL", false) || f.J(upperCase, "FLOA", false) || f.J(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2860d != aVar.f2860d) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.f2859c != aVar.f2859c) {
                return false;
            }
            int i10 = aVar.f2862f;
            String str = aVar.f2861e;
            String str2 = this.f2861e;
            int i11 = this.f2862f;
            if (i11 == 1 && i10 == 2 && str2 != null && !com.bumptech.glide.d.k(str2, str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !com.bumptech.glide.d.k(str, str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (!com.bumptech.glide.d.k(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f2863g != aVar.f2863g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.f2863g) * 31) + (this.f2859c ? 1231 : 1237)) * 31) + this.f2860d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.f2858b);
        sb.append("', affinity='");
        sb.append(this.f2863g);
        sb.append("', notNull=");
        sb.append(this.f2859c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f2860d);
        sb.append(", defaultValue='");
        String str = this.f2861e;
        if (str == null) {
            str = "undefined";
        }
        return E0.a.l(sb, str, "'}");
    }
}
