package p228x6;

import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final g current;
    private final g previous;

    public f(g gVar, g gVar2) {
        i.f(gVar, "previous");
        i.f(gVar2, "current");
        this.previous = gVar;
        this.current = gVar2;
    }

    public final g getCurrent() {
        return this.current;
    }

    public final g getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        i.e(jSONObjectPut, "JSONObject()\n           …, current.toJSONObject())");
        return jSONObjectPut;
    }
}
