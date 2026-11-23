package za;

import A1.F;
import H1.n;
import L1.g;
import M2.O;
import N1.f;
import N6.i;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads_identifier.zzj;
import com.google.gson.internal.l;
import com.kcstream.cing.MainApp;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executors;
import org.chromium.net.UrlRequest;
import p086i8.C;
import p106l0.s;
import p140o4.r;
import p163q7.j;
import p232y1.h;
import p232y1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements V1.a, zzj, n, I6.a, k, f, W3.a, i, l, k2.b, j, p199u7.b, p232y1.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16342s;

    public /* synthetic */ c(int i10) {
        this.f16342s = i10;
    }

    public static void f() {
        for (c cVar : Ha.a.f1936b) {
            cVar.getClass();
            f();
        }
    }

    public static void h(Object... objArr) {
        p210v8.i.f(objArr, "args");
        for (c cVar : Ha.a.f1936b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            cVar.getClass();
            h(objArrCopyOf);
        }
    }

    public static void k(Object... objArr) {
        p210v8.i.f(objArr, "args");
        for (c cVar : Ha.a.f1936b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            cVar.getClass();
            k(objArrCopyOf);
        }
    }

    public static boolean l(p126n0.b bVar, Editable editable, int i10, int i11, boolean z6) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z6) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z10) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z10) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z10 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z11) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z11) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z11 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                s[] sVarArr = (s[]) editable.getSpans(selectionStart, iMin, s.class);
                if (sVarArr != null && sVarArr.length > 0) {
                    for (s sVar : sVarArr) {
                        int spanStart = editable.getSpanStart(sVar);
                        int spanEnd = editable.getSpanEnd(sVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static void m(Object... objArr) {
        p210v8.i.f(objArr, "args");
        for (c cVar : Ha.a.f1936b) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            cVar.getClass();
            m(objArrCopyOf);
        }
    }

    @Override // p232y1.b
    public boolean a(Object obj, File file, h hVar) throws Throwable {
        try {
            U1.b.d(((g) ((L1.c) ((F) obj).get()).f2742s.f2739b).a.f15734d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }

    @Override // I6.a
    public Object b() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public r c(MainApp mainApp) {
        r rVar;
        C.a(C.c("036DBADD0FFDD1"));
        r rVar2 = r.f13780z;
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (this) {
            rVar = r.f13780z;
            if (rVar == null) {
                rVar = new r(mainApp);
                r.f13780z = rVar;
            }
        }
        return rVar;
    }

    @Override // W3.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new O(Executors.newSingleThreadExecutor(), 2);
    }

    @Override // N6.i
    public void j(View view, float f10) {
        switch (this.f16342s) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                view.setTranslationX((-f10) * view.getWidth());
                if (Math.abs(f10) <= 0.5d) {
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
                    view.setRotation(Math.abs(f10) * 360.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotation(Math.abs(f10) * (-360.0f));
                }
                break;
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
                    view.setScaleY(Math.max(0.4f, Math.abs(f10)));
                }
                break;
            case 16:
                view.setTranslationX((-f10) * view.getWidth());
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                if (f10 < -1.0f) {
                    view.setAlpha(0.0f);
                } else if (f10 <= 0.0f) {
                    view.setRotation(Math.abs(f10) * 90.0f);
                    view.setAlpha(1.0f - Math.abs(f10));
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setRotation(0.0f);
                    view.setAlpha(1.0f);
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
                    view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * 180.0f);
                } else if (f10 > 1.0f) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                    view.setRotationY(((1.0f - Math.abs(f10)) + 1.0f) * (-180.0f));
                }
                break;
        }
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        return new ConcurrentSkipListMap();
    }

    @Override // V1.a
    public Object o() {
        switch (this.f16342s) {
            case 2:
                try {
                    return new C1.i(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                return new ArrayList();
        }
    }

    @Override // p163q7.j
    public boolean p() {
        return false;
    }

    @Override // p232y1.k
    public int r(h hVar) {
        return 1;
    }

    @Override // H1.n
    public void i() {
    }

    @Override // H1.n
    public void e(B1.b bVar, Bitmap bitmap) {
    }

    @Override // p232y1.f
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
