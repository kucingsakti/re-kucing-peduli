package com.google.android.gms.measurement.internal;

import M2.L;
import M2.RunnableC0308q;
import M2.r;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoi;

/* JADX INFO: loaded from: classes.dex */
public final class zzfw extends L {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final zzfy f9047A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final zzfy f9048B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final zzfy f9049C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final zzfy f9050D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final zzfy f9051E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final zzfy f9052F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public char f9053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f9055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzfy f9056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzfy f9057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final zzfy f9058z;

    public zzfw(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9053u = (char) 0;
        this.f9054v = -1L;
        this.f9056x = new zzfy(this, 6, false, false);
        this.f9057y = new zzfy(this, 6, true, false);
        this.f9058z = new zzfy(this, 6, false, true);
        this.f9047A = new zzfy(this, 5, false, false);
        this.f9048B = new zzfy(this, 5, true, false);
        this.f9049C = new zzfy(this, 5, false, true);
        this.f9050D = new zzfy(this, 4, false, false);
        this.f9051E = new zzfy(this, 3, false, false);
        this.f9052F = new zzfy(this, 2, false, false);
    }

    public static r a1(String str) {
        if (str == null) {
            return null;
        }
        return new r(str);
    }

    public static String b1(Object obj, boolean z6) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z6) {
                return String.valueOf(obj);
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l4.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof r) {
                return ((r) obj).a;
            }
            return z6 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z6 ? th.getClass().getName() : th.toString());
        String strF1 = f1(zzhj.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && f1(className).equals(strF1)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    public static String c1(boolean z6, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strB1 = b1(obj, z6);
        String strB2 = b1(obj2, z6);
        String strB3 = b1(obj3, z6);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB1)) {
            sb.append(str2);
            sb.append(strB1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    public static String f1(String str) {
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                return str.substring(0, iLastIndexOf);
            }
            zzoi.f8819t.get();
            if (!((Boolean) zzbf.f9016w0.a(null)).booleanValue()) {
                return str;
            }
        }
        return "";
    }

    @Override // M2.L
    public final boolean Z0() {
        return false;
    }

    public final void d1(int i10, boolean z6, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z6 && e1(i10)) {
            Log.println(i10, k1(), c1(false, str, obj, obj2, obj3));
        }
        if (z10 || i10 < 5) {
            return;
        }
        Preconditions.i(str);
        zzhc zzhcVar = ((zzhj) this.f577s).f9116B;
        if (zzhcVar == null) {
            Log.println(6, k1(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzhcVar.f2917t) {
            Log.println(6, k1(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 9) {
            i10 = 8;
        }
        zzhcVar.f1(new RunnableC0308q(this, i10, str, obj, obj2, obj3));
    }

    public final boolean e1(int i10) {
        return Log.isLoggable(k1(), i10);
    }

    public final zzfy g1() {
        return this.f9051E;
    }

    public final zzfy h1() {
        return this.f9056x;
    }

    public final zzfy i1() {
        return this.f9052F;
    }

    public final zzfy j1() {
        return this.f9047A;
    }

    public final String k1() {
        String str;
        synchronized (this) {
            try {
                if (this.f9055w == null) {
                    String str2 = ((zzhj) this.f577s).f9143v;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f9055w = str2;
                }
                Preconditions.i(this.f9055w);
                str = this.f9055w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
