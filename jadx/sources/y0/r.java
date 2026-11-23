package y0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f15961t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i10) {
        super(0);
        this.f15960s = i10;
        this.f15961t = tVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [h8.d, java.lang.Object] */
    @Override // p200u8.a
    public final Object invoke() {
        List list;
        switch (this.f15960s) {
            case 0:
                p076h8.f fVar = (p076h8.f) this.f15961t.j.getValue();
                return (fVar == null || (list = (List) fVar.f11789s) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f15961t.a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                p210v8.i.c(fragment);
                t.a(fragment, arrayList, sb);
                String string = sb.toString();
                p210v8.i.e(string, "fragRegex.toString()");
                return new p076h8.f(arrayList, string);
            case 2:
                String str2 = (String) this.f15961t.f15979l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                p076h8.f fVar2 = (p076h8.f) this.f15961t.j.getValue();
                if (fVar2 != null) {
                    return (String) fVar2.f11790t;
                }
                return null;
            case 4:
                String str3 = this.f15961t.a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f15961t.f15981n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f15961t.f15973e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                t tVar = this.f15961t;
                tVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) tVar.f15975g.getValue()).booleanValue()) {
                    String str6 = tVar.a;
                    Uri uri = Uri.parse(str6);
                    for (String str7 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str7);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str8 = (String) p086i8.k.V(queryParameters);
                        if (str8 == null) {
                            tVar.f15977i = true;
                            str8 = str7;
                        }
                        Matcher matcher = t.f15965r.matcher(str8);
                        C0879q c0879q = new C0879q();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            p210v8.i.d(strGroup, "null cannot be cast to non-null type kotlin.String");
                            c0879q.f15959b.add(strGroup);
                            p210v8.i.e(str8, "queryParam");
                            String strSubstring = str8.substring(iEnd, matcher.start());
                            p210v8.i.e(strSubstring, "substring(...)");
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str8.length()) {
                            String strSubstring2 = str8.substring(iEnd);
                            p210v8.i.e(strSubstring2, "substring(...)");
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        p210v8.i.e(string2, "argRegex.toString()");
                        c0879q.a = L9.n.G(string2, t.f15967t, t.f15968u);
                        p210v8.i.e(str7, "paramName");
                        linkedHashMap.put(str7, c0879q);
                    }
                }
                return linkedHashMap;
        }
    }
}
