package p029c9;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import C9.h;
import D3.b;
import L9.f;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import p047e9.Q;
import p176r9.c;
import p210v8.i;
import p220w9.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f7546b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7547c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7548d = new e();

    public static String[] b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static j c(String str) {
        c cVar;
        i.f(str, "representation");
        char cCharAt = str.charAt(0);
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i10];
            if (cVar.h().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (cVar != null) {
            return new i(cVar);
        }
        if (cCharAt == 'V') {
            return new i(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new g(c(strSubstring));
        }
        if (cCharAt == 'L' && str.length() > 0) {
            b.h(str.charAt(f.L(str)), ';', false);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new h(strSubstring2);
    }

    public static h d(String str) {
        i.f(str, "internalName");
        return new h(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        i.f(str, "internalName");
        i.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        i.f(strArr, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(j jVar) {
        String strH;
        i.f(jVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        if (jVar instanceof g) {
            return "[" + h(((g) jVar).f7552i);
        }
        if (jVar instanceof i) {
            c cVar = ((i) jVar).f7554i;
            return (cVar == null || (strH = cVar.h()) == null) ? "V" : strH;
        }
        if (jVar instanceof h) {
            return AbstractC0487g.j(new StringBuilder("L"), ((h) jVar).f7553i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p220w9.k
    public AbstractC0151y a(Q q10, String str, D d3, D d8) {
        i.f(q10, "proto");
        i.f(str, "flexibleId");
        i.f(d3, "lowerBound");
        i.f(d8, "upperBound");
        if (str.equals("kotlin.jvm.PlatformType")) {
            return q10.k(h9.k.f11883g) ? new Z8.f(d3, d8) : C0133f.j(d3, d8);
        }
        return C9.i.c(h.ERROR_FLEXIBLE_TYPE, str, d3.toString(), d8.toString());
    }
}
