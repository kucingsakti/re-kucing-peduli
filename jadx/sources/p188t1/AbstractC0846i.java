package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.C;

/* JADX INFO: renamed from: t1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846i implements H {
    static {
        C.a(C.c("0971A7DC0FF7"));
        C.a(C.c("0971A7DC0FF7E4AB92721D069A597D22C6E7AFED56C5"));
        C.a(C.c("0971A7DC0FF7ECA3"));
        C.a(C.c("1367A6C00BE9"));
        C.a(C.c("1377B6C30FE6D1"));
        AbstractC0487g.r("1377B6C30FE6D1868A630A1A954C603DD5CC80E15ED321", "1377B6C30FE6D18E82");
    }

    public static String b(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (boolean z6 : zArr) {
            if (z6) {
                sb.append(C.a(C.c("51")));
            } else {
                sb.append(C.a(C.c("50")));
            }
        }
        return sb.toString();
    }

    public static JSONObject c(X509Certificate x509Certificate) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C.a(C.c("0971A7DC0FF7")), x509Certificate.getIssuerDN().getName());
        String strA = C.a(C.c("0971A7DC0FF7E4AB92721D069A597D22C6E7AFED56C5"));
        try {
            Collection<List<?>> issuerAlternativeNames = x509Certificate.getIssuerAlternativeNames();
            jSONArray = new JSONArray();
            if (issuerAlternativeNames != null) {
                Iterator<List<?>> it = issuerAlternativeNames.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toString());
                }
            }
        } catch (Exception unused) {
            jSONArray = new JSONArray();
        }
        jSONObject.put(strA, jSONArray);
        jSONObject.put(C.a(C.c("0971A7DC0FF7ECA3")), b(x509Certificate.getIssuerUniqueID()));
        jSONObject.put(C.a(C.c("1367A6C00BE9")), x509Certificate.getSerialNumber());
        jSONObject.put(C.a(C.c("1377B6C30FE6D1")), x509Certificate.getSubjectDN().getName());
        String strA2 = C.a(C.c("1377B6C30FE6D1868A630A1A954C603DD5CC80E15ED321"));
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            jSONArray2 = new JSONArray();
            if (subjectAlternativeNames != null) {
                Iterator<List<?>> it2 = subjectAlternativeNames.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().toString());
                }
            }
        } catch (Exception unused2) {
            jSONArray2 = new JSONArray();
        }
        jSONObject.put(strA2, jSONArray2);
        jSONObject.put(C.a(C.c("1377B6C30FE6D18E82")), b(x509Certificate.getSubjectUniqueID()));
        return jSONObject;
    }
}
