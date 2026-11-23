package com.onesignal.notifications.internal.registration.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onesignal.common.AndroidUtils;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0073a Companion = new C0073a(null);
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private final X4.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p025c5.c _deviceService;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.registration.impl.a$a, reason: collision with other inner class name */
    public static final class C0073a {
        public /* synthetic */ C0073a(p210v8.e eVar) {
            this();
        }

        private C0073a() {
        }
    }

    public static final class b extends p144o8.g implements p200u8.c {
        int label;

        public b(p123m8.d<? super b> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        public static final void m41invokeSuspend$lambda1(a aVar, DialogInterface dialogInterface, int i10) {
            ((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).setUserRejectedGMSUpdate(true);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            Activity current = a.this._applicationService.getCurrent();
            m mVar = m.a;
            if (current == null) {
                return mVar;
            }
            AndroidUtils androidUtils = AndroidUtils.INSTANCE;
            String resourceString = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String resourceString2 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_update", "Update");
            String resourceString3 = androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(current).setMessage(resourceString).setPositiveButton(resourceString2, new J4.g(1, current, a.this)).setNegativeButton(resourceString3, new J4.f(a.this, 1)).setNeutralButton(androidUtils.getResourceString(current, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
            return mVar;
        }
    }

    public a(X4.f fVar, p025c5.c cVar, com.onesignal.core.internal.config.b bVar) {
        i.f(fVar, "_applicationService");
        i.f(cVar, "_deviceService");
        i.f(bVar, "_configModelStore");
        this._applicationService = fVar;
        this._deviceService = cVar;
        this._configModelStore = bVar;
    }

    public static final /* synthetic */ void access$openPlayStoreToApp(a aVar, Activity activity) {
        aVar.openPlayStoreToApp(activity);
    }

    private final boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager packageManager = this._applicationService.getAppContext().getPackageManager();
            CharSequence charSequenceLoadLabel = packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager);
            i.d(charSequenceLoadLabel, "null cannot be cast to non-null type kotlin.String");
            return !((String) charSequenceLoadLabel).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPlayStoreToApp(Activity activity) {
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f7832d;
            i.e(googleApiAvailability, "getInstance()");
            PendingIntent activity2 = null;
            Intent intentA = googleApiAvailability.a(googleApiAvailability.b(this._applicationService.getAppContext(), GoogleApiAvailabilityLight.a), activity, null);
            if (intentA != null) {
                activity2 = PendingIntent.getActivity(activity, PLAY_SERVICES_RESOLUTION_REQUEST, intentA, 201326592);
            }
            if (activity2 != null) {
                activity2.send();
            }
        } catch (PendingIntent.CanceledException e10) {
            e10.printStackTrace();
        }
    }

    public final Object showUpdateGPSDialog(p123m8.d<? super m> dVar) throws Throwable {
        boolean zIsAndroidDeviceType = this._deviceService.isAndroidDeviceType();
        m mVar = m.a;
        if (zIsAndroidDeviceType && isGooglePlayStoreInstalled() && !((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getDisableGMSMissingPrompt() && !((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUserRejectedGMSUpdate()) {
            U9.d dVar2 = I.a;
            Object objW = AbstractC0342z.w(n.a, new b(null), dVar);
            if (objW == p134n8.a.f13404s) {
                return objW;
            }
        }
        return mVar;
    }
}
