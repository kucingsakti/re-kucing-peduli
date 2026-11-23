package O8;

import A9.AbstractC0151y;
import L8.InterfaceC0285t;

/* JADX INFO: loaded from: classes.dex */
public final class T extends U {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p076h8.j f3687D;

    public T(InterfaceC0285t interfaceC0285t, U u3, int i10, M8.h hVar, p096j9.f fVar, AbstractC0151y abstractC0151y, boolean z6, boolean z10, boolean z11, AbstractC0151y abstractC0151y2, L8.M m2, p200u8.a aVar) {
        super(interfaceC0285t, u3, i10, hVar, fVar, abstractC0151y, z6, z10, z11, abstractC0151y2, m2);
        this.f3687D = D3.b.s(aVar);
    }

    @Override // O8.U
    public final U Z0(J8.g gVar, p096j9.f fVar, int i10) {
        M8.h hVarQ = q();
        p210v8.i.e(hVarQ, "annotations");
        AbstractC0151y type = getType();
        p210v8.i.e(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        boolean zA1 = a1();
        L8.N n10 = L8.M.a;
        A0.r rVar = new A0.r(this, 20);
        return new T(gVar, null, i10, hVarQ, fVar, type, zA1, this.f3693z, this.f3688A, this.f3689B, n10, rVar);
    }
}
