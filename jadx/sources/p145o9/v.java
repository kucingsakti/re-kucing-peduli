package p145o9;

import A9.AbstractC0151y;
import L8.InterfaceC0290y;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class v extends g {
    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        i.f(interfaceC0290y, "module");
        return interfaceC0290y.s().u();
    }

    @Override // p145o9.g
    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("\""), (String) this.a, '\"');
    }
}
