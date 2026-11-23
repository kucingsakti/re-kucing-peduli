package com.google.android.gms.common;

import I.C0249m;
import I.q;
import I.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import p078i.AbstractActivityC0655l;
import p156q0.M;
import p188t1.AbstractC0856t;
import p233y2.a;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7831c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GoogleApiAvailability f7832d = new GoogleApiAvailability();

    public static AlertDialog d(Activity activity, int i10, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zac.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(com.kcstream.cing.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.kcstream.cing.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.kcstream.cing.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, zagVar);
        }
        String strC = zac.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", AbstractC0487g.g(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0655l) {
                M m2 = ((AbstractActivityC0655l) activity).m();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                Preconditions.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.f7844J0 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.f7845K0 = onCancelListener;
                }
                supportErrorDialogFragment.n0(m2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        errorDialogFragment.f7825s = alertDialog;
        if (onCancelListener != null) {
            errorDialogFragment.f7826t = onCancelListener;
        }
        errorDialogFragment.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i10, new a(super.a(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        e(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", E0.a.g("GMS core API Availability. ConnectionResult=", i10, ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new p205v2.a(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? zac.e(context, "common_google_play_services_resolution_required_title") : zac.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.kcstream.cing.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? zac.d(context, "common_google_play_services_resolution_required_text", zac.a(context)) : zac.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Preconditions.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s sVar = new s(context, null);
        sVar.f2000r = true;
        sVar.e(16, true);
        sVar.f1988e = s.c(strE);
        q qVar = new q(0);
        qVar.f1983f = s.c(strD);
        sVar.i(qVar);
        if (DeviceProperties.a(context)) {
            sVar.f2008z.icon = context.getApplicationInfo().icon;
            sVar.j = 2;
            if (DeviceProperties.b(context)) {
                sVar.f1985b.add(new C0249m(com.kcstream.cing.R.drawable.common_full_open_on_phone, resources.getString(com.kcstream.cing.R.string.common_open_on_phone), pendingIntent));
            } else {
                sVar.f1990g = pendingIntent;
            }
        } else {
            sVar.f2008z.icon = android.R.drawable.stat_sys_warning;
            sVar.f2008z.tickerText = s.c(resources.getString(com.kcstream.cing.R.string.common_google_play_services_notification_ticker));
            sVar.f2008z.when = System.currentTimeMillis();
            sVar.f1990g = pendingIntent;
            sVar.f1989f = s.c(strD);
        }
        if (PlatformVersion.a()) {
            Preconditions.l(PlatformVersion.a());
            synchronized (f7831c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.kcstream.cing.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC0856t.b(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            sVar.f2004v = "com.google.android.gms.availability";
        }
        Notification notificationB = sVar.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            GooglePlayServicesUtilLight.a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    public final void g(Activity activity, LifecycleFragment lifecycleFragment, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i10, new a(super.a(i10, activity, "d"), lifecycleFragment, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        e(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
