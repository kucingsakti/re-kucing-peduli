package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final p110l5.a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public h(p110l5.a aVar) {
        p210v8.i.f(aVar, "_time");
        this._time = aVar;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) 1000);
        long j = currentTimeMillis - this.lastDisplayTime;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j + " displayDelay: " + this.displayDelay, null, 2, null);
        return j >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j) {
        this.displayDelay = j;
    }

    public final void setDisplayLimit(int i10) {
        this.displayLimit = i10;
    }

    public final void setDisplayQuantity(int i10) {
        this.displayQuantity = i10;
    }

    public final void setDisplayStats(h hVar) {
        p210v8.i.f(hVar, "displayStats");
        this.lastDisplayTime = hVar.lastDisplayTime;
        this.displayQuantity = hVar.displayQuantity;
    }

    public final void setLastDisplayTime(long j) {
        this.lastDisplayTime = j;
    }

    public final boolean shouldDisplayAgain() {
        boolean z6 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage shouldDisplayAgain: " + z6, null, 2, null);
        return z6;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, long j, p110l5.a aVar) {
        this(aVar);
        p210v8.i.f(aVar, p084i6.e.TIME);
        this.displayQuantity = i10;
        this.lastDisplayTime = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject, p110l5.a aVar) throws JSONException {
        this(aVar);
        p210v8.i.f(jSONObject, "json");
        p210v8.i.f(aVar, p084i6.e.TIME);
        this.isRedisplayEnabled = true;
        Object obj = jSONObject.get(DISPLAY_LIMIT);
        Object obj2 = jSONObject.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }
}
