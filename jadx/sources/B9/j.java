package B9;

import A9.AbstractC0151y;
import A9.S;
import L8.InterfaceC0273g;
import L8.P;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p135n9.b {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p200u8.a f788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f791e;

    public /* synthetic */ j(S s9, i iVar, P p10, int i10) {
        this(s9, (i10 & 2) != 0 ? null : iVar, (j) null, (i10 & 8) != 0 ? null : p10);
    }

    @Override // p135n9.b
    public final S a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p210v8.i.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f789c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f789c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    public final int hashCode() {
        j jVar = this.f789c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // A9.O
    public final I8.i s() {
        AbstractC0151y abstractC0151yB = this.a.b();
        p210v8.i.e(abstractC0151yB, "projection.type");
        return qa.b.l(abstractC0151yB);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // A9.O
    public final Collection t() {
        Collection collection = (List) this.f791e.getValue();
        if (collection == null) {
            collection = p086i8.s.f12328s;
        }
        return collection;
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    @Override // A9.O
    public final List u() {
        return p086i8.s.f12328s;
    }

    @Override // A9.O
    public final boolean v() {
        return false;
    }

    @Override // A9.O
    public final InterfaceC0273g w() {
        return null;
    }

    public j(S s9, p200u8.a aVar, j jVar, P p10) {
        p210v8.i.f(s9, "projection");
        this.a = s9;
        this.f788b = aVar;
        this.f789c = jVar;
        this.f790d = p10;
        this.f791e = D3.b.r(p076h8.e.f11786s, new A0.r(this, 4));
    }
}
