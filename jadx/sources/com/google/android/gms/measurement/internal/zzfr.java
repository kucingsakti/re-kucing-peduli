package com.google.android.gms.measurement.internal;

import A1.r;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzfr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f9044b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f9045c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f9046d = new AtomicReference();
    public final r a;

    public zzfr(r rVar) {
        this.a = rVar;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.i(atomicReference);
        Preconditions.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        String strE;
        if (bundle == null) {
            return null;
        }
        if (!this.a.O()) {
            return bundle.toString();
        }
        StringBuilder sbC = e.c("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbC.length() != 8) {
                sbC.append(", ");
            }
            sbC.append(f(str));
            sbC.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strE = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strE = e((Object[]) obj);
            } else {
                strE = obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbC.append(strE);
        }
        sbC.append("}]");
        return sbC.toString();
    }

    public final String b(zzbd zzbdVar) {
        String string;
        r rVar = this.a;
        if (!rVar.O()) {
            return zzbdVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbdVar.f8925u);
        sb.append(",name=");
        sb.append(c(zzbdVar.f8923s));
        sb.append(",params=");
        zzbc zzbcVar = zzbdVar.f8924t;
        if (zzbcVar == null) {
            string = null;
        } else {
            string = !rVar.O() ? zzbcVar.f8922s.toString() : a(zzbcVar.T());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.O() ? str : d(str, zziq.f9180c, zziq.a, f9044b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbC = e.c("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sbC.length() != 1) {
                    sbC.append(", ");
                }
                sbC.append(strA);
            }
        }
        sbC.append("]");
        return sbC.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.O() ? str : d(str, zzip.f9176b, zzip.a, f9045c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.O()) {
            return str.startsWith("_exp_") ? E0.a.i("experiment_id(", str, ")") : d(str, zzis.f9182b, zzis.a, f9046d);
        }
        return str;
    }
}
