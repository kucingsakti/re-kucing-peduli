package p217w6;

import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final String externalId;
    private final String onesignalId;

    public c(String str, String str2) {
        i.f(str, "onesignalId");
        i.f(str2, "externalId");
        this.onesignalId = str;
        this.externalId = str2;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        i.e(jSONObjectPut, "JSONObject()\n           …\"externalId\", externalId)");
        return jSONObjectPut;
    }
}
