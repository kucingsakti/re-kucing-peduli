package p182s4;

import N9.InterfaceC0341y;
import O3.k;
import java.util.Map;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p197u4.j;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class I extends g implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ E f14615A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0780q f14616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public K f14617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public G f14618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D3.g f14619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E f14620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f14621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ K f14623z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k3, E e10, d dVar) {
        super(2, dVar);
        this.f14623z = k3;
        this.f14615A = e10;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new I(this.f14623z, this.f14615A, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        C0780q c0780q;
        G g8;
        D3.g gVar;
        j jVar;
        E e10;
        Object objB;
        j jVar2;
        C0780q c0780q2;
        G g10;
        E e11;
        k kVar;
        EnumC0772i enumC0772i;
        EnumC0772i enumC0772i2;
        EnumC0772i enumC0772i3;
        EnumC0772i enumC0772i4;
        k kVar2;
        a aVar = a.f13404s;
        int i10 = this.f14622y;
        K k3 = this.f14623z;
        if (i10 == 0) {
            J7.a.v(obj);
            this.f14622y = 1;
            objA = K.a(k3, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i10 == 1) {
            J7.a.v(obj);
            objA = obj;
        } else {
            if (i10 == 2) {
                J7.a.v(obj);
                objA2 = obj;
                c0780q = (C0780q) objA2;
                g8 = G.a;
                gVar = k3.a;
                jVar = k3.f14631c;
                p191t4.c cVar = p191t4.c.a;
                this.f14616s = c0780q;
                this.f14617t = k3;
                this.f14618u = g8;
                this.f14619v = gVar;
                e10 = this.f14615A;
                this.f14620w = e10;
                this.f14621x = jVar;
                this.f14622y = 3;
                objB = cVar.b(this);
                if (objB != aVar) {
                    jVar2 = jVar;
                    c0780q2 = c0780q;
                    g10 = g8;
                    e11 = e10;
                }
                return aVar;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = this.f14621x;
            e11 = this.f14620w;
            D3.g gVar2 = this.f14619v;
            G g11 = this.f14618u;
            K k10 = this.f14617t;
            C0780q c0780q3 = this.f14616s;
            J7.a.v(obj);
            gVar = gVar2;
            k3 = k10;
            c0780q2 = c0780q3;
            g10 = g11;
            objB = obj;
        }
        Map map = (Map) objB;
        String str = c0780q2.a;
        g10.getClass();
        i.f(gVar, "firebaseApp");
        i.f(e11, "sessionDetails");
        i.f(jVar2, "sessionsSettings");
        i.f(map, "subscribers");
        String str2 = c0780q2.f14710b;
        i.f(str2, "firebaseAuthenticationToken");
        kVar = (k) map.get(p191t4.d.f15223t);
        enumC0772i = EnumC0772i.COLLECTION_DISABLED;
        enumC0772i2 = EnumC0772i.COLLECTION_ENABLED;
        enumC0772i3 = EnumC0772i.COLLECTION_SDK_NOT_INSTALLED;
        if (kVar == null) {
            enumC0772i4 = enumC0772i3;
        } else if (kVar.a.u()) {
            enumC0772i4 = enumC0772i2;
        } else {
            enumC0772i4 = enumC0772i;
        }
        kVar2 = (k) map.get(p191t4.d.f15222s);
        if (kVar2 == null) {
            enumC0772i = enumC0772i3;
        } else if (kVar2.a.u()) {
            enumC0772i = enumC0772i2;
        }
        F f10 = new F(new N(e11.a, e11.f14610b, e11.f14611c, e11.f14612d, new C0773j(enumC0772i4, enumC0772i, jVar2.a()), str, str2), G.a(gVar));
        int i11 = K.f14629g;
        k3.getClass();
        try {
            k3.f14632d.C(f10);
        } catch (RuntimeException unused) {
        }
        return m.a;
        if (((Boolean) objA).booleanValue()) {
            X x8 = C0780q.f14709c;
            p082i4.d dVar = k3.f14630b;
            this.f14622y = 2;
            objA2 = x8.a(dVar, this);
            if (objA2 != aVar) {
                c0780q = (C0780q) objA2;
                g8 = G.a;
                gVar = k3.a;
                jVar = k3.f14631c;
                p191t4.c cVar2 = p191t4.c.a;
                this.f14616s = c0780q;
                this.f14617t = k3;
                this.f14618u = g8;
                this.f14619v = gVar;
                e10 = this.f14615A;
                this.f14620w = e10;
                this.f14621x = jVar;
                this.f14622y = 3;
                objB = cVar2.b(this);
                if (objB != aVar) {
                    jVar2 = jVar;
                    c0780q2 = c0780q;
                    g10 = g8;
                    e11 = e10;
                    Map map2 = (Map) objB;
                    String str3 = c0780q2.a;
                    g10.getClass();
                    i.f(gVar, "firebaseApp");
                    i.f(e11, "sessionDetails");
                    i.f(jVar2, "sessionsSettings");
                    i.f(map2, "subscribers");
                    String str4 = c0780q2.f14710b;
                    i.f(str4, "firebaseAuthenticationToken");
                    kVar = (k) map2.get(p191t4.d.f15223t);
                    enumC0772i = EnumC0772i.COLLECTION_DISABLED;
                    enumC0772i2 = EnumC0772i.COLLECTION_ENABLED;
                    enumC0772i3 = EnumC0772i.COLLECTION_SDK_NOT_INSTALLED;
                    if (kVar == null) {
                        enumC0772i4 = enumC0772i3;
                    } else if (kVar.a.u()) {
                        enumC0772i4 = enumC0772i2;
                    } else {
                        enumC0772i4 = enumC0772i;
                    }
                    kVar2 = (k) map2.get(p191t4.d.f15222s);
                    if (kVar2 == null) {
                        enumC0772i = enumC0772i3;
                    } else if (kVar2.a.u()) {
                        enumC0772i = enumC0772i2;
                    }
                    F f11 = new F(new N(e11.a, e11.f14610b, e11.f14611c, e11.f14612d, new C0773j(enumC0772i4, enumC0772i, jVar2.a()), str3, str4), G.a(gVar));
                    int i12 = K.f14629g;
                    k3.getClass();
                    k3.f14632d.C(f11);
                }
            }
            return aVar;
        }
        return m.a;
    }
}
