package p165q9;

import C8.InterfaceC0177e;
import O8.U;
import p210v8.g;
import p210v8.i;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f14439A = new b(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return u.a.b(U.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "declaresDefaultValue()Z";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        U u3 = (U) obj;
        i.f(u3, "p0");
        return Boolean.valueOf(u3.a1());
    }
}
