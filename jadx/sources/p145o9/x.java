package p145o9;

import A9.AbstractC0151y;
import A9.D;
import C9.h;
import I8.n;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class x extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13837b = 0;

    public x(byte b3) {
        super(Byte.valueOf(b3));
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        switch (this.f13837b) {
            case 0:
                i.f(interfaceC0290y, "module");
                InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(interfaceC0290y, n.f2154R);
                D dP = interfaceC0271eD != null ? interfaceC0271eD.p() : null;
                return dP == null ? C9.i.c(h.NOT_FOUND_UNSIGNED_TYPE, "UByte") : dP;
            case 1:
                i.f(interfaceC0290y, "module");
                InterfaceC0271e interfaceC0271eD2 = AbstractC0287v.d(interfaceC0290y, n.f2156T);
                D dP2 = interfaceC0271eD2 != null ? interfaceC0271eD2.p() : null;
                return dP2 == null ? C9.i.c(h.NOT_FOUND_UNSIGNED_TYPE, "UInt") : dP2;
            case 2:
                i.f(interfaceC0290y, "module");
                InterfaceC0271e interfaceC0271eD3 = AbstractC0287v.d(interfaceC0290y, n.f2157U);
                D dP3 = interfaceC0271eD3 != null ? interfaceC0271eD3.p() : null;
                return dP3 == null ? C9.i.c(h.NOT_FOUND_UNSIGNED_TYPE, "ULong") : dP3;
            default:
                i.f(interfaceC0290y, "module");
                InterfaceC0271e interfaceC0271eD4 = AbstractC0287v.d(interfaceC0290y, n.f2155S);
                D dP4 = interfaceC0271eD4 != null ? interfaceC0271eD4.p() : null;
                return dP4 == null ? C9.i.c(h.NOT_FOUND_UNSIGNED_TYPE, "UShort") : dP4;
        }
    }

    @Override // p145o9.g
    public final String toString() {
        switch (this.f13837b) {
            case 0:
                return ((Number) this.a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.a).longValue() + ".toULong()";
            default:
                return ((Number) this.a).intValue() + ".toUShort()";
        }
    }

    public x(short s9) {
        super(Short.valueOf(s9));
    }

    public x(int i10) {
        super(Integer.valueOf(i10));
    }

    public x(long j) {
        super(Long.valueOf(j));
    }
}
