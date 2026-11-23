package p210v8;

import C8.InterfaceC0174b;
import C8.InterfaceC0178f;
import F8.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b implements f, InterfaceC0178f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f15460z;

    public g(int i10) {
        this(i10, a.f15448s, null, null, null, 0);
    }

    @Override // p210v8.b
    public final InterfaceC0174b c() {
        return u.a.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && g().equals(gVar.g()) && this.f15460z == gVar.f15460z && this.f15459y == gVar.f15459y && i.a(this.f15450t, gVar.f15450t) && i.a(d(), gVar.d());
        }
        if (obj instanceof InterfaceC0178f) {
            return obj.equals(a());
        }
        return false;
    }

    @Override // p210v8.b
    public final InterfaceC0174b f() {
        InterfaceC0174b interfaceC0174bA = a();
        if (interfaceC0174bA != this) {
            return (InterfaceC0178f) interfaceC0174bA;
        }
        throw new p0();
    }

    @Override // p210v8.f
    public final int getArity() {
        return this.f15459y;
    }

    public final int hashCode() {
        return g().hashCode() + ((getName().hashCode() + (d() == null ? 0 : d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0174b interfaceC0174bA = a();
        if (interfaceC0174bA != this) {
            return interfaceC0174bA.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public g(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f15459y = i10;
        this.f15460z = 0;
    }
}
