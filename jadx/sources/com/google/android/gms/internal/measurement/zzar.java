package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzar extends zzal implements zzak {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f8473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zzh f8474w;

    public zzar(zzar zzarVar) {
        super(zzarVar.f8462s);
        ArrayList arrayList = new ArrayList(zzarVar.f8472u.size());
        this.f8472u = arrayList;
        arrayList.addAll(zzarVar.f8472u);
        ArrayList arrayList2 = new ArrayList(zzarVar.f8473v.size());
        this.f8473v = arrayList2;
        arrayList2.addAll(zzarVar.f8473v);
        this.f8474w = zzarVar.f8474w;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        zzax zzaxVar;
        zzh zzhVarD = this.f8474w.d();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8472u;
            int size = arrayList.size();
            zzaxVar = zzaq.f8465i;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                zzhVarD.e((String) arrayList.get(i10), zzhVar.f8658b.a(zzhVar, (zzaq) list.get(i10)));
            } else {
                zzhVarD.e((String) arrayList.get(i10), zzaxVar);
            }
            i10++;
        }
        for (zzaq zzaqVar : this.f8473v) {
            zzbb zzbbVar = zzhVarD.f8658b;
            zzaq zzaqVarA = zzbbVar.a(zzhVarD, zzaqVar);
            if (zzaqVarA instanceof zzat) {
                zzaqVarA = zzbbVar.a(zzhVarD, zzaqVar);
            }
            if (zzaqVarA instanceof zzaj) {
                return ((zzaj) zzaqVarA).f8460s;
            }
        }
        return zzaxVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzar(this);
    }

    public zzar(String str, ArrayList arrayList, List list, zzh zzhVar) {
        super(str);
        this.f8472u = new ArrayList();
        this.f8474w = zzhVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f8472u.add(((zzaq) it.next()).f());
            }
        }
        this.f8473v = new ArrayList(list);
    }
}
