package F8;

import A9.AbstractC0151y;
import C8.InterfaceC0174b;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0290y;
import R8.AbstractC0408c;
import R8.C0409d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p047e9.C0632y;
import p104k9.AbstractC0682k;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {
    public static final p096j9.c a = new p096j9.c("kotlin.jvm.JvmStatic");

    public static final AbstractC0224s a(InterfaceC0174b interfaceC0174b) {
        AbstractC0224s abstractC0224s = interfaceC0174b instanceof AbstractC0224s ? (AbstractC0224s) interfaceC0174b : null;
        if (abstractC0224s != null) {
            return abstractC0224s;
        }
        F fB = b(interfaceC0174b);
        return fB != null ? fB : c(interfaceC0174b);
    }

    public static final F b(Object obj) {
        F f10 = obj instanceof F ? (F) obj : null;
        if (f10 != null) {
            return f10;
        }
        p210v8.g gVar = obj instanceof p210v8.g ? (p210v8.g) obj : null;
        InterfaceC0174b interfaceC0174bA = gVar != null ? gVar.a() : null;
        if (interfaceC0174bA instanceof F) {
            return (F) interfaceC0174bA;
        }
        return null;
    }

    public static final k0 c(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var != null) {
            return k0Var;
        }
        p210v8.p pVar = obj instanceof p210v8.p ? (p210v8.p) obj : null;
        InterfaceC0174b interfaceC0174bA = pVar != null ? pVar.a() : null;
        if (interfaceC0174bA instanceof k0) {
            return (k0) interfaceC0174bA;
        }
        return null;
    }

    public static final ArrayList d(M8.a aVar) throws IllegalAccessException, InvocationTargetException {
        List listU;
        Annotation annotationI;
        p210v8.i.f(aVar, "<this>");
        M8.h<M8.b> hVarQ = aVar.q();
        ArrayList<Annotation> arrayList = new ArrayList();
        for (M8.b bVar : hVarQ) {
            L8.M mG = bVar.g();
            if (mG instanceof Q8.a) {
                annotationI = ((Q8.a) mG).f4339s;
            } else if (mG instanceof Q8.f) {
                R8.r rVar = ((Q8.f) mG).f4344s;
                C0409d c0409d = rVar instanceof C0409d ? (C0409d) rVar : null;
                annotationI = c0409d != null ? c0409d.a : null;
            } else {
                annotationI = i(bVar);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (p068ga.d.o(p068ga.d.l((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsO = p068ga.d.o(p068ga.d.l(annotation));
                        if (!clsO.getSimpleName().equals("Container") || clsO.getAnnotation(p210v8.w.class) == null) {
                            listU = com.bumptech.glide.d.u(annotation);
                        } else {
                            Object objInvoke = clsO.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                            p210v8.i.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listU = p086i8.i.l((Annotation[]) objInvoke);
                        }
                        p086i8.q.J(arrayList2, listU);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        p210v8.i.f(type, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC0268b f(Class cls, AbstractC0682k abstractC0682k, p067g9.f fVar, p067g9.g gVar, p067g9.a aVar, p200u8.c cVar) {
        List list;
        p210v8.i.f(cls, "moduleAnchor");
        p210v8.i.f(abstractC0682k, "proto");
        p210v8.i.f(fVar, "nameResolver");
        p210v8.i.f(aVar, "metadataVersion");
        Q8.e eVarA = q0.a(cls);
        if (abstractC0682k instanceof C0632y) {
            list = ((C0632y) abstractC0682k).f11231A;
        } else {
            if (!(abstractC0682k instanceof p047e9.G)) {
                throw new IllegalStateException(("Unsupported message: " + abstractC0682k).toString());
            }
            list = ((p047e9.G) abstractC0682k).f10786A;
        }
        List list2 = list;
        I4.c cVar2 = eVarA.a;
        p067g9.h hVar = p067g9.h.f11586b;
        p210v8.i.e(list2, "typeParameters");
        return (InterfaceC0268b) cVar.invoke(new p220w9.q(new V3.b(cVar2, fVar, (InterfaceC0290y) cVar2.f2079b, gVar, hVar, aVar, null, null, list2)), abstractC0682k);
    }

    public static final O8.x g(InterfaceC0269c interfaceC0269c) {
        p210v8.i.f(interfaceC0269c, "<this>");
        if (interfaceC0269c.G() == null) {
            return null;
        }
        InterfaceC0276j interfaceC0276jV = interfaceC0269c.v();
        p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC0271e) interfaceC0276jV).M0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, p096j9.b bVar, int i10) {
        String str = K8.d.a;
        p096j9.e eVarI = bVar.b().i();
        p210v8.i.e(eVarI, "kotlinClassId.asSingleFqName().toUnsafe()");
        p096j9.b bVarF = K8.d.f(eVarI);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String strB = bVar.g().b();
        String strB2 = bVar.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat("."));
        }
        sb.append(L9.n.F(strB2, '.', '$'));
        if (i10 > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return p086i8.C.A(classLoader, string);
    }

    public static final Annotation i(M8.b bVar) {
        InterfaceC0271e interfaceC0271eD = p165q9.d.d(bVar);
        Class clsJ = interfaceC0271eD != null ? j(interfaceC0271eD) : null;
        if (!(clsJ instanceof Class)) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            p096j9.f fVar = (p096j9.f) entry.getKey();
            p145o9.g gVar = (p145o9.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            p210v8.i.e(classLoader, "annotationClass.classLoader");
            Object objK = k(gVar, classLoader);
            p076h8.f fVar2 = objK != null ? new p076h8.f(fVar.g(), objK) : null;
            if (fVar2 != null) {
                arrayList.add(fVar2);
            }
        }
        Map mapZ = p086i8.y.z(arrayList);
        Set setKeySet = mapZ.keySet();
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        return (Annotation) xa.d.h(clsJ, mapZ, arrayList2);
    }

    public static final Class j(InterfaceC0271e interfaceC0271e) {
        p210v8.i.f(interfaceC0271e, "<this>");
        L8.M mG = interfaceC0271e.g();
        p210v8.i.e(mG, "source");
        if (mG instanceof p029c9.m) {
            return ((p029c9.m) mG).f7562s.a;
        }
        if (mG instanceof Q8.f) {
            R8.r rVar = ((Q8.f) mG).f4344s;
            p210v8.i.d(rVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((R8.n) rVar).a;
        }
        p096j9.b bVarF = p165q9.d.f(interfaceC0271e);
        if (bVarF == null) {
            return null;
        }
        return h(AbstractC0408c.d(interfaceC0271e.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(p145o9.g gVar, ClassLoader classLoader) {
        AbstractC0151y abstractC0151y;
        Class clsH;
        if (gVar instanceof p145o9.a) {
            return i((M8.b) ((p145o9.a) gVar).a);
        }
        int i10 = 0;
        if (gVar instanceof p145o9.b) {
            p145o9.b bVar = (p145o9.b) gVar;
            p145o9.w wVar = bVar instanceof p145o9.w ? (p145o9.w) bVar : null;
            if (wVar != null && (abstractC0151y = wVar.f13836c) != null) {
                Iterable iterable = (Iterable) bVar.a;
                ArrayList arrayList = new ArrayList(p086i8.m.H(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((p145o9.g) it.next(), classLoader));
                }
                p096j9.f fVar = I8.i.f2112e;
                InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
                I8.k kVarR = interfaceC0273gW == null ? null : I8.i.r(interfaceC0273gW);
                int i11 = kVarR == null ? -1 : x0.a[kVarR.ordinal()];
                Object obj = bVar.a;
                switch (i11) {
                    case -1:
                        if (!I8.i.y(abstractC0151y)) {
                            throw new IllegalStateException(("Not an array type: " + abstractC0151y).toString());
                        }
                        AbstractC0151y abstractC0151yB = ((A9.S) p086i8.k.k0(abstractC0151y.l())).b();
                        p210v8.i.e(abstractC0151yB, "type.arguments.single().type");
                        InterfaceC0273g interfaceC0273gW2 = abstractC0151yB.D().w();
                        InterfaceC0271e interfaceC0271e = interfaceC0273gW2 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW2 : null;
                        if (interfaceC0271e == null) {
                            throw new IllegalStateException(("Not a class type: " + abstractC0151yB).toString());
                        }
                        if (I8.i.G(abstractC0151yB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                p210v8.i.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i10] = obj2;
                                i10++;
                            }
                            return strArr;
                        }
                        if (I8.i.b(interfaceC0271e, I8.n.P)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i10 < size2) {
                                Object obj3 = arrayList.get(i10);
                                p210v8.i.d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i10] = obj3;
                                i10++;
                            }
                            return clsArr;
                        }
                        p096j9.b bVarF = p165q9.d.f(interfaceC0271e);
                        if (bVarF != null && (clsH = h(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            p210v8.i.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i10 < size3) {
                                objArr[i10] = arrayList.get(i10);
                                i10++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            p210v8.i.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            p210v8.i.d(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            p210v8.i.d(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            p210v8.i.d(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            p210v8.i.d(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            p210v8.i.d(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            p210v8.i.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            p210v8.i.d(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof p145o9.i) {
            p076h8.f fVar2 = (p076h8.f) ((p145o9.i) gVar).a;
            p096j9.b bVar2 = (p096j9.b) fVar2.f11789s;
            p096j9.f fVar3 = (p096j9.f) fVar2.f11790t;
            Class clsH2 = h(classLoader, bVar2, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, fVar3.g());
            }
        } else if (gVar instanceof p145o9.r) {
            p145o9.q qVar = (p145o9.q) ((p145o9.r) gVar).a;
            if (qVar instanceof p145o9.p) {
                p145o9.f fVar4 = ((p145o9.p) qVar).a;
                return h(classLoader, fVar4.a, fVar4.f13830b);
            }
            if (!(qVar instanceof p145o9.o)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC0273g interfaceC0273gW3 = ((p145o9.o) qVar).a.D().w();
            InterfaceC0271e interfaceC0271e2 = interfaceC0273gW3 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW3 : null;
            if (interfaceC0271e2 != null) {
                return j(interfaceC0271e2);
            }
        } else {
            if (!(gVar instanceof p145o9.j ? true : gVar instanceof p145o9.t)) {
                return gVar.b();
            }
        }
        return null;
    }
}
