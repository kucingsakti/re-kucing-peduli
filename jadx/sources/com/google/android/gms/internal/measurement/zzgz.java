package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgz<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f8651f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile P f8652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicInteger f8653h;
    public final zzhh a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f8656d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f8657e;

    static {
        new AtomicReference();
        new zzhn() { // from class: com.google.android.gms.internal.measurement.zzha
        };
        f8653h = new AtomicInteger();
    }

    public zzgz(zzhh zzhhVar, String str, Object obj) {
        zzhhVar.getClass();
        if (zzhhVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = zzhhVar;
        this.f8654b = str;
        this.f8655c = obj;
    }

    public static void e() {
        f8653h.incrementAndGet();
    }

    public final Object a() {
        int i10 = f8653h.get();
        if (this.f8656d < i10) {
            synchronized (this) {
                try {
                    if (this.f8656d < i10) {
                        P p10 = f8652g;
                        z3.b bVar = z3.a.f16304s;
                        String strA = null;
                        if (p10 != null) {
                            bVar = (z3.b) p10.f8355b.get();
                            if (bVar.b()) {
                                zzgt zzgtVar = (zzgt) bVar.a();
                                zzhh zzhhVar = this.a;
                                strA = zzgtVar.a(zzhhVar.a, zzhhVar.f8663c, this.f8654b);
                            }
                        }
                        if (!(p10 != null)) {
                            throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                        }
                        this.a.getClass();
                        Object objD = d(p10);
                        if (objD == null && (objD = b(p10)) == null) {
                            objD = this.f8655c;
                        }
                        if (bVar.b()) {
                            objD = strA == null ? this.f8655c : c(strA);
                        }
                        this.f8657e = objD;
                        this.f8656d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f8657e;
    }

    public final Object b(P p10) {
        S s9;
        String strC;
        if (!this.a.f8664d) {
            Context context = p10.a;
            synchronized (S.class) {
                try {
                    if (S.f8357v == null) {
                        S.f8357v = J.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new S(context, 0) : new S(0);
                    }
                    s9 = S.f8357v;
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzhh zzhhVar = this.a;
            if (zzhhVar.f8664d) {
                strC = null;
            } else {
                String str = zzhhVar.f8662b;
                strC = this.f8654b;
                if (str == null || !str.isEmpty()) {
                    strC = p231y.a.c(str, strC);
                }
            }
            Object objK = s9.k(strC);
            if (objK != null) {
                return c(objK);
            }
        }
        return null;
    }

    public abstract Object c(Object obj);

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzgy] */
    public final Object d(P p10) {
        Q qA;
        Uri uri = this.a.a;
        if (uri != null) {
            Context context = p10.a;
            z3.b bVar = zzgx.a;
            boolean zBooleanValue = false;
            if ("com.google.android.gms.phenotype".equals(uri.getAuthority())) {
                if (zzgx.a.b()) {
                    zBooleanValue = ((Boolean) zzgx.a.a()).booleanValue();
                } else {
                    synchronized (zzgx.f8650b) {
                        try {
                            if (zzgx.a.b()) {
                                zBooleanValue = ((Boolean) zzgx.a.a()).booleanValue();
                            } else {
                                try {
                                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                                        if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                        }
                                        zzgx.a = new z3.c(Boolean.valueOf(zBooleanValue));
                                        zBooleanValue = ((Boolean) zzgx.a.a()).booleanValue();
                                    }
                                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                        zBooleanValue = true;
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                zzgx.a = new z3.c(Boolean.valueOf(zBooleanValue));
                                zBooleanValue = ((Boolean) zzgx.a.a()).booleanValue();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (zBooleanValue) {
                this.a.getClass();
                qA = zzgk.a(p10.a.getContentResolver(), this.a.a, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgz.f8653h.incrementAndGet();
                    }
                });
            } else {
                qA = null;
            }
        } else {
            qA = zzhi.a(p10.a, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgz.f8653h.incrementAndGet();
                }
            });
        }
        if (qA != null) {
            String str = this.a.f8663c;
            String strC = this.f8654b;
            if (str == null || !str.isEmpty()) {
                strC = p231y.a.c(str, strC);
            }
            Object objK = qA.k(strC);
            if (objK != null) {
                return c(objK);
            }
        }
        return null;
    }
}
