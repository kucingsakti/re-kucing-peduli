package p084i6;

import com.onesignal.debug.internal.logging.b;
import org.json.JSONArray;
import org.json.JSONException;
import p075h6.c;
import p075h6.d;
import p110l5.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar) {
        super(fVar, aVar);
        i.f(fVar, "dataRepository");
        i.f(aVar, "timeProvider");
    }

    @Override // p084i6.a, p084i6.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // p084i6.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // p084i6.a, p084i6.b
    public c getChannelType() {
        return c.NOTIFICATION;
    }

    @Override // p084i6.a, p084i6.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // p084i6.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // p084i6.a
    public JSONArray getLastChannelObjects() throws JSONException {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // p084i6.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e10) {
            b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    @Override // p084i6.a
    public void initInfluencedTypeFromCache() {
        d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // p084i6.a
    public void saveChannelObjects(JSONArray jSONArray) {
        i.f(jSONArray, "channelObjects");
        getDataRepository().saveNotifications(jSONArray);
    }
}
