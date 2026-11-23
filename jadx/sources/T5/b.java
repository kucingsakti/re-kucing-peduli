package T5;

import B1.h;
import L9.n;
import U5.d;
import X4.f;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements S5.a {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final a Companion = new a(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final f _applicationService;
    private final p043e5.a _languageContext;
    private final Pattern hexPattern;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public b(f fVar, p043e5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_languageContext");
        this._applicationService = fVar;
        this._languageContext = aVar;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        long[] vibrationPattern;
        Object objOpt = jSONObject.opt("chnl");
        if (objOpt instanceof String) {
            jSONObject2 = new JSONObject((String) objOpt);
        } else {
            i.d(objOpt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject2 = (JSONObject) objOpt;
        }
        String str = DEFAULT_CHANNEL_ID;
        String strOptString = jSONObject2.optString("id", DEFAULT_CHANNEL_ID);
        if (!i.a(strOptString, "miscellaneous")) {
            str = strOptString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject3.has(language)) {
                jSONObjectOptJSONObject = jSONObject3.optJSONObject(language);
            } else {
                jSONObjectOptJSONObject = jSONObject2;
            }
        } else {
            jSONObjectOptJSONObject = jSONObject2;
        }
        i.c(jSONObjectOptJSONObject);
        String strOptString2 = jSONObjectOptJSONObject.optString("nm", "Miscellaneous");
        int iPriorityToImportance = priorityToImportance(jSONObject.optInt("pri", 6));
        h.l();
        NotificationChannel notificationChannelE = T5.a.e(str, iPriorityToImportance, strOptString2);
        notificationChannelE.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
            String strOptString3 = jSONObject2.optString("grp_id");
            String strOptString4 = jSONObjectOptJSONObject.optString("grp_nm");
            i.e(strOptString4, "payloadWithText.optString(\"grp_nm\")");
            notificationManager.createNotificationChannelGroup(T5.a.f(strOptString3, strOptString4));
            notificationChannelE.setGroup(strOptString3);
        }
        if (jSONObject.has("ledc")) {
            String strOptString5 = jSONObject.optString("ledc");
            if (!this.hexPattern.matcher(strOptString5).matches()) {
                com.onesignal.debug.internal.logging.b.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                strOptString5 = "FFFFFFFF";
            }
            try {
                notificationChannelE.setLightColor(new BigInteger(strOptString5, 16).intValue());
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        notificationChannelE.enableLights(jSONObject.optInt("led", 1) == 1);
        if (jSONObject.has("vib_pt") && (vibrationPattern = U5.e.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
            notificationChannelE.setVibrationPattern(vibrationPattern);
        }
        notificationChannelE.enableVibration(jSONObject.optInt("vib", 1) == 1);
        if (jSONObject.has("sound")) {
            String strOptString6 = jSONObject.optString("sound", null);
            Uri soundUri = U5.e.INSTANCE.getSoundUri(context, strOptString6);
            if (soundUri != null) {
                notificationChannelE.setSound(soundUri, null);
            } else if ("null".equals(strOptString6) || "nil".equals(strOptString6)) {
                notificationChannelE.setSound(null, null);
            }
        }
        notificationChannelE.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannelE.setShowBadge(jSONObject.optInt("bdg", 1) == 1);
        notificationChannelE.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        com.onesignal.debug.internal.logging.b.verbose$default("Creating notification channel with channel:\n" + notificationChannelE, null, 2, null);
        try {
            notificationManager.createNotificationChannel(notificationChannelE);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        i.e(str, "channelId");
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        h.l();
        NotificationChannel notificationChannelY = T5.a.y();
        notificationChannelY.enableLights(true);
        notificationChannelY.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelY);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        h.l();
        notificationManager.createNotificationChannel(T5.a.c());
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i10) {
        if (i10 > 9) {
            return 5;
        }
        if (i10 > 7) {
            return 4;
        }
        if (i10 > 5) {
            return 3;
        }
        if (i10 > 3) {
            return 2;
        }
        return i10 > 1 ? 1 : 0;
    }

    @Override // S5.a
    public String createNotificationChannel(d dVar) {
        i.f(dVar, "notificationJob");
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = dVar.getJsonPayload();
        i.c(jsonPayload);
        NotificationManager notificationManager = U5.e.INSTANCE.getNotificationManager(appContext);
        if (dVar.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String strOptString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(strOptString) != null) {
                i.e(strOptString, "otherChannel");
                return strOptString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("Could not create notification channel due to JSON payload error!", e10);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @Override // S5.a
    public void processChannelList(JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = U5.e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                i.e(jSONObject, "list.getJSONObject(i)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("Could not create notification channel due to JSON payload error!", e10);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        List arrayList = new ArrayList();
        try {
            List notificationChannels = notificationManager.getNotificationChannels();
            i.e(notificationChannels, "notificationManager.notificationChannels");
            arrayList = notificationChannels;
        } catch (NullPointerException e11) {
            com.onesignal.debug.internal.logging.b.error$default("Error when trying to delete notification channel: " + e11.getMessage(), null, 2, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id = T5.a.d(it.next()).getId();
            i.e(id, "id");
            if (n.I(id, CHANNEL_PREFIX, false) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }
}
