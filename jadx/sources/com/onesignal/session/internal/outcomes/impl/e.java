package com.onesignal.session.internal.outcomes.impl;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j6.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final p075h6.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        /* JADX WARN: Code duplicated, block: B:19:0x007d  */
        public final e fromOutcomeEventParamstoOutcomeEvent(f fVar) {
            JSONArray notificationIds;
            n indirectBody;
            JSONArray notificationIds2;
            p210v8.i.f(fVar, "outcomeEventParams");
            p075h6.d dVar = p075h6.d.UNATTRIBUTED;
            if (fVar.getOutcomeSource() != null) {
                m outcomeSource = fVar.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    p210v8.i.c(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        p210v8.i.c(directBody2);
                        JSONArray notificationIds3 = directBody2.getNotificationIds();
                        p210v8.i.c(notificationIds3);
                        if (notificationIds3.length() > 0) {
                            dVar = p075h6.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            p210v8.i.c(directBody3);
                            notificationIds = directBody3.getNotificationIds();
                        } else if (outcomeSource.getIndirectBody() != null) {
                            indirectBody = outcomeSource.getIndirectBody();
                            p210v8.i.c(indirectBody);
                            if (indirectBody.getNotificationIds() != null) {
                                n indirectBody2 = outcomeSource.getIndirectBody();
                                p210v8.i.c(indirectBody2);
                                notificationIds2 = indirectBody2.getNotificationIds();
                                p210v8.i.c(notificationIds2);
                                if (notificationIds2.length() > 0) {
                                    dVar = p075h6.d.INDIRECT;
                                    n indirectBody3 = outcomeSource.getIndirectBody();
                                    p210v8.i.c(indirectBody3);
                                    notificationIds = indirectBody3.getNotificationIds();
                                } else {
                                    notificationIds = null;
                                }
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else if (outcomeSource.getIndirectBody() != null) {
                        indirectBody = outcomeSource.getIndirectBody();
                        p210v8.i.c(indirectBody);
                        if (indirectBody.getNotificationIds() != null) {
                            n indirectBody4 = outcomeSource.getIndirectBody();
                            p210v8.i.c(indirectBody4);
                            notificationIds2 = indirectBody4.getNotificationIds();
                            p210v8.i.c(notificationIds2);
                            if (notificationIds2.length() > 0) {
                                dVar = p075h6.d.INDIRECT;
                                n indirectBody5 = outcomeSource.getIndirectBody();
                                p210v8.i.c(indirectBody5);
                                notificationIds = indirectBody5.getNotificationIds();
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else if (outcomeSource.getIndirectBody() != null) {
                    indirectBody = outcomeSource.getIndirectBody();
                    p210v8.i.c(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody6 = outcomeSource.getIndirectBody();
                        p210v8.i.c(indirectBody6);
                        notificationIds2 = indirectBody6.getNotificationIds();
                        p210v8.i.c(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = p075h6.d.INDIRECT;
                            n indirectBody7 = outcomeSource.getIndirectBody();
                            p210v8.i.c(indirectBody7);
                            notificationIds = indirectBody7.getNotificationIds();
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else {
                    notificationIds = null;
                }
            } else {
                notificationIds = null;
            }
            return new e(dVar, notificationIds, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
        }

        private a() {
        }
    }

    public e(p075h6.d dVar, JSONArray jSONArray, String str, long j, long j10, float f10) {
        p210v8.i.f(dVar, SESSION);
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        this.session = dVar;
        this.notificationIds = jSONArray;
        this.name = str;
        this.timestamp = j;
        this.sessionTime = j10;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && p210v8.i.a(getNotificationIds(), eVar.getNotificationIds()) && p210v8.i.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.a
    public String getName() {
        return this.name;
    }

    @Override // j6.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // j6.a
    public p075h6.d getSession() {
        return this.session;
    }

    @Override // j6.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // j6.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // j6.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int iHashCode = 1;
        for (int i10 = 0; i10 < 6; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put(OUTCOME_ID, getName());
        jSONObject.put(TIMESTAMP, getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
