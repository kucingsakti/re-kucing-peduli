package X9;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f5431d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f5432e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f5434c;

    public A(String str, String str2, String[] strArr) {
        this.a = str;
        this.f5433b = str2;
        this.f5434c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f5434c;
        int i10 = 0;
        int i11 = p068ga.l.i(0, strArr.length - 1, 2);
        if (i11 < 0) {
            str = null;
            break;
        }
        while (true) {
            int i12 = i10 + 2;
            if (L9.n.C(strArr[i10], "charset", true)) {
                str = strArr[i10 + 1];
                break;
            }
            if (i10 == i11) {
                str = null;
                break;
            }
            i10 = i12;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A) && p210v8.i.a(((A) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
