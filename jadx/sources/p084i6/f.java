package p084i6;

import com.onesignal.core.internal.config.a;
import com.onesignal.core.internal.config.b;
import org.json.JSONArray;
import org.json.JSONException;
import p075h6.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c {
    private final b _configModelStore;
    private final p093j5.b preferences;

    public f(p093j5.b bVar, b bVar2) {
        i.f(bVar, "preferences");
        i.f(bVar2, "_configModelStore");
        this.preferences = bVar;
        this._configModelStore = bVar2;
    }

    @Override // p084i6.c
    public void cacheIAMInfluenceType(d dVar) {
        i.f(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, dVar.toString());
    }

    @Override // p084i6.c
    public void cacheNotificationInfluenceType(d dVar) {
        i.f(dVar, "influenceType");
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, dVar.toString());
    }

    @Override // p084i6.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // p084i6.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // p084i6.c
    public d getIamCachedInfluenceType() {
        return d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, d.UNATTRIBUTED.toString()));
    }

    @Override // p084i6.c
    public int getIamIndirectAttributionWindow() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // p084i6.c
    public int getIamLimit() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // p084i6.c
    public JSONArray getLastIAMsReceivedData() throws JSONException {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // p084i6.c
    public JSONArray getLastNotificationsReceivedData() throws JSONException {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // p084i6.c
    public d getNotificationCachedInfluenceType() {
        return d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, d.UNATTRIBUTED.toString()));
    }

    @Override // p084i6.c
    public int getNotificationIndirectAttributionWindow() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // p084i6.c
    public int getNotificationLimit() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // p084i6.c
    public boolean isDirectInfluenceEnabled() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // p084i6.c
    public boolean isIndirectInfluenceEnabled() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // p084i6.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((a) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // p084i6.c
    public void saveIAMs(JSONArray jSONArray) {
        i.f(jSONArray, "iams");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, jSONArray.toString());
    }

    @Override // p084i6.c
    public void saveNotifications(JSONArray jSONArray) {
        i.f(jSONArray, "notifications");
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, jSONArray.toString());
    }
}
