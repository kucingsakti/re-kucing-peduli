package p210v8;

import C8.InterfaceC0174b;
import C8.InterfaceC0175c;
import C8.InterfaceC0177e;
import C8.q;
import C8.r;
import F8.AbstractC0224s;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p implements r {
    public n(InterfaceC0177e interfaceC0177e, String str, String str2) {
        super(a.f15448s, ((c) interfaceC0177e).a(), str, str2, !(interfaceC0177e instanceof InterfaceC0175c) ? 1 : 0);
    }

    @Override // p210v8.b
    public final InterfaceC0174b c() {
        return u.a.f(this);
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        return ((AbstractC0224s) e()).v(obj);
    }

    @Override // C8.u
    public final q e() {
        return ((r) f()).e();
    }
}
