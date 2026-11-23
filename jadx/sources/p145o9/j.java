package p145o9;

import A9.AbstractC0151y;
import C9.h;
import L8.InterfaceC0290y;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13833b;

    public j(String str) {
        super(m.a);
        this.f13833b = str;
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        i.f(interfaceC0290y, "module");
        return C9.i.c(h.ERROR_CONSTANT_VALUE, this.f13833b);
    }

    @Override // p145o9.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // p145o9.g
    public final String toString() {
        return this.f13833b;
    }
}
