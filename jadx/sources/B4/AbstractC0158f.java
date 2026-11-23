package B4;

import I.AbstractC0245i;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import com.kcstream.cing.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: B4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0158f {
    public static final String[] a = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Toast f673c;

    public static int a(File file) {
        Log.i("Info", "dir:" + file.getAbsolutePath());
        int i10 = 0;
        if (file.isDirectory()) {
            try {
                int iA = 0;
                for (File file2 : file.listFiles()) {
                    try {
                        if (file2.isDirectory()) {
                            iA += a(file2);
                        }
                        if (file2.lastModified() < new Date().getTime() - (((long) 0) * 86400000)) {
                            Log.i("AgentWebUtils", "file name:" + file2.getName());
                            if (file2.delete()) {
                                iA++;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        i10 = iA;
                        e.getMessage();
                        return i10;
                    }
                }
                return iA;
            } catch (Exception e11) {
                e = e11;
            }
        }
        return i10;
    }

    public static void b(Activity activity, WebView webView) {
        try {
            String str = AbstractC0162j.a;
            CookieManager.getInstance().removeAllCookies(new C0161i(0));
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC0160h(0));
            webView.getSettings().setCacheMode(2);
            activity.deleteDatabase("webviewCache.db");
            activity.deleteDatabase("webview.db");
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            a(new File(AbstractC0162j.a(activity)));
        } catch (Exception unused) {
            String str2 = AbstractC0162j.a;
        }
    }

    public static AbstractC0153a c(WebView webView) {
        if (!(webView.getParent() instanceof ViewGroup)) {
            throw new IllegalStateException("please check webcreator's create method was be called ?");
        }
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        while (viewGroup != null) {
            viewGroup.toString();
            String str = AbstractC0162j.a;
            if (viewGroup.getId() == R.id.web_parent_layout_id) {
                return ((P) viewGroup).f652s;
            }
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        throw new IllegalStateException("please check webcreator's create method was be called ?");
    }

    public static List d(Activity activity, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!e(activity, strArr[i10])) {
                arrayList.add(strArr[i10]);
            }
        }
        return arrayList;
    }

    public static boolean e(Context context, String... strArr) {
        for (String str : Arrays.asList(strArr)) {
            if (J.f.a(context, str) == -1) {
                return false;
            }
            String strD = AbstractC0245i.d(str);
            if (!TextUtils.isEmpty(strD)) {
                if (AbstractC0245i.b((AppOpsManager) AbstractC0245i.a(context, AppOpsManager.class), strD, context.getPackageName()) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(Activity activity, WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, String str, C0163k c0163k) {
        try {
            Object objInvoke = C4.a.class.getDeclaredMethod("newBuilder", Activity.class, WebView.class).invoke(null, activity, webView);
            Class<?> cls = objInvoke.getClass();
            if (valueCallback != null) {
                Method declaredMethod = cls.getDeclaredMethod("setUriValueCallbacks", ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(objInvoke, valueCallback);
            }
            if (fileChooserParams != null) {
                Method declaredMethod2 = cls.getDeclaredMethod("setFileChooserParams", WebChromeClient.FileChooserParams.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objInvoke, fileChooserParams);
            }
            if (!TextUtils.isEmpty(str)) {
                Method declaredMethod3 = cls.getDeclaredMethod("setAcceptType", String.class);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(objInvoke, str);
            }
            if (c0163k != null) {
                Method declaredMethod4 = cls.getDeclaredMethod("setJsChannelCallback", Handler.Callback.class);
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(objInvoke, c0163k);
            }
            Method declaredMethod5 = cls.getDeclaredMethod("setPermissionInterceptor", AbstractC0158f.class);
            declaredMethod5.setAccessible(true);
            declaredMethod5.invoke(objInvoke, null);
            Method declaredMethod6 = cls.getDeclaredMethod("build", new Class[0]);
            declaredMethod6.setAccessible(true);
            Object objInvoke2 = declaredMethod6.invoke(objInvoke, new Object[0]);
            Method declaredMethod7 = objInvoke2.getClass().getDeclaredMethod("openFileChooser", new Class[0]);
            declaredMethod7.setAccessible(true);
            declaredMethod7.invoke(objInvoke2, new Object[0]);
            return true;
        } catch (Throwable th) {
            String str2 = AbstractC0162j.a;
            boolean z6 = th instanceof ClassNotFoundException;
            return valueCallback == null;
        }
    }
}
