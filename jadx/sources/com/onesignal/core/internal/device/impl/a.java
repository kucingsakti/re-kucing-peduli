package com.onesignal.core.internal.device.impl;

import X4.f;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.common.AndroidUtils;
import java.lang.reflect.InvocationTargetException;
import p025c5.c;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    public static final C0028a Companion = new C0028a(null);
    private static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    private final f _applicationService;

    /* JADX INFO: renamed from: com.onesignal.core.internal.device.impl.a$a, reason: collision with other inner class name */
    public static final class C0028a {
        public /* synthetic */ C0028a(e eVar) {
            this();
        }

        private C0028a() {
        }
    }

    public a(f fVar) {
        i.f(fVar, "_applicationService");
        this._applicationService = fVar;
    }

    private final boolean hasHMSAGConnectLibrary() {
        try {
            Class.forName("com.huawei.agconnect.config.AGConnectServicesConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSAvailabilityLibrary() {
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean hasHMSPushKitLibrary() {
        try {
            Class.forName("com.huawei.hms.aaid.HmsInstanceId");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final boolean isHMSCoreInstalledAndEnabled() throws IllegalAccessException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.huawei.hms.api.HuaweiApiAvailability");
            Object objInvoke = cls.getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this._applicationService.getAppContext());
            i.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (ClassNotFoundException unused) {
        }
    }

    private final boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    private final boolean packageInstalledAndEnabled(String str) {
        try {
            return this._applicationService.getAppContext().getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final boolean supportsADM() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // p025c5.c
    public p025c5.a getDeviceType() {
        if (supportsADM()) {
            return p025c5.a.Fire;
        }
        boolean supportsHMS = getSupportsHMS();
        boolean zSupportsGooglePush = supportsGooglePush();
        if (zSupportsGooglePush && supportsHMS) {
            return AndroidUtils.INSTANCE.getManifestMetaBoolean(this._applicationService.getAppContext(), PREFER_HMS_METADATA_NAME) ? p025c5.a.Huawei : p025c5.a.Android;
        }
        if (zSupportsGooglePush) {
            return p025c5.a.Android;
        }
        if (supportsHMS) {
            return p025c5.a.Huawei;
        }
        if (isGMSInstalledAndEnabled()) {
            return p025c5.a.Android;
        }
        return isHMSCoreInstalledAndEnabledFallback() ? p025c5.a.Huawei : p025c5.a.Android;
    }

    @Override // p025c5.c
    public boolean getHasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    @Override // p025c5.c
    public boolean getHasFCMLibrary() {
        try {
            p081i3.b bVar = FirebaseMessaging.f9984k;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // p025c5.c
    public p025c5.b getJetpackLibraryStatus() {
        return !AndroidUtils.INSTANCE.hasNotificationManagerCompat() ? p025c5.b.MISSING : p025c5.b.OK;
    }

    @Override // p025c5.c
    public boolean getSupportsHMS() {
        if (hasHMSAvailabilityLibrary() && getHasAllHMSLibrariesForPushKit()) {
            return isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    @Override // p025c5.c
    public boolean isAndroidDeviceType() {
        return getDeviceType() == p025c5.a.Android;
    }

    @Override // p025c5.c
    public boolean isFireOSDeviceType() {
        return getDeviceType() == p025c5.a.Fire;
    }

    @Override // p025c5.c
    public boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled(GOOGLE_PLAY_SERVICES_PACKAGE);
    }

    @Override // p025c5.c
    public boolean isHuaweiDeviceType() {
        return getDeviceType() == p025c5.a.Huawei;
    }

    @Override // p025c5.c
    public boolean supportsGooglePush() {
        if (getHasFCMLibrary()) {
            return isGMSInstalledAndEnabled();
        }
        return false;
    }
}
