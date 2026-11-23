package A4;

import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.chromium.net.UrlRequest;
import p204v1.g;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f293A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f294B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f295C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int[] f296D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String[] f298F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f299G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Reader f300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f301t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final char[] f302u = new char[1024];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f303v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f305x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f307z = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f297E = 1;

    static {
        g.f15398u = new g(1);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f296D = iArr;
        iArr[0] = 6;
        this.f298F = new String[32];
        this.f299G = new int[32];
        this.f300s = reader;
    }

    public final double A() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f307z = 0;
            int[] iArr = this.f299G;
            int i10 = this.f297E - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f293A;
        }
        if (iG == 16) {
            this.f295C = new String(this.f302u, this.f303v, this.f294B);
            this.f303v += this.f294B;
        } else if (iG == 8 || iG == 9) {
            this.f295C = K(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.f295C = W();
        } else if (iG != 11) {
            throw new IllegalStateException("Expected a double but was " + E0.a.q(X()) + p());
        }
        this.f307z = 11;
        double d3 = Double.parseDouble(this.f295C);
        if (!this.f301t && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d3 + p());
        }
        this.f295C = null;
        this.f307z = 0;
        int[] iArr2 = this.f299G;
        int i11 = this.f297E - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d3;
    }

    public final int B() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j = this.f293A;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f293A + p());
            }
            this.f307z = 0;
            int[] iArr = this.f299G;
            int i11 = this.f297E - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iG == 16) {
            this.f295C = new String(this.f302u, this.f303v, this.f294B);
            this.f303v += this.f294B;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected an int but was " + E0.a.q(X()) + p());
            }
            if (iG == 10) {
                this.f295C = W();
            } else {
                this.f295C = K(iG == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f295C);
                this.f307z = 0;
                int[] iArr2 = this.f299G;
                int i13 = this.f297E - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f307z = 11;
        double d3 = Double.parseDouble(this.f295C);
        int i14 = (int) d3;
        if (i14 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.f295C + p());
        }
        this.f295C = null;
        this.f307z = 0;
        int[] iArr3 = this.f299G;
        int i15 = this.f297E - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final long E() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f307z = 0;
            int[] iArr = this.f299G;
            int i10 = this.f297E - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f293A;
        }
        if (iG == 16) {
            this.f295C = new String(this.f302u, this.f303v, this.f294B);
            this.f303v += this.f294B;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected a long but was " + E0.a.q(X()) + p());
            }
            if (iG == 10) {
                this.f295C = W();
            } else {
                this.f295C = K(iG == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f295C);
                this.f307z = 0;
                int[] iArr2 = this.f299G;
                int i11 = this.f297E - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f307z = 11;
        double d3 = Double.parseDouble(this.f295C);
        long j10 = (long) d3;
        if (j10 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.f295C + p());
        }
        this.f295C = null;
        this.f307z = 0;
        int[] iArr3 = this.f299G;
        int i12 = this.f297E - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j10;
    }

    public final String G() throws IOException {
        String strK;
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strK = W();
        } else if (iG == 12) {
            strK = K('\'');
        } else {
            if (iG != 13) {
                throw new IllegalStateException("Expected a name but was " + E0.a.q(X()) + p());
            }
            strK = K('\"');
        }
        this.f307z = 0;
        this.f298F[this.f297E - 1] = strK;
        return strK;
    }

    public final int H(boolean z6) throws IOException {
        int i10 = this.f303v;
        int i11 = this.f304w;
        while (true) {
            if (i10 == i11) {
                this.f303v = i10;
                if (!j(1)) {
                    if (!z6) {
                        return -1;
                    }
                    throw new EOFException("End of input" + p());
                }
                i10 = this.f303v;
                i11 = this.f304w;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f302u;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f305x++;
                this.f306y = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f303v = i12;
                    if (i12 == i11) {
                        this.f303v = i10;
                        boolean zJ = j(2);
                        this.f303v++;
                        if (!zJ) {
                        }
                        return c10;
                    }
                    c();
                    int i13 = this.f303v;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f303v = i13 + 1;
                        while (true) {
                            if (this.f303v + 2 > this.f304w && !j(2)) {
                                e0("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f303v;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f303v + 2;
                                        i11 = this.f304w;
                                        break;
                                    }
                                    if (cArr[this.f303v + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f305x++;
                                this.f306y = i14 + 1;
                            }
                            this.f303v++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f303v = i13 + 1;
                        b0();
                        i10 = this.f303v;
                        i11 = this.f304w;
                    }
                } else {
                    if (c10 != '#') {
                        this.f303v = i12;
                        return c10;
                    }
                    this.f303v = i12;
                    c();
                    b0();
                    i10 = this.f303v;
                    i11 = this.f304w;
                }
            }
            i10 = i12;
        }
    }

    public final void J() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw new IllegalStateException("Expected null but was " + E0.a.q(X()) + p());
        }
        this.f307z = 0;
        int[] iArr = this.f299G;
        int i10 = this.f297E - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String K(char c10) throws MalformedJsonException {
        int i10;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i11 = this.f303v;
            int i12 = this.f304w;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f302u;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f303v = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb.append(cArr, i10, i15);
                            return sb.toString();
                        }
                        if (c11 == '\\') {
                            this.f303v = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb.append(cArr, i10, i17);
                            sb.append(Z());
                            i11 = this.f303v;
                            i12 = this.f304w;
                        } else {
                            if (c11 == '\n') {
                                this.f305x++;
                                this.f306y = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb.append(cArr, i10, i11 - i10);
            this.f303v = i11;
        } while (j(1));
        e0("Unterminated string");
        throw null;
    }

    public final String T() throws IOException {
        String str;
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = W();
        } else if (iG == 8) {
            str = K('\'');
        } else if (iG == 9) {
            str = K('\"');
        } else if (iG == 11) {
            str = this.f295C;
            this.f295C = null;
        } else if (iG == 15) {
            str = Long.toString(this.f293A);
        } else {
            if (iG != 16) {
                throw new IllegalStateException("Expected a string but was " + E0.a.q(X()) + p());
            }
            str = new String(this.f302u, this.f303v, this.f294B);
            this.f303v += this.f294B;
        }
        this.f307z = 0;
        int[] iArr = this.f299G;
        int i10 = this.f297E - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String W() throws MalformedJsonException {
        String string;
        StringBuilder sb = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f303v;
                int i13 = i12 + i11;
                int i14 = this.f304w;
                char[] cArr = this.f302u;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i11, 16));
                    }
                    sb.append(cArr, this.f303v, i11);
                    this.f303v += i11;
                    if (!j(1)) {
                    }
                } else if (!j(i11 + 1)) {
                    i10 = i11;
                }
                if (sb == null) {
                    string = new String(cArr, this.f303v, i10);
                } else {
                    sb.append(cArr, this.f303v, i10);
                    string = sb.toString();
                }
                this.f303v += i10;
                return string;
            }
        }
    }

    public final int X() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void Y(int i10) {
        int i11 = this.f297E;
        int[] iArr = this.f296D;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f296D = Arrays.copyOf(iArr, i12);
            this.f299G = Arrays.copyOf(this.f299G, i12);
            this.f298F = (String[]) Arrays.copyOf(this.f298F, i12);
        }
        int[] iArr2 = this.f296D;
        int i13 = this.f297E;
        this.f297E = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char Z() throws MalformedJsonException {
        int i10;
        if (this.f303v == this.f304w && !j(1)) {
            e0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f303v;
        int i12 = i11 + 1;
        this.f303v = i12;
        char[] cArr = this.f302u;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f305x++;
            this.f306y = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            e0("Invalid escape sequence");
            throw null;
        }
        if (i11 + 5 > this.f304w && !j(4)) {
            e0("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.f303v;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = cArr[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f303v, 4)));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (i10 + c13);
            i13++;
        }
        this.f303v += 4;
        return c11;
    }

    public final void a() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 3) {
            Y(1);
            this.f299G[this.f297E - 1] = 0;
            this.f307z = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + E0.a.q(X()) + p());
        }
    }

    public final void a0(char c10) throws MalformedJsonException {
        do {
            int i10 = this.f303v;
            int i11 = this.f304w;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f302u[i10];
                if (c11 == c10) {
                    this.f303v = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f303v = i12;
                    Z();
                    i10 = this.f303v;
                    i11 = this.f304w;
                } else {
                    if (c11 == '\n') {
                        this.f305x++;
                        this.f306y = i12;
                    }
                    i10 = i12;
                }
            }
            this.f303v = i10;
        } while (j(1));
        e0("Unterminated string");
        throw null;
    }

    public final void b() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 1) {
            Y(3);
            this.f307z = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + E0.a.q(X()) + p());
        }
    }

    public final void b0() {
        char c10;
        do {
            if (this.f303v >= this.f304w && !j(1)) {
                return;
            }
            int i10 = this.f303v;
            int i11 = i10 + 1;
            this.f303v = i11;
            c10 = this.f302u[i10];
            if (c10 == '\n') {
                this.f305x++;
                this.f306y = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final void c() throws MalformedJsonException {
        if (this.f301t) {
            return;
        }
        e0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void c0() throws MalformedJsonException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f303v;
                if (i11 + i10 < this.f304w) {
                    char c10 = this.f302u[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    this.f303v += i10;
                    return;
                }
                this.f303v = i11 + i10;
            }
        } while (j(1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f307z = 0;
        this.f296D[0] = 8;
        this.f297E = 1;
        this.f300s.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0() throws IOException {
        int i10 = 0;
        do {
            int iG = this.f307z;
            if (iG == 0) {
                iG = g();
            }
            switch (iG) {
                case 1:
                    Y(3);
                    i10++;
                    this.f307z = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f298F[this.f297E - 1] = null;
                    }
                    this.f297E--;
                    i10--;
                    this.f307z = 0;
                    break;
                case 3:
                    Y(1);
                    i10++;
                    this.f307z = 0;
                    break;
                case 4:
                    this.f297E--;
                    i10--;
                    this.f307z = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f307z = 0;
                    break;
                case 8:
                    a0('\'');
                    this.f307z = 0;
                    break;
                case 9:
                    a0('\"');
                    this.f307z = 0;
                    break;
                case 10:
                    c0();
                    this.f307z = 0;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    a0('\'');
                    if (i10 == 0) {
                        this.f298F[this.f297E - 1] = "<skipped>";
                    }
                    this.f307z = 0;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    a0('\"');
                    if (i10 == 0) {
                        this.f298F[this.f297E - 1] = "<skipped>";
                    }
                    this.f307z = 0;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    c0();
                    if (i10 == 0) {
                        this.f298F[this.f297E - 1] = "<skipped>";
                    }
                    this.f307z = 0;
                    break;
                case 16:
                    this.f303v += this.f294B;
                    this.f307z = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f299G;
        int i11 = this.f297E - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void e0(String str) throws MalformedJsonException {
        StringBuilder sbC = e.c(str);
        sbC.append(p());
        throw new MalformedJsonException(sbC.toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[PHI: r4 r15
      0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:181:0x0237 A[DONT_INVERT, PHI: r8
      0x0237: PHI (r8v19 int) = (r8v18 int), (r8v20 int) binds: [B:167:0x0212, B:173:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:200:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0268  */
    /* JADX WARN: Code duplicated, block: B:207:0x0272  */
    /* JADX WARN: Code duplicated, block: B:209:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x0287  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public final int g() throws IOException {
        int iH;
        int i10;
        int iH2;
        char c10;
        String str;
        String str2;
        int i11;
        int length;
        int i12;
        char c11;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z6;
        char c12;
        int i17;
        int i18;
        int[] iArr = this.f296D;
        int i19 = this.f297E - 1;
        int i20 = iArr[i19];
        char[] cArr = this.f302u;
        if (i20 == 1) {
            iArr[i19] = 2;
        } else if (i20 == 2) {
            int iH3 = H(true);
            if (iH3 != 44) {
                if (iH3 != 59) {
                    if (iH3 == 93) {
                        this.f307z = 4;
                        return 4;
                    }
                    e0("Unterminated array");
                    throw null;
                }
                c();
            }
        } else {
            if (i20 == 3 || i20 == 5) {
                iArr[i19] = 4;
                if (i20 == 5 && (iH = H(true)) != 44) {
                    if (iH != 59) {
                        if (iH == 125) {
                            this.f307z = 2;
                            return 2;
                        }
                        e0("Unterminated object");
                        throw null;
                    }
                    c();
                }
                int iH4 = H(true);
                if (iH4 == 34) {
                    this.f307z = 13;
                    return 13;
                }
                if (iH4 == 39) {
                    c();
                    this.f307z = 12;
                    return 12;
                }
                if (iH4 == 125) {
                    if (i20 != 5) {
                        this.f307z = 2;
                        return 2;
                    }
                    e0("Expected name");
                    throw null;
                }
                c();
                this.f303v--;
                if (o((char) iH4)) {
                    this.f307z = 14;
                    return 14;
                }
                e0("Expected name");
                throw null;
            }
            if (i20 != 4) {
                if (i20 == 6) {
                    if (this.f301t) {
                        H(true);
                        int i21 = this.f303v;
                        this.f303v = i21 - 1;
                        if (i21 + 4 <= this.f304w || j(5)) {
                            int i22 = this.f303v;
                            if (cArr[i22] == ')' && cArr[i22 + 1] == ']' && cArr[i22 + 2] == '}' && cArr[i22 + 3] == '\'' && cArr[i22 + 4] == '\n') {
                                this.f303v = i22 + 5;
                            }
                        }
                    }
                    this.f296D[this.f297E - 1] = 7;
                } else if (i20 == 7) {
                    i10 = 0;
                    if (H(false) == -1) {
                        this.f307z = 17;
                        return 17;
                    }
                    c();
                    this.f303v--;
                } else {
                    i10 = 0;
                    if (i20 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iH2 = H(true);
                if (iH2 != 34) {
                    this.f307z = 9;
                    return 9;
                }
                if (iH2 != 39) {
                    c();
                    this.f307z = 8;
                    return 8;
                }
                if (iH2 != 44 && iH2 != 59) {
                    if (iH2 != 91) {
                        this.f307z = 3;
                        return 3;
                    }
                    if (iH2 != 93) {
                        if (iH2 != 123) {
                            this.f307z = 1;
                            return 1;
                        }
                        int i23 = this.f303v - 1;
                        this.f303v = i23;
                        c10 = cArr[i23];
                        if (c10 != 't' || c10 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i11 = 5;
                        } else {
                            if (c10 != 'f' && c10 != 'F') {
                                if (c10 != 'n' && c10 != 'N') {
                                    i11 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i11 = 7;
                                if (i11 != 0) {
                                    return i11;
                                }
                                int i24 = this.f303v;
                                i13 = this.f304w;
                                i14 = i10;
                                i15 = i14;
                                int i25 = i15;
                                i16 = i24;
                                z6 = true;
                                long j = 0;
                                while (true) {
                                    if (i16 + i15 != i13) {
                                        c12 = cArr[i16 + i15];
                                        if (c12 != '+') {
                                            if (c12 != 'E' || c12 == 'e') {
                                                if (i14 != 2 || i14 == 4) {
                                                    i14 = 5;
                                                    i15++;
                                                }
                                            } else if (c12 == '-') {
                                                if (i14 == 0) {
                                                    i14 = 1;
                                                    i25 = 1;
                                                } else {
                                                    if (i14 != 5) {
                                                    }
                                                    i14 = 6;
                                                }
                                                i15++;
                                            } else if (c12 != '.') {
                                                if (c12 >= '0' && c12 <= '9') {
                                                    if (i14 == 1 || i14 == 0) {
                                                        j = -(c12 - '0');
                                                        i14 = 2;
                                                    } else if (i14 == 2) {
                                                        if (j != 0) {
                                                            long j10 = (10 * j) - ((long) (c12 - '0'));
                                                            z6 &= j > -922337203685477580L || (j == -922337203685477580L && j10 < j);
                                                            j = j10;
                                                        }
                                                    } else if (i14 == 3) {
                                                        i14 = 4;
                                                    } else if (i14 == 5 || i14 == 6) {
                                                        i14 = 7;
                                                    }
                                                    i15++;
                                                } else if (!o(c12)) {
                                                    i18 = 2;
                                                    if (i14 != 2) {
                                                        if (i14 != i18 || i14 == 4 || i14 == 7) {
                                                            this.f294B = i15;
                                                            i17 = 16;
                                                            this.f307z = 16;
                                                        }
                                                    } else if (z6 || ((j == Long.MIN_VALUE && i25 == 0) || (j == 0 && i25 != 0))) {
                                                        i18 = 2;
                                                        if (i14 != i18) {
                                                        }
                                                        this.f294B = i15;
                                                        i17 = 16;
                                                        this.f307z = 16;
                                                    } else {
                                                        if (i25 == 0) {
                                                            j = -j;
                                                        }
                                                        this.f293A = j;
                                                        this.f303v += i15;
                                                        i17 = 15;
                                                        this.f307z = 15;
                                                    }
                                                }
                                            } else if (i14 == 2) {
                                                i14 = 3;
                                                i15++;
                                            }
                                            if (i17 != 0) {
                                                return i17;
                                            }
                                            if (o(cArr[this.f303v])) {
                                                e0("Expected value");
                                                throw null;
                                            }
                                            c();
                                            this.f307z = 10;
                                            return 10;
                                        }
                                        if (i14 != 5) {
                                        }
                                        i14 = 6;
                                        i15++;
                                    } else if (i15 != cArr.length) {
                                        if (j(i15 + 1)) {
                                            i16 = this.f303v;
                                            i13 = this.f304w;
                                            c12 = cArr[i16 + i15];
                                            if (c12 != '+') {
                                                if (c12 != 'E') {
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                } else {
                                                    if (i14 != 2) {
                                                    }
                                                    i14 = 5;
                                                    i15++;
                                                }
                                                if (i17 != 0) {
                                                    return i17;
                                                }
                                                if (o(cArr[this.f303v])) {
                                                    e0("Expected value");
                                                    throw null;
                                                }
                                                c();
                                                this.f307z = 10;
                                                return 10;
                                            }
                                            if (i14 != 5) {
                                            }
                                            i14 = 6;
                                            i15++;
                                        }
                                        i18 = 2;
                                        if (i14 != 2) {
                                            if (i14 != i18) {
                                            }
                                            this.f294B = i15;
                                            i17 = 16;
                                            this.f307z = 16;
                                        } else {
                                            if (z6) {
                                            }
                                            i18 = 2;
                                            if (i14 != i18) {
                                            }
                                            this.f294B = i15;
                                            i17 = 16;
                                            this.f307z = 16;
                                        }
                                        if (i17 != 0) {
                                            return i17;
                                        }
                                        if (o(cArr[this.f303v])) {
                                            e0("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.f307z = 10;
                                        return 10;
                                    }
                                    i17 = 0;
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (o(cArr[this.f303v])) {
                                        e0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f307z = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i11 = 6;
                        }
                        length = str.length();
                        i12 = 1;
                        while (true) {
                            if (i12 >= length) {
                                if ((this.f303v + length < this.f304w && !j(length + 1)) || !o(cArr[this.f303v + length])) {
                                    this.f303v += length;
                                    this.f307z = i11;
                                    break;
                                }
                                break;
                            }
                            if ((this.f303v + i12 >= this.f304w || j(i12 + 1)) && ((c11 = cArr[this.f303v + i12]) == str.charAt(i12) || c11 == str2.charAt(i12))) {
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        int i26 = this.f303v;
                        i13 = this.f304w;
                        i14 = i10;
                        i15 = i14;
                        int i27 = i15;
                        i16 = i26;
                        z6 = true;
                        long j11 = 0;
                        while (true) {
                            if (i16 + i15 != i13) {
                                c12 = cArr[i16 + i15];
                                if (c12 != '+') {
                                    if (c12 != 'E') {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    } else {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    }
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (o(cArr[this.f303v])) {
                                        e0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f307z = 10;
                                    return 10;
                                }
                                if (i14 != 5) {
                                }
                                i14 = 6;
                                i15++;
                            } else if (i15 != cArr.length) {
                                if (j(i15 + 1)) {
                                    i16 = this.f303v;
                                    i13 = this.f304w;
                                    c12 = cArr[i16 + i15];
                                    if (c12 != '+') {
                                        if (c12 != 'E') {
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                        } else {
                                            if (i14 != 2) {
                                            }
                                            i14 = 5;
                                            i15++;
                                        }
                                        if (i17 != 0) {
                                            return i17;
                                        }
                                        if (o(cArr[this.f303v])) {
                                            e0("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.f307z = 10;
                                        return 10;
                                    }
                                    if (i14 != 5) {
                                    }
                                    i14 = 6;
                                    i15++;
                                }
                                i18 = 2;
                                if (i14 != 2) {
                                    if (i14 != i18) {
                                    }
                                    this.f294B = i15;
                                    i17 = 16;
                                    this.f307z = 16;
                                } else {
                                    if (z6) {
                                    }
                                    i18 = 2;
                                    if (i14 != i18) {
                                    }
                                    this.f294B = i15;
                                    i17 = 16;
                                    this.f307z = 16;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (o(cArr[this.f303v])) {
                                    e0("Expected value");
                                    throw null;
                                }
                                c();
                                this.f307z = 10;
                                return 10;
                            }
                            i17 = 0;
                            if (i17 != 0) {
                                return i17;
                            }
                            if (o(cArr[this.f303v])) {
                                e0("Expected value");
                                throw null;
                            }
                            c();
                            this.f307z = 10;
                            return 10;
                        }
                    }
                    if (i20 == 1) {
                        this.f307z = 4;
                        return 4;
                    }
                }
                if (i20 == 1 && i20 != 2) {
                    e0("Unexpected value");
                    throw null;
                }
                c();
                this.f303v--;
                this.f307z = 7;
                return 7;
            }
            iArr[i19] = 5;
            int iH5 = H(true);
            if (iH5 != 58) {
                if (iH5 != 61) {
                    e0("Expected ':'");
                    throw null;
                }
                c();
                if (this.f303v < this.f304w || j(1)) {
                    int i28 = this.f303v;
                    if (cArr[i28] == '>') {
                        this.f303v = i28 + 1;
                    }
                }
            }
        }
        i10 = 0;
        iH2 = H(true);
        if (iH2 != 34) {
            this.f307z = 9;
            return 9;
        }
        if (iH2 != 39) {
            c();
            this.f307z = 8;
            return 8;
        }
        if (iH2 != 44) {
            if (iH2 != 91) {
                this.f307z = 3;
                return 3;
            }
            if (iH2 != 93) {
                if (iH2 != 123) {
                    this.f307z = 1;
                    return 1;
                }
                int i29 = this.f303v - 1;
                this.f303v = i29;
                c10 = cArr[i29];
                if (c10 != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i11 = 5;
                    length = str.length();
                    i12 = 1;
                    while (true) {
                        if (i12 >= length) {
                            if (this.f303v + length < this.f304w) {
                            }
                            this.f303v += length;
                            this.f307z = i11;
                            break;
                        }
                        i12 = this.f303v + i12 >= this.f304w ? i12 + 1 : i12 + 1;
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    int i210 = this.f303v;
                    i13 = this.f304w;
                    i14 = i10;
                    i15 = i14;
                    int i211 = i15;
                    i16 = i210;
                    z6 = true;
                    long j12 = 0;
                    while (true) {
                        if (i16 + i15 != i13) {
                            c12 = cArr[i16 + i15];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (o(cArr[this.f303v])) {
                                    e0("Expected value");
                                    throw null;
                                }
                                c();
                                this.f307z = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        } else if (i15 != cArr.length) {
                            if (j(i15 + 1)) {
                                i16 = this.f303v;
                                i13 = this.f304w;
                                c12 = cArr[i16 + i15];
                                if (c12 != '+') {
                                    if (c12 != 'E') {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    } else {
                                        if (i14 != 2) {
                                        }
                                        i14 = 5;
                                        i15++;
                                    }
                                    if (i17 != 0) {
                                        return i17;
                                    }
                                    if (o(cArr[this.f303v])) {
                                        e0("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f307z = 10;
                                    return 10;
                                }
                                if (i14 != 5) {
                                }
                                i14 = 6;
                                i15++;
                            }
                            i18 = 2;
                            if (i14 != 2) {
                                if (i14 != i18) {
                                }
                                this.f294B = i15;
                                i17 = 16;
                                this.f307z = 16;
                            } else {
                                if (z6) {
                                }
                                i18 = 2;
                                if (i14 != i18) {
                                }
                                this.f294B = i15;
                                i17 = 16;
                                this.f307z = 16;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (o(cArr[this.f303v])) {
                                e0("Expected value");
                                throw null;
                            }
                            c();
                            this.f307z = 10;
                            return 10;
                        }
                        i17 = 0;
                        if (i17 != 0) {
                            return i17;
                        }
                        if (o(cArr[this.f303v])) {
                            e0("Expected value");
                            throw null;
                        }
                        c();
                        this.f307z = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i11 = 5;
                length = str.length();
                i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (this.f303v + length < this.f304w) {
                        }
                        this.f303v += length;
                        this.f307z = i11;
                        break;
                    }
                    if (this.f303v + i12 >= this.f304w) {
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                int i212 = this.f303v;
                i13 = this.f304w;
                i14 = i10;
                i15 = i14;
                int i213 = i15;
                i16 = i212;
                z6 = true;
                long j13 = 0;
                while (true) {
                    if (i16 + i15 != i13) {
                        c12 = cArr[i16 + i15];
                        if (c12 != '+') {
                            if (c12 != 'E') {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            } else {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (o(cArr[this.f303v])) {
                                e0("Expected value");
                                throw null;
                            }
                            c();
                            this.f307z = 10;
                            return 10;
                        }
                        if (i14 != 5) {
                        }
                        i14 = 6;
                        i15++;
                    } else if (i15 != cArr.length) {
                        if (j(i15 + 1)) {
                            i16 = this.f303v;
                            i13 = this.f304w;
                            c12 = cArr[i16 + i15];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (o(cArr[this.f303v])) {
                                    e0("Expected value");
                                    throw null;
                                }
                                c();
                                this.f307z = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        }
                        i18 = 2;
                        if (i14 != 2) {
                            if (i14 != i18) {
                            }
                            this.f294B = i15;
                            i17 = 16;
                            this.f307z = 16;
                        } else {
                            if (z6) {
                            }
                            i18 = 2;
                            if (i14 != i18) {
                            }
                            this.f294B = i15;
                            i17 = 16;
                            this.f307z = 16;
                        }
                        if (i17 != 0) {
                            return i17;
                        }
                        if (o(cArr[this.f303v])) {
                            e0("Expected value");
                            throw null;
                        }
                        c();
                        this.f307z = 10;
                        return 10;
                    }
                    i17 = 0;
                    if (i17 != 0) {
                        return i17;
                    }
                    if (o(cArr[this.f303v])) {
                        e0("Expected value");
                        throw null;
                    }
                    c();
                    this.f307z = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                int i214 = this.f303v;
                i13 = this.f304w;
                i14 = i10;
                i15 = i14;
                int i215 = i15;
                i16 = i214;
                z6 = true;
                long j14 = 0;
                while (true) {
                    if (i16 + i15 != i13) {
                        c12 = cArr[i16 + i15];
                        if (c12 != '+') {
                            if (c12 != 'E') {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            } else {
                                if (i14 != 2) {
                                }
                                i14 = 5;
                                i15++;
                            }
                            if (i17 != 0) {
                                return i17;
                            }
                            if (o(cArr[this.f303v])) {
                                e0("Expected value");
                                throw null;
                            }
                            c();
                            this.f307z = 10;
                            return 10;
                        }
                        if (i14 != 5) {
                        }
                        i14 = 6;
                        i15++;
                    } else if (i15 != cArr.length) {
                        if (j(i15 + 1)) {
                            i16 = this.f303v;
                            i13 = this.f304w;
                            c12 = cArr[i16 + i15];
                            if (c12 != '+') {
                                if (c12 != 'E') {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                } else {
                                    if (i14 != 2) {
                                    }
                                    i14 = 5;
                                    i15++;
                                }
                                if (i17 != 0) {
                                    return i17;
                                }
                                if (o(cArr[this.f303v])) {
                                    e0("Expected value");
                                    throw null;
                                }
                                c();
                                this.f307z = 10;
                                return 10;
                            }
                            if (i14 != 5) {
                            }
                            i14 = 6;
                            i15++;
                        }
                        i18 = 2;
                        if (i14 != 2) {
                            if (i14 != i18) {
                            }
                            this.f294B = i15;
                            i17 = 16;
                            this.f307z = 16;
                        } else {
                            if (z6) {
                            }
                            i18 = 2;
                            if (i14 != i18) {
                            }
                            this.f294B = i15;
                            i17 = 16;
                            this.f307z = 16;
                        }
                        if (i17 != 0) {
                            return i17;
                        }
                        if (o(cArr[this.f303v])) {
                            e0("Expected value");
                            throw null;
                        }
                        c();
                        this.f307z = 10;
                        return 10;
                    }
                    i17 = 0;
                    if (i17 != 0) {
                        return i17;
                    }
                    if (o(cArr[this.f303v])) {
                        e0("Expected value");
                        throw null;
                    }
                    c();
                    this.f307z = 10;
                    return 10;
                }
            }
            if (i20 == 1) {
                this.f307z = 4;
                return 4;
            }
        }
        if (i20 == 1) {
        }
        c();
        this.f303v--;
        this.f307z = 7;
        return 7;
    }

    public final void h() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + E0.a.q(X()) + p());
        }
        int i10 = this.f297E;
        this.f297E = i10 - 1;
        int[] iArr = this.f299G;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f307z = 0;
    }

    public final void i() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + E0.a.q(X()) + p());
        }
        int i10 = this.f297E;
        int i11 = i10 - 1;
        this.f297E = i11;
        this.f298F[i11] = null;
        int[] iArr = this.f299G;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f307z = 0;
    }

    public final boolean j(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f306y;
        int i14 = this.f303v;
        this.f306y = i13 - i14;
        int i15 = this.f304w;
        char[] cArr = this.f302u;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f304w = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f304w = 0;
        }
        this.f303v = 0;
        do {
            int i17 = this.f304w;
            int i18 = this.f300s.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f304w + i18;
            this.f304w = i11;
            if (this.f305x == 0 && (i12 = this.f306y) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f303v++;
                this.f306y = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String l(boolean z6) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f297E;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f296D[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f299G[i10];
                if (z6 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String str = this.f298F[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
            i10++;
        }
    }

    public final boolean n() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4 || iG == 17) ? false : true;
    }

    public final boolean o(char c10) throws MalformedJsonException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public final String p() {
        return " at line " + (this.f305x + 1) + " column " + ((this.f303v - this.f306y) + 1) + " path " + l(false);
    }

    public final boolean t() throws IOException {
        int iG = this.f307z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.f307z = 0;
            int[] iArr = this.f299G;
            int i10 = this.f297E - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iG != 6) {
            throw new IllegalStateException("Expected a boolean but was " + E0.a.q(X()) + p());
        }
        this.f307z = 0;
        int[] iArr2 = this.f299G;
        int i11 = this.f297E - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final String toString() {
        return a.class.getSimpleName() + p();
    }
}
