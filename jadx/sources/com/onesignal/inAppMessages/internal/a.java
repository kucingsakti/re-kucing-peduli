package com.onesignal.inAppMessages.internal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.s;
import p086i8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p151p5.a {
    public static final C0034a Companion = new C0034a(null);
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private Date endTime;
    private boolean hasLiquid;
    private boolean isDisplayedInSession;
    private boolean isPreview;
    private boolean isTriggerChanged;
    private final String messageId;
    private h redisplayStats;
    private List<? extends List<l>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.a$a, reason: collision with other inner class name */
    public static final class C0034a {
        public /* synthetic */ C0034a(p210v8.e eVar) {
            this();
        }

        private C0034a() {
        }
    }

    public a(String str, p110l5.a aVar) {
        p210v8.i.f(str, IAM_ID);
        p210v8.i.f(aVar, p084i6.e.TIME);
        this.messageId = str;
        this.variants = t.f12329s;
        this.triggers = s.f12328s;
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new h(aVar);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            p210v8.i.e(string, "{\n                json.g…g(END_TIME)\n            }");
            if (string.equals("null")) {
                return null;
            }
            try {
                return com.onesignal.common.b.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<l>> parseTriggerJson(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<l>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList<l> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i11);
                p210v8.i.e(jSONObject, "ands.getJSONObject(j)");
                arrayList2.add(new l(jSONObject));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap<String, String> map2 = new HashMap<>();
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                p210v8.i.e(next2, "languageType");
                String string = jSONObject2.getString(next2);
                p210v8.i.e(string, "variant.getString(languageType)");
                map2.put(next2, string);
            }
            p210v8.i.e(next, "variantType");
            map.put(next, map2);
        }
        return map;
    }

    public final void addClickId(String str) {
        p210v8.i.f(str, "clickId");
        this.clickedClickIds.add(str);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.class.equals(obj.getClass())) {
            return false;
        }
        return p210v8.i.a(getMessageId(), ((a) obj).getMessageId());
    }

    public final Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public final double getDisplayDuration() {
        return this.displayDuration;
    }

    public final boolean getHasLiquid() {
        return this.hasLiquid;
    }

    @Override // p151p5.a
    public String getMessageId() {
        return this.messageId;
    }

    public final h getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<l>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String str) {
        p210v8.i.f(str, "clickId");
        return !this.clickedClickIds.contains(str);
    }

    public final boolean isDisplayedInSession() {
        return this.isDisplayedInSession;
    }

    public final boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        Date date2 = this.endTime;
        p210v8.i.c(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String str) {
        p210v8.i.f(str, "clickId");
        this.clickedClickIds.remove(str);
    }

    public final void setDisplayDuration(double d3) {
        this.displayDuration = d3;
    }

    public final void setDisplayedInSession(boolean z6) {
        this.isDisplayedInSession = z6;
    }

    public final void setTriggerChanged(boolean z6) {
        this.isTriggerChanged = z6;
    }

    public final boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, getMessageId());
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.variants.keySet()) {
                Map<String, String> map = this.variants.get(str);
                p210v8.i.c(map);
                Map<String, String> map2 = map;
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : map2.keySet()) {
                    jSONObject3.put(str2, map2.get(str2));
                }
                jSONObject2.put(str, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (List<l> list : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<l> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, com.onesignal.common.b.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(boolean z6, p110l5.a aVar) {
        this("", aVar);
        p210v8.i.f(aVar, p084i6.e.TIME);
        this.isPreview = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, Set<String> set, boolean z6, h hVar, p110l5.a aVar) {
        this(str, aVar);
        p210v8.i.f(str, IAM_ID);
        p210v8.i.f(set, "clickIds");
        p210v8.i.f(hVar, "redisplayStats");
        p210v8.i.f(aVar, p084i6.e.TIME);
        this.clickedClickIds = p086i8.k.v0(set);
        this.isDisplayedInSession = z6;
        this.redisplayStats = hVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(JSONObject jSONObject, p110l5.a aVar) throws JSONException {
        p210v8.i.f(jSONObject, "json");
        p210v8.i.f(aVar, p084i6.e.TIME);
        String string = jSONObject.getString(ID);
        p210v8.i.e(string, "json.getString(ID)");
        this(string, aVar);
        JSONObject jSONObject2 = jSONObject.getJSONObject(IAM_VARIANTS);
        p210v8.i.e(jSONObject2, "json.getJSONObject(IAM_VARIANTS)");
        this.variants = parseVariants(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray(IAM_TRIGGERS);
        p210v8.i.e(jSONArray, "json.getJSONArray(IAM_TRIGGERS)");
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(IAM_REDISPLAY_STATS);
            p210v8.i.e(jSONObject3, "json.getJSONObject(IAM_REDISPLAY_STATS)");
            this.redisplayStats = new h(jSONObject3, aVar);
        }
    }
}
