package p188t1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class S implements H {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f14989b;

    public S(String str, JSONObject jSONObject) {
        this.a = str;
        this.f14989b = jSONObject;
    }

    @Override // p188t1.H
    public final void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.a, this.f14989b);
    }
}
