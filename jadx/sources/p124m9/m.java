package p124m9;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.O;
import A9.T;
import I8.o;
import L8.AbstractC0281o;
import L8.AbstractC0287v;
import L8.C0280n;
import L8.C0289x;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.K;
import L9.e;
import M8.h;
import O8.AbstractC0346b;
import O8.L;
import O8.M;
import O8.N;
import O8.U;
import O8.x;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import oa.b;
import org.chromium.net.UrlRequest;
import p086i8.k;
import p096j9.g;
import p165q9.d;
import p201u9.a;
import p210v8.i;
import p238y9.q;
import t9.f;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final C0289x a = new C0289x("ResolutionAnchorProvider", 0);

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 23:
            case 25:
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(InterfaceC0271e interfaceC0271e, LinkedHashSet linkedHashSet, n nVar, boolean z6) {
        for (InterfaceC0276j interfaceC0276j : b.d(nVar, f.f15240o, 2)) {
            if (interfaceC0276j instanceof InterfaceC0271e) {
                InterfaceC0271e interfaceC0271eZ0 = (InterfaceC0271e) interfaceC0276j;
                if (interfaceC0271eZ0.i0()) {
                    p096j9.f name = interfaceC0271eZ0.getName();
                    i.e(name, "descriptor.name");
                    InterfaceC0273g interfaceC0273gA = nVar.a(name, T8.b.f4762v);
                    interfaceC0271eZ0 = interfaceC0273gA instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA : interfaceC0273gA instanceof q ? ((q) interfaceC0273gA).Z0() : null;
                }
                if (interfaceC0271eZ0 == null) {
                    continue;
                } else {
                    if (interfaceC0271e == null) {
                        e.a(27);
                        throw null;
                    }
                    int i10 = e.a;
                    Iterator it = interfaceC0271eZ0.I().t().iterator();
                    while (it.hasNext()) {
                        if (e.p((AbstractC0151y) it.next(), interfaceC0271e.c())) {
                            linkedHashSet.add(interfaceC0271eZ0);
                            break;
                        }
                    }
                    if (z6) {
                        n nVarS0 = interfaceC0271eZ0.s0();
                        i.e(nVarS0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        c(interfaceC0271e, linkedHashSet, nVarS0, z6);
                    }
                }
            }
        }
    }

    public static x e(InterfaceC0268b interfaceC0268b, AbstractC0151y abstractC0151y, p096j9.f fVar, h hVar, int i10) {
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (abstractC0151y == null) {
            return null;
        }
        a aVar = new a(interfaceC0268b, abstractC0151y, fVar);
        e eVar = g.a;
        return new x(interfaceC0268b, aVar, hVar, p096j9.f.j("_context_receiver_" + i10));
    }

    public static L f(K k3, h hVar) {
        return l(k3, hVar, true, k3.g());
    }

    public static M g(K k3, h hVar) {
        M8.f fVar = M8.g.a;
        L8.M mG = k3.g();
        if (mG != null) {
            return m(k3, hVar, fVar, true, k3.f(), mG);
        }
        a(6);
        throw null;
    }

    public static O8.K h(AbstractC0346b abstractC0346b) {
        if (abstractC0346b == null) {
            a(26);
            throw null;
        }
        InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(e.d(abstractC0346b), p096j9.i.f12576t);
        if (interfaceC0271eD == null) {
            return null;
        }
        M8.f fVar = M8.g.a;
        C0280n c0280n = AbstractC0281o.f2822e;
        O8.K kA1 = O8.K.a1(abstractC0346b, 1, c0280n, false, o.f2189b, 4, abstractC0346b.g());
        L l4 = new L(kA1, fVar, 1, c0280n, false, false, false, 4, null, abstractC0346b.g());
        kA1.d1(l4, null, null, null);
        A9.K.f338t.getClass();
        A9.K k3 = A9.K.f339u;
        O oI = interfaceC0271eD.I();
        List listSingletonList = Collections.singletonList(new T(1, abstractC0346b.p()));
        i.f(k3, "attributes");
        i.f(oI, "constructor");
        i.f(listSingletonList, "arguments");
        D dR = C0133f.r(k3, oI, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        kA1.g1(dR, list, null, null, list);
        l4.c1(kA1.w());
        return kA1;
    }

    public static N i(AbstractC0346b abstractC0346b) {
        if (abstractC0346b == null) {
            a(24);
            throw null;
        }
        M8.f fVar = M8.g.a;
        N nK1 = N.k1(abstractC0346b, o.f2190c, 4, abstractC0346b.g());
        U u3 = new U(nK1, null, 0, fVar, p096j9.f.j("value"), d.e(abstractC0346b).u(), false, false, false, null, abstractC0346b.g());
        List list = Collections.EMPTY_LIST;
        return nK1.e1(null, null, list, list, Collections.singletonList(u3), abstractC0346b.p(), 1, AbstractC0281o.f2822e);
    }

    public static N j(AbstractC0346b abstractC0346b) {
        if (abstractC0346b == null) {
            a(22);
            throw null;
        }
        N nK1 = N.k1(abstractC0346b, o.a, 4, abstractC0346b.g());
        List list = Collections.EMPTY_LIST;
        return nK1.e1(null, null, list, list, list, d.e(abstractC0346b).h(abstractC0346b.p()), 1, AbstractC0281o.f2822e);
    }

    public static x k(InterfaceC0268b interfaceC0268b, AbstractC0151y abstractC0151y, h hVar) {
        if (abstractC0151y == null) {
            return null;
        }
        return new x(interfaceC0268b, new p201u9.b(interfaceC0268b, abstractC0151y), hVar);
    }

    public static L l(K k3, h hVar, boolean z6, L8.M m2) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (m2 != null) {
            return new L(k3, hVar, k3.m(), k3.f(), z6, false, false, 1, null, m2);
        }
        a(19);
        throw null;
    }

    public static M m(K k3, h hVar, h hVar2, boolean z6, C0280n c0280n, L8.M m2) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (c0280n == null) {
            a(10);
            throw null;
        }
        if (m2 == null) {
            a(11);
            throw null;
        }
        M m10 = new M(k3, hVar, k3.m(), c0280n, z6, false, false, 1, null, m2);
        m10.f3677E = M.b1(m10, k3.getType(), hVar2);
        return m10;
    }

    public static boolean n(InterfaceC0285t interfaceC0285t) {
        return interfaceC0285t.V() == 4 && e.n(interfaceC0285t.v(), 3);
    }

    public static final Collection o(Collection collection, p200u8.b bVar) {
        i.f(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        J9.i iVar = new J9.i();
        while (!linkedList.isEmpty()) {
            Object objT = k.T(linkedList);
            J9.i iVar2 = new J9.i();
            ArrayList arrayListG = l.g(objT, linkedList, bVar, new e2.b(iVar2, 5));
            if (arrayListG.size() == 1 && iVar2.isEmpty()) {
                Object objJ0 = k.j0(arrayListG);
                i.e(objJ0, "overridableGroup.single()");
                iVar.add(objJ0);
            } else {
                Object objS = l.s(arrayListG, bVar);
                InterfaceC0268b interfaceC0268b = (InterfaceC0268b) bVar.invoke(objS);
                for (Object obj : arrayListG) {
                    i.e(obj, "it");
                    if (!l.k(interfaceC0268b, (InterfaceC0268b) bVar.invoke(obj))) {
                        iVar2.add(obj);
                    }
                }
                if (!iVar2.isEmpty()) {
                    iVar.addAll(iVar2);
                }
                iVar.add(objS);
            }
        }
        return iVar;
    }

    public abstract void b(InterfaceC0269c interfaceC0269c);

    public abstract void d(InterfaceC0269c interfaceC0269c, InterfaceC0269c interfaceC0269c2);

    public void p(InterfaceC0269c interfaceC0269c, Collection collection) {
        i.f(interfaceC0269c, "member");
        interfaceC0269c.p0(collection);
    }
}
