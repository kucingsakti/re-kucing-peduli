package com.onesignal.core.activities;

import I.AbstractC0241e;
import O3.z;
import P4.d;
import R5.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import kotlin.Metadata;
import p083i5.e;
import p093j5.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/onesignal/core/activities/PermissionsActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "extras", "Lh8/m;", "handleBundleParams", "(Landroid/os/Bundle;)V", "reregisterCallbackHandlers", "", "androidPermissionString", "requestPermission", "(Ljava/lang/String;)V", "permission", "", "shouldShowSettings", "(Ljava/lang/String;)Z", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/onesignal/core/internal/permissions/impl/a;", "requestPermissionService", "Lcom/onesignal/core/internal/permissions/impl/a;", "Lj5/b;", "preferenceService", "Lj5/b;", "permissionRequestType", "Ljava/lang/String;", "Companion", a.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PermissionsActivity extends Activity {
    public static final int DELAY_TIME_CALLBACK_CALL = 500;
    public static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    public static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    public static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    public static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private String permissionRequestType;
    private b preferenceService;
    private com.onesignal.core.internal.permissions.impl.a requestPermissionService;

    private final void handleBundleParams(Bundle extras) {
        reregisterCallbackHandlers(extras);
        i.c(extras);
        this.permissionRequestType = extras.getString(INTENT_EXTRA_PERMISSION_TYPE);
        String string = extras.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        i.c(string);
        requestPermission(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onRequestPermissionsResult$lambda-0, reason: not valid java name */
    public static final void m9onRequestPermissionsResult$lambda0(PermissionsActivity permissionsActivity, String[] strArr, int[] iArr) {
        i.f(permissionsActivity, "this$0");
        i.f(strArr, "$permissions");
        i.f(iArr, "$grantResults");
        com.onesignal.core.internal.permissions.impl.a aVar = permissionsActivity.requestPermissionService;
        i.c(aVar);
        String str = permissionsActivity.permissionRequestType;
        i.c(str);
        e callback = aVar.getCallback(str);
        if (callback == null) {
            throw new RuntimeException("Missing handler for permissionRequestType: " + permissionsActivity.permissionRequestType);
        }
        if (strArr.length == 0) {
            callback.onReject(false);
            return;
        }
        String str2 = strArr[0];
        if (iArr.length <= 0 || iArr[0] != 0) {
            callback.onReject(permissionsActivity.shouldShowSettings(str2));
            return;
        }
        callback.onAccept();
        b bVar = permissionsActivity.preferenceService;
        i.c(bVar);
        bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + str2, Boolean.TRUE);
    }

    private final void requestPermission(String androidPermissionString) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        i.c(aVar);
        if (aVar.getWaiting()) {
            return;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        i.c(aVar2);
        aVar2.setWaiting(true);
        com.onesignal.core.internal.permissions.impl.a aVar3 = this.requestPermissionService;
        i.c(aVar3);
        aVar3.setShouldShowRequestPermissionRationaleBeforeRequest(AbstractC0241e.g(this, androidPermissionString));
        AbstractC0241e.f(this, new String[]{androidPermissionString}, 2);
    }

    private final void reregisterCallbackHandlers(Bundle extras) {
        i.c(extras);
        String string = extras.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(E0.a.h("Could not find callback class for PermissionActivity: ", string));
        }
    }

    private final boolean shouldShowSettings(String permission) {
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        i.c(aVar);
        if (!aVar.getFallbackToSettings()) {
            return false;
        }
        com.onesignal.core.internal.permissions.impl.a aVar2 = this.requestPermissionService;
        i.c(aVar2);
        if (aVar2.getShouldShowRequestPermissionRationaleBeforeRequest() && !AbstractC0241e.g(this, permission)) {
            b bVar = this.preferenceService;
            i.c(bVar);
            bVar.saveBool("OneSignal", "USER_RESOLVED_PERMISSION_" + permission, Boolean.TRUE);
            return false;
        }
        b bVar2 = this.preferenceService;
        i.c(bVar2);
        Boolean bool = bVar2.getBool("OneSignal", "USER_RESOLVED_PERMISSION_" + permission, Boolean.FALSE);
        i.c(bool);
        return bool.booleanValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (d.b(this)) {
            this.requestPermissionService = (com.onesignal.core.internal.permissions.impl.a) d.a().getService(com.onesignal.core.internal.permissions.impl.a.class);
            this.preferenceService = (b) d.a().getService(b.class);
            handleBundleParams(getIntent().getExtras());
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i.f(intent, "intent");
        super.onNewIntent(intent);
        handleBundleParams(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        i.f(permissions, "permissions");
        i.f(grantResults, "grantResults");
        com.onesignal.core.internal.permissions.impl.a aVar = this.requestPermissionService;
        i.c(aVar);
        aVar.setWaiting(false);
        if (requestCode == 2) {
            new Handler().postDelayed(new z(this, permissions, grantResults, 1), 500L);
        }
        finish();
        overridePendingTransition(V4.a.onesignal_fade_in, V4.a.onesignal_fade_out);
    }
}
