package za;

import J7.j;
import J7.n;
import T7.f;
import T7.k;
import T7.t;
import java.lang.reflect.Type;
import ya.C0898t;
import ya.InterfaceC0884e;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0884e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type f16343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f16344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f16346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f16350z;

    public d(Type type, n nVar, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f16343s = type;
        this.f16344t = nVar;
        this.f16345u = z6;
        this.f16346v = z10;
        this.f16347w = z11;
        this.f16348x = z12;
        this.f16349y = z13;
        this.f16350z = z14;
    }

    @Override // ya.InterfaceC0884e
    public final Type T() {
        return this.f16343s;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[RETURN] */
    @Override // ya.InterfaceC0884e
    public final Object w0(C0898t c0898t) {
        a aVar;
        n nVar;
        j aVar2 = new a(c0898t, 2);
        if (!this.f16345u) {
            if (this.f16346v) {
                aVar = new a(aVar2, 0);
            }
            nVar = this.f16344t;
            if (nVar != null) {
                aVar2 = new W7.b(aVar2, nVar);
            }
            if (this.f16347w) {
                return new t(new f(aVar2, 1));
            }
            if (this.f16348x) {
                return new k(aVar2, 1);
            }
            if (this.f16349y) {
                return new U7.c(aVar2, 2);
            }
            if (this.f16350z) {
                return new U7.f(aVar2, 1);
            }
            return aVar2;
        }
        aVar = new a(aVar2, 1);
        aVar2 = aVar;
        nVar = this.f16344t;
        if (nVar != null) {
            aVar2 = new W7.b(aVar2, nVar);
        }
        if (this.f16347w) {
            return new t(new f(aVar2, 1));
        }
        if (this.f16348x) {
            return new k(aVar2, 1);
        }
        if (this.f16349y) {
            return new U7.c(aVar2, 2);
        }
        if (this.f16350z) {
            return new U7.f(aVar2, 1);
        }
        return aVar2;
    }
}
