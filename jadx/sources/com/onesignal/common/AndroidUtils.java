package com.onesignal.common;

import L9.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001LB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010\rJ\u0015\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u0004\u0018\u00010\t2\u0006\u0010+\u001a\u00020'¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000b¢\u0006\u0004\b2\u0010/J\u001d\u00106\u001a\u0002052\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\t¢\u0006\u0004\b6\u00107J\u001d\u00106\u001a\u0002052\u0006\u00103\u001a\u00020\u00152\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\u0015\u0010<\u001a\u00020;2\u0006\u00109\u001a\u000208¢\u0006\u0004\b<\u0010=J%\u0010B\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\b\u0012\u0004\u0012\u00020\t0D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0D2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bF\u0010GJ\u001b\u0010J\u001a\u00020\u000b2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030HH\u0007¢\u0006\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/onesignal/common/AndroidUtils;", "", "<init>", "()V", "", "minDelay", "maxDelay", "getRandomDelay", "(II)I", "", "body", "", "isStringNotEmpty", "(Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "isActivityFullyReady", "(Landroid/app/Activity;)Z", "configChangeFlag", "hasConfigChangeFlag", "(Landroid/app/Activity;I)Z", "Landroid/content/Context;", "context", "getAppVersion", "(Landroid/content/Context;)Ljava/lang/String;", "metaName", "getManifestMeta", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "getManifestMetaBoolean", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/os/Bundle;", "getManifestMetaBundle", "(Landroid/content/Context;)Landroid/os/Bundle;", "key", "defaultStr", "getResourceString", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", MediationMetaData.KEY_NAME, "isValidResourceName", "", "subjectThrowable", "getRootCauseThrowable", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "throwable", "getRootCauseMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "isRunningOnMainThread", "()Z", "getTargetSdkVersion", "(Landroid/content/Context;)I", "hasNotificationManagerCompat", "appContext", "url", "Lh8/m;", "openURLInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "(Landroid/content/Context;Landroid/net/Uri;)V", "Landroid/content/Intent;", "openURLInBrowserIntent", "(Landroid/net/Uri;)Landroid/content/Intent;", "permission", "isUserGranted", "LX4/f;", "applicationService", "hasPermission", "(Ljava/lang/String;ZLX4/f;)Z", "", "permissions", "filterManifestPermissions", "(Ljava/util/List;LX4/f;)Ljava/util/List;", "Ljava/lang/Class;", "_class", "opaqueHasClass", "(Ljava/lang/Class;)Z", R5.a.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    public enum a {
        DATA(JsonStorageKeyNames.DATA_KEY),
        HTTPS("https"),
        HTTP("http");

        public static final C0010a Companion = new C0010a(null);
        private final String text;

        /* JADX INFO: renamed from: com.onesignal.common.AndroidUtils$a$a, reason: collision with other inner class name */
        public static final class C0010a {
            public /* synthetic */ C0010a(p210v8.e eVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (n.C(aVar.text, str, true)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0010a() {
            }
        }

        a(String str) {
            this.text = str;
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> permissions, X4.f applicationService) throws PackageManager.NameNotFoundException {
        p210v8.i.f(permissions, "permissions");
        p210v8.i.f(applicationService, "applicationService");
        PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
        p210v8.i.e(packageInfo, "applicationService.appCo…eManager.GET_PERMISSIONS)");
        String[] strArr = packageInfo.requestedPermissions;
        p210v8.i.e(strArr, "packageInfo.requestedPermissions");
        List listC = p086i8.l.C(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (listC.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getAppVersion(Context context) {
        Integer numValueOf;
        p210v8.i.f(context, "context");
        try {
            numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String metaName) {
        p210v8.i.f(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(metaName);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String metaName) {
        p210v8.i.f(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(metaName);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        p210v8.i.f(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            p210v8.i.e(applicationInfo, "context.packageManager.g…A_DATA,\n                )");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            com.onesignal.debug.internal.logging.b.error("Manifest application info not found", e10);
            return null;
        }
    }

    public final int getRandomDelay(int minDelay, int maxDelay) {
        return new Random().nextInt((maxDelay + 1) - minDelay) + minDelay;
    }

    public final String getResourceString(Context context, String key, String defaultStr) {
        p210v8.i.f(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(key, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : defaultStr;
    }

    public final String getRootCauseMessage(Throwable throwable) {
        p210v8.i.f(throwable, "throwable");
        return getRootCauseThrowable(throwable).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable subjectThrowable) {
        p210v8.i.f(subjectThrowable, "subjectThrowable");
        while (subjectThrowable.getCause() != null && subjectThrowable.getCause() != subjectThrowable) {
            subjectThrowable = subjectThrowable.getCause();
            p210v8.i.c(subjectThrowable);
        }
        return subjectThrowable;
    }

    public final int getTargetSdkVersion(Context context) {
        p210v8.i.f(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            p210v8.i.e(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int configChangeFlag) {
        p210v8.i.f(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & configChangeFlag) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String permission, boolean isUserGranted, X4.f applicationService) {
        p210v8.i.f(permission, "permission");
        p210v8.i.f(applicationService, "applicationService");
        try {
            PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
            p210v8.i.e(packageInfo, "applicationService.appCo…NS,\n                    )");
            String[] strArr = packageInfo.requestedPermissions;
            p210v8.i.e(strArr, "packageInfo.requestedPermissions");
            if (p086i8.l.C(Arrays.copyOf(strArr, strArr.length)).contains(permission)) {
                return (isUserGranted && J.f.a(applicationService.getAppContext(), permission) == -1) ? false : true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        p210v8.i.f(activity, "activity");
        boolean z6 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        p210v8.i.e(decorView, "activity.window.decorView");
        return z6 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isRunningOnMainThread() {
        return p210v8.i.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String body) {
        return !TextUtils.isEmpty(body);
    }

    public final boolean isValidResourceName(String name) {
        if (name == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[0-9]");
        p210v8.i.e(patternCompile, "compile(...)");
        return !patternCompile.matcher(name).matches();
    }

    @Keep
    public final boolean opaqueHasClass(Class<?> _class) {
        p210v8.i.f(_class, "_class");
        return true;
    }

    public final void openURLInBrowser(Context appContext, Uri uri) {
        p210v8.i.f(appContext, "appContext");
        p210v8.i.f(uri, "uri");
        appContext.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        p210v8.i.f(uri, "uri");
        a aVarFromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (aVarFromString == null) {
            aVarFromString = a.HTTP;
            String string = uri.toString();
            p210v8.i.e(string, "uri.toString()");
            if (!L9.f.J(string, "://", false)) {
                uri = Uri.parse("http://" + uri);
                p210v8.i.e(uri, "parse(\"http://$uri\")");
            }
        }
        int i10 = com.onesignal.common.a.$EnumSwitchMapping$0[aVarFromString.ordinal()];
        if (i10 != 1) {
            intentMakeMainSelectorActivity = (i10 == 2 || i10 != 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            p210v8.i.e(intentMakeMainSelectorActivity, "makeMainSelectorActivity…ent.CATEGORY_APP_BROWSER)");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context appContext, String url) {
        p210v8.i.f(appContext, "appContext");
        p210v8.i.f(url, "url");
        int length = url.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = p210v8.i.h(url.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        Uri uri = Uri.parse(url.subSequence(i10, length + 1).toString());
        p210v8.i.e(uri, "parse(url.trim { it <= ' ' })");
        openURLInBrowser(appContext, uri);
    }
}
