package p188t1;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0846i {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14967b;

    public A(String str, ArrayList arrayList) {
        this.a = str;
        this.f14967b = arrayList;
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        ArrayList<X509Certificate> arrayList = this.f14967b;
        JSONArray jSONArray = new JSONArray();
        for (X509Certificate x509Certificate : arrayList) {
            if (x509Certificate != null) {
                jSONArray.put(AbstractC0846i.c(x509Certificate));
            }
        }
        jSONObject.put(this.a, jSONArray);
    }
}
