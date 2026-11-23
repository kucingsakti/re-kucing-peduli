package com.onesignal.notifications.internal.display.impl;

import I.s;
import J5.p;
import J5.q;
import L9.n;
import X4.f;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.RemoteViews;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.exceptions.MainThreadException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Arrays;
import org.json.JSONObject;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements W5.b {
    private final f _applicationService;
    private final W5.a _notificationDisplayBuilder;
    private final Z5.b _notificationLimitManager;
    private final W5.c _summaryNotificationDisplayer;

    public static final class a extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f fVar, Z5.b bVar, W5.c cVar, W5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_notificationLimitManager");
        i.f(cVar, "_summaryNotificationDisplayer");
        i.f(aVar, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._notificationLimitManager = bVar;
        this._summaryNotificationDisplayer = cVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final void addBackgroundImage(JSONObject jSONObject, s sVar) throws Throwable {
        Bitmap bitmapFromAssetsOrResourceName;
        JSONObject jSONObject2;
        String string;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            com.onesignal.debug.internal.logging.b.verbose$default("Cannot use background images in notifications for device on version: " + i10, null, 2, null);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            JSONObject jSONObject3 = new JSONObject(strOptString);
            bitmapFromAssetsOrResourceName = getBitmap(jSONObject3.optString("img", null));
            jSONObject2 = jSONObject3;
        } else {
            bitmapFromAssetsOrResourceName = null;
            jSONObject2 = null;
        }
        if (bitmapFromAssetsOrResourceName == null) {
            bitmapFromAssetsOrResourceName = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmapFromAssetsOrResourceName != null) {
            Context currentContext = getCurrentContext();
            i.c(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            int i11 = p.os_bgimage_notif_title;
            remoteViews.setTextViewText(i11, this._notificationDisplayBuilder.getTitle(jSONObject));
            int i12 = p.os_bgimage_notif_body;
            remoteViews.setTextViewText(i12, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, i11, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, i12, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                i.c(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    i.c(contextResources2);
                    string = contextResources2.getString(identifier);
                } else {
                    string = null;
                }
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                int i13 = p.os_bgimage_notif_bgimage_right_aligned;
                remoteViews.setImageViewBitmap(i13, bitmapFromAssetsOrResourceName);
                remoteViews.setViewVisibility(i13, 0);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage, bitmapFromAssetsOrResourceName);
            }
            i.c(sVar);
            sVar.f2008z.contentView = remoteViews;
            sVar.i(null);
        }
    }

    private final void applyNotificationExtender(U5.d dVar, s sVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = s.class.getDeclaredField("z");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(sVar);
                i.d(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                i.c(sVar);
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                i.c(notification2);
                notification2.getNotificationExtender();
                i.c(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(s sVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString());
        i.e(intentPutExtra, "intentGenerator.getNewBa…TA, gcmBundle.toString())");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(iNextInt, intentPutExtra);
        i.c(sVar);
        sVar.f1990g = newActionPendingIntent;
        sVar.f2008z.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i10));
        Notification notificationB = sVar.b();
        i.e(notificationB, "notifBuilder.build()");
        return notificationB;
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

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        Integer numSafeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (numSafeGetColorFromHex != null) {
            remoteViews.setTextColor(i10, numSafeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        i.c(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i10, J.b.a(getCurrentContext(), identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0170, code lost:
    
        if (r5.createGrouplessSummaryNotification(r5, r12, r7, r8, r9) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        r4 = r0;
        r5 = r2;
        r3 = r10;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a0, code lost:
    
        if (r4.createSummaryNotification(r5, r0, r6, r9) == r3) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showNotification(U5.d r24, p123m8.d<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.display.impl.c.showNotification(U5.d, m8.d):java.lang.Object");
    }

    @Override // W5.b
    public Object displayNotification(U5.d dVar, p123m8.d<? super Boolean> dVar2) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, dVar2);
    }

    public final m isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new MainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
        return m.a;
    }
}
