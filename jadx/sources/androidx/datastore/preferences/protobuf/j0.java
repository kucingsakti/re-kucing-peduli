package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public final boolean a(Object obj, InterfaceC0479a0 interfaceC0479a0) throws InvalidProtocolBufferException {
        int iD = interfaceC0479a0.d();
        int i10 = iD >>> 3;
        int i11 = iD & 7;
        if (i11 == 0) {
            ((k0) obj).c(i10 << 3, Long.valueOf(interfaceC0479a0.H()));
            return true;
        }
        if (i11 == 1) {
            ((k0) obj).c((i10 << 3) | 1, Long.valueOf(interfaceC0479a0.g()));
            return true;
        }
        if (i11 == 2) {
            ((k0) obj).c((i10 << 3) | 2, interfaceC0479a0.w());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            ((k0) obj).c((i10 << 3) | 5, Integer.valueOf(interfaceC0479a0.p()));
            return true;
        }
        k0 k0VarB = k0.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (interfaceC0479a0.r() != Integer.MAX_VALUE && a(k0VarB, interfaceC0479a0)) {
        }
        if (i13 != interfaceC0479a0.d()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        k0VarB.f6498e = false;
        ((k0) obj).c(i12 | 3, k0VarB);
        return true;
    }

    public abstract k0 b();
}
