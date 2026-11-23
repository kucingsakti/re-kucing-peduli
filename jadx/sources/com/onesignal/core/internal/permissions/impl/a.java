package com.onesignal.core.internal.permissions.impl;

import X4.d;
import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.HashMap;
import p083i5.e;
import p083i5.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {
    private final X4.f _application;
    private final HashMap<String, e> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    /* JADX INFO: renamed from: com.onesignal.core.internal.permissions.impl.a$a, reason: collision with other inner class name */
    public static final class C0031a implements d {
        final /* synthetic */ String $androidPermissionString;
        final /* synthetic */ Class<?> $callbackClass;
        final /* synthetic */ String $permissionRequestType;

        public C0031a(String str, String str2, Class<?> cls) {
            this.$permissionRequestType = str;
            this.$androidPermissionString = str2;
            this.$callbackClass = cls;
        }

        @Override // X4.d
        public void onActivityAvailable(Activity activity) {
            i.f(activity, "activity");
            if (activity.getClass().equals(PermissionsActivity.class)) {
                a.this._application.removeActivityLifecycleHandler(this);
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, this.$permissionRequestType).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, this.$androidPermissionString).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, this.$callbackClass.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(V4.a.onesignal_fade_in, V4.a.onesignal_fade_out);
        }

        @Override // X4.d
        public void onActivityStopped(Activity activity) {
            i.f(activity, "activity");
        }
    }

    public a(X4.f fVar) {
        i.f(fVar, "_application");
        this._application = fVar;
        this.callbackMap = new HashMap<>();
    }

    public final e getCallback(String str) {
        i.f(str, "permissionType");
        return this.callbackMap.get(str);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    @Override // p083i5.f
    public void registerAsCallback(String str, e eVar) {
        i.f(str, "permissionType");
        i.f(eVar, "callback");
        this.callbackMap.put(str, eVar);
    }

    public final void setFallbackToSettings(boolean z6) {
        this.fallbackToSettings = z6;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z6) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z6;
    }

    public final void setWaiting(boolean z6) {
        this.waiting = z6;
    }

    @Override // p083i5.f
    public void startPrompt(boolean z6, String str, String str2, Class<?> cls) {
        i.f(cls, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z6;
        this._application.addActivityLifecycleHandler(new C0031a(str, str2, cls));
    }
}
