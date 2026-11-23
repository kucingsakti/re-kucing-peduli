package p086i8;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.O;
import A9.P;
import A9.S;
import A9.Z;
import A9.b0;
import A9.d0;
import C8.InterfaceC0175c;
import J9.l;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.J;
import L8.K;
import O8.N;
import U8.AbstractC0443d;
import U8.C0444e;
import U8.C0445f;
import U8.F;
import U8.g;
import X9.w;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.V;
import com.google.android.gms.measurement.internal.zzab;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Extras;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.a;
import h9.k;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ma.c;
import p029c9.n;
import p040e1.j;
import p047e9.G;
import p095j8.e;
import p095j8.h;
import p096j9.f;
import p104k9.C0678g;
import p104k9.m;
import p188t1.Y;
import p210v8.i;
import p210v8.u;
import p230x9.d;
import qa.b;
import y0.C0878p;
import zlc.season.claritypotion.ClarityPotion;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static zzab a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12307b = {96, 2, -44, -87, 106, -123, -91, -57, -26, 23, 111, 104, -5, 45, 20, 84, -93, -87, -50, -128, 51, -74, 82, 125, 58, -126, -59, 84, 95, -123, 89, 60};

    public static final Class A(ClassLoader classLoader, String str) {
        i.f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = (byte) (bArr[i10] ^ f12307b[i10 % 32]);
        }
        return new String(bArr2);
    }

    public static c b() throws InterruptedException {
        c cVar = c.j;
        i.c(cVar);
        c cVar2 = cVar.f13185f;
        if (cVar2 == null) {
            long jNanoTime = System.nanoTime();
            c.class.wait(c.f13182h);
            c cVar3 = c.j;
            i.c(cVar3);
            if (cVar3.f13185f != null || System.nanoTime() - jNanoTime < c.f13183i) {
                return null;
            }
            return c.j;
        }
        long jNanoTime2 = cVar2.f13186g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            c.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        c cVar4 = c.j;
        i.c(cVar4);
        cVar4.f13185f = cVar2.f13185f;
        cVar2.f13185f = null;
        return cVar2;
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[str.length() / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 1;
            byte bDigit = (byte) (Character.digit(str.charAt(i10), 16) << 4);
            bArr[i11] = bDigit;
            i10 += 2;
            bArr[i11] = (byte) (bDigit + ((byte) Character.digit(str.charAt(i12), 16)));
            i11++;
        }
        return bArr;
    }

    public static h d(h hVar) {
        e eVar = hVar.f12539s;
        eVar.b();
        return eVar.f12522A > 0 ? hVar : h.f12538t;
    }

    public static void e(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(Y9.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
            i10 = i11;
        }
    }

    public static void f(String str, String str2) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                throw new IllegalArgumentException(i.k(Y9.c.q(str2) ? "" : i.k(str, ": "), Y9.c.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2)).toString());
            }
            i10 = i11;
        }
    }

    public static Activity g() {
        Iterator it = k.i0((ArrayList) ClarityPotion.f16352t.f13675t).iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }

    public static Context h() {
        Context context = ClarityPotion.f16351s;
        if (context != null) {
            return context;
        }
        i.n("clarityPotion");
        throw null;
    }

    public static ColorStateList i(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !a.l(drawable)) {
            return null;
        }
        return a.d(drawable).getColorStateList();
    }

    public static C0878p j(V v4) {
        d dVar = C0878p.f15957c;
        u0.a aVar = u0.a.f15287t;
        i.f(aVar, "defaultCreationExtras");
        Y1.c cVar = new Y1.c(v4, dVar, aVar);
        InterfaceC0175c interfaceC0175cR = p068ga.d.r(C0878p.class);
        String strS = interfaceC0175cR.s();
        if (strS != null) {
            return (C0878p) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String k(InterfaceC0285t interfaceC0285t) {
        f fVar;
        InterfaceC0269c interfaceC0269cL = I8.i.z(interfaceC0285t) ? l(interfaceC0285t) : null;
        if (interfaceC0269cL != null) {
            InterfaceC0269c interfaceC0269cK = p165q9.d.k(interfaceC0269cL);
            if (interfaceC0269cK instanceof K) {
                I8.i.z(interfaceC0269cK);
                InterfaceC0269c interfaceC0269cB = p165q9.d.b(p165q9.d.k(interfaceC0269cK), C0444e.f4965v);
                if (interfaceC0269cB != null && (fVar = (f) g.a.get(p165q9.d.g(interfaceC0269cB))) != null) {
                    return fVar.g();
                }
            } else if (interfaceC0269cK instanceof N) {
                int i10 = AbstractC0443d.f4962l;
                LinkedHashMap linkedHashMap = F.f4944i;
                String strD = b.d((N) interfaceC0269cK);
                f fVar2 = strD == null ? null : (f) linkedHashMap.get(strD);
                if (fVar2 != null) {
                    return fVar2.g();
                }
            }
        }
        return null;
    }

    public static final InterfaceC0269c l(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "<this>");
        if (!F.j.contains(interfaceC0269c.getName()) && !g.f4974d.contains(p165q9.d.k(interfaceC0269c).getName())) {
            return null;
        }
        if (interfaceC0269c instanceof K ? true : interfaceC0269c instanceof J) {
            return p165q9.d.b(interfaceC0269c, C0444e.f4967x);
        }
        if (interfaceC0269c instanceof N) {
            return p165q9.d.b(interfaceC0269c, C0444e.f4968y);
        }
        return null;
    }

    public static final InterfaceC0269c m(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "<this>");
        InterfaceC0269c interfaceC0269cL = l(interfaceC0269c);
        if (interfaceC0269cL != null) {
            return interfaceC0269cL;
        }
        int i10 = C0445f.f4971l;
        f name = interfaceC0269c.getName();
        i.e(name, MediationMetaData.KEY_NAME);
        if (C0445f.b(name)) {
            return p165q9.d.b(interfaceC0269c, C0444e.f4969z);
        }
        return null;
    }

    public static final n n(G g8, p067g9.f fVar, p067g9.g gVar, boolean z6, boolean z10, boolean z11) {
        i.f(g8, "proto");
        i.f(fVar, "nameResolver");
        m mVar = k.f11880d;
        i.e(mVar, "propertySignature");
        h9.e eVar = (h9.e) xa.d.m(g8, mVar);
        if (eVar != null) {
            if (z6) {
                C0678g c0678g = i9.h.a;
                i9.d dVarB = i9.h.b(g8, fVar, gVar, z11);
                if (dVarB != null) {
                    return o1.f.h(dVarB);
                }
            } else if (z10 && (eVar.f11834t & 2) == 2) {
                h9.c cVar = eVar.f11836v;
                i.e(cVar, "signature.syntheticMethod");
                return new n(fVar.getString(cVar.f11820u).concat(fVar.getString(cVar.f11821v)));
            }
        }
        return null;
    }

    public static final boolean p(InterfaceC0271e interfaceC0271e, InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0271e, "<this>");
        i.f(interfaceC0269c, "specialCallableDescriptor");
        InterfaceC0276j interfaceC0276jV = interfaceC0269c.v();
        i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        D dP = ((InterfaceC0271e) interfaceC0276jV).p();
        i.e(dP, "specialCallableDescripto…ssDescriptor).defaultType");
        for (InterfaceC0271e interfaceC0271eJ = p124m9.e.j(interfaceC0271e); interfaceC0271eJ != null; interfaceC0271eJ = p124m9.e.j(interfaceC0271eJ)) {
            if (!(interfaceC0271eJ instanceof W8.c)) {
                D dP2 = interfaceC0271eJ.p();
                if (dP2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                d0 d0VarG = null;
                arrayDeque.add(new B9.n(dP2, null));
                O oD = dP.D();
                while (!arrayDeque.isEmpty()) {
                    B9.n nVar = (B9.n) arrayDeque.poll();
                    AbstractC0151y abstractC0151yG = nVar.a;
                    O oD2 = abstractC0151yG.D();
                    if (oD2 == null) {
                        B9.g.a(3);
                        throw null;
                    }
                    if (oD == null) {
                        B9.g.a(4);
                        throw null;
                    }
                    if (oD2.equals(oD)) {
                        boolean zH = abstractC0151yG.H();
                        for (B9.n nVar2 = nVar.f796b; nVar2 != null; nVar2 = nVar2.f796b) {
                            AbstractC0151y abstractC0151y = nVar2.a;
                            List listL = abstractC0151y.l();
                            boolean z6 = listL instanceof Collection;
                            C0133f c0133f = P.f350b;
                            if (!z6 || !listL.isEmpty()) {
                                Iterator it = listL.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        abstractC0151yG = new Z(c0133f.f(abstractC0151y.D(), abstractC0151y.l())).g(1, abstractC0151yG);
                                        break;
                                    }
                                    if (((S) it.next()).a() != 1) {
                                        abstractC0151yG = (AbstractC0151y) Y.c(new Z(Y.A(c0133f.f(abstractC0151y.D(), abstractC0151y.l()))).g(1, abstractC0151yG)).f1652b;
                                        break;
                                    }
                                }
                            } else {
                                abstractC0151yG = new Z(c0133f.f(abstractC0151y.D(), abstractC0151y.l())).g(1, abstractC0151yG);
                                break;
                            }
                            zH = zH || abstractC0151y.H();
                        }
                        O oD3 = abstractC0151yG.D();
                        if (oD3 == null) {
                            B9.g.a(3);
                            throw null;
                        }
                        if (oD3.equals(oD)) {
                            d0VarG = b0.g(abstractC0151yG, zH);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + B9.g.n(oD3) + ", \n\nsupertype: " + B9.g.n(oD) + " \n" + oD3.equals(oD));
                    }
                    for (AbstractC0151y abstractC0151y2 : oD2.t()) {
                        i.e(abstractC0151y2, "immediateSupertype");
                        arrayDeque.add(new B9.n(abstractC0151y2, nVar));
                    }
                }
                if (d0VarG != null) {
                    return !I8.i.z(interfaceC0271eJ);
                }
            }
        }
        return false;
    }

    public static final boolean q(List list) {
        i.g(list, "$this$isMutable");
        Object objG = l.g(u.a.b(list.getClass()).t(), D8.a.f1076s, new j(16), new D8.b(new LinkedList()));
        i.e(objG, "dfs(\n        supertypes,…        }\n        }\n    )");
        Collection collection = (Collection) objG;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((p210v8.j) it.next()).toString().equals("kotlin.collections.MutableList<E>")) {
                return true;
            }
        }
        return false;
    }

    public static LinkedHashSet r(Set set, Object obj) {
        i.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(set.size()));
        boolean z6 = false;
        for (Object obj2 : set) {
            boolean z10 = true;
            if (!z6 && i.a(obj2, obj)) {
                z6 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set s(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(objArr.length));
        i.D(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static w t(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = L9.f.j0(str).toString();
            i11 = i12;
        }
        int i13 = p068ga.l.i(0, strArr2.length - 1, 2);
        if (i13 >= 0) {
            while (true) {
                int i14 = i10 + 2;
                String str2 = strArr2[i10];
                String str3 = strArr2[i10 + 1];
                e(str2);
                f(str3, str2);
                if (i10 == i13) {
                    break;
                }
                i10 = i14;
            }
        }
        return new w(strArr2);
    }

    public static LinkedHashSet u(Set set, Iterable iterable) {
        int size;
        i.f(set, "<this>");
        i.f(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(size));
        linkedHashSet.addAll(set);
        q.J(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet v(Set set, Object obj) {
        i.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set w(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        i.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static Set x(Object... objArr) {
        return objArr.length > 0 ? i.K(objArr) : u.f12330s;
    }

    public static void y(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            p052f3.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                p052f3.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            p052f3.a.a(outline, path);
        }
    }

    public static final void z(Download download, DownloadInfo downloadInfo) {
        i.g(downloadInfo, "downloadInfo");
        DownloadInfo downloadInfo2 = (DownloadInfo) download;
        downloadInfo.f10360s = downloadInfo2.f10360s;
        downloadInfo.g(downloadInfo2.f10361t);
        downloadInfo.i(downloadInfo2.f10362u);
        downloadInfo.f(downloadInfo2.f10363v);
        downloadInfo.f10364w = downloadInfo2.f10364w;
        int i10 = downloadInfo2.f10365x;
        AbstractC0487g.v(i10, "<set-?>");
        downloadInfo.f10365x = i10;
        downloadInfo.f10366y = y.A(downloadInfo2.f10366y);
        downloadInfo.f10367z = downloadInfo2.f10367z;
        downloadInfo.f10346A = downloadInfo2.f10346A;
        h7.f fVar = downloadInfo2.f10347B;
        i.g(fVar, "<set-?>");
        downloadInfo.f10347B = fVar;
        int i11 = downloadInfo2.f10349D;
        AbstractC0487g.v(i11, "<set-?>");
        downloadInfo.f10349D = i11;
        h7.b bVar = downloadInfo2.f10348C;
        i.g(bVar, "<set-?>");
        downloadInfo.f10348C = bVar;
        downloadInfo.f10350E = downloadInfo2.f10350E;
        downloadInfo.f10351F = downloadInfo2.f10351F;
        int i12 = downloadInfo2.f10352G;
        AbstractC0487g.v(i12, "<set-?>");
        downloadInfo.f10352G = i12;
        downloadInfo.f10353H = downloadInfo2.f10353H;
        downloadInfo.f10354I = downloadInfo2.f10354I;
        Extras extras = downloadInfo2.f10355J;
        i.g(extras, "<set-?>");
        downloadInfo.f10355J = extras;
        downloadInfo.f10356K = downloadInfo2.f10356K;
        downloadInfo.f10357L = downloadInfo2.f10357L;
    }
}
