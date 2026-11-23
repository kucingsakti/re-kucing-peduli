package p210v8;

import C8.InterfaceC0174b;
import C8.InterfaceC0175c;
import C8.h;
import C8.i;
import C8.j;
import C8.q;
import F8.AbstractC0224s;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p implements i, j {
    public l(InterfaceC0175c interfaceC0175c, String str, String str2) {
        super(a.f15448s, ((c) interfaceC0175c).a(), str, str2, !(interfaceC0175c instanceof InterfaceC0175c) ? 1 : 0);
    }

    @Override // p210v8.b
    public final InterfaceC0174b c() {
        return u.a.d(this);
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        return ((AbstractC0224s) e()).v(obj);
    }

    @Override // C8.u
    public final q e() {
        return ((i) f()).e();
    }

    @Override // C8.j
    public final h h() {
        return ((i) f()).h();
    }

    public l(Class cls, String str, String str2) {
        super(a.f15448s, cls, str, str2, 0);
    }
}
