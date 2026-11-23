package F8;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends AbstractC0224s implements C8.u {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f1591z = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f1592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f1593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f1596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r0 f1597y;

    public k0(D d3, String str, String str2, O8.K k3, Object obj) {
        this.f1592t = d3;
        this.f1593u = str;
        this.f1594v = str2;
        this.f1595w = obj;
        this.f1596x = D3.b.r(p076h8.e.f11786s, new j0(this, 1));
        this.f1597y = t0.j(k3, new j0(this, 0));
    }

    @Override // F8.AbstractC0224s
    public final G8.e c() {
        return m().c();
    }

    @Override // F8.AbstractC0224s
    public final D d() {
        return this.f1592t;
    }

    public final boolean equals(Object obj) {
        k0 k0VarC = y0.c(obj);
        return k0VarC != null && p210v8.i.a(this.f1592t, k0VarC.f1592t) && p210v8.i.a(this.f1593u, k0VarC.f1593u) && p210v8.i.a(this.f1594v, k0VarC.f1594v) && p210v8.i.a(this.f1595w, k0VarC.f1595w);
    }

    @Override // F8.AbstractC0224s
    public final G8.e f() {
        m().getClass();
        return null;
    }

    @Override // C8.InterfaceC0174b
    public final String getName() {
        return this.f1593u;
    }

    public final int hashCode() {
        return this.f1594v.hashCode() + p231y.a.a(this.f1592t.hashCode() * 31, this.f1593u, 31);
    }

    @Override // F8.AbstractC0224s
    public final boolean j() {
        return !p210v8.i.a(this.f1595w, p210v8.a.f15448s);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h8.d, java.lang.Object] */
    public final Member k() {
        if (!g().m0()) {
            return null;
        }
        p096j9.b bVar = w0.a;
        t0 t0VarB = w0.b(g());
        if (t0VarB instanceof C0220n) {
            C0220n c0220n = (C0220n) t0VarB;
            h9.e eVar = c0220n.f1609v;
            if ((eVar.f11834t & 16) == 16) {
                h9.c cVar = eVar.f11839y;
                int i10 = cVar.f11819t;
                if ((i10 & 1) != 1 || (i10 & 2) != 2) {
                    return null;
                }
                int i11 = cVar.f11820u;
                p067g9.f fVar = c0220n.f1610w;
                return this.f1592t.c(fVar.getString(i11), fVar.getString(cVar.f11821v));
            }
        }
        return (Field) this.f1596x.getValue();
    }

    @Override // F8.AbstractC0224s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final L8.K g() {
        Object objInvoke = this.f1597y.invoke();
        p210v8.i.e(objInvoke, "_descriptor()");
        return (L8.K) objInvoke;
    }

    public abstract g0 m();

    @Override // C8.InterfaceC0174b
    public final boolean t() {
        return false;
    }

    public final String toString() {
        p114l9.g gVar = v0.a;
        return v0.c(g());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(D d3, String str, String str2, Object obj) {
        this(d3, str, str2, null, obj);
        p210v8.i.f(d3, "container");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(D d3, O8.K k3) {
        p210v8.i.f(d3, "container");
        p210v8.i.f(k3, "descriptor");
        String strG = k3.getName().g();
        p210v8.i.e(strG, "descriptor.name.asString()");
        this(d3, strG, w0.b(k3).d(), k3, p210v8.a.f15448s);
    }
}
