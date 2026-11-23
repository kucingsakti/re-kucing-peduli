package p197u4;

import D3.g;
import V.h;
import Y1.c;
import android.content.Context;
import android.os.Bundle;
import o1.f;
import p060g0.b;
import p076h8.m;
import p082i4.d;
import p123m8.i;
import p134n8.a;
import p140o4.n;
import p182s4.AbstractC0782t;
import p182s4.C0765b;
import p182s4.G;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f15330c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15331d = f.m(AbstractC0782t.f14717b, new h(g.f15325s));
    public final n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15332b;

    public j(g gVar, i iVar, i iVar2, d dVar) {
        gVar.a();
        Context context = gVar.a;
        p210v8.i.e(context, "firebaseApp.applicationContext");
        G g8 = G.a;
        C0765b c0765bA = G.a(gVar);
        n nVar = new n(context);
        c cVar = new c(c0765bA, iVar);
        f15330c.getClass();
        d dVar2 = new d(iVar2, dVar, c0765bA, cVar, (p039e0.f) f15331d.a(h.a[0], context));
        this.a = nVar;
        this.f15332b = dVar2;
    }

    public final double a() {
        Bundle bundle = this.a.a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        f fVar = this.f15332b.b().f15348b;
        if (fVar == null) {
            p210v8.i.n("sessionConfigs");
            throw null;
        }
        Double d3 = fVar.f15321b;
        if (d3 != null) {
            double dDoubleValue2 = d3.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p144o8.c cVar) {
        i iVar;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f15329v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f15329v = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f15327t;
        a aVar = a.f13404s;
        int i11 = iVar.f15329v;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                jVar = iVar.f15326s;
                J7.a.v(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        }
        J7.a.v(obj);
        iVar.f15326s = this;
        iVar.f15329v = 1;
        this.a.getClass();
        if (mVar != aVar) {
            jVar = this;
        }
        d dVar = jVar.f15332b;
        iVar.f15326s = null;
        iVar.f15329v = 2;
        return dVar.d(iVar) == aVar ? aVar : mVar;
    }
}
