package p210v8;

import C8.InterfaceC0174b;
import C8.u;
import F8.p0;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends b implements u {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f15462y;

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f15462y = (i10 & 2) == 2;
    }

    @Override // p210v8.b
    public final InterfaceC0174b a() {
        return this.f15462y ? this : super.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return d().equals(pVar.d()) && this.f15452v.equals(pVar.f15452v) && this.f15453w.equals(pVar.f15453w) && i.a(this.f15450t, pVar.f15450t);
        }
        if (obj instanceof u) {
            return obj.equals(a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15453w.hashCode() + a.a(d().hashCode() * 31, this.f15452v, 31);
    }

    @Override // p210v8.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final u f() {
        if (this.f15462y) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        InterfaceC0174b interfaceC0174bA = a();
        if (interfaceC0174bA != this) {
            return (u) interfaceC0174bA;
        }
        throw new p0();
    }

    public final String toString() {
        InterfaceC0174b interfaceC0174bA = a();
        return interfaceC0174bA != this ? interfaceC0174bA.toString() : E0.a.l(new StringBuilder("property "), this.f15452v, " (Kotlin reflection is not available)");
    }
}
