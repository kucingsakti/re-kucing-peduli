package com.onesignal.inAppMessages.internal;

import L9.n;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    private final a kind;
    private final b operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM(U5.c.PAYLOAD_OS_ROOT_CUSTOM),
        UNKNOWN("unknown");

        public static final C0042a Companion = new C0042a(null);
        private final String value;

        /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.l$a$a, reason: collision with other inner class name */
        public static final class C0042a {
            public /* synthetic */ C0042a(p210v8.e eVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (n.C(aVar.value, str, true)) {
                        return aVar;
                    }
                }
                return a.UNKNOWN;
            }

            private C0042a() {
            }
        }

        a(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS(ScarConstants.IN_SIGNAL_KEY);

        public static final a Companion = new a(null);
        private final String text;

        public static final class a {
            public /* synthetic */ a(p210v8.e eVar) {
                this();
            }

            public final b fromString(String str) {
                for (b bVar : b.values()) {
                    if (n.C(bVar.text, str, true)) {
                        return bVar;
                    }
                }
                return b.EQUAL_TO;
            }

            private a() {
            }
        }

        b(String str) {
            this.text = str;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public l(JSONObject jSONObject) throws JSONException {
        p210v8.i.f(jSONObject, "json");
        String string = jSONObject.getString("id");
        p210v8.i.e(string, "json.getString(\"id\")");
        this.triggerId = string;
        this.kind = a.Companion.fromString(jSONObject.getString("kind"));
        this.property = jSONObject.optString("property", null);
        this.operatorType = b.Companion.fromString(jSONObject.getString("operator"));
        this.value = jSONObject.opt("value");
    }

    public final a getKind() {
        return this.kind;
    }

    public final b getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.triggerId);
            jSONObject.put("kind", this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put("value", this.value);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
