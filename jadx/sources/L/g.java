package L;

import A1.r;
import B4.I;
import J0.M;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final C4.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f2716b;

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            a = new l();
        } else if (i10 >= 28) {
            a = new k();
        } else if (i10 >= 26) {
            a = new j();
        } else if (i10 < 24) {
            a = new h();
        } else {
            Method method = i.f2724g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new i();
            } else {
                a = new h();
            }
        }
        f2716b = new M(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, K.e eVar, Resources resources, int i10, String str, int i11, int i12, K.b bVar, boolean z6) {
        Typeface typefaceI;
        Typeface typefaceCreate;
        int i13 = 9;
        int i14 = 6;
        int i15 = 1;
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i16 = -3;
        if (eVar instanceof K.h) {
            K.h hVar = (K.h) eVar;
            String str2 = hVar.f2494d;
            typefaceI = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new D4.a(bVar, i14, typefaceCreate));
                }
                return typefaceCreate;
            }
            Object[] objArr3 = !z6 ? bVar != null : hVar.f2493c != 0;
            int i17 = z6 ? hVar.f2492b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            r rVar = new r(19, z10);
            rVar.f167t = bVar;
            Fa.e eVar2 = hVar.a;
            o1.c cVar = new o1.c(rVar, i13, handler);
            if (objArr3 == true) {
                M m2 = R.g.a;
                String str3 = ((String) eVar2.f1663x) + "-" + i12;
                Typeface typeface = (Typeface) R.g.a.g(str3);
                if (typeface != null) {
                    handler.post(new P2.g(rVar, i15, typeface));
                    typefaceI = typeface;
                } else if (i17 == -1) {
                    R.f fVarA = R.g.a(str3, context, eVar2, i12);
                    cVar.u(fVarA);
                    typefaceI = fVarA.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    R.f fVar = (R.f) R.g.f4422b.submit(new R.d(str3, context, eVar2, i12, 0)).get(i17, TimeUnit.MILLISECONDS);
                                    cVar.u(fVar);
                                    typefaceI = fVar.a;
                                } catch (ExecutionException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e11) {
                            throw e11;
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) cVar.f13624u).post(new R.a(i16, (int) (objArr2 == true ? 1 : 0), cVar.f13623t));
                    }
                }
            } else {
                M m10 = R.g.a;
                String str4 = ((String) eVar2.f1663x) + "-" + i12;
                Typeface typeface2 = (Typeface) R.g.a.g(str4);
                if (typeface2 != null) {
                    handler.post(new P2.g(rVar, i15, typeface2));
                    typefaceI = typeface2;
                } else {
                    R.e eVar3 = new R.e(cVar, objArr == true ? 1 : 0);
                    synchronized (R.g.f4423c) {
                        try {
                            p212w.i iVar = R.g.f4424d;
                            ArrayList arrayList = (ArrayList) iVar.get(str4);
                            if (arrayList != null) {
                                arrayList.add(eVar3);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar3);
                                iVar.put(str4, arrayList2);
                                R.d dVar = new R.d(str4, context, eVar2, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = R.g.f4422b;
                                R.e eVar4 = new R.e(str4, i15);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                I i18 = new I(i13);
                                i18.f631t = dVar;
                                i18.f632u = eVar4;
                                i18.f633v = handler2;
                                threadPoolExecutor.execute(i18);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceI = a.i(context, (K.f) eVar, resources, i12);
            if (bVar != null) {
                if (typefaceI != null) {
                    new Handler(Looper.getMainLooper()).post(new D4.a(bVar, i14, typefaceI));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceI != null) {
            f2716b.k(b(resources, i10, str, i11, i12), typefaceI);
        }
        return typefaceI;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
