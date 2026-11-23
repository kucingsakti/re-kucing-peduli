package ka;

import L9.f;
import L9.n;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {
    public static final c a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        s sVar = s.f12328s;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return sVar;
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(E0.a.g("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbL = AbstractC0487g.l("endIndex > string.length: ", length2, " > ");
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        long j = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i11 = i12;
                    } else {
                        j += (long) 4;
                        i11 += 2;
                    }
                }
                j += (long) i10;
            }
            i11++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        i.f(str, "host");
        i.f(x509Certificate, "certificate");
        byte[] bArr = Y9.c.a;
        if (Y9.c.f5825f.a(str)) {
            String strQ = C3.a.q(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (i.a(strQ, C3.a.q((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            i.e(locale, "US");
            str = str.toLowerCase(locale);
            i.e(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (str.length() == 0 || n.I(str, ".", false) || n.B(str, "..") || lowerCase == null || lowerCase.length() == 0 || n.I(lowerCase, ".", false) || n.B(lowerCase, "..")) {
                    zA = false;
                } else {
                    String strK = !n.B(str, ".") ? i.k(".", str) : str;
                    if (!n.B(lowerCase, ".")) {
                        lowerCase = i.k(".", lowerCase);
                    }
                    if (b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        i.e(locale2, "US");
                        lowerCase = lowerCase.toLowerCase(locale2);
                        i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!f.J(lowerCase, "*", false)) {
                        zA = i.a(strK, lowerCase);
                    } else if (!n.I(lowerCase, "*.", false) || f.O(lowerCase, '*', 1, 4) != -1 || strK.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (n.B(strK, strSubstring) && ((length = strK.length() - strSubstring.length()) <= 0 || f.R(strK, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        i.f(str, "host");
        i.f(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate != null) {
                    return c(str, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
