package com.onesignal.notifications.internal;

import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements J5.g {
    private final c _notification;
    private final e _result;

    public d(c cVar, e eVar) {
        i.f(cVar, "_notification");
        i.f(eVar, "_result");
        this._notification = cVar;
        this._result = eVar;
    }

    @Override // J5.g
    public J5.f getNotification() {
        return this._notification;
    }

    @Override // J5.g
    public J5.i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        i.e(jSONObjectPut, "JSONObject()\n           …, _result.toJSONObject())");
        return jSONObjectPut;
    }
}
