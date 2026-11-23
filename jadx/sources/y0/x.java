package y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f15993B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f15994A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f15996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f15998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f15999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p212w.j f16000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f16001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16002z;

    static {
        new LinkedHashMap();
    }

    public x(O o10) {
        LinkedHashMap linkedHashMap = P.f15895b;
        this.f15995s = qa.b.m(o10.getClass());
        this.f15999w = new ArrayList();
        this.f16000x = new p212w.j(0);
        this.f16001y = new LinkedHashMap();
    }

    public final Bundle e(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f16001y;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C0868f c0868f = (C0868f) entry.getValue();
            c0868f.getClass();
            p210v8.i.f(str, MediationMetaData.KEY_NAME);
            if (c0868f.f15917c && (obj = c0868f.f15918d) != null) {
                c0868f.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0868f c0868f2 = (C0868f) entry2.getValue();
                c0868f2.getClass();
                p210v8.i.f(str2, MediationMetaData.KEY_NAME);
                M m2 = c0868f2.a;
                if (c0868f2.f15916b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        m2.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbM = AbstractC0487g.m("Wrong argument type for '", str2, "' in argument bundle. ");
                sbM.append(m2.b());
                sbM.append(" expected.");
                throw new IllegalArgumentException(sbM.toString().toString());
            }
        }
        return bundle2;
    }

    public boolean equals(Object obj) {
        boolean z6;
        boolean z10;
        if (this != obj) {
            if (obj != null && (obj instanceof x)) {
                x xVar = (x) obj;
                boolean zA = p210v8.i.a(this.f15999w, xVar.f15999w);
                p212w.j jVar = this.f16000x;
                int iH = jVar.h();
                p212w.j jVar2 = xVar.f16000x;
                if (iH != jVar2.h()) {
                    z6 = false;
                    break;
                }
                Iterator it = ((K9.a) K9.n.s(new p212w.k(jVar))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!p210v8.i.a(jVar.d(iIntValue), jVar2.d(iIntValue))) {
                        z6 = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = this.f16001y;
                int size = linkedHashMap.size();
                LinkedHashMap linkedHashMap2 = xVar.f16001y;
                if (size != linkedHashMap2.size()) {
                    z10 = false;
                    break;
                }
                Iterator it2 = ((Iterable) p086i8.k.N(linkedHashMap.entrySet()).f2699b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap2.containsKey(entry.getKey()) || !p210v8.i.a(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                        z10 = false;
                        break;
                    }
                }
                if (this.f16002z != xVar.f16002z || !p210v8.i.a(this.f15994A, xVar.f15994A) || !zA || !z6 || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int[] f(x xVar) {
        p086i8.h hVar = new p086i8.h();
        x xVar2 = this;
        while (true) {
            z zVar = xVar2.f15996t;
            if ((xVar != null ? xVar.f15996t : null) != null) {
                z zVar2 = xVar.f15996t;
                p210v8.i.c(zVar2);
                if (zVar2.o(xVar2.f16002z, zVar2, null, false) != xVar2) {
                    if (zVar != null || zVar.f16008D != xVar2.f16002z) {
                        hVar.g(xVar2);
                    }
                    if (!p210v8.i.a(zVar, xVar) || zVar == null) {
                        break;
                    }
                    xVar2 = zVar;
                } else {
                    hVar.g(xVar2);
                    break;
                }
            } else {
                if (zVar != null) {
                    hVar.g(xVar2);
                } else {
                    hVar.g(xVar2);
                }
                if (!p210v8.i.a(zVar, xVar)) {
                    break;
                }
                xVar2 = zVar;
            }
        }
        List listS0 = p086i8.k.s0(hVar);
        ArrayList arrayList = new ArrayList(p086i8.m.H(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((x) it.next()).f16002z));
        }
        return p086i8.k.r0(arrayList);
    }

    public final C0867e g(int i10) {
        p212w.j jVar = this.f16000x;
        C0867e c0867e = jVar.h() == 0 ? null : (C0867e) jVar.d(i10);
        if (c0867e != null) {
            return c0867e;
        }
        z zVar = this.f15996t;
        if (zVar != null) {
            return zVar.g(i10);
        }
        return null;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.f16002z * 31;
        String str = this.f15994A;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (t tVar : this.f15999w) {
            int i11 = iHashCode * 31;
            String str2 = tVar.a;
            int iHashCode2 = (i11 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = tVar.f15970b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = tVar.f15971c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        p212w.j jVar = this.f16000x;
        p210v8.i.f(jVar, "<this>");
        int i12 = 0;
        while (true) {
            if (!(i12 < jVar.h())) {
                break;
            }
            int i13 = i12 + 1;
            C0867e c0867e = (C0867e) jVar.i(i12);
            int i14 = ((iHashCode * 31) + c0867e.a) * 31;
            D d3 = c0867e.f15914b;
            iHashCode = i14 + (d3 != null ? d3.hashCode() : 0);
            Bundle bundle = c0867e.f15915c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i15 = iHashCode * 31;
                    Bundle bundle2 = c0867e.f15915c;
                    p210v8.i.c(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i15 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i12 = i13;
        }
        LinkedHashMap linkedHashMap = this.f16001y;
        for (String str6 : linkedHashMap.keySet()) {
            int iA = p231y.a.a(iHashCode * 31, str6, 31);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iA + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x031e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0321  */
    /* JADX WARN: Code duplicated, block: B:145:0x0326  */
    /* JADX WARN: Code duplicated, block: B:148:0x0333  */
    /* JADX WARN: Code duplicated, block: B:150:0x033b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0344  */
    /* JADX WARN: Code duplicated, block: B:154:0x0348  */
    /* JADX WARN: Code duplicated, block: B:159:0x0360  */
    /* JADX WARN: Code duplicated, block: B:162:0x0373  */
    /* JADX WARN: Code duplicated, block: B:164:0x0380  */
    /* JADX WARN: Code duplicated, block: B:176:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0386 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [h8.d, java.lang.Object] */
    public v k(wa.a aVar) {
        boolean zMatches;
        boolean z6;
        p076h8.j jVar;
        int i10;
        int i11;
        Bundle bundle;
        int size;
        int i12;
        boolean z10;
        int i13;
        v vVar;
        Bundle bundle2;
        Pattern pattern;
        Matcher matcher;
        List listU;
        List listP0;
        List listU2;
        int i14;
        boolean zMatches2;
        this = this;
        aVar = aVar;
        ArrayList<t> arrayList = this.f15999w;
        if (arrayList.isEmpty()) {
            return null;
        }
        v vVar2 = null;
        for (t tVar : arrayList) {
            tVar.getClass();
            p076h8.j jVar2 = tVar.f15974f;
            Pattern pattern2 = (Pattern) jVar2.getValue();
            Uri uri = (Uri) aVar.f15699u;
            if (pattern2 == null) {
                zMatches = true;
            } else if (uri == null) {
                zMatches = false;
            } else {
                Pattern pattern3 = (Pattern) jVar2.getValue();
                p210v8.i.c(pattern3);
                zMatches = pattern3.matcher(uri.toString()).matches();
            }
            p076h8.j jVar3 = tVar.f15982o;
            String str = (String) aVar.f15700v;
            Object obj = (String) aVar.f15698t;
            String str2 = tVar.f15971c;
            String str3 = tVar.f15970b;
            if (zMatches) {
                if (str3 == null ? true : obj == null ? false : str3.equals(obj)) {
                    if (str2 == null) {
                        zMatches2 = true;
                    } else if (str == null) {
                        zMatches2 = false;
                    } else {
                        Pattern pattern4 = (Pattern) jVar3.getValue();
                        p210v8.i.c(pattern4);
                        zMatches2 = pattern4.matcher(str).matches();
                    }
                    if (zMatches2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (z6) {
                LinkedHashMap linkedHashMap = this.f16001y;
                if (uri != null) {
                    tVar.getClass();
                    p210v8.i.f(uri, "deepLink");
                    p210v8.i.f(linkedHashMap, "arguments");
                    Pattern pattern5 = (Pattern) tVar.f15974f.getValue();
                    Bundle bundle3 = null;
                    i10 = 1;
                    Matcher matcher2 = pattern5 != null ? pattern5.matcher(uri.toString()) : null;
                    if (matcher2 != null && matcher2.matches()) {
                        Bundle bundle4 = new Bundle();
                        if (tVar.c(matcher2, bundle4, linkedHashMap) && (!((Boolean) tVar.f15975g.getValue()).booleanValue() || tVar.d(uri, bundle4, linkedHashMap))) {
                            String fragment = uri.getFragment();
                            i11 = 0;
                            Pattern pattern6 = (Pattern) tVar.f15980m.getValue();
                            Matcher matcher3 = pattern6 != null ? pattern6.matcher(String.valueOf(fragment)) : null;
                            if (matcher3 != null && matcher3.matches()) {
                                List list = (List) tVar.f15978k.getValue();
                                jVar = jVar2;
                                ArrayList arrayList2 = new ArrayList(p086i8.m.H(list, 10));
                                Iterator it = list.iterator();
                                int i15 = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    Iterator it2 = it;
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        p086i8.l.G();
                                        throw null;
                                    }
                                    String str4 = (String) next;
                                    String strDecode = Uri.decode(matcher3.group(i16));
                                    Matcher matcher4 = matcher3;
                                    C0868f c0868f = (C0868f) linkedHashMap.get(str4);
                                    try {
                                        p210v8.i.e(strDecode, "value");
                                        t.e(bundle4, str4, strDecode, c0868f);
                                        arrayList2.add(p076h8.m.a);
                                        it = it2;
                                        i15 = i16;
                                        matcher3 = matcher4;
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            } else {
                                jVar = jVar2;
                            }
                            if (com.bumptech.glide.e.k(linkedHashMap, new s(0, bundle4)).isEmpty()) {
                                bundle3 = bundle4;
                            }
                        } else {
                            jVar = jVar2;
                            i11 = 0;
                        }
                    } else {
                        jVar = jVar2;
                        i11 = 0;
                    }
                    bundle = bundle3;
                } else {
                    jVar = jVar2;
                    i10 = 1;
                    i11 = 0;
                    bundle = null;
                }
                if (uri != null) {
                    String str5 = tVar.a;
                    if (str5 != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        List<String> pathSegments2 = Uri.parse(str5).getPathSegments();
                        p210v8.i.e(pathSegments, "requestedPathSegments");
                        p210v8.i.e(pathSegments2, "uriPathSegments");
                        List<String> listS0 = pathSegments2;
                        Set setV0 = p086i8.k.v0(pathSegments);
                        if (!(listS0 instanceof Collection)) {
                            listS0 = p086i8.k.s0(listS0);
                        }
                        setV0.retainAll(listS0);
                        size = setV0.size();
                    }
                    i12 = size;
                    if (obj == null && obj.equals(str3)) {
                        z10 = i10;
                    } else {
                        z10 = i11;
                    }
                    if (str != null || str2 == null) {
                        i13 = -1;
                    } else {
                        Pattern pattern7 = (Pattern) jVar3.getValue();
                        p210v8.i.c(pattern7);
                        if (pattern7.matcher(str).matches()) {
                            Pattern patternCompile = Pattern.compile("/");
                            p210v8.i.e(patternCompile, "compile(...)");
                            L9.f.Y(i11);
                            Matcher matcher5 = patternCompile.matcher(str2);
                            if (matcher5.find()) {
                                ArrayList arrayList3 = new ArrayList(10);
                                int iEnd = i11;
                                do {
                                    arrayList3.add(str2.subSequence(iEnd, matcher5.start()).toString());
                                    iEnd = matcher5.end();
                                } while (matcher5.find());
                                arrayList3.add(str2.subSequence(iEnd, str2.length()).toString());
                                listU = arrayList3;
                            } else {
                                listU = com.bumptech.glide.d.u(str2.toString());
                            }
                            boolean zIsEmpty = listU.isEmpty();
                            List listP1 = p086i8.s.f12328s;
                            if (zIsEmpty) {
                                listP0 = listP1;
                                break;
                            }
                            ListIterator listIterator = listU.listIterator(listU.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    listP0 = listP1;
                                    break;
                                }
                                if (((String) listIterator.previous()).length() != 0) {
                                    listP0 = p086i8.k.p0(listU, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                            int i17 = i11;
                            String str6 = (String) listP0.get(i17);
                            String str7 = (String) listP0.get(i10);
                            Pattern patternCompile2 = Pattern.compile("/");
                            p210v8.i.e(patternCompile2, "compile(...)");
                            L9.f.Y(i17);
                            Matcher matcher6 = patternCompile2.matcher(str);
                            if (matcher6.find()) {
                                ArrayList arrayList4 = new ArrayList(10);
                                int iEnd2 = 0;
                                do {
                                    arrayList4.add(str.subSequence(iEnd2, matcher6.start()).toString());
                                    iEnd2 = matcher6.end();
                                } while (matcher6.find());
                                arrayList4.add(str.subSequence(iEnd2, str.length()).toString());
                                listU2 = arrayList4;
                            } else {
                                listU2 = com.bumptech.glide.d.u(str.toString());
                            }
                            if (listU2.isEmpty()) {
                                i14 = 1;
                                break;
                            }
                            ListIterator listIterator2 = listU2.listIterator(listU2.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    i14 = 1;
                                    break;
                                }
                                if (((String) listIterator2.previous()).length() != 0) {
                                    i14 = 1;
                                    listP1 = p086i8.k.p0(listU2, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                            String str8 = (String) listP1.get(0);
                            String str9 = (String) listP1.get(i14);
                            i13 = p210v8.i.a(str6, str8) ? 2 : 0;
                            if (p210v8.i.a(str7, str9)) {
                                i13++;
                            }
                        } else {
                            i13 = -1;
                        }
                    }
                    if (bundle != null) {
                        vVar = new v(this, bundle, tVar.f15983p, i12, z10, i13);
                        if (vVar2 != null || vVar.compareTo(vVar2) > 0) {
                            vVar2 = vVar;
                        }
                    } else if (z10 == 0 || i13 > -1) {
                        p210v8.i.f(linkedHashMap, "arguments");
                        bundle2 = new Bundle();
                        if (uri != null) {
                            pattern = (Pattern) jVar.getValue();
                            if (pattern != null) {
                                matcher = pattern.matcher(uri.toString());
                            } else {
                                matcher = null;
                            }
                            if (matcher != null && matcher.matches()) {
                                tVar.c(matcher, bundle2, linkedHashMap);
                                if (((Boolean) tVar.f15975g.getValue()).booleanValue()) {
                                    tVar.d(uri, bundle2, linkedHashMap);
                                }
                            }
                        }
                        if (com.bumptech.glide.e.k(linkedHashMap, new s(1, bundle2)).isEmpty()) {
                            vVar = new v(this, bundle, tVar.f15983p, i12, z10, i13);
                            if (vVar2 != null) {
                            }
                            vVar2 = vVar;
                        }
                    }
                } else {
                    tVar.getClass();
                }
                size = 0;
                i12 = size;
                if (obj == null) {
                    z10 = i11;
                } else {
                    z10 = i11;
                }
                if (str != null) {
                    i13 = -1;
                } else {
                    i13 = -1;
                }
                if (bundle != null) {
                    vVar = new v(this, bundle, tVar.f15983p, i12, z10, i13);
                    if (vVar2 != null) {
                    }
                    vVar2 = vVar;
                } else if (z10 == 0) {
                    p210v8.i.f(linkedHashMap, "arguments");
                    bundle2 = new Bundle();
                    if (uri != null) {
                        pattern = (Pattern) jVar.getValue();
                        if (pattern != null) {
                            matcher = pattern.matcher(uri.toString());
                        } else {
                            matcher = null;
                        }
                        if (matcher != null) {
                            tVar.c(matcher, bundle2, linkedHashMap);
                            if (((Boolean) tVar.f15975g.getValue()).booleanValue()) {
                                tVar.d(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (com.bumptech.glide.e.k(linkedHashMap, new s(1, bundle2)).isEmpty()) {
                        vVar = new v(this, bundle, tVar.f15983p, i12, z10, i13);
                        if (vVar2 != null) {
                        }
                        vVar2 = vVar;
                    }
                } else {
                    p210v8.i.f(linkedHashMap, "arguments");
                    bundle2 = new Bundle();
                    if (uri != null) {
                        pattern = (Pattern) jVar.getValue();
                        if (pattern != null) {
                            matcher = pattern.matcher(uri.toString());
                        } else {
                            matcher = null;
                        }
                        if (matcher != null) {
                            tVar.c(matcher, bundle2, linkedHashMap);
                            if (((Boolean) tVar.f15975g.getValue()).booleanValue()) {
                                tVar.d(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (com.bumptech.glide.e.k(linkedHashMap, new s(1, bundle2)).isEmpty()) {
                        vVar = new v(this, bundle, tVar.f15983p, i12, z10, i13);
                        if (vVar2 != null) {
                        }
                        vVar2 = vVar;
                    }
                }
            }
        }
        return vVar2;
    }

    public void m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p240z0.a.f16297e);
        p210v8.i.e(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.f16002z = 0;
            this.f15997u = null;
        } else {
            if (L9.n.D(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            p210v8.i.f(strConcat, "uriPattern");
            ArrayList arrayListK = com.bumptech.glide.e.k(this.f16001y, new w(new t(strConcat, null, null), 1));
            if (!arrayListK.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + arrayListK).toString());
            }
            D3.b.s(new c2.a(strConcat, 24));
            this.f16002z = strConcat.hashCode();
            this.f15997u = null;
        }
        this.f15994A = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f16002z = resourceId;
            this.f15997u = null;
            this.f15997u = p068ga.d.m(context, resourceId);
        }
        this.f15998v = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f15997u;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f16002z));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f15994A;
        if (str2 != null && !L9.n.D(str2)) {
            sb.append(" route=");
            sb.append(this.f15994A);
        }
        if (this.f15998v != null) {
            sb.append(" label=");
            sb.append(this.f15998v);
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
