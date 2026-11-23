package C9;

import A9.O;
import L8.InterfaceC0273g;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements O {
    public final h a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f983c;

    public g(h hVar, String... strArr) {
        p210v8.i.f(hVar, "kind");
        p210v8.i.f(strArr, "formatParams");
        this.a = hVar;
        this.f982b = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f983c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(hVar.f1013s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // A9.O
    public final I8.i s() {
        I8.e eVar = I8.e.f2106f;
        return I8.e.f2106f;
    }

    @Override // A9.O
    public final Collection t() {
        return s.f12328s;
    }

    public final String toString() {
        return this.f983c;
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
        i.a.getClass();
        return i.f1016c;
    }
}
