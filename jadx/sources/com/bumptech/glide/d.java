package com.bumptech.glide;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.S;
import I8.n;
import I8.o;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0285t;
import O8.U;
import X9.C0471q;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import p086i8.C;
import p086i8.s;
import p086i8.t;
import p086i8.y;
import p086i8.z;
import p145o9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Object A(Set set, Enum r10, Enum r11, Enum r12, boolean z6) {
        Enum r13;
        if (!z6) {
            if (r12 != null) {
                set = p086i8.k.w0(C.v(set, r12));
            }
            return p086i8.k.l0(set);
        }
        if (set.contains(r10)) {
            r13 = r10;
        } else {
            r13 = set.contains(r11) ? r11 : null;
        }
        if (p210v8.i.a(r13, r10) && p210v8.i.a(r12, r11)) {
            return null;
        }
        return r12 == null ? r13 : r12;
    }

    public static p095j8.b a(p095j8.b bVar) {
        if (bVar.f12516w != null) {
            throw new IllegalStateException();
        }
        bVar.o();
        bVar.f12515v = true;
        return bVar.f12514u > 0 ? bVar : p095j8.b.f12511y;
    }

    public static final Bundle b(p076h8.f... fVarArr) {
        Bundle bundle = new Bundle(fVarArr.length);
        for (p076h8.f fVar : fVarArr) {
            String str = (String) fVar.f11789s;
            Object obj = fVar.f11790t;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                p210v8.i.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                Q.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                Q.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final int f(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        M8.b bVarH = abstractC0151y.q().H(n.f2179q);
        if (bVarH == null) {
            return 0;
        }
        p145o9.g gVar = (p145o9.g) y.v(bVarH.b(), o.f2191d);
        p210v8.i.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((p145o9.k) gVar).a).intValue();
    }

    public static final int g(int i10) {
        AbstractC0487g.p(i10, "<this>");
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            return 3;
        }
        if (iD == 1) {
            return 1;
        }
        if (iD == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final D h(I8.i iVar, M8.h hVar, AbstractC0151y abstractC0151y, List list, ArrayList arrayList, AbstractC0151y abstractC0151y2, boolean z6) {
        InterfaceC0271e interfaceC0271eJ;
        int i10 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC0151y != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(qa.b.a((AbstractC0151y) it.next()));
        }
        arrayList2.addAll(arrayList3);
        J9.l.b(arrayList2, abstractC0151y != null ? qa.b.a(abstractC0151y) : null);
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            M8.h iVar2 = M8.g.a;
            if (!zHasNext) {
                arrayList2.add(qa.b.a(abstractC0151y2));
                int size = list.size() + arrayList.size() + (abstractC0151y == null ? 0 : 1);
                if (z6) {
                    interfaceC0271eJ = iVar.v(size);
                } else {
                    p096j9.f fVar = o.a;
                    interfaceC0271eJ = iVar.j("Function" + size);
                }
                if (abstractC0151y != null) {
                    p096j9.c cVar = n.f2178p;
                    if (!hVar.E(cVar)) {
                        ArrayList arrayListF0 = p086i8.k.f0(hVar, new M8.j(iVar, cVar, t.f12329s));
                        hVar = arrayListF0.isEmpty() ? iVar2 : new M8.i(arrayListF0, i10);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    p096j9.c cVar2 = n.f2179q;
                    if (!hVar.E(cVar2)) {
                        ArrayList arrayListF1 = p086i8.k.f0(hVar, new M8.j(iVar, cVar2, z.t(new p076h8.f(o.f2191d, new p145o9.k(size2)))));
                        if (!arrayListF1.isEmpty()) {
                            iVar2 = new M8.i(arrayListF1, i10);
                        }
                        hVar = iVar2;
                    }
                }
                return C0133f.q(AbstractC0130c.x(hVar), interfaceC0271eJ, arrayList2);
            }
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                p086i8.l.G();
                throw null;
            }
            arrayList2.add(qa.b.a((AbstractC0151y) next));
            i11 = i12;
        }
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(q(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static int j(int i10, int i11, String str, boolean z6) {
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z6)) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static boolean k(String str, String str2) {
        p210v8.i.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < str.length()) {
                char cCharAt = str.charAt(i10);
                int i13 = i12 + 1;
                if (i12 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt != ')' || (i11 = i11 - 1) != 0 || i12 == str.length() - 1) {
                    }
                    i10++;
                    i12 = i13;
                }
            }
            if (i11 == 0) {
                String strSubstring = str.substring(1, str.length() - 1);
                p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return p210v8.i.a(L9.f.j0(strSubstring).toString(), str2);
            }
        }
        return false;
    }

    public static boolean l(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        p210v8.i.f(interfaceC0268b, "superDescriptor");
        p210v8.i.f(interfaceC0268b2, "subDescriptor");
        if (!(interfaceC0268b2 instanceof W8.f) || !(interfaceC0268b instanceof InterfaceC0285t)) {
            return false;
        }
        W8.f fVar = (W8.f) interfaceC0268b2;
        fVar.H0().size();
        InterfaceC0285t interfaceC0285t = (InterfaceC0285t) interfaceC0268b;
        interfaceC0285t.H0().size();
        List listH0 = fVar.c().H0();
        p210v8.i.e(listH0, "subDescriptor.original.valueParameters");
        List listH1 = interfaceC0285t.c().H0();
        p210v8.i.e(listH1, "superDescriptor.original.valueParameters");
        for (p076h8.f fVar2 : p086i8.k.z0(listH0, listH1)) {
            U u3 = (U) fVar2.f11789s;
            U u10 = (U) fVar2.f11790t;
            p210v8.i.e(u3, "subParameter");
            boolean z6 = v((InterfaceC0285t) interfaceC0268b2, u3) instanceof p029c9.i;
            p210v8.i.e(u10, "superParameter");
            if (z6 != (v(interfaceC0285t, u10) instanceof p029c9.i)) {
                return true;
            }
        }
        return false;
    }

    public static final p096j9.f m(AbstractC0151y abstractC0151y) {
        String str;
        M8.b bVarH = abstractC0151y.q().H(n.f2180r);
        if (bVarH != null) {
            Object objL0 = p086i8.k.l0(bVarH.b().values());
            v vVar = objL0 instanceof v ? (v) objL0 : null;
            if (vVar != null && (str = (String) vVar.a) != null) {
                if (!p096j9.f.k(str)) {
                    str = null;
                }
                if (str != null) {
                    return p096j9.f.j(str);
                }
            }
        }
        return null;
    }

    public static final List n(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        s(abstractC0151y);
        int iF = f(abstractC0151y);
        if (iF == 0) {
            return s.f12328s;
        }
        List listSubList = abstractC0151y.l().subList(0, iF);
        ArrayList arrayList = new ArrayList(p086i8.m.H(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC0151y abstractC0151yB = ((S) it.next()).b();
            p210v8.i.e(abstractC0151yB, "it.type");
            arrayList.add(abstractC0151yB);
        }
        return arrayList;
    }

    public static final J8.e o(InterfaceC0273g interfaceC0273g) {
        if (!(interfaceC0273g instanceof InterfaceC0271e) || !I8.i.I(interfaceC0273g)) {
            return null;
        }
        p096j9.e eVarH = p165q9.d.h(interfaceC0273g);
        if (!eVarH.d() || eVarH.a.isEmpty()) {
            return null;
        }
        K3.d dVar = J8.e.f2453u;
        String strG = eVarH.f().g();
        p210v8.i.e(strG, "shortName().asString()");
        p096j9.c cVarE = eVarH.g().e();
        p210v8.i.e(cVarE, "toSafe().parent()");
        dVar.getClass();
        J8.d dVarU = K3.d.u(strG, cVarE);
        if (dVarU != null) {
            return dVarU.a;
        }
        return null;
    }

    public static final AbstractC0151y p(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        s(abstractC0151y);
        if (abstractC0151y.q().H(n.f2178p) == null) {
            return null;
        }
        return ((S) abstractC0151y.l().get(f(abstractC0151y))).b();
    }

    public static String q(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final List r(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        s(abstractC0151y);
        List listL = abstractC0151y.l();
        return listL.subList(((!s(abstractC0151y) || abstractC0151y.q().H(n.f2178p) == null) ? 0 : 1) + f(abstractC0151y), listL.size() - 1);
    }

    public static final boolean s(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW == null) {
            return false;
        }
        J8.e eVarO = o(interfaceC0273gW);
        return eVarO == J8.e.f2454v || eVarO == J8.e.f2455w;
    }

    public static final boolean t(AbstractC0151y abstractC0151y) {
        p210v8.i.f(abstractC0151y, "<this>");
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        return (interfaceC0273gW != null ? o(interfaceC0273gW) : null) == J8.e.f2455w;
    }

    public static List u(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        p210v8.i.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (p165q9.d.g(r0).equals(p165q9.d.g(r3)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p029c9.j v(L8.InterfaceC0285t r8, O8.U r9) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.v(L8.t, O8.U):c9.j");
    }

    public static void w(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long x(int i10, String str) {
        int iJ = j(0, i10, str, false);
        Matcher matcher = C0471q.f5628m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iP = -1;
        int i14 = -1;
        int i15 = -1;
        while (iJ < i10) {
            int iJ2 = j(iJ + 1, i10, str, true);
            matcher.region(iJ, iJ2);
            if (i12 == -1 && matcher.usePattern(C0471q.f5628m).matches()) {
                String strGroup = matcher.group(1);
                p210v8.i.e(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                p210v8.i.e(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                p210v8.i.e(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(C0471q.f5627l).matches()) {
                String strGroup4 = matcher.group(1);
                p210v8.i.e(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iP == -1) {
                Pattern pattern = C0471q.f5626k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    p210v8.i.e(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    p210v8.i.e(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    p210v8.i.e(strPattern, "MONTH_PATTERN.pattern()");
                    iP = L9.f.P(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(C0471q.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    p210v8.i.e(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iJ = j(iJ2 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iP == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Y9.c.f5824e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iP - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public abstract boolean c(p231y.h hVar, p231y.d dVar, p231y.d dVar2);

    public abstract boolean d(p231y.h hVar, Object obj, Object obj2);

    public abstract boolean e(p231y.h hVar, p231y.g gVar, p231y.g gVar2);

    public abstract void y(p231y.g gVar, p231y.g gVar2);

    public abstract void z(p231y.g gVar, Thread thread);
}
