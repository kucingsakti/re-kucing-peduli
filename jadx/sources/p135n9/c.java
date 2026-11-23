package p135n9;

import A9.AbstractC0151y;
import A9.S;
import B9.j;
import L8.InterfaceC0273g;
import com.bumptech.glide.d;
import java.util.Collection;
import java.util.List;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public final S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f13410b;

    public c(S s9) {
        i.f(s9, "projection");
        this.a = s9;
        s9.a();
    }

    @Override // p135n9.b
    public final S a() {
        return this.a;
    }

    @Override // A9.O
    public final I8.i s() {
        I8.i iVarS = this.a.b().D().s();
        i.e(iVarS, "projection.type.constructor.builtIns");
        return iVarS;
    }

    @Override // A9.O
    public final Collection t() {
        S s9 = this.a;
        AbstractC0151y abstractC0151yB = s9.a() == 3 ? s9.b() : s().o();
        i.e(abstractC0151yB, "if (projection.projectio… builtIns.nullableAnyType");
        return d.u(abstractC0151yB);
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }

    @Override // A9.O
    public final List u() {
        return s.f12328s;
    }

    @Override // A9.O
    public final boolean v() {
        return false;
    }

    @Override // A9.O
    public final /* bridge */ /* synthetic */ InterfaceC0273g w() {
        return null;
    }
}
