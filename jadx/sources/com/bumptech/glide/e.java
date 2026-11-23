package com.bumptech.glide;

import C8.InterfaceC0175c;
import I8.n;
import R8.AbstractC0408c;
import X9.C0468n;
import X9.Q;
import X9.t;
import X9.v;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p.Y0;
import p.a1;
import p086i8.C;
import p086i8.s;
import y0.C0868f;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(AtomicLong atomicLong, long j) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            } else {
                j11 = j10 + j;
            }
        } while (!atomicLong.compareAndSet(j10, j11 >= 0 ? j11 : Long.MAX_VALUE));
    }

    public static String b(String str) throws IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        InputStream inputStream = processExec == null ? null : processExec.getInputStream();
        if (inputStream != null) {
            try {
                return new Scanner(inputStream).useDelimiter(C.a(C.c("3C43"))).next().trim();
            } catch (NoSuchElementException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h8.d, java.lang.Object] */
    public static p145o9.f c(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            p210v8.i.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new p145o9.f(p096j9.b.j(n.f2167d.g()), i10);
            }
            I8.k kVarI = p176r9.c.g(cls.getName()).i();
            p210v8.i.e(kVarI, "get(currentClass.name).primitiveType");
            return i10 > 0 ? new p145o9.f(p096j9.b.j((p096j9.c) kVarI.f2131v.getValue()), i10 - 1) : new p145o9.f(p096j9.b.j((p096j9.c) kVarI.f2130u.getValue()), i10);
        }
        p096j9.b bVarA = AbstractC0408c.a(cls);
        String str = K8.d.a;
        p096j9.b bVar = (p096j9.b) K8.d.f2632h.get(bVarA.b().i());
        if (bVar != null) {
            bVarA = bVar;
        }
        return new p145o9.f(bVarA, i10);
    }

    public static final Collection d(Collection collection, Collection collection2) {
        p210v8.i.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static Integer e(String str) {
        try {
            String str2 = (String) Class.forName(C.a(C.c("016CB0DB05ECC1E98964413B825E6031CEF9BCEF43D3200953E7B6"))).getMethod(C.a(C.c("0767A0")), String.class).invoke(null, str);
            if (str2 != null) {
                return Integer.valueOf(Integer.parseInt(str2));
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static v f(SSLSession sSLSession) throws IOException {
        List listL;
        List listL2 = s.f12328s;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(p210v8.i.k(cipherSuite, "cipherSuite == "));
        }
        C0468n c0468nC = C0468n.f5600b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        Q qG = o1.f.g(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listL = peerCertificates != null ? Y9.c.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listL2 = Y9.c.l(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new v(qG, c0468nC, listL2, new t(listL, 1));
    }

    public static p123m8.g g(p123m8.g gVar, p123m8.h hVar) {
        p210v8.i.f(hVar, "key");
        if (p210v8.i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final String h(InterfaceC0175c interfaceC0175c) {
        p210v8.i.g(interfaceC0175c, "$this$name");
        String strS = interfaceC0175c.s();
        return strS != null ? strS : p068ga.d.o(interfaceC0175c).getName();
    }

    public static final J9.g i(ArrayList arrayList) {
        J9.g gVar = new J9.g();
        for (Object obj : arrayList) {
            t9.n nVar = (t9.n) obj;
            if (nVar != null && nVar != t9.m.f15259b) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    public static p123m8.i j(p123m8.g gVar, p123m8.h hVar) {
        p210v8.i.f(hVar, "key");
        return p210v8.i.a(gVar.getKey(), hVar) ? p123m8.j.f13164s : gVar;
    }

    public static final ArrayList k(Map map, p200u8.b bVar) {
        p210v8.i.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0868f c0868f = (C0868f) entry.getValue();
            Boolean boolValueOf = c0868f != null ? Boolean.valueOf(c0868f.f15916b) : null;
            p210v8.i.c(boolValueOf);
            if (!boolValueOf.booleanValue() && !c0868f.f15917c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) bVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static p123m8.i l(p123m8.g gVar, p123m8.i iVar) {
        p210v8.i.f(iVar, "context");
        return iVar == p123m8.j.f13164s ? gVar : (p123m8.i) iVar.fold(gVar, p123m8.b.f13159u);
    }

    public static void m(p029c9.k kVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        p210v8.i.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                p210v8.i.c(objInvoke);
                p096j9.f fVarJ = p096j9.f.j(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    kVar.r(fVarJ, c((Class) objInvoke));
                } else if (Q8.c.a.contains(enclosingClass)) {
                    kVar.p(fVarJ, objInvoke);
                } else {
                    List list = AbstractC0408c.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        p210v8.i.e(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        kVar.s(fVarJ, AbstractC0408c.a(enclosingClass), p096j9.f.j(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        p210v8.i.e(interfaces, "clazz.interfaces");
                        Class cls2 = (Class) p086i8.i.C(interfaces);
                        p210v8.i.e(cls2, "annotationClass");
                        p029c9.k kVarT = kVar.t(AbstractC0408c.a(cls2), fVarJ);
                        if (kVarT != null) {
                            m(kVarT, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        p029c9.l lVarQ = kVar.q(fVarJ);
                        if (lVarQ != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                p096j9.b bVarA = AbstractC0408c.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    p210v8.i.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    lVarQ.l0(bVarA, p096j9.f.j(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    p210v8.i.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    lVarQ.K0(c((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    p029c9.k kVarD0 = lVarQ.D0(AbstractC0408c.a(componentType));
                                    if (kVarD0 != null) {
                                        p210v8.i.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        m(kVarD0, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    lVarQ.G0(obj4);
                                }
                            }
                            lVarQ.o();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        kVar.o();
    }

    public static void n(AtomicLong atomicLong, long j) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            j11 = j10 - j;
            if (j11 < 0) {
                J7.j.y(new IllegalStateException("More produced than requested: " + j11));
                j11 = 0L;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
    }

    public static p096j9.f o(p096j9.f fVar, String str, String str2, int i10) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z6 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f12552t) {
            String strH = fVar.h();
            if (L9.n.I(strH, str, false) && strH.length() != str.length() && ('a' > (cCharAt = strH.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return p096j9.f.j(str2.concat(L9.f.W(strH, str)));
                }
                if (!z6) {
                    return fVar;
                }
                String strW = L9.f.W(strH, str);
                if (strW.length() != 0 && J7.j.s(0, strW)) {
                    if (strW.length() != 1 && J7.j.s(1, strW)) {
                        B8.b it = new B8.c(0, strW.length() - 1, 1).iterator();
                        do {
                            if (!it.f774u) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (J7.j.s(((Number) next).intValue(), strW));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strW.substring(0, iIntValue);
                            p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strX = J7.j.X(strSubstring);
                            String strSubstring2 = strW.substring(iIntValue);
                            p210v8.i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            strW = strX.concat(strSubstring2);
                        } else {
                            strW = J7.j.X(strW);
                        }
                    } else if (strW.length() != 0 && 'A' <= (cCharAt2 = strW.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strW.substring(1);
                        p210v8.i.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        strW = lowerCase + strSubstring3;
                    }
                }
                if (p096j9.f.k(strW)) {
                    return p096j9.f.j(strW);
                }
            }
        }
        return null;
    }

    public static final List p(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        p095j8.b bVar = new p095j8.b();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            p210v8.i.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            p210v8.i.e(string2, "cursor.getString(toColumnIndex)");
            bVar.add(new M0.c(string, i10, string2, i11));
        }
        return p086i8.k.n0(d.a(bVar));
    }

    public static final M0.d q(P0.c cVar, String str, boolean z6) throws IOException {
        Cursor cursorN = cVar.n("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorN.getColumnIndex("seqno");
            int columnIndex2 = cursorN.getColumnIndex("cid");
            int columnIndex3 = cursorN.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex4 = cursorN.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorN.moveToNext()) {
                    if (cursorN.getInt(columnIndex2) >= 0) {
                        int i10 = cursorN.getInt(columnIndex);
                        String string = cursorN.getString(columnIndex3);
                        String str2 = cursorN.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        p210v8.i.e(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                p210v8.i.e(collectionValues, "columnsMap.values");
                List listS0 = p086i8.k.s0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                p210v8.i.e(collectionValues2, "ordersMap.values");
                M0.d dVar = new M0.d(str, z6, listS0, p086i8.k.s0(collectionValues2));
                cursorN.close();
                return dVar;
            }
            cursorN.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.c(cursorN, th);
                throw th2;
            }
        }
    }

    public static void r(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Y0.a(view, charSequence);
            return;
        }
        a1 a1Var = a1.f14023C;
        if (a1Var != null && a1Var.f14027s == view) {
            a1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a1(view, charSequence);
            return;
        }
        a1 a1Var2 = a1.f14024D;
        if (a1Var2 != null && a1Var2.f14027s == view) {
            a1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
