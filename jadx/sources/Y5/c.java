package Y5;

import J5.h;
import J5.j;
import J5.k;
import J5.m;
import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    void addInternalNotificationLifecycleEventHandler(b bVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, d<? super Boolean> dVar);

    Object canReceiveNotification(JSONObject jSONObject, d<? super Boolean> dVar);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, d<? super p076h8.m> dVar);

    Object notificationReceived(U5.d dVar, d<? super p076h8.m> dVar2);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void removeInternalNotificationLifecycleEventHandler(b bVar);

    void setInternalNotificationLifecycleCallback(a aVar);
}
