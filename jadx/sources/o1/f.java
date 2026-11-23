package o1;

import A9.D;
import C8.InterfaceC0175c;
import C8.InterfaceC0176d;
import C8.u;
import F8.m0;
import F8.n0;
import F8.p0;
import L8.AbstractC0281o;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.P;
import N9.AbstractC0342z;
import N9.I;
import N9.q0;
import O8.U;
import O8.x;
import X9.Q;
import android.util.TypedValue;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParserException;
import p086i8.s;
import p086i8.v;
import sa.B;
import sa.C;
import sa.C0787a;
import sa.C0789b;
import sa.G;
import sa.K;
import sa.N;
import y0.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static k a;

    public static final boolean a(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        p210v8.i.f(bArr, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        p210v8.i.f(bArr2, "b");
        if (i12 <= 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
            if (i14 >= i12) {
                return true;
            }
            i13 = i14;
        }
    }

    public static M b(TypedValue typedValue, M m2, M m10, String str, String str2) throws XmlPullParserException {
        if (m2 == null || m2 == m10) {
            return m2 == null ? m10 : m2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static final void c(long j, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j || j - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static J8.g d(J8.c cVar, boolean z6) {
        String lowerCase;
        p210v8.i.f(cVar, "functionClass");
        J8.g gVar = new J8.g(cVar, null, 1, z6);
        x xVarM0 = cVar.M0();
        s sVar = s.f12328s;
        List list = cVar.f2447C;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((P) obj).j0() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        K9.r rVarY0 = p086i8.k.y0(arrayList);
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(rVarY0, 10));
        Iterator it = rVarY0.iterator();
        while (true) {
            K9.b bVar = (K9.b) it;
            if (!bVar.f2675t.hasNext()) {
                gVar.e1(null, xVarM0, sVar, sVar, arrayList2, ((P) p086i8.k.b0(list)).p(), 4, AbstractC0281o.f2822e);
                J8.g gVar2 = gVar;
                gVar2.f3779O = true;
                return gVar2;
            }
            v vVar = (v) bVar.next();
            int i10 = vVar.a;
            P p10 = (P) vVar.f12331b;
            String strG = p10.getName().g();
            p210v8.i.e(strG, "typeParameter.name.asString()");
            if (strG.equals("T")) {
                lowerCase = "instance";
            } else if (strG.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strG.toLowerCase(Locale.ROOT);
                p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            J8.g gVar3 = gVar;
            String str = lowerCase;
            M8.f fVar = M8.g.a;
            p096j9.f fVarJ = p096j9.f.j(str);
            D dP = p10.p();
            p210v8.i.e(dP, "typeParameter.defaultType");
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new U(gVar3, null, i10, fVar, fVarJ, dP, false, false, false, null, L8.M.a));
            gVar = gVar3;
            arrayList2 = arrayList3;
        }
    }

    public static M8.b e(M8.h hVar, p096j9.c cVar) {
        Object next;
        p210v8.i.f(cVar, "fqName");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p210v8.i.a(((M8.b) next).a(), cVar)) {
                return (M8.b) next;
            }
        }
        next = null;
        return (M8.b) next;
    }

    public static final HashSet f(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setG = ((t9.n) it.next()).g();
            if (setG == null) {
                return null;
            }
            p086i8.q.J(hashSet, setG);
        }
        return hashSet;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Q g(String str) {
        p210v8.i.f(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return Q.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return Q.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return Q.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return Q.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return Q.SSL_3_0;
        }
        throw new IllegalArgumentException(p210v8.i.k(str, "Unexpected TLS version: "));
    }

    public static p029c9.n h(p068ga.d dVar) {
        if (dVar instanceof i9.e) {
            i9.e eVar = (i9.e) dVar;
            String str = eVar.f12335b;
            p210v8.i.f(str, MediationMetaData.KEY_NAME);
            String str2 = eVar.f12336c;
            p210v8.i.f(str2, "desc");
            return new p029c9.n(str.concat(str2));
        }
        if (!(dVar instanceof i9.d)) {
            throw new NoWhenBranchMatchedException();
        }
        i9.d dVar2 = (i9.d) dVar;
        String str3 = dVar2.f12333b;
        p210v8.i.f(str3, MediationMetaData.KEY_NAME);
        String str4 = dVar2.f12334c;
        p210v8.i.f(str4, "desc");
        return new p029c9.n(str3 + '#' + str4);
    }

    public static final InterfaceC0175c i(InterfaceC0176d interfaceC0176d) {
        Object obj;
        if (interfaceC0176d instanceof InterfaceC0175c) {
            return (InterfaceC0175c) interfaceC0176d;
        }
        if (!(interfaceC0176d instanceof C8.v)) {
            throw new p0("Cannot calculate JVM erasure for type: " + interfaceC0176d, 0);
        }
        u uVar = n0.f1613v[0];
        Object objInvoke = ((n0) ((C8.v) interfaceC0176d)).f1615t.invoke();
        p210v8.i.e(objInvoke, "<get-upperBounds>(...)");
        List list = (List) objInvoke;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            p210v8.j jVar = (p210v8.j) next;
            p210v8.i.d(jVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC0273g interfaceC0273gW = ((m0) jVar).a.D().w();
            InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
            if (interfaceC0271e != null && interfaceC0271e.M() != 2 && interfaceC0271e.M() != 5) {
                obj = next;
                break;
            }
        }
        p210v8.j jVar2 = (p210v8.j) obj;
        if (jVar2 == null) {
            jVar2 = (p210v8.j) p086i8.k.V(list);
        }
        return jVar2 != null ? j(jVar2) : p210v8.u.a.b(Object.class);
    }

    public static final InterfaceC0175c j(p210v8.j jVar) {
        InterfaceC0176d interfaceC0176dC = ((m0) jVar).c();
        if (interfaceC0176dC != null) {
            return i(interfaceC0176dC);
        }
        throw new p0("Cannot calculate JVM erasure for type: " + jVar, 0);
    }

    public static boolean k(M8.h hVar, p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        return hVar.H(cVar) != null;
    }

    public static org.jsoup.nodes.h l(String str) {
        K0.n nVar;
        C0789b c0789b = new C0789b();
        StringReader stringReader = new StringReader(str);
        p102k7.e eVar = new p102k7.e(c0789b);
        org.jsoup.nodes.h hVar = new org.jsoup.nodes.h("");
        c0789b.f14877d = hVar;
        hVar.f13875C = eVar;
        c0789b.a = eVar;
        c0789b.f14881h = sa.D.f14800c;
        C0787a c0787a = new C0787a(stringReader, 32768);
        c0789b.f14875b = c0787a;
        C c10 = (C) eVar.f12743s;
        c10.getClass();
        c0787a.f14863i = null;
        c0789b.f14880g = null;
        c0789b.f14876c = new N(c0789b.f14875b, c10);
        c0789b.f14878e = new ArrayList(32);
        c0789b.f14882i = new HashMap();
        c0789b.f14879f = "";
        c0789b.f14884l = B.f14791s;
        c0789b.f14885m = null;
        c0789b.f14886n = false;
        c0789b.f14887o = null;
        c0789b.f14888p = null;
        c0789b.f14889q = new ArrayList();
        c0789b.f14890r = new ArrayList();
        c0789b.f14891s = new ArrayList();
        c0789b.f14892t = new K();
        c0789b.f14893u = true;
        c0789b.f14894v = false;
        N n10 = c0789b.f14876c;
        while (true) {
            if (n10.f14842e) {
                StringBuilder sb = n10.f14844g;
                int length = sb.length();
                G g8 = n10.f14848l;
                if (length != 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    g8.f14819b = string;
                    n10.f14843f = null;
                    nVar = g8;
                } else {
                    String str2 = n10.f14843f;
                    if (str2 != null) {
                        g8.f14819b = str2;
                        n10.f14843f = null;
                        nVar = g8;
                    } else {
                        n10.f14842e = false;
                        nVar = n10.f14841d;
                    }
                }
                c0789b.D(nVar);
                nVar.q();
                if (nVar.a == 6) {
                    c0789b.f14875b.d();
                    c0789b.f14875b = null;
                    c0789b.f14876c = null;
                    c0789b.f14878e = null;
                    c0789b.f14882i = null;
                    return c0789b.f14877d;
                }
            } else {
                n10.f14840c.i(n10, n10.a);
            }
        }
    }

    public static p060g0.b m(String str, V.h hVar) {
        p060g0.a aVar = p060g0.a.f11455s;
        S9.e eVarB = AbstractC0342z.b(I.f3415c.plus(new q0()));
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return new p060g0.b(str, hVar, aVar, eVarB);
    }

    public static final void n(int i10, int i11, Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static final String o(byte b3) {
        char[] cArr = na.b.a;
        return new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]});
    }
}
