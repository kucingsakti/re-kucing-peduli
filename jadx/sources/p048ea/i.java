package p048ea;

import O8.C0352h;
import java.io.IOException;
import p010aa.a;
import p068ga.n;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i10) {
        super(str, true);
        this.f11285e = i10;
        this.f11286f = obj;
        this.f11287g = obj2;
    }

    @Override // p010aa.a
    public final long a() {
        long jA;
        v[] vVarArr;
        int i10 = 0;
        switch (this.f11285e) {
            case 0:
                o oVar = (o) this.f11286f;
                oVar.f11321s.a(oVar, (z) ((t) this.f11287g).f15466s);
                return -1L;
            case 1:
                try {
                    ((o) this.f11286f).f11321s.b((v) this.f11287g);
                    break;
                } catch (IOException e10) {
                    n nVar = n.a;
                    n nVar2 = n.a;
                    String strK = p210v8.i.k(((o) this.f11286f).f11323u, "Http2Connection.Listener failure for ");
                    nVar2.getClass();
                    n.i(strK, 4, e10);
                    try {
                        ((v) this.f11287g).c(a.PROTOCOL_ERROR, e10);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C0352h c0352h = (C0352h) this.f11286f;
                z zVar = (z) this.f11287g;
                t tVar = new t();
                o oVar2 = (o) c0352h.f3708u;
                synchronized (oVar2.f11319O) {
                    synchronized (oVar2) {
                        try {
                            z zVar2 = oVar2.f11313I;
                            z zVar3 = new z();
                            zVar3.b(zVar2);
                            zVar3.b(zVar);
                            tVar.f15466s = zVar3;
                            jA = ((long) zVar3.a()) - ((long) zVar2.a());
                            if (jA == 0 || oVar2.f11322t.isEmpty()) {
                                vVarArr = null;
                            } else {
                                Object[] array = oVar2.f11322t.values().toArray(new v[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                vVarArr = (v[]) array;
                            }
                            z zVar4 = (z) tVar.f15466s;
                            p210v8.i.f(zVar4, "<set-?>");
                            oVar2.f11313I = zVar4;
                            oVar2.f11306B.c(new i(p210v8.i.k(" onSettings", oVar2.f11323u), oVar2, tVar, i10), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f11319O.a((z) tVar.f15466s);
                    } catch (IOException e11) {
                        oVar2.b(e11);
                    }
                    break;
                }
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    while (i10 < length) {
                        v vVar = vVarArr[i10];
                        i10++;
                        synchronized (vVar) {
                            vVar.f11360f += jA;
                            if (jA > 0) {
                                vVar.notifyAll();
                            }
                        }
                    }
                }
                return -1L;
        }
    }
}
