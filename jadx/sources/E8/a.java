package E8;

import C8.InterfaceC0177e;
import p047e9.C0632y;
import p200u8.c;
import p210v8.g;
import p210v8.i;
import p210v8.u;
import p220w9.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends g implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f1455A = new a(2);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return u.a.b(q.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "loadFunction";
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        q qVar = (q) obj;
        C0632y c0632y = (C0632y) obj2;
        i.f(qVar, "p0");
        i.f(c0632y, "p1");
        return qVar.e(c0632y);
    }
}
