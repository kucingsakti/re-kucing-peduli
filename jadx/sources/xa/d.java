package xa;

import A0.r;
import A9.A;
import A9.AbstractC0151y;
import A9.D;
import A9.J;
import E4.B;
import E4.C0187a;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0285t;
import L8.M;
import L8.P;
import M8.h;
import O8.U;
import android.content.Context;
import android.view.View;
import com.aheaditec.talsec_security.security.api.Natives;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.R;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p076h8.f;
import p076h8.j;
import p086i8.C;
import p086i8.k;
import p086i8.m;
import p086i8.y;
import p104k9.AbstractC0682k;
import p104k9.C0679h;
import p104k9.l;
import p124m9.e;
import p204v1.g;
import p210v8.i;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static c a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f15804b = false;

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b3)));
        }
        return sb.toString();
    }

    public static void b(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static final ArrayList f(List list, Collection collection, InterfaceC0285t interfaceC0285t) {
        i.f(collection, "oldValueParameters");
        list.size();
        collection.size();
        ArrayList<f> arrayListZ0 = k.z0(list, collection);
        ArrayList arrayList = new ArrayList(m.H(arrayListZ0, 10));
        for (f fVar : arrayListZ0) {
            AbstractC0151y abstractC0151y = (AbstractC0151y) fVar.f11789s;
            U u3 = (U) fVar.f11790t;
            int i10 = u3.f3691x;
            h hVarQ = u3.q();
            p096j9.f name = u3.getName();
            i.e(name, "oldParameter.name");
            boolean zA1 = u3.a1();
            AbstractC0151y abstractC0151yF = u3.f3689B != null ? p165q9.d.j(interfaceC0285t).s().f(abstractC0151y) : null;
            M mG = u3.g();
            i.e(mG, "oldParameter.source");
            arrayList.add(new U(interfaceC0285t, null, i10, hVarQ, name, abstractC0151y, zA1, u3.f3693z, u3.f3688A, abstractC0151yF, mG));
        }
        return arrayList;
    }

    public static I3.b g(String str, String str2) {
        p160q4.a aVar = new p160q4.a(str, str2);
        I3.a aVarB = I3.b.b(p160q4.a.class);
        aVarB.f2015e = 1;
        aVarB.f2016f = new C0187a(aVar, 5);
        return aVarB.b();
    }

    public static final Object h(Class cls, Map map, List list) {
        i.f(cls, "annotationClass");
        i.f(list, "methods");
        j jVarS = D3.b.s(new r(map, 12));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new G8.b(cls, map, D3.b.s(new A(cls, 15, map)), jVarS, list));
        i.d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static final J i(InterfaceC0271e interfaceC0271e, InterfaceC0271e interfaceC0271e2) {
        i.f(interfaceC0271e, "from");
        i.f(interfaceC0271e2, "to");
        interfaceC0271e.y().size();
        interfaceC0271e2.y().size();
        List listY = interfaceC0271e.y();
        i.e(listY, "from.declaredTypeParameters");
        List list = listY;
        ArrayList arrayList = new ArrayList(m.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((P) it.next()).I());
        }
        List listY2 = interfaceC0271e2.y();
        i.e(listY2, "to.declaredTypeParameters");
        List list2 = listY2;
        ArrayList arrayList2 = new ArrayList(m.H(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            D dP = ((P) it2.next()).p();
            i.e(dP, "it.defaultType");
            arrayList2.add(qa.b.a(dP));
        }
        return new J(y.z(k.z0(arrayList, arrayList2)), 1);
    }

    public static I3.b j(String str, D3.i iVar) {
        I3.a aVarB = I3.b.b(p160q4.a.class);
        aVarB.f2015e = 1;
        aVarB.a(I3.j.b(Context.class));
        aVarB.f2016f = new B(str, 10, iVar);
        return aVarB.b();
    }

    public static final Object m(AbstractC0682k abstractC0682k, p104k9.m mVar) {
        i.f(abstractC0682k, "<this>");
        i.f(mVar, "extension");
        if (abstractC0682k.k(mVar)) {
            return abstractC0682k.j(mVar);
        }
        return null;
    }

    public static final Object n(AbstractC0682k abstractC0682k, p104k9.m mVar, int i10) {
        i.f(abstractC0682k, "<this>");
        i.f(mVar, "extension");
        abstractC0682k.n(mVar);
        C0679h c0679h = abstractC0682k.f12811s;
        c0679h.getClass();
        l lVar = mVar.f12817d;
        if (!lVar.f12814u) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        p104k9.y yVar = c0679h.a;
        Object obj = yVar.get(lVar);
        if (i10 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC0682k.n(mVar);
        if (!lVar.f12814u) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = yVar.get(lVar);
        if (obj2 != null) {
            return mVar.a(((List) obj2).get(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final Y8.D o(InterfaceC0271e interfaceC0271e) {
        InterfaceC0271e interfaceC0271e2;
        i.f(interfaceC0271e, "<this>");
        int i10 = p165q9.d.a;
        Iterator it = interfaceC0271e.p().D().t().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC0271e2 = null;
                break;
            }
            AbstractC0151y abstractC0151y = (AbstractC0151y) it.next();
            if (!I8.i.x(abstractC0151y)) {
                InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
                if (e.n(interfaceC0273gW, 1) || e.n(interfaceC0273gW, 3)) {
                    i.d(interfaceC0273gW, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC0271e2 = (InterfaceC0271e) interfaceC0273gW;
                    break;
                }
            }
        }
        if (interfaceC0271e2 == null) {
            return null;
        }
        n nVarV0 = interfaceC0271e2.v0();
        Y8.D d3 = nVarV0 instanceof Y8.D ? (Y8.D) nVarV0 : null;
        return d3 == null ? o(interfaceC0271e2) : d3;
    }

    public static float r(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static final boolean s(String str) {
        i.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void t(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void u(View view, N0.f fVar) {
        i.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static void v(MainApp mainApp, p195u1.b bVar) {
        Natives natives = Natives.a;
        C.a(C.c("036DBADD0FFDD1"));
        natives.start(mainApp, true);
        if (g.f15397t == null) {
            synchronized (g.class) {
                try {
                    if (g.f15397t == null) {
                        g.f15397t = new g(mainApp, bVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract Method k(Class cls, Field field);

    public abstract Constructor l(Class cls);

    public abstract String[] p(Class cls);

    public abstract boolean q(Class cls);
}
