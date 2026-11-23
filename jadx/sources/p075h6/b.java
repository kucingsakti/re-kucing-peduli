package p075h6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private c influenceChannel;
    private d influenceType;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str) throws JSONException {
        i.f(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = c.Companion.fromString(string);
        this.influenceType = d.Companion.fromString(string2);
        i.e(string3, "ids");
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final b copy() {
        return new b(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class.equals(obj.getClass())) {
            b bVar = (b) obj;
            if (this.influenceChannel == bVar.influenceChannel && this.influenceType == bVar.influenceType) {
                return true;
            }
        }
        return false;
    }

    public final String getDirectId() throws JSONException {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final c getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final d getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(d dVar) {
        i.f(dVar, "<set-?>");
        this.influenceType = dVar;
    }

    public final String toJSONString() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String string = jSONObjectPut.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        i.e(string, "JSONObject()\n           …)\n            .toString()");
        return string;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public b(c cVar, d dVar, JSONArray jSONArray) {
        i.f(cVar, "influenceChannel");
        i.f(dVar, "influenceType");
        this.influenceChannel = cVar;
        this.influenceType = dVar;
        this.ids = jSONArray;
    }
}
