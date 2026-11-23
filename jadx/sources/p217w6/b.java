package p217w6;

import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final c current;

    public b(c cVar) {
        i.f(cVar, "current");
        this.current = cVar;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("current", this.current.toJSONObject());
        i.e(jSONObjectPut, "JSONObject()\n           …, current.toJSONObject())");
        return jSONObjectPut;
    }
}
