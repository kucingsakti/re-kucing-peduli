package p228x6;

import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final String id;
    private final boolean optedIn;
    private final String token;

    public g(String str, String str2, boolean z6) {
        i.f(str, "id");
        i.f(str2, "token");
        this.id = str;
        this.token = str2;
        this.optedIn = z6;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.id).put("token", this.token).put("optedIn", this.optedIn);
        i.e(jSONObjectPut, "JSONObject()\n           … .put(\"optedIn\", optedIn)");
        return jSONObjectPut;
    }
}
