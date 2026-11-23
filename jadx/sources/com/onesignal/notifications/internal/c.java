package com.onesignal.notifications.internal;

import I.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements J5.c {
    private List<? extends J5.b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private J5.a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.onesignal.common.threading.c displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<c> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility;
    private t notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private long sentTime;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;
    private int ttl;

    public static final class a implements J5.b {
        private final String icon;
        private final String id;
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // J5.b
        public String getIcon() {
            return this.icon;
        }

        @Override // J5.b
        public String getId() {
            return this.id;
        }

        @Override // J5.b
        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
                return jSONObject;
            } catch (Throwable th) {
                th.printStackTrace();
                return jSONObject;
            }
        }

        public a(String str, String str2, String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i10, p210v8.e eVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(JSONObject jSONObject, p110l5.a aVar) {
        this(null, jSONObject, 0, aVar);
        i.f(jSONObject, "payload");
        i.f(aVar, p084i6.e.TIME);
    }

    private final void initPayloadData(JSONObject jSONObject, p110l5.a aVar) {
        try {
            JSONObject customJSONObject = U5.e.INSTANCE.getCustomJSONObject(jSONObject);
            long currentTimeMillis = aVar.getCurrentTimeMillis();
            if (jSONObject.has("google.ttl")) {
                setSentTime(jSONObject.optLong("google.sent_time", currentTimeMillis) / ((long) 1000));
                setTtl(jSONObject.optInt("google.ttl", 259200));
            } else if (jSONObject.has(com.onesignal.notifications.bridges.a.HMS_TTL_KEY)) {
                setSentTime(jSONObject.optLong(com.onesignal.notifications.bridges.a.HMS_SENT_TIME_KEY, currentTimeMillis) / ((long) 1000));
                setTtl(jSONObject.optInt(com.onesignal.notifications.bridges.a.HMS_TTL_KEY, 259200));
            } else {
                setSentTime(currentTimeMillis / ((long) 1000));
                setTtl(259200);
            }
            setNotificationId(com.onesignal.common.e.safeString(customJSONObject, "i"));
            setTemplateId(com.onesignal.common.e.safeString(customJSONObject, "ti"));
            setTemplateName(com.onesignal.common.e.safeString(customJSONObject, "tn"));
            String string = jSONObject.toString();
            i.e(string, "currentJsonPayload.toString()");
            setRawPayload(string);
            setAdditionalData(com.onesignal.common.e.safeJSONObject(customJSONObject, R5.a.PUSH_ADDITIONAL_DATA_KEY));
            setLaunchURL(com.onesignal.common.e.safeString(customJSONObject, "u"));
            setBody(com.onesignal.common.e.safeString(jSONObject, "alert"));
            setTitle(com.onesignal.common.e.safeString(jSONObject, "title"));
            setSmallIcon(com.onesignal.common.e.safeString(jSONObject, "sicon"));
            setBigPicture(com.onesignal.common.e.safeString(jSONObject, "bicon"));
            setLargeIcon(com.onesignal.common.e.safeString(jSONObject, "licon"));
            setSound(com.onesignal.common.e.safeString(jSONObject, "sound"));
            setGroupKey(com.onesignal.common.e.safeString(jSONObject, "grp"));
            setGroupMessage(com.onesignal.common.e.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(com.onesignal.common.e.safeString(jSONObject, "bgac"));
            setLedColor(com.onesignal.common.e.safeString(jSONObject, "ledc"));
            String strSafeString = com.onesignal.common.e.safeString(jSONObject, "vis");
            if (strSafeString != null) {
                setLockScreenVisibility(Integer.parseInt(strSafeString));
            }
            setFromProjectNumber(com.onesignal.common.e.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String strSafeString2 = com.onesignal.common.e.safeString(jSONObject, "collapse_key");
            if (!"do_not_collapse".equals(strSafeString2)) {
                setCollapseId(strSafeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(jSONObject);
            } catch (Throwable th2) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private final void setActionButtonsFromData() throws Throwable {
        if (getAdditionalData() != null) {
            JSONObject additionalData = getAdditionalData();
            i.c(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                i.c(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    i.e(jSONObject, "jsonActionButton");
                    arrayList.add(new a(com.onesignal.common.e.safeString(jSONObject, "id"), com.onesignal.common.e.safeString(jSONObject, "text"), com.onesignal.common.e.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                i.c(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                i.c(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) throws Throwable {
        String strSafeString = com.onesignal.common.e.safeString(jSONObject, "bg_img");
        if (strSafeString != null) {
            JSONObject jSONObject2 = new JSONObject(strSafeString);
            setBackgroundImageLayout(new J5.a(com.onesignal.common.e.safeString(jSONObject2, "img"), com.onesignal.common.e.safeString(jSONObject2, "tc"), com.onesignal.common.e.safeString(jSONObject2, "bc")));
        }
    }

    @Override // J5.c, J5.d
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public List<J5.b> getActionButtons() {
        return this.actionButtons;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public J5.a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getBody() {
        return this.body;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.onesignal.common.threading.c getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final t getNotificationExtender() {
        return null;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public int getPriority() {
        return this.priority;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getSound() {
        return this.sound;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public String getTitle() {
        return this.title;
    }

    @Override // J5.c, J5.e, J5.f, J5.d
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends J5.b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i10) {
        this.androidNotificationId = i10;
    }

    public void setBackgroundImageLayout(J5.a aVar) {
        this.backgroundImageLayout = aVar;
    }

    public void setBigPicture(String str) {
        this.bigPicture = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCollapseId(String str) {
        this.collapseId = str;
    }

    public void setFromProjectNumber(String str) {
        this.fromProjectNumber = str;
    }

    public void setGroupKey(String str) {
        this.groupKey = str;
    }

    public void setGroupMessage(String str) {
        this.groupMessage = str;
    }

    public void setGroupedNotifications(List<c> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public void setLaunchURL(String str) {
        this.launchURL = str;
    }

    public void setLedColor(String str) {
        this.ledColor = str;
    }

    public void setLockScreenVisibility(int i10) {
        this.lockScreenVisibility = i10;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setRawPayload(String str) {
        i.f(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j) {
        this.sentTime = j;
    }

    public void setSmallIcon(String str) {
        this.smallIcon = str;
    }

    public void setSmallIconAccentColor(String str) {
        this.smallIconAccentColor = str;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTtl(int i10) {
        this.ttl = i10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<c> groupedNotifications = getGroupedNotifications();
                i.c(groupedNotifications);
                Iterator<c> it = groupedNotifications.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put("title", getTitle());
            jSONObject.put("body", getBody());
            jSONObject.put("smallIcon", getSmallIcon());
            jSONObject.put("largeIcon", getLargeIcon());
            jSONObject.put("bigPicture", getBigPicture());
            jSONObject.put("smallIconAccentColor", getSmallIconAccentColor());
            jSONObject.put("launchURL", getLaunchURL());
            jSONObject.put("sound", getSound());
            jSONObject.put("ledColor", getLedColor());
            jSONObject.put("lockScreenVisibility", getLockScreenVisibility());
            jSONObject.put("groupKey", getGroupKey());
            jSONObject.put("groupMessage", getGroupMessage());
            jSONObject.put("fromProjectNumber", getFromProjectNumber());
            jSONObject.put("collapseId", getCollapseId());
            jSONObject.put("priority", getPriority());
            if (getAdditionalData() != null) {
                jSONObject.put("additionalData", getAdditionalData());
            }
            if (getActionButtons() != null) {
                JSONArray jSONArray2 = new JSONArray();
                List<J5.b> actionButtons = getActionButtons();
                i.c(actionButtons);
                for (J5.b bVar : actionButtons) {
                    i.d(bVar, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) bVar).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public c(List<c> list, JSONObject jSONObject, int i10, p110l5.a aVar) {
        i.f(jSONObject, "jsonPayload");
        i.f(aVar, p084i6.e.TIME);
        this.displayWaiter = new com.onesignal.common.threading.c();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jSONObject, aVar);
        setGroupedNotifications(list);
        setAndroidNotificationId(i10);
    }

    @Override // J5.c, J5.e
    public void setExtender(t tVar) {
    }

    public final void setNotificationExtender(t tVar) {
    }
}
