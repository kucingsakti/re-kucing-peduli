package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    public final zzh a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbb f8658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8659c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8660d = new HashMap();

    public zzh(zzh zzhVar, zzbb zzbbVar) {
        this.a = zzhVar;
        this.f8658b = zzbbVar;
    }

    public final zzaq a(zzaf zzafVar) {
        zzaq zzaqVarA = zzaq.f8465i;
        Iterator itY = zzafVar.y();
        while (itY.hasNext()) {
            zzaqVarA = this.f8658b.a(this, zzafVar.q(((Integer) itY.next()).intValue()));
            if (zzaqVarA instanceof zzaj) {
                break;
            }
        }
        return zzaqVarA;
    }

    public final zzaq b(zzaq zzaqVar) {
        return this.f8658b.a(this, zzaqVar);
    }

    public final zzaq c(String str) {
        zzh zzhVar = this;
        while (!zzhVar.f8659c.containsKey(str)) {
            zzhVar = zzhVar.a;
            if (zzhVar == null) {
                throw new IllegalArgumentException(p231y.a.c(str, " is not defined"));
            }
        }
        return (zzaq) zzhVar.f8659c.get(str);
    }

    public final zzh d() {
        return new zzh(this, this.f8658b);
    }

    public final void e(String str, zzaq zzaqVar) {
        if (this.f8660d.containsKey(str)) {
            return;
        }
        HashMap map = this.f8659c;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }

    public final boolean f(String str) {
        zzh zzhVar = this;
        while (!zzhVar.f8659c.containsKey(str)) {
            zzhVar = zzhVar.a;
            if (zzhVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void g(String str, zzaq zzaqVar) {
        zzh zzhVar;
        zzh zzhVar2 = this;
        while (!zzhVar2.f8659c.containsKey(str) && (zzhVar = zzhVar2.a) != null && zzhVar.f(str)) {
            zzhVar2 = zzhVar;
        }
        if (zzhVar2.f8660d.containsKey(str)) {
            return;
        }
        HashMap map = zzhVar2.f8659c;
        if (zzaqVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaqVar);
        }
    }
}
