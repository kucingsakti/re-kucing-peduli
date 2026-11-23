package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String str, m mVar, float f10, long j, long j10) {
        p210v8.i.f(str, "outcomeId");
        this.outcomeId = str;
        this.outcomeSource = mVar;
        this.weight = f10;
        this.sessionTime = j;
        this.timestamp = j10;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final m getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        m mVar = this.outcomeSource;
        if (mVar != null) {
            return mVar.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null;
        }
        return true;
    }

    public final void setSessionTime(long j) {
        this.sessionTime = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            jSONObjectPut.put("sources", mVar.toJSONObject());
        }
        float f10 = this.weight;
        if (f10 > 0.0f) {
            jSONObjectPut.put("weight", Float.valueOf(f10));
        }
        long j = this.timestamp;
        if (j > 0) {
            jSONObjectPut.put("timestamp", j);
        }
        long j10 = this.sessionTime;
        if (j10 > 0) {
            jSONObjectPut.put("session_time", j10);
        }
        p210v8.i.e(jSONObjectPut, "json");
        return jSONObjectPut;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
