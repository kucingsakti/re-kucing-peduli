package F8;

import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import O8.C0364u;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import p104k9.C0678g;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k0 f1588t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, int i10) {
        super(0);
        this.f1587s = i10;
        this.f1588t = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    @Override // p200u8.a
    public final Object invoke() {
        C0364u c0364uA0;
        boolean zE;
        boolean z6;
        Class<?> enclosingClass;
        k0 k0Var = this.f1588t;
        int i10 = 2;
        o1.k kVar = null;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f1587s) {
            case 0:
                D d3 = k0Var.f1592t;
                d3.getClass();
                String str = k0Var.f1593u;
                p210v8.i.f(str, MediationMetaData.KEY_NAME);
                String str2 = k0Var.f1594v;
                p210v8.i.f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
                L9.e eVar = D.f1511s;
                eVar.getClass();
                Matcher matcher = eVar.f2855s.matcher(str2);
                p210v8.i.e(matcher, "matcher(...)");
                if (matcher.matches()) {
                    p210v8.i.f(str2, "input");
                    kVar = new o1.k();
                    kVar.f13638s = matcher;
                }
                if (kVar != null) {
                    if (((L9.d) kVar.f13639t) == null) {
                        kVar.f13639t = new L9.d(kVar, i11);
                    }
                    L9.d dVar = (L9.d) kVar.f13639t;
                    p210v8.i.c(dVar);
                    String str3 = (String) dVar.get(1);
                    L8.K kF = d3.f(Integer.parseInt(str3));
                    if (kF != null) {
                        return kF;
                    }
                    StringBuilder sbM = AbstractC0487g.m("Local property #", str3, " not found in ");
                    sbM.append(d3.a());
                    throw new p0(sbM.toString(), 0);
                }
                Collection collectionI = d3.i(p096j9.f.j(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionI) {
                    if (p210v8.i.a(w0.b((L8.K) obj).d(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new p0("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + d3, 0);
                }
                if (arrayList.size() == 1) {
                    return (L8.K) p086i8.k.k0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    C0280n c0280nF = ((L8.K) obj2).f();
                    Object arrayList2 = linkedHashMap.get(c0280nF);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(c0280nF, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new C0212f(i10));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                p210v8.i.e(collectionValues, "properties\n             …\n                }.values");
                List list = (List) p086i8.k.a0(collectionValues);
                if (list.size() == 1) {
                    return (L8.K) p086i8.k.T(list);
                }
                String strZ = p086i8.k.Z(d3.i(p096j9.f.j(str)), "\n", null, null, C0208b.f1563y, 30);
                StringBuilder sb = new StringBuilder("Property '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(d3);
                sb.append(':');
                sb.append(strZ.length() == 0 ? " no members found" : "\n".concat(strZ));
                throw new p0(sb.toString(), 0);
            default:
                p096j9.b bVar = w0.a;
                t0 t0VarB = w0.b(k0Var.g());
                if (!(t0VarB instanceof C0220n)) {
                    if (t0VarB instanceof C0218l) {
                        return ((C0218l) t0VarB).f1598t;
                    }
                    if ((t0VarB instanceof C0219m) || (t0VarB instanceof C0221o)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C0220n c0220n = (C0220n) t0VarB;
                C0678g c0678g = i9.h.a;
                p047e9.G g8 = c0220n.f1608u;
                i9.d dVarB = i9.h.b(g8, c0220n.f1610w, c0220n.f1611x, true);
                if (dVarB == null) {
                    return null;
                }
                L8.K k3 = c0220n.f1607t;
                if (k3.V() != 2) {
                    InterfaceC0276j interfaceC0276jV = k3.v();
                    if (interfaceC0276jV == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (p124m9.e.l(interfaceC0276jV)) {
                        InterfaceC0276j interfaceC0276jV2 = interfaceC0276jV.v();
                        if (p124m9.e.n(interfaceC0276jV2, 1) || p124m9.e.n(interfaceC0276jV2, 3)) {
                            InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0276jV;
                            LinkedHashSet linkedHashSet = I8.d.a;
                            LinkedHashSet linkedHashSet2 = I8.d.a;
                            if (p124m9.e.l(interfaceC0271e)) {
                                LinkedHashSet linkedHashSet3 = I8.d.a;
                                p096j9.b bVarF = p165q9.d.f(interfaceC0271e);
                                if (p086i8.k.O(linkedHashSet3, bVarF != null ? bVarF.f() : null)) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (p124m9.e.l(k3.v())) {
                                    c0364uA0 = k3.a0();
                                    if (c0364uA0 == null && c0364uA0.q().E(U8.w.a)) {
                                        zE = true;
                                    } else {
                                        zE = k3.q().E(U8.w.a);
                                    }
                                    if (!zE) {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = false;
                                }
                            }
                        } else if (p124m9.e.l(k3.v())) {
                            z10 = false;
                        } else {
                            c0364uA0 = k3.a0();
                            if (c0364uA0 == null) {
                                zE = k3.q().E(U8.w.a);
                            } else {
                                zE = k3.q().E(U8.w.a);
                            }
                            if (!zE) {
                                z10 = false;
                            }
                        }
                    } else if (p124m9.e.l(k3.v())) {
                        z10 = false;
                    } else {
                        c0364uA0 = k3.a0();
                        if (c0364uA0 == null) {
                            zE = k3.q().E(U8.w.a);
                        } else {
                            zE = k3.q().E(U8.w.a);
                        }
                        if (!zE) {
                            z10 = false;
                        }
                    }
                } else {
                    z10 = false;
                }
                D d8 = k0Var.f1592t;
                if (z10 || i9.h.d(g8)) {
                    enclosingClass = d8.a().getEnclosingClass();
                } else {
                    InterfaceC0276j interfaceC0276jV3 = k3.v();
                    enclosingClass = interfaceC0276jV3 instanceof InterfaceC0271e ? y0.j((InterfaceC0271e) interfaceC0276jV3) : d8.a();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(dVarB.f12333b);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
        }
    }
}
