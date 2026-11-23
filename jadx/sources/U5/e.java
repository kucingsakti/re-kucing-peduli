package U5;

import I.J;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final e INSTANCE = new e();

    private e() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(e eVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return eVar.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        i.f(context, "context");
        try {
            if (!new J(context).a()) {
                return false;
            }
            if (str == null || Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            return notificationChannel == null || notificationChannel.getImportance() != 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        i.f(arrayList, "grouplessNotifs");
        for (StatusBarNotification statusBarNotification : arrayList) {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
            i.e(builderRecoverBuilder, "recoverBuilder(context, …uplessNotif.notification)");
            Notification notificationBuild = builderRecoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            i.e(notificationBuild, "grouplessNotifBuilder\n  …                 .build()");
            i.c(context);
            new J(context).b(statusBarNotification.getId(), notificationBuild);
        }
    }

    public final com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jSONArray, p110l5.a aVar) {
        i.f(jSONArray, "jsonArray");
        i.f(aVar, p084i6.e.TIME);
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z6 = true;
        JSONObject jSONObject = null;
        String strOptString = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z6) {
                    z6 = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.c(jSONObject, aVar));
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error parsing JSON item " + i10 + '/' + length + " for callback.", th);
            }
        }
        i.c(jSONObject);
        com.onesignal.notifications.internal.c cVar = new com.onesignal.notifications.internal.c(arrayList, jSONObject, iOptInt, aVar);
        return new com.onesignal.notifications.internal.d(cVar, new com.onesignal.notifications.internal.e(strOptString, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        i.f(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean zIsGroupSummary = isGroupSummary(statusBarNotification);
            boolean z6 = notification.getGroup() == null || i.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!zIsGroupSummary && z6) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        i.f(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            i.e(activeNotifications, "getNotificationManager(c…text).activeNotifications");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(J5.f fVar) {
        String templateId;
        i.f(fVar, "notification");
        String templateName = fVar.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = fVar.getTemplateId()) == null || templateId.length() != 0)) {
            return fVar.getTemplateName() + " - " + fVar.getTemplateId();
        }
        if (fVar.getTitle() == null) {
            return "";
        }
        String title = fVar.getTitle();
        i.c(title);
        String title2 = fVar.getTitle();
        i.c(title2);
        String strSubstring = title.substring(0, Math.min(10, title2.length()));
        i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) throws JSONException {
        i.f(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        i.f(context, "context");
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i10++;
            }
        }
        return i10;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", null);
            }
            com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
            return null;
        } catch (JSONException unused) {
            com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
    }

    public final NotificationManager getNotificationManager(Context context) {
        i.f(context, "context");
        Object systemService = context.getSystemService("notification");
        i.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        i.f(context, "context");
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (AndroidUtils.INSTANCE.isValidResourceName(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + '/' + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + '/' + identifier2);
    }

    public final boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        i.f(statusBarNotification, "notif");
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject jSONObject) {
        JSONArray jSONArray;
        i.f(jSONObject, "fcmBundle");
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            if (objOpt instanceof String) {
                jSONArray = new JSONArray((String) objOpt);
            } else {
                i.d(objOpt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) objOpt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
