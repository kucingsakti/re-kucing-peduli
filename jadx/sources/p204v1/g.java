package p204v1;

import C0.l;
import C8.InterfaceC0175c;
import H1.C;
import N1.f;
import N6.i;
import N7.b;
import X9.F;
import X9.K;
import X9.L;
import Y9.c;
import android.content.Context;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.k;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.R;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.chromium.net.UrlRequest;
import p042e4.a;
import p068ga.d;
import p086i8.m;
import p188t1.G;
import p188t1.N;
import y0.C0872j;
import y0.C0878p;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
public class g implements l, a, C, f, Continuation, b, T, i, com.google.gson.internal.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile g f15397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static g f15398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static g f15399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static g f15400w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15401s;

    public /* synthetic */ g(int i10) {
        this.f15401s = i10;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f13842e;
        int length = bArr.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = (i15 + length) / 2;
            while (i16 > i14 && bArr[i16] != 10) {
                i16 += i14;
            }
            int i17 = i16 + 1;
            int i18 = 1;
            while (true) {
                i11 = i17 + i18;
                if (bArr[i11] == 10) {
                    break;
                }
                i18++;
            }
            int i19 = i11 - i17;
            int i20 = i10;
            boolean z10 = false;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (z10) {
                    i12 = 46;
                    z6 = false;
                } else {
                    byte b3 = bArr2[i20][i21];
                    byte[] bArr4 = c.a;
                    int i23 = b3 & 255;
                    z6 = z10;
                    i12 = i23;
                }
                byte b7 = bArr[i17 + i22];
                byte[] bArr5 = c.a;
                i13 = i12 - (b7 & 255);
                if (i13 != 0) {
                    break;
                }
                i22++;
                i21++;
                if (i22 == i19) {
                    break;
                }
                if (bArr2[i20].length != i21) {
                    z10 = z6;
                } else {
                    if (i20 == bArr2.length - 1) {
                        break;
                    }
                    i20++;
                    z10 = true;
                    i21 = -1;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i24 = i19 - i22;
                    int length2 = bArr2[i20].length - i21;
                    int length3 = bArr2.length;
                    for (int i25 = i20 + 1; i25 < length3; i25++) {
                        length2 += bArr2[i25].length;
                    }
                    if (length2 < i24) {
                        length = i16;
                    } else if (length2 <= i24) {
                        Charset charset = StandardCharsets.UTF_8;
                        p210v8.i.e(charset, "UTF_8");
                        return new String(bArr, i17, i19, charset);
                    }
                }
                i15 = i11 + 1;
            } else {
                length = i16;
            }
            i14 = -1;
        }
        return null;
    }

    public static final L d(L l4) {
        if ((l4 == null ? null : l4.f5537y) == null) {
            return l4;
        }
        K kG = l4.g();
        kG.f5519g = null;
        return kG.a();
    }

    public static ArrayList f(List list) {
        p210v8.i.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((F) obj) != F.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((F) it.next()).f5504s);
        }
        return arrayList2;
    }

    public static byte[] k(List list) {
        p210v8.i.f(list, "protocols");
        ma.f fVar = new ma.f();
        for (String str : f(list)) {
            fVar.d0(str.length());
            fVar.i0(str);
        }
        return fVar.A(fVar.f13190t);
    }

    public static C0872j l(Context context, x xVar, Bundle bundle, EnumC0519n enumC0519n, C0878p c0878p) {
        String string = UUID.randomUUID().toString();
        p210v8.i.e(string, "randomUUID().toString()");
        p210v8.i.f(xVar, "destination");
        p210v8.i.f(enumC0519n, "hostLifecycleState");
        return new C0872j(context, xVar, bundle, enumC0519n, c0878p, string, null);
    }

    public static Path m(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static boolean o() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean p(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object C(Task task) {
        return null;
    }

    @Override // C0.l
    public CharSequence b(Preference preference) {
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int iC = listPreference.C(listPreference.f6795n0);
        if (TextUtils.isEmpty((iC < 0 || (charSequenceArr2 = listPreference.f6793l0) == null) ? null : charSequenceArr2[iC])) {
            return listPreference.f6832s.getString(R.string.not_set);
        }
        int iC2 = listPreference.C(listPreference.f6795n0);
        if (iC2 < 0 || (charSequenceArr = listPreference.f6793l0) == null) {
            return null;
        }
        return charSequenceArr[iC2];
    }

    @Override // H1.C
    public void c(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    public Q e(Class cls) {
        switch (this.f15401s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return C3.a.e(cls);
            default:
                return new p213w0.a();
        }
    }

    @Override // androidx.lifecycle.T
    public Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        switch (this.f15401s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
        }
        return i(d.o(interfaceC0175c), bVar);
    }

    public float h(float f10, float f11) {
        return 1.0f;
    }

    public Q i(Class cls, u0.b bVar) {
        switch (this.f15401s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
        }
        return e(cls);
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f15401s) {
            case 15:
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(view.getWidth());
                    view.setRotationY(Math.abs(f10) * (-90.0f));
                } else if (f10 <= 1.0f) {
                    view.setAlpha(1.0f);
                    view.setPivotX(0.0f);
                    view.setRotationY(Math.abs(f10) * 90.0f);
                } else {
                    view.setAlpha(0.0f);
                }
                if (Math.abs(f10) <= 0.5d) {
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                } else if (Math.abs(f10) <= 1.0f) {
                    view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                }
                break;
            case 16:
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
                    view.setRotation(Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * 36000.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotation(Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * Math.abs(f10) * (-36000.0f));
                }
                break;
            default:
                view.setTranslationX((-f10) * view.getWidth());
                view.setCameraDistance(12000.0f);
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
                    view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * 900.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * (-900.0f));
                }
                break;
        }
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        switch (this.f15401s) {
            case 19:
                return new ArrayDeque();
            default:
                return new k(true);
        }
    }

    public String toString() {
        switch (this.f15401s) {
            case 10:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public g(MainApp mainApp, p195u1.b bVar) {
        this.f15401s = 0;
        o1.c cVar = new o1.c(mainApp);
        S s9 = new S((N) cVar.f13623t);
        if (f.f15392f == null) {
            synchronized (f.class) {
                try {
                    if (f.f15392f == null) {
                        f.f15392f = new f(bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f fVar = f.f15392f;
        new i(mainApp, s9, ((N) cVar.f13623t).f14988f.a, G.a(cVar, bVar, mainApp, (e) fVar.f15395d), fVar, bVar);
    }

    @Override // N7.b
    public void accept(Object obj) {
    }
}
