package com.onesignal.notifications.internal.display.impl;

import I.C0249m;
import I.p;
import I.q;
import I.s;
import L9.n;
import U5.e;
import X4.f;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements W5.a {
    private final f _applicationService;
    private final S5.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class a {
        private s compatBuilder;
        private boolean hasLargeIcon;

        public final s getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(s sVar) {
            this.compatBuilder = sVar;
        }

        public final void setHasLargeIcon(boolean z6) {
            this.hasLargeIcon = z6;
        }
    }

    public b(f fVar, S5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_notificationChannelManager");
        this._applicationService = fVar;
        this._notificationChannelManager = aVar;
        this.notificationDismissedClass = NotificationDismissReceiver.class;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            i.c(resourceString);
            list.add(resourceString);
            list2.add(R5.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(U5.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(R5.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(R5.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i10);
                    String strOptString = jSONObject4.optString("text");
                    i.e(strOptString, "button.optString(\"text\")");
                    list.add(strOptString);
                    String strOptString2 = jSONObject4.optString("id");
                    i.e(strOptString2, "button.optString(\"id\")");
                    list2.add(strOptString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i10) {
        if (i10 > 9) {
            return 2;
        }
        if (i10 > 7) {
            return 1;
        }
        if (i10 > 4) {
            return 0;
        }
        return i10 > 2 ? -1 : -2;
    }

    private final BigInteger getAccentColor(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(this._applicationService.getAppContext(), "onesignal_notification_accent_color", null);
            if (resourceString != null) {
                return new BigInteger(resourceString, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(this._applicationService.getAppContext(), "com.onesignal.NotificationAccentColor.DEFAULT");
            if (manifestMeta != null) {
                return new BigInteger(manifestMeta, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = i.h(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        return (n.I(string, "http://", false) || n.I(string, "https://", false)) ? getBitmapFromURL(string) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmapDecodeStream;
        try {
            Context currentContext = getCurrentContext();
            i.c(currentContext);
            bitmapDecodeStream = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    i.c(currentContext2);
                    bitmapDecodeStream = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        i.c(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = i.h(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(string)) {
            return 0;
        }
        int drawableId = getDrawableId(string);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", null));
        return resourceIcon != 0 ? resourceIcon : getDefaultSmallIconId();
    }

    private final boolean isSoundEnabled(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("sound", null);
        return ("null".equals(strOptString) || "nil".equals(strOptString)) ? false : true;
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            i.c(contextResources);
            int dimension = (int) contextResources.getDimension(V4.b.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            i.c(contextResources2);
            int dimension2 = (int) contextResources2.getDimension(V4.b.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private final void setAlertnessOptions(JSONObject jSONObject, s sVar) {
        int iConvertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        sVar.j = iConvertOSToAndroidPriority;
        if (iConvertOSToAndroidPriority < 0) {
            return;
        }
        int i10 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int iIntValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = sVar.f2008z;
                notification.ledARGB = iIntValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i10 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] vibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (vibrationPattern != null) {
                    sVar.f2008z.vibrate = vibrationPattern;
                }
            } else {
                i10 |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            i.c(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                sVar.h(soundUri);
            } else {
                i10 |= 1;
            }
        }
        sVar.d(i10);
    }

    @Override // W5.a
    public void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, s sVar, int i10, String str) {
        int resourceIcon;
        i.f(jSONObject, "fcmJson");
        i.f(aVar, "intentGenerator");
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(U5.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has(R5.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(R5.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = aVar.getNewBaseIntent(i10);
                        newBaseIntent.setAction("" + i11);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(i10, newBaseIntent);
                        if (jSONObjectOptJSONObject.has("icon")) {
                            try {
                                resourceIcon = getResourceIcon(jSONObjectOptJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            resourceIcon = 0;
                        }
                        i.c(sVar);
                        sVar.f1985b.add(new C0249m(resourceIcon, jSONObjectOptJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // W5.a
    public void addXiaomiSettings(a aVar, Notification notification) {
        i.f(notification, "notification");
        i.c(aVar);
        if (aVar.getHasLargeIcon()) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // W5.a
    public a getBaseOneSignalNotificationBuilder(U5.d dVar) {
        int i10;
        i.f(dVar, "notificationJob");
        JSONObject jsonPayload = dVar.getJsonPayload();
        i.c(jsonPayload);
        a aVar = new a();
        s sVar = new s(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(dVar));
        String strOptString = jsonPayload.optString("alert", null);
        sVar.e(16, true);
        sVar.f2008z.icon = getSmallIconId(jsonPayload);
        q qVar = new q(0);
        qVar.f1983f = s.c(strOptString);
        sVar.i(qVar);
        sVar.f1989f = s.c(strOptString);
        sVar.f2008z.tickerText = s.c(strOptString);
        if (Build.VERSION.SDK_INT < 24 || !i.a(jsonPayload.optString("title"), "")) {
            sVar.f1988e = s.c(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                sVar.f2002t = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String strOptString2 = jsonPayload.optString("vis");
                i.e(strOptString2, "fcmJson.optString(\"vis\")");
                i10 = Integer.parseInt(strOptString2);
            } else {
                i10 = 1;
            }
            sVar.f2003u = i10;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            sVar.f(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            p pVar = new p();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f6342b = bitmap;
            pVar.f1979e = iconCompat;
            pVar.f2010c = s.c(strOptString);
            pVar.f2011d = true;
            sVar.i(pVar);
        }
        if (dVar.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = dVar.getShownTimeStamp();
                i.c(shownTimeStamp);
                sVar.f2008z.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, sVar);
        aVar.setCompatBuilder(sVar);
        return aVar;
    }

    @Override // W5.a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // W5.a
    public int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        return drawableId3 != 0 ? drawableId3 : R.drawable.ic_popup_reminder;
    }

    @Override // W5.a
    public int getGroupAlertBehavior() {
        return Build.VERSION.SDK_INT >= 24 ? 2 : 1;
    }

    @Override // W5.a
    public Intent getNewBaseDismissIntent(int i10) {
        Intent intentPutExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
        i.e(intentPutExtra, "Intent(currentContext, n…tExtra(\"dismissed\", true)");
        return intentPutExtra;
    }

    @Override // W5.a
    public PendingIntent getNewDismissActionPendingIntent(int i10, Intent intent) {
        i.f(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i10, intent, 201326592);
        i.e(broadcast, "getBroadcast(\n          …FLAG_IMMUTABLE,\n        )");
        return broadcast;
    }

    @Override // W5.a
    public CharSequence getTitle(JSONObject jSONObject) {
        i.f(jSONObject, "fcmJson");
        String strOptString = jSONObject.optString("title", null);
        if (strOptString != null) {
            return strOptString;
        }
        Context currentContext = getCurrentContext();
        i.c(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        i.c(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        i.e(applicationLabel, "currentContext!!.package…cationInfo,\n            )");
        return applicationLabel;
    }

    @Override // W5.a
    public void removeNotifyOptions(s sVar) {
        i.c(sVar);
        sVar.e(8, true);
        sVar.d(0);
        sVar.h(null);
        Notification notification = sVar.f2008z;
        notification.vibrate = null;
        notification.tickerText = s.c(null);
    }
}
