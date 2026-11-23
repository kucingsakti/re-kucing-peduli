package com.google.android.gms.measurement.internal;

import B4.I;
import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import p040e1.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzjc implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Bundle f9218t;

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        zzhj zzhjVar;
        zziv zzivVar = this.f9217s;
        Bundle bundle = this.f9218t;
        if (bundle == null) {
            zzivVar.U0().f3146R.b(new Bundle());
            return;
        }
        Bundle bundleA = zzivVar.U0().f3146R.a();
        Iterator<String> it = bundle.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            jVar = zzivVar.f9203M;
            zzhjVar = (zzhj) zzivVar.f577s;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzivVar.V0();
                if (zznp.E1(obj)) {
                    zzivVar.V0();
                    zznp.m1(jVar, null, 27, null, null, 0);
                }
                zzivVar.i().f9049C.c("Invalid default event parameter type. Name, value", next, obj);
            } else if (zznp.c2(next)) {
                zzivVar.i().f9049C.a(next, "Invalid default event parameter name. Name");
            } else if (obj == null) {
                bundleA.remove(next);
            } else if (zzivVar.V0().I1("param", next, zzhjVar.f9146y.Y0(null, false), obj)) {
                zzivVar.V0().q1(bundleA, next, obj);
            }
        }
        zzivVar.V0();
        int i10 = zzhjVar.f9146y.V0().N1(201500000) ? 100 : 25;
        if (bundleA.size() > i10) {
            int i11 = 0;
            for (String str : new TreeSet(bundleA.keySet())) {
                i11++;
                if (i11 > i10) {
                    bundleA.remove(str);
                }
            }
            zzivVar.V0();
            zznp.m1(jVar, null, 26, null, null, 0);
            zzivVar.i().f9049C.b("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzivVar.U0().f3146R.b(bundleA);
        zzkx zzkxVarR = zzhjVar.r();
        zzkxVarR.W0();
        zzkxVarR.a1();
        zzkxVarR.f1(new I(zzkxVarR, zzkxVarR.p1(false), bundleA, 8));
    }
}
