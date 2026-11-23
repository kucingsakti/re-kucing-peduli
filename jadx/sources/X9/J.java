package X9;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final I c(A a, String str) {
        p210v8.i.f(str, "content");
        Charset charset = L9.a.a;
        if (a != null) {
            Pattern pattern = A.f5431d;
            Charset charsetA = a.a(null);
            if (charsetA == null) {
                a = p068ga.d.x(a + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        p210v8.i.e(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        Y9.c.c(bytes.length, 0, length);
        return new I(a, length, bytes);
    }

    public abstract long a();

    public abstract A b();

    public abstract void d(ma.g gVar);
}
