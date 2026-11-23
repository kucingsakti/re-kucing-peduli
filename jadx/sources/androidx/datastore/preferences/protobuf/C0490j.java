package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0490j implements InterfaceC0479a0 {
    public final A3.E a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6486d = 0;

    public C0490j(A3.E e10) {
        Charset charset = AbstractC0505z.a;
        this.a = e10;
        e10.f226b = this;
    }

    public static void U(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void V(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void A(List list, InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX;
        int i10 = this.f6484b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(O(interfaceC0481b0, c0494n));
            A3.E e10 = this.a;
            if (e10.f() || this.f6486d != 0) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == i10);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void C(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX;
        if ((this.f6484b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(w());
            A3.E e10 = this.a;
            if (e10.f()) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == this.f6484b);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void D(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0492l;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 1) {
                e10.k();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            V(e10.y());
            e10.k();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(e10.k()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iY = e10.y();
        V(iY);
        int iE = e10.e() + iY;
        do {
            list.add(Double.valueOf(e10.k()));
        } while (e10.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void E(List list, InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX;
        int i10 = this.f6484b;
        if ((i10 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(P(interfaceC0481b0, c0494n));
            A3.E e10 = this.a;
            if (e10.f() || this.f6486d != 0) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == i10);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void F(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof G;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.q();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.q();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(e10.q()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Long.valueOf(e10.q()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void G(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof G;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 1) {
                e10.s();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            V(e10.y());
            e10.s();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(e10.s()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iY = e10.y();
        V(iY);
        int iE = e10.e() + iY;
        do {
            list.add(Long.valueOf(e10.s()));
        } while (e10.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final long H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final String I() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void J(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof G;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 1) {
                e10.n();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            V(e10.y());
            e10.n();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(e10.n()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iY = e10.y();
        V(iY);
        int iE = e10.e() + iY;
        do {
            list.add(Long.valueOf(e10.n()));
        } while (e10.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void K(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.p();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.p();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(e10.p()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Integer.valueOf(e10.p()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void L(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.l();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.l();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(e10.l()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Integer.valueOf(e10.l()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final Object M(InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(3);
        return O(interfaceC0481b0, c0494n);
    }

    public final Object N(B0 b3, Class cls, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (b3.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(H());
            case 3:
                return Long.valueOf(e());
            case 4:
                return Integer.valueOf(z());
            case 5:
                return Long.valueOf(g());
            case 6:
                return Integer.valueOf(p());
            case 7:
                return Boolean.valueOf(q());
            case 8:
                return I();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                S(2);
                return P(X.f6439c.a(cls), c0494n);
            case 11:
                return w();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Integer.valueOf(y());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Integer.valueOf(c());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(B());
            case 15:
                return Long.valueOf(t());
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(l());
        }
    }

    public final Object O(InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) {
        int i10 = this.f6485c;
        this.f6485c = ((this.f6484b >>> 3) << 3) | 4;
        try {
            Object objI = interfaceC0481b0.i();
            interfaceC0481b0.a(objI, this, c0494n);
            interfaceC0481b0.d(objI);
            if (this.f6484b != this.f6485c) {
                throw InvalidProtocolBufferException.e();
            }
            this.f6485c = i10;
            return objI;
        } catch (Throwable th) {
            this.f6485c = i10;
            throw th;
        }
    }

    public final Object P(InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) throws InvalidProtocolBufferException {
        A3.E e10 = this.a;
        int iY = e10.y();
        if (e10.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iH = e10.h(iY);
        Object objI = interfaceC0481b0.i();
        e10.a++;
        interfaceC0481b0.a(objI, this, c0494n);
        interfaceC0481b0.d(objI);
        e10.d(0);
        e10.a--;
        e10.g(iH);
        return objI;
    }

    public final void Q(List list, boolean z6) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iX;
        int iX2;
        if ((this.f6484b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z10 = list instanceof C;
        A3.E e10 = this.a;
        if (!z10 || z6) {
            do {
                list.add(z6 ? I() : o());
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        C c10 = (C) list;
        do {
            c10.B(w());
            if (e10.f()) {
                return;
            } else {
                iX2 = e10.x();
            }
        } while (iX2 == this.f6484b);
        this.f6486d = iX2;
    }

    public final void R(int i10) throws InvalidProtocolBufferException {
        if (this.a.e() != i10) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void S(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f6484b & 7) != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean T() {
        int i10;
        A3.E e10 = this.a;
        if (e10.f() || (i10 = this.f6484b) == this.f6485c) {
            return false;
        }
        return e10.B(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final Object a(InterfaceC0481b0 interfaceC0481b0, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return P(interfaceC0481b0, c0494n);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void b(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.t();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.t();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(e10.t()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Integer.valueOf(e10.t()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int d() {
        return this.f6484b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final long e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void f(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 2) {
                U(e10.y());
                e10.m();
                throw null;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            e10.m();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 2) {
            int iY = e10.y();
            U(iY);
            int iE = e10.e() + iY;
            do {
                list.add(Integer.valueOf(e10.m()));
            } while (e10.e() < iE);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(e10.m()));
            if (e10.f()) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == this.f6484b);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final long g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void h(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 2) {
                U(e10.y());
                e10.r();
                throw null;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            e10.r();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 2) {
            int iY = e10.y();
            U(iY);
            int iE = e10.e() + iY;
            do {
                list.add(Integer.valueOf(e10.r()));
            } while (e10.e() < iE);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(e10.r()));
            if (e10.f()) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == this.f6484b);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void j(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof G;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.u();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.u();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(e10.u()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Long.valueOf(e10.u()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void k(L l4, J j, C0494n c0494n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        A3.E e10 = this.a;
        int iH = e10.h(e10.y());
        Object objN = "";
        p060g0.i iVar = j.f6417c;
        Object objN2 = iVar;
        while (true) {
            try {
                int iR = r();
                if (iR == Integer.MAX_VALUE || e10.f()) {
                    break;
                }
                if (iR == 1) {
                    objN = N(j.a, null, null);
                } else if (iR != 2) {
                    try {
                        if (!T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objN2 = N(j.f6416b, iVar.getClass(), c0494n);
                }
            } catch (Throwable th) {
                e10.g(iH);
                throw th;
            }
        }
        l4.put(objN, objN2);
        e10.g(iH);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final long l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void m(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0503x;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.y();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.y();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Integer.valueOf(e10.y()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Integer.valueOf(e10.y()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void n(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0484d;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.i();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.i();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Boolean.valueOf(e10.i()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Boolean.valueOf(e10.i()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final String o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int p() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final boolean q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int r() {
        int i10 = this.f6486d;
        if (i10 != 0) {
            this.f6484b = i10;
            this.f6486d = 0;
        } else {
            this.f6484b = this.a.x();
        }
        int i11 = this.f6484b;
        if (i11 == 0 || i11 == this.f6485c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void s(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Q(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void u(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof G;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 0) {
                e10.z();
                throw null;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            e10.y();
            e10.z();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 0) {
            do {
                list.add(Long.valueOf(e10.z()));
                if (e10.f()) {
                    return;
                } else {
                    iX = e10.x();
                }
            } while (iX == this.f6484b);
            this.f6486d = iX;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iE = e10.e() + e10.y();
        do {
            list.add(Long.valueOf(e10.z()));
        } while (e10.e() < iE);
        R(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void v(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Q(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final C0488h w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final void x(List list) throws InvalidProtocolBufferException {
        int iX;
        boolean z6 = list instanceof AbstractC0498s;
        A3.E e10 = this.a;
        if (z6) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i10 = this.f6484b & 7;
            if (i10 == 2) {
                U(e10.y());
                e10.o();
                throw null;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            e10.o();
            throw null;
        }
        int i11 = this.f6484b & 7;
        if (i11 == 2) {
            int iY = e10.y();
            U(iY);
            int iE = e10.e() + iY;
            do {
                list.add(Float.valueOf(e10.o()));
            } while (e10.e() < iE);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Float.valueOf(e10.o()));
            if (e10.f()) {
                return;
            } else {
                iX = e10.x();
            }
        } while (iX == this.f6484b);
        this.f6486d = iX;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int y() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0479a0
    public final int z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.p();
    }
}
