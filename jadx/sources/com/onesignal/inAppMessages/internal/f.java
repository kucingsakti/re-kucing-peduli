package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final a Companion = new a(null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public f(JSONObject jSONObject) throws JSONException {
        p210v8.i.f(jSONObject, "json");
        String string = jSONObject.getString("name");
        p210v8.i.e(string, "json.getString(OUTCOME_NAME)");
        this.name = string;
        this.weight = jSONObject.has(OUTCOME_WEIGHT) ? (float) jSONObject.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.isUnique = jSONObject.has(OUTCOME_UNIQUE) && jSONObject.getBoolean(OUTCOME_UNIQUE);
    }

    public final String getName() {
        return this.name;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    public final void setName(String str) {
        p210v8.i.f(str, "<set-?>");
        this.name = str;
    }

    public final void setUnique(boolean z6) {
        this.isUnique = z6;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put(OUTCOME_WEIGHT, this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }
}
