package okhttp3.internal.publicsuffix;

import J7.a;
import K9.l;
import L9.f;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import ma.b;
import ma.m;
import ma.o;
import ma.r;
import ma.y;
import p068ga.n;
import p086i8.k;
import p086i8.s;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "v1/g", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f13842e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f13843f = d.u("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f13844g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f13845b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f13846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13847d;

    public static List c(String str) {
        List listB0 = f.b0(str, new char[]{'.'});
        return i.a(k.b0(listB0), "") ? k.Q(listB0) : listB0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listB0;
        int size;
        int size2;
        int i10 = 0;
        String unicode = IDN.toUnicode(str);
        i.e(unicode, "unicodeDomain");
        List listC = c(unicode);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.f13845b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z6 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z6 = true;
                    } catch (IOException e10) {
                        n nVar = n.a;
                        n.a.getClass();
                        n.i("Failed to read public suffix list", 5, e10);
                        if (z6) {
                        }
                    }
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f13846c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i11 = 0; i11 < size3; i11++) {
            String str2 = (String) listC.get(i11);
            Charset charset = StandardCharsets.UTF_8;
            i.e(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            i.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strA = null;
                break;
            }
            int i13 = i12 + 1;
            byte[] bArr2 = this.f13846c;
            if (bArr2 == null) {
                i.n("publicSuffixListBytes");
                throw null;
            }
            strA = g.a(bArr2, bArr, i12);
            if (strA != null) {
                break;
            }
            i12 = i13;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                strA2 = null;
                break;
            }
            int i15 = i14 + 1;
            bArr3[i14] = f13842e;
            byte[] bArr4 = this.f13846c;
            if (bArr4 == null) {
                i.n("publicSuffixListBytes");
                throw null;
            }
            strA2 = g.a(bArr4, bArr3, i14);
            if (strA2 != null) {
                break;
            }
            i14 = i15;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i16 = size3 - 1;
        int i17 = 0;
        while (true) {
            if (i17 >= i16) {
                strA3 = null;
                break;
            }
            int i18 = i17 + 1;
            byte[] bArr5 = this.f13847d;
            if (bArr5 == null) {
                i.n("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = g.a(bArr5, bArr, i17);
            if (strA3 != null) {
                break;
            }
            i17 = i18;
        }
        if (strA3 != null) {
            listB0 = f.b0(i.k(strA3, "!"), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listB0 = f13843f;
        } else {
            List listB1 = strA == null ? null : f.b0(strA, new char[]{'.'});
            List list = s.f12328s;
            if (listB1 == null) {
                listB1 = list;
            }
            List listB2 = strA2 == null ? null : f.b0(strA2, new char[]{'.'});
            if (listB2 != null) {
                list = listB2;
            }
            listB0 = listB1.size() > list.size() ? listB1 : list;
        }
        if (listC.size() == listB0.size() && ((String) listB0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listB0.size();
        } else {
            size = listC.size();
            size2 = listB0.size() + 1;
        }
        l lVarU = K9.n.u(k.N(c(str)), size - size2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : lVarU) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) ".");
            }
            a.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        i.e(string, "toString(...)");
        return string;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = o.a;
        r rVarD = p068ga.d.d(new m(new b(resourceAsStream, 1, new y())));
        try {
            long j = rVarD.j();
            rVarD.p(j);
            byte[] bArrA = rVarD.f13213t.A(j);
            long j10 = rVarD.j();
            rVarD.p(j10);
            byte[] bArrA2 = rVarD.f13213t.A(j10);
            rVarD.close();
            synchronized (this) {
                this.f13846c = bArrA;
                this.f13847d = bArrA2;
            }
            this.f13845b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.c(rVarD, th);
                throw th2;
            }
        }
    }
}
