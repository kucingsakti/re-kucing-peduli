package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzas implements zzaq, Iterable<zzaq> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8475s;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f8475s = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzas(this.f8475s);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean d() {
        return Boolean.valueOf(!this.f8475s.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double e() {
        String str = this.f8475s;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.f8475s.equals(((zzas) obj).f8475s);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String f() {
        return this.f8475s;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator g() {
        return new C0564d(this, 1);
    }

    public final int hashCode() {
        return this.f8475s.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new C0564d(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x016f A[PHI: r0
      0x016f: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v5 java.lang.String), (r0v7 java.lang.String) binds: [B:106:0x016d, B:102:0x015e, B:98:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq o(String str, zzh zzhVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        byte b3;
        byte b7;
        int i10;
        int i11;
        boolean zIsEmpty;
        int i12;
        zzh zzhVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        String strF = "undefined";
        zzaq zzaqVarA = zzaq.f8465i;
        String str5 = this.f8475s;
        switch (str.hashCode()) {
            case -1789698943:
                str3 = r0;
                str4 = "charAt";
                b3 = str.equals(str3) ? (byte) 0 : (byte) -1;
                break;
            case -1776922004:
                str4 = "charAt";
                if (str.equals("toString")) {
                    str3 = r0;
                    b3 = 1;
                } else {
                    b3 = -1;
                    str3 = r0;
                }
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str3 = r0;
                    b3 = 2;
                } else {
                    b3 = -1;
                    str3 = r0;
                }
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str3 = r0;
                    b3 = 3;
                } else {
                    b3 = -1;
                    str3 = r0;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b7 = 4;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b7 = 5;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b7 = 6;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b7 = 7;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b7 = 8;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b7 = 9;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b7 = 10;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b7 = 11;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b7 = 12;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b7 = 13;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b7 = 14;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b7 = 15;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b7 = 16;
                    b3 = b7;
                } else {
                    b3 = -1;
                }
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
            default:
                b3 = -1;
                str3 = "hasOwnProperty";
                str4 = "charAt";
                break;
        }
        switch (b3) {
            case 0:
                zzg.g(str3, 1, arrayList);
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                boolean zEquals = "length".equals(zzaqVarA2.f());
                zzag zzagVar = zzaq.f8469n;
                if (zEquals) {
                    return zzagVar;
                }
                double dDoubleValue = zzaqVarA2.e().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str5.length()) ? zzaq.f8470o : zzagVar;
            case 1:
                zzg.g("toString", 0, arrayList);
                return this;
            case 2:
                zzg.g("toLocaleLowerCase", 0, arrayList);
                return new zzas(str5.toLowerCase());
            case 3:
                zzg.m(1, str4, arrayList);
                int iA = !arrayList.isEmpty() ? (int) zzg.a(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) : 0;
                return (iA < 0 || iA >= str5.length()) ? zzaq.f8471p : new zzas(String.valueOf(str5.charAt(iA)));
            case 4:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str5);
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        sb.append(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i13)).f());
                    }
                    return new zzas(sb.toString());
                }
                return this;
            case 5:
                zzg.g("toLowerCase", 0, arrayList);
                return new zzas(str5.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.m(1, "search", arrayList);
                if (arrayList.isEmpty()) {
                    zzaqVarA.getClass();
                } else {
                    strF = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                }
                Matcher matcher = Pattern.compile(strF).matcher(str5);
                return matcher.find() ? new zzai(Double.valueOf(matcher.start())) : new zzai(Double.valueOf(-1.0d));
            case 7:
                zzg.g("toLocaleUpperCase", 0, arrayList);
                return new zzas(str5.toUpperCase());
            case 8:
                zzg.m(2, "lastIndexOf", arrayList);
                if (arrayList.size() <= 0) {
                    zzaqVarA.getClass();
                } else {
                    strF = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                }
                String str6 = strF;
                double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue();
                return new zzai(Double.valueOf(str5.lastIndexOf(str6, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzg.a(dDoubleValue2)))));
            case 9:
                zzg.g("toUpperCase", 0, arrayList);
                return new zzas(str5.toUpperCase(Locale.ENGLISH));
            case 10:
                zzg.g("toUpperCase", 0, arrayList);
                return new zzas(str5.trim());
            case 11:
                zzg.m(1, "match", arrayList);
                Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f()).matcher(str5);
                return matcher2.find() ? new zzaf(new zzas(matcher2.group())) : zzaq.j;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zzg.m(2, "slice", arrayList);
                double dA = zzg.a(!arrayList.isEmpty() ? zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue() : 0.0d);
                int iMax = (int) (dA < 0.0d ? Math.max(((double) str5.length()) + dA, 0.0d) : Math.min(dA, str5.length()));
                double dA2 = zzg.a(arrayList.size() > 1 ? zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue() : str5.length());
                return new zzas(str5.substring(iMax, Math.max(0, ((int) (dA2 < 0.0d ? Math.max(((double) str5.length()) + dA2, 0.0d) : Math.min(dA2, str5.length()))) - iMax) + iMax));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                zzg.m(2, "split", arrayList);
                if (str5.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strF2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                    long jI = arrayList.size() > 1 ? ((long) zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())) & 4294967295L : 2147483647L;
                    if (jI == 0) {
                        return new zzaf();
                    }
                    String[] strArrSplit = str5.split(Pattern.quote(strF2), ((int) jI) + 1);
                    int length = strArrSplit.length;
                    if (!strF2.isEmpty() || strArrSplit.length <= 0) {
                        i11 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            i11 = zIsEmpty;
                            length = strArrSplit.length - 1;
                            i11 = zIsEmpty;
                        }
                    }
                    i11 = zIsEmpty;
                    if (strArrSplit.length > jI) {
                        length--;
                    }
                    while (i11 < length) {
                        arrayList2.add(new zzas(strArrSplit[i11]));
                        i11++;
                    }
                }
                return new zzaf(arrayList2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                zzg.m(2, "substring", arrayList);
                int iA2 = !arrayList.isEmpty() ? (int) zzg.a(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) : 0;
                int iA3 = arrayList.size() > 1 ? (int) zzg.a(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue()) : str5.length();
                int iMin = Math.min(Math.max(iA2, 0), str5.length());
                int iMin2 = Math.min(Math.max(iA3, 0), str5.length());
                return new zzas(str5.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                zzg.m(2, "replace", arrayList);
                zzaqVarA.getClass();
                if (!arrayList.isEmpty()) {
                    strF = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).f();
                    if (arrayList.size() > 1) {
                        zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                    }
                }
                String str7 = strF;
                zzaq zzaqVarA3 = zzaqVarA;
                int iIndexOf = str5.indexOf(str7);
                if (iIndexOf >= 0) {
                    if (zzaqVarA3 instanceof zzal) {
                        i12 = 0;
                        zzaqVarA3 = ((zzal) zzaqVarA3).a(zzhVar, Arrays.asList(new zzas(str7), new zzai(Double.valueOf(iIndexOf)), this));
                    } else {
                        i12 = 0;
                    }
                    return new zzas(str5.substring(i12, iIndexOf) + zzaqVarA3.f() + str5.substring(str7.length() + iIndexOf));
                }
                return this;
            case 16:
                zzg.m(2, "indexOf", arrayList);
                if (arrayList.size() <= 0) {
                    zzaqVarA.getClass();
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    strF = zzhVar2.f8658b.a(zzhVar2, (zzaq) arrayList.get(0)).f();
                }
                return new zzai(Double.valueOf(str5.indexOf(strF, (int) zzg.a(arrayList.size() < 2 ? 0.0d : zzhVar2.f8658b.a(zzhVar2, (zzaq) arrayList.get(1)).e().doubleValue()))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        return E0.a.l(new StringBuilder("\""), this.f8475s, "\"");
    }
}
