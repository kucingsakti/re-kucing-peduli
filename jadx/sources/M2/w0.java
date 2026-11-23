package M2;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzhj;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzfn.zzm f3154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f3155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f3156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p212w.e f3157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p212w.e f3158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0 f3159h;

    public w0(v0 v0Var, String str) {
        this.f3159h = v0Var;
        this.a = str;
        this.f3153b = true;
        this.f3155d = new BitSet();
        this.f3156e = new BitSet();
        this.f3157f = new p212w.e(0);
        this.f3158g = new p212w.e(0);
    }

    public final void a(x0 x0Var) {
        int iA = x0Var.a();
        Boolean bool = x0Var.a;
        if (bool != null) {
            this.f3156e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = x0Var.f3161b;
        if (bool2 != null) {
            this.f3155d.set(iA, bool2.booleanValue());
        }
        if (x0Var.f3162c != null) {
            Integer numValueOf = Integer.valueOf(iA);
            p212w.e eVar = this.f3157f;
            Long l4 = (Long) eVar.get(numValueOf);
            long jLongValue = x0Var.f3162c.longValue() / 1000;
            if (l4 == null || jLongValue > l4.longValue()) {
                eVar.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (x0Var.f3163d != null) {
            p212w.e eVar2 = this.f3158g;
            List arrayList = (List) eVar2.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(Integer.valueOf(iA), arrayList);
            }
            if (x0Var.g()) {
                arrayList.clear();
            }
            zzoc.a();
            String str = this.a;
            v0 v0Var = this.f3159h;
            zzag zzagVar = ((zzhj) v0Var.f577s).f9146y;
            zzfj zzfjVar = zzbf.f8992k0;
            if (zzagVar.h1(str, zzfjVar) && x0Var.f()) {
                arrayList.clear();
            }
            zzoc.a();
            if (!((zzhj) v0Var.f577s).f9146y.h1(str, zzfjVar)) {
                arrayList.add(Long.valueOf(x0Var.f3163d.longValue() / 1000));
                return;
            }
            long jLongValue2 = x0Var.f3163d.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public w0(v0 v0Var, String str, zzfn.zzm zzmVar, BitSet bitSet, BitSet bitSet2, p212w.e eVar, p212w.e eVar2) {
        this.f3159h = v0Var;
        this.a = str;
        this.f3155d = bitSet;
        this.f3156e = bitSet2;
        this.f3157f = eVar;
        this.f3158g = new p212w.e(0);
        for (Integer num : (p212w.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f3158g.put(num, arrayList);
        }
        this.f3153b = false;
        this.f3154c = zzmVar;
    }
}
