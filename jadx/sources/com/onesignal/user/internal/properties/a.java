package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.h;
import com.onesignal.common.modeling.i;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: com.onesignal.user.internal.properties.a$a, reason: collision with other inner class name */
    public static final class C0085a extends k implements p200u8.a {
        public static final C0085a INSTANCE = new C0085a();

        public C0085a() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "US";
        }
    }

    public static final class b extends k implements p200u8.a {
        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final h invoke() {
            return new h(a.this, "tags");
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.i
    public i createModelForProperty(String str, JSONObject jSONObject) throws JSONException {
        p210v8.i.f(str, "property");
        p210v8.i.f(jSONObject, "jsonObject");
        if (!str.equals("tags")) {
            return null;
        }
        h hVar = new h(this, "tags");
        Iterator<String> itKeys = jSONObject.keys();
        p210v8.i.e(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            p210v8.i.e(next, "key");
            String string = jSONObject.getString(next);
            p210v8.i.e(string, "jsonObject.getString(key)");
            i.setStringProperty$default(hVar, next, string, null, false, 12, null);
        }
        return hVar;
    }

    public final String getCountry() {
        return getStringProperty("country", C0085a.INSTANCE);
    }

    public final String getLanguage() {
        return i.getOptStringProperty$default(this, "language", null, 2, null);
    }

    public final Float getLocationAccuracy() {
        return i.getOptFloatProperty$default(this, "locationAccuracy", null, 2, null);
    }

    public final Boolean getLocationBackground() {
        return i.getOptBooleanProperty$default(this, "locationBackground", null, 2, null);
    }

    public final Double getLocationLatitude() {
        return i.getOptDoubleProperty$default(this, "locationLatitude", null, 2, null);
    }

    public final Double getLocationLongitude() {
        return i.getOptDoubleProperty$default(this, "locationLongitude", null, 2, null);
    }

    public final Long getLocationTimestamp() {
        return i.getOptLongProperty$default(this, "locationTimestamp", null, 2, null);
    }

    public final Integer getLocationType() {
        return i.getOptIntProperty$default(this, "locationType", null, 2, null);
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final h getTags() {
        return getMapModelProperty("tags", new b());
    }

    public final String getTimezone() {
        return i.getOptStringProperty$default(this, "timezone", null, 2, null);
    }

    public final void setCountry(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "country", str, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        i.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f10) {
        i.setOptFloatProperty$default(this, "locationAccuracy", f10, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        i.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d3) {
        i.setOptDoubleProperty$default(this, "locationLatitude", d3, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d3) {
        i.setOptDoubleProperty$default(this, "locationLongitude", d3, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l4) {
        i.setOptLongProperty$default(this, "locationTimestamp", l4, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        i.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        i.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
