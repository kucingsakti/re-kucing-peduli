package y0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f15964q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f15965r = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f15966s = "http[s]?://";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f15967t = ".*";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f15968u = E0.a.i("\\E", ".*", "\\Q");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f15969v = "([^/]*?|)";
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p076h8.j f15974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p076h8.j f15975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f15976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15977i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f15978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f15979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p076h8.j f15980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p076h8.j f15982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15983p;

    public t(String str, String str2, String str3) {
        List listU;
        List listP0;
        this.a = str;
        this.f15970b = str2;
        this.f15971c = str3;
        ArrayList arrayList = new ArrayList();
        this.f15972d = arrayList;
        this.f15974f = D3.b.s(new r(this, 6));
        this.f15975g = D3.b.s(new r(this, 4));
        p076h8.e eVar = p076h8.e.f11787t;
        this.f15976h = D3.b.r(eVar, new r(this, 7));
        this.j = D3.b.r(eVar, new r(this, 1));
        this.f15978k = D3.b.r(eVar, new r(this, 0));
        this.f15979l = D3.b.r(eVar, new r(this, 3));
        this.f15980m = D3.b.s(new r(this, 2));
        this.f15982o = D3.b.s(new r(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f15964q.matcher(str).find()) {
                sb.append(f15966s);
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            p210v8.i.e(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            String str4 = f15967t;
            this.f15983p = (L9.f.J(sb, str4, false) || L9.f.J(sb, f15969v, false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb.toString();
            p210v8.i.e(string, "uriRegex.toString()");
            this.f15973e = L9.n.G(string, str4, f15968u);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(E0.a.i("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern patternCompile = Pattern.compile("/");
        p210v8.i.e(patternCompile, "compile(...)");
        L9.f.Y(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listU = arrayList2;
        } else {
            listU = com.bumptech.glide.d.u(str3.toString());
        }
        if (listU.isEmpty()) {
            listP0 = p086i8.s.f12328s;
        } else {
            ListIterator listIterator = listU.listIterator(listU.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listP0 = p086i8.k.p0(listU, listIterator.nextIndex() + 1);
                }
            }
            listP0 = p086i8.s.f12328s;
        }
        this.f15981n = L9.n.G("^(" + ((String) listP0.get(0)) + "|[*]+)/(" + ((String) listP0.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f15965r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            p210v8.i.d(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                p210v8.i.e(strSubstring, "substring(...)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append(f15969v);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            p210v8.i.e(strSubstring2, "substring(...)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void e(Bundle bundle, String str, String str2, C0868f c0868f) {
        if (c0868f == null) {
            bundle.putString(str, str2);
            return;
        }
        M m2 = c0868f.a;
        p210v8.i.f(str, "key");
        m2.e(bundle, str, m2.d(str2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [h8.d, java.lang.Object] */
    public final ArrayList b() {
        ArrayList arrayList = this.f15972d;
        Collection collectionValues = ((Map) this.f15976h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p086i8.q.J(arrayList2, ((C0879q) it.next()).f15959b);
        }
        return p086i8.k.g0(p086i8.k.g0(arrayList, arrayList2), (List) this.f15978k.getValue());
    }

    public final boolean c(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f15972d;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p086i8.l.G();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i11));
            C0868f c0868f = (C0868f) linkedHashMap.get(str);
            try {
                p210v8.i.e(strDecode, "value");
                e(bundle, str, strDecode, c0868f);
                arrayList2.add(p076h8.m.a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [h8.d, java.lang.Object] */
    public final boolean d(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z6;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f15976h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C0879q c0879q = (C0879q) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f15977i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = com.bumptech.glide.d.u(query);
            }
            p210v8.i.e(queryParameters, "inputParams");
            Object obj2 = p076h8.m.a;
            int i10 = 0;
            Bundle bundleB = com.bumptech.glide.d.b(new p076h8.f[0]);
            for (String str2 : c0879q.f15959b) {
                C0868f c0868f = (C0868f) linkedHashMap.get(str2);
                M m2 = c0868f != null ? c0868f.a : null;
                if ((m2 instanceof F) && !c0868f.f15917c) {
                    switch (((F) m2).f15872r) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = p086i8.s.f12328s;
                            break;
                        case 2:
                            obj = new float[0];
                            break;
                        case 3:
                            obj = p086i8.s.f12328s;
                            break;
                        case 4:
                            obj = new int[0];
                            break;
                        case 5:
                            obj = p086i8.s.f12328s;
                            break;
                        case 6:
                            obj = new long[0];
                            break;
                        case 7:
                            obj = p086i8.s.f12328s;
                            break;
                        case 8:
                            obj = new String[0];
                            break;
                        default:
                            obj = p086i8.s.f12328s;
                            break;
                    }
                    m2.e(bundleB, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = c0879q.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i10;
                }
                ArrayList arrayList = c0879q.f15959b;
                ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
                int i11 = i10;
                for (Object obj3 : arrayList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        p086i8.l.G();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    String strGroup = matcher.group(i12);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    int i13 = i10;
                    C0868f c0868f2 = (C0868f) linkedHashMap.get(str5);
                    try {
                        if (bundleB.containsKey(str5)) {
                            if (bundleB.containsKey(str5)) {
                                if (c0868f2 != null) {
                                    M m10 = c0868f2.a;
                                    Object objA = m10.a(str5, bundleB);
                                    if (!bundleB.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    m10.e(bundleB, str5, m10.c(objA, strGroup));
                                    objValueOf = obj2;
                                }
                                z6 = i13;
                            } else {
                                z6 = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z6);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj2;
                            }
                        } else {
                            e(bundleB, str5, strGroup, c0868f2);
                            objValueOf = obj2;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    i11 = i12;
                    i10 = i13;
                }
            }
            bundle.putAll(bundleB);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            t tVar = (t) obj;
            if (p210v8.i.a(this.a, tVar.a) && p210v8.i.a(this.f15970b, tVar.f15970b) && p210v8.i.a(this.f15971c, tVar.f15971c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15970b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15971c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
