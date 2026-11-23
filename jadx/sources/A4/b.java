package A4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f308A = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f309B = new String[128];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f310C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Writer f311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f318z;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f309B[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f309B;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f310C = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f312t = iArr;
        this.f313u = 0;
        if (iArr.length == 0) {
            this.f312t = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f312t;
        int i10 = this.f313u;
        this.f313u = i10 + 1;
        iArr2[i10] = 6;
        this.f314v = ":";
        this.f318z = true;
        Objects.requireNonNull(writer, "out == null");
        this.f311s = writer;
    }

    public void A(long j) throws IOException {
        H();
        a();
        this.f311s.write(Long.toString(j));
    }

    public void B(Number number) throws IOException {
        if (number == null) {
            n();
            return;
        }
        H();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f308A.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f315w) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f311s.append((CharSequence) string);
    }

    public void E(String str) throws IOException {
        if (str == null) {
            n();
            return;
        }
        H();
        a();
        p(str);
    }

    public void G(boolean z6) throws IOException {
        H();
        a();
        this.f311s.write(z6 ? "true" : "false");
    }

    public final void H() throws IOException {
        if (this.f317y != null) {
            int iO = o();
            if (iO == 5) {
                this.f311s.write(44);
            } else if (iO != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            l();
            this.f312t[this.f313u - 1] = 4;
            p(this.f317y);
            this.f317y = null;
        }
    }

    public final void a() throws IOException {
        int iO = o();
        if (iO == 1) {
            this.f312t[this.f313u - 1] = 2;
            l();
            return;
        }
        Writer writer = this.f311s;
        if (iO == 2) {
            writer.append(',');
            l();
        } else {
            if (iO == 4) {
                writer.append((CharSequence) this.f314v);
                this.f312t[this.f313u - 1] = 5;
                return;
            }
            if (iO != 6) {
                if (iO != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f315w) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f312t[this.f313u - 1] = 7;
        }
    }

    public void b() throws IOException {
        H();
        a();
        int i10 = this.f313u;
        int[] iArr = this.f312t;
        if (i10 == iArr.length) {
            this.f312t = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f312t;
        int i11 = this.f313u;
        this.f313u = i11 + 1;
        iArr2[i11] = 1;
        this.f311s.write(91);
    }

    public void c() throws IOException {
        H();
        a();
        int i10 = this.f313u;
        int[] iArr = this.f312t;
        if (i10 == iArr.length) {
            this.f312t = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f312t;
        int i11 = this.f313u;
        this.f313u = i11 + 1;
        iArr2[i11] = 3;
        this.f311s.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f311s.close();
        int i10 = this.f313u;
        if (i10 > 1 || (i10 == 1 && this.f312t[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f313u = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f313u == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f311s.flush();
    }

    public final void g(int i10, int i11, char c10) throws IOException {
        int iO = o();
        if (iO != i11 && iO != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f317y != null) {
            throw new IllegalStateException("Dangling name: " + this.f317y);
        }
        this.f313u--;
        if (iO == i11) {
            l();
        }
        this.f311s.write(c10);
    }

    public void h() throws IOException {
        g(1, 2, ']');
    }

    public void i() throws IOException {
        g(3, 5, '}');
    }

    public void j(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f317y != null) {
            throw new IllegalStateException();
        }
        if (this.f313u == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f317y = str;
    }

    public b n() throws IOException {
        if (this.f317y != null) {
            if (!this.f318z) {
                this.f317y = null;
                return this;
            }
            H();
        }
        a();
        this.f311s.write("null");
        return this;
    }

    public final int o() {
        int i10 = this.f313u;
        if (i10 != 0) {
            return this.f312t[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void p(String str) throws IOException {
        String str2;
        String[] strArr = this.f316x ? f310C : f309B;
        Writer writer = this.f311s;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void t(double d3) throws IOException {
        H();
        if (this.f315w || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            a();
            this.f311s.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    public final void l() {
    }
}
