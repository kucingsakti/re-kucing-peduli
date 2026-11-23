package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p151p5.b {
    private final a _message;
    private final c _result;

    public b(a aVar, c cVar) {
        p210v8.i.f(aVar, "msg");
        p210v8.i.f(cVar, "actn");
        this._message = aVar;
        this._result = cVar;
    }

    @Override // p151p5.b
    public p151p5.a getMessage() {
        return this._message;
    }

    @Override // p151p5.b
    public p151p5.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        p210v8.i.e(jSONObjectPut, "JSONObject()\n           …, _result.toJSONObject())");
        return jSONObjectPut;
    }
}
