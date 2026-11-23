package O8;

import A9.AbstractC0151y;
import A9.Z;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0278l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class U extends V implements L8.I, L8.T {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3688A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AbstractC0151y f3689B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U f3690C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3693z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(InterfaceC0268b interfaceC0268b, U u3, int i10, M8.h hVar, p096j9.f fVar, AbstractC0151y abstractC0151y, boolean z6, boolean z10, boolean z11, AbstractC0151y abstractC0151y2, L8.M m2) {
        super(interfaceC0268b, hVar, fVar, abstractC0151y, m2);
        p210v8.i.f(interfaceC0268b, "containingDeclaration");
        p210v8.i.f(hVar, "annotations");
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(abstractC0151y, "outType");
        p210v8.i.f(m2, "source");
        this.f3691x = i10;
        this.f3692y = z6;
        this.f3693z = z10;
        this.f3688A = z11;
        this.f3689B = abstractC0151y2;
        this.f3690C = u3 == null ? this : u3;
    }

    @Override // L8.T
    public final /* bridge */ /* synthetic */ p145o9.g A0() {
        return null;
    }

    @Override // L8.T
    public final boolean P() {
        return false;
    }

    public U Z0(J8.g gVar, p096j9.f fVar, int i10) {
        M8.h hVarQ = q();
        p210v8.i.e(hVarQ, "annotations");
        AbstractC0151y type = getType();
        p210v8.i.e(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        boolean zA1 = a1();
        L8.N n10 = L8.M.a;
        return new U(gVar, null, i10, hVarQ, fVar, type, zA1, this.f3693z, this.f3688A, this.f3689B, n10);
    }

    public final boolean a1() {
        return this.f3692y && ((InterfaceC0269c) v()).V() != 2;
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0276j
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0268b v() {
        InterfaceC0276j interfaceC0276jV = super.v();
        p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC0268b) interfaceC0276jV;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final U c() {
        U u3 = this.f3690C;
        return u3 == this ? this : u3.c();
    }

    @Override // L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2823f;
        p210v8.i.e(c0280n, "LOCAL");
        return c0280n;
    }

    @Override // L8.O
    public final InterfaceC0277k j(Z z6) {
        p210v8.i.f(z6, "substitutor");
        if (z6.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.z(this, obj);
    }

    @Override // L8.InterfaceC0268b
    public final Collection x() {
        Collection collectionX = v().x();
        p210v8.i.e(collectionX, "containingDeclaration.overriddenDescriptors");
        Collection collection = collectionX;
        ArrayList arrayList = new ArrayList(p086i8.m.H(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((U) ((InterfaceC0268b) it.next()).H0().get(this.f3691x));
        }
        return arrayList;
    }
}
