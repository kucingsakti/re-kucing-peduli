package F9;

import A9.O;
import A9.P;
import A9.S;
import A9.T;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P {
    @Override // A9.P
    public final S g(O o10) {
        i.f(o10, "key");
        p135n9.b bVar = o10 instanceof p135n9.b ? (p135n9.b) o10 : null;
        if (bVar == null) {
            return null;
        }
        return bVar.a().c() ? new T(3, bVar.a().b()) : bVar.a();
    }
}
