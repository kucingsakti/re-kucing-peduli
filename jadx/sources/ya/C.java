package ya;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class C extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0880a f16142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16143f;

    public C(Method method, int i10, String str, boolean z6) {
        C0880a c0880a = C0880a.f16201t;
        this.f16139b = method;
        this.f16140c = i10;
        Objects.requireNonNull(str, "name == null");
        this.f16141d = str;
        this.f16142e = c0880a;
        this.f16143f = z6;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) throws EOFException {
        String strJ;
        String str = this.f16141d;
        if (obj == null) {
            throw T.k(this.f16139b, this.f16140c, E0.a.i("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f16142e.getClass();
        String string = obj.toString();
        if (i10.f16152c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strJ = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z6 = this.f16143f;
            int i11 = 47;
            int i12 = -1;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z6 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                ma.f fVar = new ma.f();
                fVar.h0(0, string, iCharCount);
                ma.f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z6 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i12 || (!z6 && (iCodePointAt2 == i11 || iCodePointAt2 == 37))) {
                            if (fVar2 == null) {
                                fVar2 = new ma.f();
                            }
                            fVar2.j0(iCodePointAt2);
                            while (!fVar2.j()) {
                                byte bT = fVar2.t();
                                fVar.d0(37);
                                char[] cArr = I.f16149l;
                                fVar.d0(cArr[((bT & 255) >> 4) & 15]);
                                fVar.d0(cArr[bT & 15]);
                            }
                        } else {
                            fVar.j0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i11 = 47;
                    i12 = -1;
                }
                strJ = fVar.J();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = i10.f16152c.replace("{" + str + "}", strJ);
        if (I.f16150m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        }
        i10.f16152c = strReplace;
    }
}
