package R;

import A1.ThreadFactoryC0093b;
import A1.l;
import J0.M;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final M a = new M(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f4422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p212w.i f4424d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0093b(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4422b = threadPoolExecutor;
        f4423c = new Object();
        f4424d = new p212w.i(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static f a(String str, Context context, Fa.e eVar, int i10) {
        M m2 = a;
        Typeface typeface = (Typeface) m2.g(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            l lVarA = c.a(context, eVar);
            int i11 = 1;
            h[] hVarArr = (h[]) lVarA.f123t;
            int i12 = lVarA.f122s;
            if (i12 != 0) {
                if (i12 != 1) {
                    i11 = -3;
                    break;
                }
                i11 = -2;
            } else if (hVarArr != null && hVarArr.length != 0) {
                i11 = 0;
                for (h hVar : hVarArr) {
                    int i13 = hVar.f4428e;
                    if (i13 != 0) {
                        if (i13 >= 0) {
                            i11 = i13;
                            break;
                        }
                        i11 = -3;
                        break;
                    }
                }
            }
            if (i11 != 0) {
                return new f(i11);
            }
            Typeface typefaceJ = L.g.a.j(context, hVarArr, i10);
            if (typefaceJ == null) {
                return new f(-3);
            }
            m2.k(str, typefaceJ);
            return new f(typefaceJ);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
