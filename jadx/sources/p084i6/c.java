package p084i6;

import org.json.JSONArray;
import org.json.JSONException;
import p075h6.d;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    void cacheIAMInfluenceType(d dVar);

    void cacheNotificationInfluenceType(d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData() throws JSONException;

    JSONArray getLastNotificationsReceivedData() throws JSONException;

    d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
