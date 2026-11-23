package p114l9;

import L9.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override // p114l9.s
    public final String f(String str) {
        i.f(str, "string");
        return n.G(n.G(str, "<", "&lt;"), ">", "&gt;");
    }
}
