package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    public static double a(double d3) {
        if (Double.isNaN(d3)) {
            return 0.0d;
        }
        if (Double.isInfinite(d3) || d3 == 0.0d || d3 == -0.0d) {
            return d3;
        }
        return Math.floor(Math.abs(d3)) * ((double) (d3 > 0.0d ? 1 : -1));
    }

    public static zzbv b(String str) {
        zzbv zzbvVar;
        if (str == null || str.isEmpty()) {
            zzbvVar = null;
        } else {
            zzbvVar = (zzbv) zzbv.f8491D0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbvVar != null) {
            return zzbvVar;
        }
        throw new IllegalArgumentException(E0.a.h("Unsupported commandId ", str));
    }

    public static Object c(zzaq zzaqVar) {
        if (zzaq.j.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.f8465i.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return d((zzap) zzaqVar);
        }
        if (!(zzaqVar instanceof zzaf)) {
            return !zzaqVar.e().isNaN() ? zzaqVar.e() : zzaqVar.f();
        }
        ArrayList arrayList = new ArrayList();
        zzaf zzafVar = (zzaf) zzaqVar;
        zzafVar.getClass();
        int i10 = 0;
        while (i10 < zzafVar.s()) {
            if (i10 >= zzafVar.s()) {
                throw new NoSuchElementException(AbstractC0487g.g(i10, "Out of bounds index: "));
            }
            int i11 = i10 + 1;
            Object objC = c(zzafVar.q(i10));
            if (objC != null) {
                arrayList.add(objC);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static HashMap d(zzap zzapVar) {
        HashMap map = new HashMap();
        zzapVar.getClass();
        for (String str : new ArrayList(zzapVar.f8464s.keySet())) {
            Object objC = c(zzapVar.k(str));
            if (objC != null) {
                map.put(str, objC);
            }
        }
        return map;
    }

    public static void e(zzbv zzbvVar, int i10, ArrayList arrayList) {
        g(zzbvVar.name(), i10, arrayList);
    }

    public static void f(zzh zzhVar) {
        int i10 = i(zzhVar.c("runtime.counter").e().doubleValue() + 1.0d);
        if (i10 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzhVar.g("runtime.counter", new zzai(Double.valueOf(i10)));
    }

    public static void g(String str, int i10, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    public static boolean h(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.e().doubleValue()) || Double.isNaN(zzaqVar2.e().doubleValue())) {
                return false;
            }
            return zzaqVar.e().equals(zzaqVar2.e());
        }
        if (zzaqVar instanceof zzas) {
            return zzaqVar.f().equals(zzaqVar2.f());
        }
        if (zzaqVar instanceof zzag) {
            return zzaqVar.d().equals(zzaqVar2.d());
        }
        return zzaqVar == zzaqVar2;
    }

    public static int i(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3) || d3 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d3)) * ((double) (d3 > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static void j(zzbv zzbvVar, int i10, ArrayList arrayList) {
        k(zzbvVar.name(), i10, arrayList);
    }

    public static void k(String str, int i10, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    public static boolean l(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double dE = zzaqVar.e();
        return !dE.isNaN() && dE.doubleValue() >= 0.0d && dE.equals(Double.valueOf(Math.floor(dE.doubleValue())));
    }

    public static void m(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }
}
