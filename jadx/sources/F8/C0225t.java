package F8;

import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: F8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225t extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0229x f1631t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0225t(C0229x c0229x, int i10) {
        super(0);
        this.f1630s = i10;
        this.f1631t = c0229x;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1630s) {
            case 0:
                C0229x c0229x = this.f1631t;
                c0229x.getClass();
                C8.u[] uVarArr = C0229x.f1639n;
                C8.u uVar = uVarArr[14];
                Object objInvoke = c0229x.f1648l.invoke();
                p210v8.i.e(objInvoke, "<get-allNonStaticMembers>(...)");
                C8.u uVar2 = uVarArr[15];
                Object objInvoke2 = c0229x.f1649m.invoke();
                p210v8.i.e(objInvoke2, "<get-allStaticMembers>(...)");
                return p086i8.k.g0((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                C0229x c0229x2 = this.f1631t;
                c0229x2.getClass();
                C8.u[] uVarArr2 = C0229x.f1639n;
                C8.u uVar3 = uVarArr2[10];
                Object objInvoke3 = c0229x2.f1645h.invoke();
                p210v8.i.e(objInvoke3, "<get-declaredNonStaticMembers>(...)");
                C8.u uVar4 = uVarArr2[12];
                Object objInvoke4 = c0229x2.j.invoke();
                p210v8.i.e(objInvoke4, "<get-inheritedNonStaticMembers>(...)");
                return p086i8.k.g0((Collection) objInvoke3, (Collection) objInvoke4);
            case 2:
                C0229x c0229x3 = this.f1631t;
                c0229x3.getClass();
                C8.u[] uVarArr3 = C0229x.f1639n;
                C8.u uVar5 = uVarArr3[11];
                Object objInvoke5 = c0229x3.f1646i.invoke();
                p210v8.i.e(objInvoke5, "<get-declaredStaticMembers>(...)");
                C8.u uVar6 = uVarArr3[13];
                Object objInvoke6 = c0229x3.f1647k.invoke();
                p210v8.i.e(objInvoke6, "<get-inheritedStaticMembers>(...)");
                return p086i8.k.g0((Collection) objInvoke5, (Collection) objInvoke6);
            case 3:
                return y0.d(this.f1631t.a());
            case 4:
                C0229x c0229x4 = this.f1631t;
                c0229x4.getClass();
                C8.u[] uVarArr4 = C0229x.f1639n;
                C8.u uVar7 = uVarArr4[10];
                Object objInvoke7 = c0229x4.f1645h.invoke();
                p210v8.i.e(objInvoke7, "<get-declaredNonStaticMembers>(...)");
                C8.u uVar8 = uVarArr4[11];
                Object objInvoke8 = c0229x4.f1646i.invoke();
                p210v8.i.e(objInvoke8, "<get-declaredStaticMembers>(...)");
                return p086i8.k.g0((Collection) objInvoke7, (Collection) objInvoke8);
            case 5:
                t9.n nVarS0 = this.f1631t.a().s0();
                p210v8.i.e(nVarS0, "descriptor.unsubstitutedInnerClassesScope");
                Collection collectionD = oa.b.d(nVarS0, null, 3);
                ArrayList<InterfaceC0276j> arrayList = new ArrayList();
                for (Object obj : collectionD) {
                    if (!p124m9.e.m((InterfaceC0276j) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC0276j interfaceC0276j : arrayList) {
                    InterfaceC0271e interfaceC0271e = interfaceC0276j instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276j : null;
                    Class clsJ = interfaceC0271e != null ? y0.j(interfaceC0271e) : null;
                    A a = clsJ != null ? new A(clsJ) : null;
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC0271e> collectionE0 = this.f1631t.a().e0();
                p210v8.i.e(collectionE0, "descriptor.sealedSubclasses");
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC0271e interfaceC0271e2 : collectionE0) {
                    p210v8.i.d(interfaceC0271e2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsJ2 = y0.j(interfaceC0271e2);
                    A a10 = clsJ2 != null ? new A(clsJ2) : null;
                    if (a10 != null) {
                        arrayList3.add(a10);
                    }
                }
                return arrayList3;
        }
    }
}
