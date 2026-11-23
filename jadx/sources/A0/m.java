package A0;

import A1.C0099h;
import A9.AbstractC0130c;
import A9.AbstractC0135h;
import A9.AbstractC0151y;
import A9.C0134g;
import A9.C0150x;
import A9.D;
import A9.J;
import A9.O;
import A9.Q;
import A9.S;
import A9.Z;
import A9.b0;
import A9.d0;
import E4.B;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0290y;
import L8.P;
import N9.AbstractC0342z;
import O8.G;
import O8.N;
import O8.U;
import R8.A;
import R8.AbstractC0408c;
import R8.C0409d;
import R8.w;
import U8.C0442c;
import U8.F;
import Y8.C0472a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.PasscodeActivity;
import com.kcstream.cing.activity.RecentCategoryActivity;
import com.kcstream.cing.library.AdController;
import com.mukesh.OtpView;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;
import p.b1;
import p078i.AbstractActivityC0655l;
import p086i8.C;
import p086i8.z;
import p210v8.u;
import y0.C0872j;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f33t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0271e interfaceC0271e, Z8.d dVar, D d3, Z8.a aVar) {
        super(1);
        this.f32s = 24;
        this.f33t = interfaceC0271e;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x053c  */
    /* JADX WARN: Code duplicated, block: B:168:0x054a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0550  */
    /* JADX WARN: Code duplicated, block: B:220:0x069f  */
    /* JADX WARN: Code duplicated, block: B:231:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:245:0x0736  */
    /* JADX WARN: Code duplicated, block: B:262:0x07da  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v101, types: [u8.b, v8.k] */
    /* JADX WARN: Type inference failed for: r5v32, types: [h8.d, java.lang.Object] */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        S sE;
        int i10;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean zEquals;
        Object next;
        boolean z12;
        boolean z13;
        boolean zIsEmpty;
        p019b9.a aVar;
        A9.r rVarG;
        A9.r rVarG2;
        C0150x c0150x = null;
        switch (this.f32s) {
            case 0:
                final C0872j c0872j = (C0872j) obj;
                p210v8.i.f(c0872j, "entry");
                final g gVar = (g) this.f33t;
                return new InterfaceC0522q() { // from class: A0.l
                    @Override // androidx.lifecycle.InterfaceC0522q
                    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
                        g gVar2 = gVar;
                        p210v8.i.f(gVar2, "this$0");
                        C0872j c0872j2 = c0872j;
                        p210v8.i.f(c0872j2, "$entry");
                        if (enumC0518m == EnumC0518m.ON_RESUME && ((List) ((Q9.t) ((Q9.m) gVar2.b().f15941e.f3811t)).f()).contains(c0872j2)) {
                            if (g.n()) {
                                c0872j2.toString();
                                interfaceC0523s.toString();
                            }
                            gVar2.b().b(c0872j2);
                        }
                        if (enumC0518m == EnumC0518m.ON_DESTROY) {
                            if (g.n()) {
                                c0872j2.toString();
                                interfaceC0523s.toString();
                            }
                            gVar2.b().b(c0872j2);
                        }
                    }
                };
            case 1:
                C0134g c0134g = (C0134g) obj;
                p210v8.i.f(c0134g, "supertypes");
                AbstractC0135h abstractC0135h = (AbstractC0135h) this.f33t;
                abstractC0135h.d().getClass();
                List list = c0134g.a;
                p210v8.i.f(list, "superTypes");
                if (list.isEmpty()) {
                    AbstractC0151y abstractC0151yC = abstractC0135h.c();
                    List listU = abstractC0151yC != null ? com.bumptech.glide.d.u(abstractC0151yC) : null;
                    if (listU == null) {
                        listU = p086i8.s.f12328s;
                    }
                    list = listU;
                }
                List listS0 = list instanceof List ? (List) list : null;
                if (listS0 == null) {
                    listS0 = p086i8.k.s0(list);
                }
                List listG = abstractC0135h.g(listS0);
                p210v8.i.f(listG, "<set-?>");
                c0134g.f372b = listG;
                return p076h8.m.a;
            case 2:
                boolean z14 = false;
                B9.f fVar = (B9.f) obj;
                p210v8.i.f(fVar, "kotlinTypeRefiner");
                C0150x c0150x2 = (C0150x) this.f33t;
                c0150x2.getClass();
                LinkedHashSet linkedHashSet = c0150x2.f392b;
                ArrayList arrayList = new ArrayList(p086i8.m.H(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0151y) it.next()).l0(fVar));
                    z14 = true;
                }
                if (z14) {
                    AbstractC0151y abstractC0151y = c0150x2.a;
                    AbstractC0151y abstractC0151yL0 = abstractC0151y != null ? abstractC0151y.l0(fVar) : null;
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    C0150x c0150x3 = new C0150x(linkedHashSet2);
                    c0150x3.a = abstractC0151yL0;
                    c0150x = c0150x3;
                }
                if (c0150x != null) {
                    c0150x2 = c0150x;
                }
                return c0150x2.b();
            case 3:
                AbstractC0151y abstractC0151y2 = (AbstractC0151y) obj;
                p210v8.i.e(abstractC0151y2, "it");
                return ((p200u8.b) this.f33t).invoke(abstractC0151y2).toString();
            case 4:
                Q q10 = (Q) obj;
                P p10 = q10.a;
                o1.e eVar = (o1.e) this.f33t;
                eVar.getClass();
                Z8.a aVar2 = q10.f351b;
                Set set = aVar2.f5908e;
                if (set != null && set.contains(p10.c())) {
                    return eVar.S0(aVar2);
                }
                D dP = p10.p();
                p210v8.i.e(dP, "typeParameter.defaultType");
                LinkedHashSet<P> linkedHashSet3 = new LinkedHashSet();
                qa.b.i(dP, dP, linkedHashSet3, set);
                int iS = z.s(p086i8.m.H(linkedHashSet3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (P p11 : linkedHashSet3) {
                    if (set == null || !set.contains(p11)) {
                        Set set2 = aVar2.f5908e;
                        sE = p170r3.e.e(p11, aVar2, eVar, eVar.T0(p11, Z8.a.a(aVar2, 0, false, set2 != null ? C.v(set2, p10) : C.w(p10), null, 47)));
                    } else {
                        sE = b0.k(p11, aVar2);
                    }
                    linkedHashMap.put(p11.I(), sE);
                }
                Z z15 = new Z(new J(linkedHashMap, 1));
                List upperBounds = p10.getUpperBounds();
                p210v8.i.e(upperBounds, "typeParameter.upperBounds");
                p095j8.h hVarZ0 = eVar.Z0(z15, upperBounds, aVar2);
                if (hVarZ0.f12539s.isEmpty()) {
                    return eVar.S0(aVar2);
                }
                if (hVarZ0.f12539s.f12522A == 1) {
                    return (AbstractC0151y) p086i8.k.j0(hVarZ0);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 5:
                int i11 = PasscodeActivity.f10200W;
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f33t;
                Intent intent = passcodeActivity.getIntent();
                p040e1.j jVar = passcodeActivity.f10201V;
                if (jVar != null) {
                    ((OtpView) jVar.f10697t).setOtpCompletionListener(new B(intent, 0, passcodeActivity));
                    return p076h8.m.a;
                }
                p210v8.i.n("bindingPasscode");
                throw null;
            case 6:
                p210v8.i.f((Ga.b) obj, "it");
                RecentCategoryActivity recentCategoryActivity = (RecentCategoryActivity) this.f33t;
                recentCategoryActivity.f10206Z++;
                AbstractC0342z.n(recentCategoryActivity, null, new E4.D(recentCategoryActivity, null), 3);
                return p076h8.m.a;
            case 7:
                p210v8.i.f((String) obj, "it");
                return Integer.valueOf(((AtomicInteger) ((o1.c) this.f33t).f13624u).getAndIncrement());
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AdController adController = (AdController) this.f33t;
                if (!zBooleanValue) {
                    i10 = 0;
                    Ha.a.a.getClass();
                    za.c.h(new Object[0]);
                } else if (adController.f2594T) {
                    if (adController.f10268Z) {
                        byte[] bArrDecode = Base64.decode(adController.ssEwx7TtXGi0X9K7r6VY(), 0);
                        p210v8.i.e(bArrDecode, "decode(...)");
                        UnityAds.load(new String(bArrDecode, L9.a.a), new K4.b(adController));
                    }
                    i10 = 0;
                    Ha.a.a.getClass();
                    za.c.h(new Object[0]);
                } else {
                    i10 = 0;
                }
                Ha.a.a.getClass();
                za.c.h(new Object[i10]);
                return p076h8.m.a;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                C0099h c0099h = (C0099h) this.f33t;
                MainActivity mainActivity = (MainActivity) c0099h.f103t;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c0099h.f105v).edit();
                String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue & 16777215)}, 1));
                switch (str.hashCode()) {
                    case -1877103645:
                        if (str.equals("#000000")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Dark);
                        }
                        break;
                    case -1743574071:
                        if (str.equals("#4DB6AC")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Teal);
                        }
                        break;
                    case -1743520149:
                        if (str.equals("#4DD0E1")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Cyan);
                        }
                        break;
                    case -1668143198:
                        if (str.equals("#7986CB")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Blue);
                        }
                        break;
                    case -1389238302:
                        if (str.equals("#A1887F")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Brown);
                        }
                        break;
                    case -1345892039:
                        if (str.equals("#BA68C8")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Purple);
                        }
                        break;
                    case -1286341166:
                        if (str.equals("#DCE775")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Lime);
                        }
                        break;
                    case -1271062229:
                        if (str.equals("#E57373")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Orange);
                        }
                        break;
                    case -1243308210:
                        if (str.equals("#F48FB1")) {
                            editorEdit.remove("setTheme");
                        }
                        break;
                    case -1226344090:
                        if (str.equals("#FFD54F")) {
                            editorEdit.putInt("setTheme", R.style.AppThemeLayout_Amber);
                        }
                        break;
                }
                editorEdit.apply();
                mainActivity.finish();
                mainActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                D3.b.H(mainActivity, MainActivity.class);
                return p076h8.m.a;
            case 10:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                if (interfaceC0269c.V() == 1) {
                    ((K8.n) this.f33t).getClass();
                    InterfaceC0276j interfaceC0276jV = interfaceC0269c.v();
                    p210v8.i.d(interfaceC0276jV, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str2 = K8.d.a;
                    if (K8.d.j.containsKey(p124m9.e.g((InterfaceC0271e) interfaceC0276jV))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 11:
                p210v8.i.f(obj, "it");
                return ((j) this.f33t).invoke();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                InterfaceC0290y interfaceC0290y = (InterfaceC0290y) obj;
                p210v8.i.f(interfaceC0290y, "module");
                return interfaceC0290y.s().h(((I8.i) this.f33t).u());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                y0.B b3 = (y0.B) obj;
                p210v8.i.c(b3);
                y0.z zVarH = b3.h();
                HashSet hashSet = new HashSet();
                int i12 = y0.z.f16006F;
                hashSet.add(Integer.valueOf(p068ga.l.e(zVarH).f16002z));
                B0.a aVar3 = new B0.a((AbstractActivityC0655l) this.f33t, new p160q4.c(hashSet));
                b3.f15847p.add(aVar3);
                p086i8.h hVar = b3.f15839g;
                if (!hVar.isEmpty()) {
                    C0872j c0872j2 = (C0872j) hVar.r();
                    aVar3.a(b3, c0872j2.f15928t, c0872j2.b());
                }
                return p076h8.m.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                d0 d0Var = (d0) obj;
                p210v8.i.e(d0Var, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
                if (AbstractC0130c.j(d0Var)) {
                    z10 = false;
                } else {
                    InterfaceC0273g interfaceC0273gW = d0Var.D().w();
                    if (!(interfaceC0273gW instanceof P) || p210v8.i.a(((P) interfaceC0273gW).v(), (p238y9.q) this.f33t)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 15:
                p096j9.c cVar = (p096j9.c) obj;
                p210v8.i.f(cVar, "fqName");
                O8.C c10 = (O8.C) this.f33t;
                ((G) c10.f3624x).getClass();
                p247z9.l lVar = c10.f3621u;
                p210v8.i.f(lVar, "storageManager");
                return new O8.z(c10, cVar, lVar);
            case 16:
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z11 = false;
                } else {
                    if (((R8.n) this.f33t).a.isEnum()) {
                        String name = method.getName();
                        if (p210v8.i.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            p210v8.i.e(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (p210v8.i.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            z11 = false;
                        }
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 17:
                p210v8.i.f((InterfaceC0269c) obj, "it");
                return Boolean.valueOf(F.f4944i.containsKey(qa.b.d((N) this.f33t)));
            case 18:
                p096j9.c cVar2 = (p096j9.c) obj;
                p210v8.i.e(cVar2, "it");
                ?? r10 = ((o1.k) this.f33t).f13638s;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : r10.entrySet()) {
                    p096j9.c cVar3 = (p096j9.c) entry.getKey();
                    if (!cVar2.equals(cVar3)) {
                        p210v8.i.f(cVar3, "packageName");
                        if (p210v8.i.a(cVar2.d() ? null : cVar2.e(), cVar3)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int length = oa.b.p((p096j9.c) ((Map.Entry) next).getKey(), cVar2).b().length();
                        do {
                            Object next2 = it2.next();
                            int length2 = oa.b.p((p096j9.c) ((Map.Entry) next2).getKey(), cVar2).b().length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 19:
                ((V9.h) this.f33t).b();
                return p076h8.m.a;
            case 20:
                C0409d c0409d = (C0409d) obj;
                p210v8.i.f(c0409d, "annotation");
                p096j9.f fVar2 = V8.c.a;
                X8.b bVar = (X8.b) this.f33t;
                return V8.c.b(bVar.f5426s, c0409d, bVar.f5428u);
            case MobileAdsBridge.CODE_21 /* 21 */:
                R8.B b7 = (R8.B) obj;
                p210v8.i.f(b7, "typeParameter");
                I.D d3 = (I.D) this.f33t;
                Integer num = (Integer) ((LinkedHashMap) d3.f1939d).get(b7);
                if (num == null) {
                    return null;
                }
                int iIntValue2 = num.intValue();
                Fa.e eVar2 = (Fa.e) d3.f1937b;
                p210v8.i.f(eVar2, "<this>");
                Fa.e eVar3 = new Fa.e((I4.a) eVar2.f1659t, d3, eVar2.f1661v);
                InterfaceC0277k interfaceC0277k = (InterfaceC0277k) d3.f1938c;
                return new Y8.F(J7.j.h(eVar3, interfaceC0277k.q()), b7, d3.a + iIntValue2, interfaceC0277k);
            case 22:
                w wVar = (w) obj;
                p210v8.i.f(wVar, "m");
                if (((Boolean) ((C0472a) this.f33t).f5732b.invoke(wVar)).booleanValue()) {
                    Class<?> declaringClass = ((Method) wVar.b()).getDeclaringClass();
                    p210v8.i.e(declaringClass, "member.declaringClass");
                    if (declaringClass.isInterface()) {
                        String strG = wVar.c().g();
                        int iHashCode = strG.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strG.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) wVar.g()).isEmpty();
                                }
                            } else if (strG.equals("equals")) {
                                R8.C c11 = (R8.C) p086i8.k.m0(wVar.g());
                                A a = c11 != null ? c11.a : null;
                                R8.p pVar = a instanceof R8.p ? (R8.p) a : null;
                                if (pVar != null) {
                                    R8.r rVar = pVar.f4475b;
                                    if ((rVar instanceof R8.n) && ((R8.n) rVar).c().b().equals("java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strG.equals("toString")) {
                            zIsEmpty = ((ArrayList) wVar.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case 23:
                p210v8.i.f((B9.f) obj, "it");
                Y8.j jVar2 = (Y8.j) this.f33t;
                return new Y8.p(jVar2.f5757B, jVar2, jVar2.f5771z, jVar2.f5756A != null, jVar2.f5764I);
            case 24:
                p210v8.i.f((B9.f) obj, "kotlinTypeRefiner");
                InterfaceC0271e interfaceC0271e = (InterfaceC0271e) this.f33t;
                if (!(interfaceC0271e instanceof InterfaceC0271e)) {
                    interfaceC0271e = null;
                }
                if (interfaceC0271e != null) {
                    p165q9.d.f(interfaceC0271e);
                }
                return null;
            case 25:
                p210v8.i.f((IOException) obj, "it");
                byte[] bArr = Y9.c.a;
                ((Z9.g) this.f33t).f5945A = true;
                return p076h8.m.a;
            case 26:
                p019b9.a aVar4 = (p019b9.a) obj;
                p210v8.i.f(aVar4, "it");
                O0.a aVar5 = (O0.a) this.f33t;
                boolean z16 = aVar5.f3504b;
                D9.c cVar4 = aVar4.a;
                if (z16) {
                    if (((cVar4 == null || (rVarG2 = B9.g.g(cVar4)) == null || !(rVarG2 instanceof Z8.f)) ? null : (Z8.f) rVarG2) != null) {
                        return null;
                    }
                }
                if (cVar4 == null) {
                    return null;
                }
                D dH = B9.g.h(cVar4);
                if (dH == null && ((rVarG = B9.g.g(cVar4)) == null || (dH = B9.g.N(rVarG)) == null)) {
                    dH = B9.g.h(cVar4);
                    p210v8.i.c(dH);
                }
                O oW = B9.g.W(dH);
                if (oW == null) {
                    return null;
                }
                List listU2 = oW.u();
                p210v8.i.e(listU2, "this.parameters");
                List list2 = listU2;
                if (!(cVar4 instanceof AbstractC0151y)) {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(cVar4);
                    sb.append(", ");
                    throw new IllegalArgumentException(AbstractC0487g.k(u.a, cVar4.getClass(), sb).toString());
                }
                List listL = ((AbstractC0151y) cVar4).l();
                Iterator it3 = list2.iterator();
                Iterator it4 = listL.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(p086i8.m.H(list2, 10), p086i8.m.H(listL, 10)));
                while (it3.hasNext() && it4.hasNext()) {
                    Object next3 = it3.next();
                    S s9 = (S) it4.next();
                    P p12 = (P) next3;
                    boolean zK = B9.g.K(s9);
                    U8.u uVar = aVar4.f7321b;
                    if (zK) {
                        aVar = new p019b9.a(null, uVar, p12);
                    } else {
                        d0 d0VarR = B9.g.r(s9);
                        aVar = new p019b9.a(d0VarR, ((C0442c) ((I4.a) ((Fa.e) aVar5.f3506d).f1659t).f2061q).b(uVar, d0VarR.q()), p12);
                    }
                    arrayList2.add(aVar);
                }
                return arrayList2;
            case 27:
                InterfaceC0269c interfaceC0269c2 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c2, "it");
                AbstractC0151y type = ((U) interfaceC0269c2.H0().get(((U) this.f33t).f3691x)).getType();
                p210v8.i.e(type, "it.valueParameters[p.index].type");
                return type;
            case 28:
                Q8.b bVar2 = (Q8.b) obj;
                p210v8.i.f(bVar2, "kotlinClass");
                p188t1.G g8 = (p188t1.G) this.f33t;
                g8.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                o1.e eVar4 = new o1.e(g8, map, map2);
                Class cls = bVar2.a;
                p210v8.i.f(cls, "klass");
                Method[] declaredMethods = cls.getDeclaredMethods();
                p210v8.i.e(declaredMethods, "klass.declaredMethods");
                int length3 = declaredMethods.length;
                int i13 = 0;
                while (true) {
                    String str3 = "sb.toString()";
                    if (i13 >= length3) {
                        Class cls2 = cls;
                        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                        p210v8.i.e(declaredConstructors, "klass.declaredConstructors");
                        int length4 = declaredConstructors.length;
                        int i14 = 0;
                        while (i14 < length4) {
                            Constructor<?> constructor = declaredConstructors[i14];
                            p096j9.f fVar3 = p096j9.h.f12556e;
                            p210v8.i.e(constructor, "constructor");
                            StringBuilder sb2 = new StringBuilder("(");
                            Constructor<?>[] constructorArr = declaredConstructors;
                            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                            int i15 = length4;
                            p210v8.i.e(parameterTypes2, "constructor.parameterTypes");
                            int length5 = parameterTypes2.length;
                            int i16 = 0;
                            while (i16 < length5) {
                                int i17 = i16;
                                Class<?> cls3 = parameterTypes2[i17];
                                p210v8.i.e(cls3, "parameterType");
                                sb2.append(AbstractC0408c.b(cls3));
                                i16 = i17 + 1;
                            }
                            sb2.append(")V");
                            String string = sb2.toString();
                            p210v8.i.e(string, str3);
                            o1.m mVarA1 = eVar4.a1(fVar3, string);
                            Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                            p210v8.i.e(declaredAnnotations, "constructor.declaredAnnotations");
                            int length6 = declaredAnnotations.length;
                            int i18 = 0;
                            while (i18 < length6) {
                                Annotation[] annotationArr = declaredAnnotations;
                                Annotation annotation = annotationArr[i18];
                                p210v8.i.e(annotation, "annotation");
                                int i19 = i14;
                                Class clsO = p068ga.d.o(p068ga.d.l(annotation));
                                Constructor<?> constructor2 = constructor;
                                int i20 = length6;
                                int i21 = i18;
                                String str4 = str3;
                                b1 b1VarU = ((p188t1.G) ((o1.e) mVarA1.f13643u).f13627t).u(AbstractC0408c.a(clsO), new Q8.a(annotation), (ArrayList) mVarA1.f13642t);
                                if (b1VarU != null) {
                                    com.bumptech.glide.e.m(b1VarU, annotation, clsO);
                                }
                                i18 = i21 + 1;
                                declaredAnnotations = annotationArr;
                                constructor = constructor2;
                                i14 = i19;
                                length6 = i20;
                                str3 = str4;
                            }
                            int i22 = i14;
                            Constructor<?> constructor3 = constructor;
                            String str5 = str3;
                            Annotation[][] parameterAnnotations = constructor3.getParameterAnnotations();
                            p210v8.i.e(parameterAnnotations, "parameterAnnotations");
                            if (parameterAnnotations.length != 0) {
                                int length7 = constructor3.getParameterTypes().length - parameterAnnotations.length;
                                int length8 = parameterAnnotations.length;
                                int i23 = 0;
                                while (i23 < length8) {
                                    Annotation[] annotationArr2 = parameterAnnotations[i23];
                                    p210v8.i.e(annotationArr2, "annotations");
                                    int length9 = annotationArr2.length;
                                    Annotation[][] annotationArr3 = parameterAnnotations;
                                    int i24 = 0;
                                    while (i24 < length9) {
                                        int i25 = i24;
                                        Annotation annotation2 = annotationArr2[i25];
                                        int i26 = length7;
                                        Class clsO2 = p068ga.d.o(p068ga.d.l(annotation2));
                                        int i27 = length8;
                                        int i28 = i23;
                                        Annotation[] annotationArr4 = annotationArr2;
                                        b1 b1VarM = mVarA1.m(i23 + i26, AbstractC0408c.a(clsO2), new Q8.a(annotation2));
                                        if (b1VarM != null) {
                                            com.bumptech.glide.e.m(b1VarM, annotation2, clsO2);
                                        }
                                        i24 = i25 + 1;
                                        length8 = i27;
                                        length7 = i26;
                                        i23 = i28;
                                        annotationArr2 = annotationArr4;
                                    }
                                    i23++;
                                    parameterAnnotations = annotationArr3;
                                }
                            }
                            mVarA1.l();
                            i14 = i22 + 1;
                            declaredConstructors = constructorArr;
                            length4 = i15;
                            str3 = str5;
                        }
                        Field[] declaredFields = cls2.getDeclaredFields();
                        p210v8.i.e(declaredFields, "klass.declaredFields");
                        int length10 = declaredFields.length;
                        int i29 = 0;
                        while (i29 < length10) {
                            Field field = declaredFields[i29];
                            p096j9.f fVarJ = p096j9.f.j(field.getName());
                            Class<?> type2 = field.getType();
                            p210v8.i.e(type2, "field.type");
                            String strB = AbstractC0408c.b(type2);
                            p210v8.i.f(strB, "desc");
                            String strG2 = fVarJ.g();
                            p210v8.i.e(strG2, "name.asString()");
                            p029c9.n nVar = new p029c9.n(strG2 + '#' + strB);
                            ArrayList arrayList3 = new ArrayList();
                            Annotation[] declaredAnnotations2 = field.getDeclaredAnnotations();
                            p210v8.i.e(declaredAnnotations2, "field.declaredAnnotations");
                            int length11 = declaredAnnotations2.length;
                            int i30 = 0;
                            while (i30 < length11) {
                                Annotation annotation3 = declaredAnnotations2[i30];
                                p210v8.i.e(annotation3, "annotation");
                                Class clsO3 = p068ga.d.o(p068ga.d.l(annotation3));
                                Field[] fieldArr = declaredFields;
                                int i31 = length10;
                                int i32 = i29;
                                b1 b1VarU2 = ((p188t1.G) eVar4.f13627t).u(AbstractC0408c.a(clsO3), new Q8.a(annotation3), arrayList3);
                                if (b1VarU2 != null) {
                                    com.bumptech.glide.e.m(b1VarU2, annotation3, clsO3);
                                }
                                i30++;
                                declaredFields = fieldArr;
                                length10 = i31;
                                i29 = i32;
                            }
                            Field[] fieldArr2 = declaredFields;
                            int i33 = length10;
                            int i34 = i29;
                            if (!arrayList3.isEmpty()) {
                                ((HashMap) eVar4.f13628u).put(nVar, arrayList3);
                            }
                            i29 = i34 + 1;
                            declaredFields = fieldArr2;
                            length10 = i33;
                        }
                        return new p029c9.a(map, map2, map3);
                    }
                    Method method2 = declaredMethods[i13];
                    p096j9.f fVarJ2 = p096j9.f.j(method2.getName());
                    StringBuilder sb3 = new StringBuilder("(");
                    Class<?>[] parameterTypes3 = method2.getParameterTypes();
                    Class cls4 = cls;
                    p210v8.i.e(parameterTypes3, "method.parameterTypes");
                    int length12 = parameterTypes3.length;
                    Method[] methodArr = declaredMethods;
                    int i35 = 0;
                    while (i35 < length12) {
                        int i36 = length12;
                        Class<?> cls5 = parameterTypes3[i35];
                        p210v8.i.e(cls5, "parameterType");
                        sb3.append(AbstractC0408c.b(cls5));
                        i35++;
                        length12 = i36;
                    }
                    sb3.append(")");
                    Class<?> returnType = method2.getReturnType();
                    p210v8.i.e(returnType, "method.returnType");
                    sb3.append(AbstractC0408c.b(returnType));
                    String string2 = sb3.toString();
                    p210v8.i.e(string2, "sb.toString()");
                    o1.m mVarA2 = eVar4.a1(fVarJ2, string2);
                    Annotation[] declaredAnnotations3 = method2.getDeclaredAnnotations();
                    p210v8.i.e(declaredAnnotations3, "method.declaredAnnotations");
                    int length13 = declaredAnnotations3.length;
                    int i37 = 0;
                    while (i37 < length13) {
                        Annotation annotation4 = declaredAnnotations3[i37];
                        p210v8.i.e(annotation4, "annotation");
                        Class clsO4 = p068ga.d.o(p068ga.d.l(annotation4));
                        Annotation[] annotationArr5 = declaredAnnotations3;
                        int i38 = length13;
                        int i39 = i37;
                        b1 b1VarU3 = ((p188t1.G) ((o1.e) mVarA2.f13643u).f13627t).u(AbstractC0408c.a(clsO4), new Q8.a(annotation4), (ArrayList) mVarA2.f13642t);
                        if (b1VarU3 != null) {
                            com.bumptech.glide.e.m(b1VarU3, annotation4, clsO4);
                        }
                        i37 = i39 + 1;
                        declaredAnnotations3 = annotationArr5;
                        length13 = i38;
                    }
                    Annotation[][] parameterAnnotations2 = method2.getParameterAnnotations();
                    p210v8.i.e(parameterAnnotations2, "method.parameterAnnotations");
                    Annotation[][] annotationArr6 = parameterAnnotations2;
                    int length14 = annotationArr6.length;
                    for (int i40 = 0; i40 < length14; i40++) {
                        Annotation[] annotationArr7 = annotationArr6[i40];
                        p210v8.i.e(annotationArr7, "annotations");
                        int length15 = annotationArr7.length;
                        int i41 = 0;
                        while (i41 < length15) {
                            Annotation annotation5 = annotationArr7[i41];
                            Annotation[][] annotationArr8 = annotationArr6;
                            Class clsO5 = p068ga.d.o(p068ga.d.l(annotation5));
                            int i42 = length14;
                            int i43 = length3;
                            b1 b1VarM2 = mVarA2.m(i40, AbstractC0408c.a(clsO5), new Q8.a(annotation5));
                            if (b1VarM2 != null) {
                                com.bumptech.glide.e.m(b1VarM2, annotation5, clsO5);
                            }
                            i41++;
                            length14 = i42;
                            annotationArr6 = annotationArr8;
                            length3 = i43;
                        }
                    }
                    mVarA2.l();
                    i13++;
                    cls = cls4;
                    declaredMethods = methodArr;
                    length3 = length3;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Q9.t tVar = ((p039e0.C) this.f33t).f10605f;
                    p039e0.g gVar2 = new p039e0.g(th);
                    tVar.getClass();
                    tVar.h(null, gVar2);
                }
                Object obj2 = p039e0.C.j;
                p039e0.C c12 = (p039e0.C) this.f33t;
                synchronized (obj2) {
                    p039e0.C.f10600i.remove(c12.c().getAbsolutePath());
                }
                return p076h8.m.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10) {
        super(1);
        this.f32s = i10;
        this.f33t = obj;
    }
}
