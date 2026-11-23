package F8;

import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F f1513t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f10, int i10) {
        super(0);
        this.f1512s = i10;
        this.f1513t = f10;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0176  */
    /* JADX WARN: Code duplicated, block: B:46:0x017e  */
    /* JADX WARN: Code duplicated, block: B:47:0x018e  */
    @Override // p200u8.a
    public final Object invoke() throws ClassNotFoundException {
        Object objC;
        G8.e rVar;
        GenericDeclaration genericDeclarationM;
        G8.e sVar;
        Method method;
        F f10 = this.f1513t;
        switch (this.f1512s) {
            case 0:
                p096j9.b bVar = w0.a;
                t0 t0VarC = w0.c(f10.g());
                boolean z6 = t0VarC instanceof C0216j;
                D d3 = f10.f1515t;
                if (z6) {
                    if (f10.i()) {
                        Class clsA = d3.a();
                        List listU = f10.u();
                        ArrayList arrayList = new ArrayList(p086i8.m.H(listU, 10));
                        Iterator it = listU.iterator();
                        while (it.hasNext()) {
                            String strB = ((U) ((C8.l) it.next())).b();
                            p210v8.i.c(strB);
                            arrayList.add(strB);
                        }
                        return new G8.a(clsA, arrayList, 2);
                    }
                    i9.e eVar = ((C0216j) t0VarC).f1585t;
                    d3.getClass();
                    String str = eVar.f12336c;
                    p210v8.i.f(str, "desc");
                    objC = D.m(d3.a(), d3.j(str));
                } else if (t0VarC instanceof C0217k) {
                    i9.e eVar2 = ((C0217k) t0VarC).f1589t;
                    objC = d3.c(eVar2.f12335b, eVar2.f12336c);
                } else if (t0VarC instanceof C0215i) {
                    objC = ((C0215i) t0VarC).f1581t;
                } else {
                    if (!(t0VarC instanceof C0214h)) {
                        if (!(t0VarC instanceof C0213g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Class clsA2 = d3.a();
                        List list = ((C0213g) t0VarC).f1574t;
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(p086i8.m.H(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new G8.a(clsA2, arrayList2, 2, 1, list);
                    }
                    objC = ((C0214h) t0VarC).f1578t;
                }
                if (objC instanceof Constructor) {
                    rVar = F.k(f10, (Constructor) objC, f10.g(), false);
                } else {
                    if (!(objC instanceof Method)) {
                        throw new p0("Could not compute caller for function: " + f10.g() + " (member = " + objC + ')', 0);
                    }
                    Method method2 = (Method) objC;
                    boolean zIsStatic = Modifier.isStatic(method2.getModifiers());
                    Object obj = f10.f1517v;
                    if (!zIsStatic) {
                        rVar = f10.j() ? new G8.p(method2, C4.a.f(obj, f10.g())) : new G8.s(0, method2);
                    } else if (((B1.a) f10.g()).q().H(y0.a) != null) {
                        rVar = f10.j() ? new G8.q(method2) : new G8.s(1, method2);
                    } else {
                        rVar = f10.j() ? new G8.r(method2, C4.a.f(obj, f10.g())) : new G8.s(2, method2);
                    }
                }
                return C4.a.m(rVar, f10.g(), false);
            default:
                p096j9.b bVar2 = w0.a;
                t0 t0VarC2 = w0.c(f10.g());
                boolean z10 = t0VarC2 instanceof C0217k;
                D d8 = f10.f1515t;
                if (z10) {
                    i9.e eVar3 = ((C0217k) t0VarC2).f1589t;
                    Member memberY = f10.c().y();
                    p210v8.i.c(memberY);
                    boolean zIsStatic2 = Modifier.isStatic(memberY.getModifiers());
                    boolean z11 = !zIsStatic2;
                    d8.getClass();
                    String str2 = eVar3.f12335b;
                    p210v8.i.f(str2, MediationMetaData.KEY_NAME);
                    String str3 = eVar3.f12336c;
                    p210v8.i.f(str3, "desc");
                    if (str2.equals("<init>")) {
                        genericDeclarationM = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        if (!zIsStatic2) {
                            arrayList3.add(d8.a());
                        }
                        d8.b(arrayList3, str3, false);
                        genericDeclarationM = D.k(d8.h(), str2.concat("$default"), (Class[]) arrayList3.toArray(new Class[0]), d8.l(L9.f.O(str3, ')', 0, 6) + 1, str3, str3.length()), z11);
                    }
                } else if (!(t0VarC2 instanceof C0216j)) {
                    if (t0VarC2 instanceof C0213g) {
                        Class clsA3 = d8.a();
                        List list3 = ((C0213g) t0VarC2).f1574t;
                        List list4 = list3;
                        ArrayList arrayList4 = new ArrayList(p086i8.m.H(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((Method) it3.next()).getName());
                        }
                        return new G8.a(clsA3, arrayList4, 1, 1, list3);
                    }
                    genericDeclarationM = null;
                } else {
                    if (f10.i()) {
                        Class clsA4 = d8.a();
                        List listU2 = f10.u();
                        ArrayList arrayList5 = new ArrayList(p086i8.m.H(listU2, 10));
                        Iterator it4 = listU2.iterator();
                        while (it4.hasNext()) {
                            String strB2 = ((U) ((C8.l) it4.next())).b();
                            p210v8.i.c(strB2);
                            arrayList5.add(strB2);
                        }
                        return new G8.a(clsA4, arrayList5, 1);
                    }
                    i9.e eVar4 = ((C0216j) t0VarC2).f1585t;
                    d8.getClass();
                    String str4 = eVar4.f12336c;
                    p210v8.i.f(str4, "desc");
                    Class clsA5 = d8.a();
                    ArrayList arrayList6 = new ArrayList();
                    d8.b(arrayList6, str4, true);
                    genericDeclarationM = D.m(clsA5, arrayList6);
                }
                if (genericDeclarationM instanceof Constructor) {
                    sVar = F.k(f10, (Constructor) genericDeclarationM, f10.g(), true);
                } else if (!(genericDeclarationM instanceof Method)) {
                    sVar = null;
                } else if (((B1.a) f10.g()).q().H(y0.a) != null) {
                    InterfaceC0276j interfaceC0276jV = f10.g().v();
                    p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((InterfaceC0271e) interfaceC0276jV).N()) {
                        method = (Method) genericDeclarationM;
                        if (f10.j()) {
                            sVar = new G8.r(method, C4.a.f(f10.f1517v, f10.g()));
                        } else {
                            sVar = new G8.s(2, method);
                        }
                    } else {
                        Method method3 = (Method) genericDeclarationM;
                        sVar = f10.j() ? new G8.q(method3) : new G8.s(1, method3);
                    }
                } else {
                    method = (Method) genericDeclarationM;
                    if (f10.j()) {
                        sVar = new G8.r(method, C4.a.f(f10.f1517v, f10.g()));
                    } else {
                        sVar = new G8.s(2, method);
                    }
                }
                if (sVar != null) {
                    return C4.a.m(sVar, f10.g(), true);
                }
                return null;
        }
    }
}
