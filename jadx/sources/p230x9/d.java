package p230x9;

import A1.C0099h;
import B1.b;
import C1.a;
import C8.InterfaceC0175c;
import N1.n;
import N6.i;
import T6.k;
import U.B0;
import U.U;
import V1.c;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zze;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.gson.internal.l;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import ma.z;
import o1.f;
import org.chromium.net.UrlRequest;
import p091j3.E;
import p156q0.N;
import p232y1.e;
import y0.C0878p;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, a, zaq, zze, n, SuccessContinuation, c, E, i, l, T, p199u7.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f15793t = new d(26);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f15794u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15795s;

    public /* synthetic */ d(int i10) {
        this.f15795s = i10;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[LOOP:1: B:16:0x0045->B:55:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00af A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static ma.i p(String str) {
        char c10;
        char c11;
        ma.i iVar;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        char c12 = 'A';
        p210v8.i.f(str, "<this>");
        byte[] bArr = z.a;
        int length = str.length();
        while (true) {
            c10 = '\t';
            c11 = ' ';
            if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                break;
            }
            length--;
        }
        int i13 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i13];
        int i14 = 0;
        if (length > 0) {
            i11 = 0;
            int i15 = 0;
            int i16 = 0;
            iVar = null;
            while (true) {
                int i17 = i14 + 1;
                char cCharAt2 = str.charAt(i14);
                char c13 = c12;
                if (c12 <= cCharAt2 && cCharAt2 <= 'Z') {
                    i12 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 <= 'z') {
                    i12 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                    i12 = cCharAt2 + 4;
                } else {
                    if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 == '/' || cCharAt2 == '_') {
                            i12 = 63;
                        } else if (cCharAt2 == '\n' || cCharAt2 == '\r' || cCharAt2 == c11 || cCharAt2 == c10) {
                            i10 = i16;
                            if (i17 >= length) {
                                i14 = i15;
                            } else {
                                i16 = i10;
                                i14 = i17;
                                c12 = c13;
                                c10 = '\t';
                                c11 = ' ';
                            }
                        }
                        bArrCopyOf = iVar;
                        if (bArrCopyOf != 0) {
                            return new ma.i(bArrCopyOf);
                        }
                        return iVar;
                    }
                    i12 = 62;
                }
                i10 = (i16 << 6) | i12;
                i15++;
                if (i15 % 4 == 0) {
                    bArrCopyOf[i11] = (byte) (i10 >> 16);
                    int i18 = i11 + 2;
                    bArrCopyOf[i11 + 1] = (byte) (i10 >> 8);
                    i11 += 3;
                    bArrCopyOf[i18] = (byte) i10;
                }
                if (i17 >= length) {
                    i14 = i15;
                } else {
                    i16 = i10;
                    i14 = i17;
                    c12 = c13;
                    c10 = '\t';
                    c11 = ' ';
                }
            }
        } else {
            iVar = null;
            i10 = 0;
            i11 = 0;
        }
        int i19 = i14 % 4;
        if (i19 != 1) {
            if (i19 == 2) {
                bArrCopyOf[i11] = (byte) ((i10 << 12) >> 16);
                i11 = 1 + i11;
            } else if (i19 == 3) {
                int i20 = i10 << 6;
                int i21 = 1 + i11;
                bArrCopyOf[i11] = (byte) (i20 >> 16);
                i11 += 2;
                bArrCopyOf[i21] = (byte) (i20 >> 8);
            }
            if (i11 != i13) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                p210v8.i.e(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            }
        } else {
            bArrCopyOf = iVar;
        }
        if (bArrCopyOf != 0) {
            return new ma.i(bArrCopyOf);
        }
        return iVar;
    }

    public static ma.i q(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(p210v8.i.k(str, "Unexpected hex string: ").toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i10 = length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                int i13 = i11 * 2;
                bArr[i11] = (byte) (na.b.a(str.charAt(i13 + 1)) + (na.b.a(str.charAt(i13)) << 4));
                if (i12 > i10) {
                    break;
                }
                i11 = i12;
            }
        }
        return new ma.i(bArr);
    }

    public static ma.i r(String str) {
        p210v8.i.f(str, "<this>");
        byte[] bytes = str.getBytes(L9.a.a);
        p210v8.i.e(bytes, "(this as java.lang.String).getBytes(charset)");
        ma.i iVar = new ma.i(bytes);
        iVar.f13194u = str;
        return iVar;
    }

    public static InputStream t(String str) {
        p210v8.i.f(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }

    public static ma.i u(byte[] bArr) {
        ma.i iVar = ma.i.f13191v;
        int length = bArr.length;
        f.c(bArr.length, 0, length);
        com.bumptech.glide.c.d(length, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
        p210v8.i.e(bArrCopyOfRange, "copyOfRange(...)");
        return new ma.i(bArrCopyOfRange);
    }

    @Override // C1.a
    public File a(e eVar) {
        return null;
    }

    @Override // B1.b
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // androidx.lifecycle.T
    public Q e(Class cls) {
        switch (this.f15795s) {
            case 25:
                return new N(true);
            default:
                return new C0878p();
        }
    }

    @Override // B1.b
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // androidx.lifecycle.T
    public Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        switch (this.f15795s) {
            case 25:
                break;
        }
        return i(p068ga.d.o(interfaceC0175c), bVar);
    }

    @Override // B1.b
    public void h(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // androidx.lifecycle.T
    public Q i(Class cls, u0.b bVar) {
        switch (this.f15795s) {
            case 25:
                break;
        }
        return e(cls);
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f15795s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                view.setTranslationX((-f10) * view.getWidth());
                if (Math.abs(f10) < 0.5d) {
                    view.setVisibility(0);
                    view.setScaleX(1.0f - Math.abs(f10));
                    view.setScaleY(1.0f - Math.abs(f10));
                } else if (Math.abs(f10) > 0.5d) {
                    view.setVisibility(8);
                }
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setRotation((1.0f - Math.abs(f10)) * 360.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotation((1.0f - Math.abs(f10)) * (-360.0f));
                }
                break;
            case 15:
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * 90.0f);
                }
                break;
            case 16:
                view.setTranslationX((-f10) * view.getWidth());
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * 90.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                }
                break;
            default:
                view.setTranslationX((-f10) * view.getWidth());
                view.setCameraDistance(20000.0f);
                double d3 = f10;
                if (d3 >= 0.5d || d3 <= -0.5d) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 1080.0f);
                    view.setTranslationY(Math.abs(f10) * (-1000.0f));
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                    view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * (-1080.0f));
                    view.setTranslationY(Math.abs(f10) * (-1000.0f));
                }
                break;
        }
    }

    @Override // p091j3.E
    public B0 k(View view, B0 b3, k kVar) {
        kVar.f4696d = b3.a() + kVar.f4696d;
        WeakHashMap weakHashMap = U.a;
        boolean z6 = view.getLayoutDirection() == 1;
        int iB = b3.b();
        int iC = b3.c();
        int i10 = kVar.a + (z6 ? iC : iB);
        kVar.a = i10;
        int i11 = kVar.f4695c;
        if (!z6) {
            iB = iC;
        }
        int i12 = i11 + iB;
        kVar.f4695c = i12;
        view.setPaddingRelative(i10, kVar.f4694b, i12, kVar.f4696d);
        return b3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) {
        return Tasks.e(Boolean.TRUE);
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        return new ArrayList();
    }

    public Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // B1.b
    public void o() {
    }

    @Override // V1.c
    public void b(Object obj) {
    }

    @Override // B1.b
    public void l(int i10) {
    }

    @Override // C1.a
    public void d(e eVar, C0099h c0099h) {
    }
}
