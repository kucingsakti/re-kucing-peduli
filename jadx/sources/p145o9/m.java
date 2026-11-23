package p145o9;

import A9.C0133f;
import A9.K;
import A9.O;
import D3.b;
import L8.InterfaceC0273g;
import c2.a;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p076h8.j;
import p086i8.k;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class m implements O {
    public final Set a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13835b;

    public m(Set set) {
        K.f338t.getClass();
        K k3 = K.f339u;
        i.f(k3, "attributes");
        C0133f.s(k3, this, s.f12328s, C9.i.a(2, true, "unknown integer literal type"), false);
        this.f13835b = b.s(new a(this, 15));
        this.a = set;
    }

    @Override // A9.O
    public final I8.i s() {
        throw null;
    }

    @Override // A9.O
    public final Collection t() {
        return (List) this.f13835b.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + k.Z(this.a, ",", null, null, l.f13834s, 30) + ']');
        return sb.toString();
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
    public final InterfaceC0273g w() {
        return null;
    }
}
