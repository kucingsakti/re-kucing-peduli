package p188t1;

import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: t1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853p extends AbstractC0846i {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509Certificate f15075b;

    public C0853p(String str, X509Certificate x509Certificate) {
        this.a = str;
        this.f15075b = x509Certificate;
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        X509Certificate x509Certificate = this.f15075b;
        if (x509Certificate != null) {
            jSONObject.put(this.a, AbstractC0846i.c(x509Certificate));
        }
    }
}
