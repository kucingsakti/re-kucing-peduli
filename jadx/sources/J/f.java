package J;

import I.AbstractC0245i;
import I.AbstractC0246j;
import I.J;
import K.k;
import K.l;
import K.o;
import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Object a = null;

    public static int a(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new J(context).a() ? 0 : -1;
    }

    public static int b(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strD = AbstractC0245i.d(str);
            if (strD != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = AbstractC0246j.c(context);
                    iC = AbstractC0246j.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = AbstractC0246j.a(appOpsManagerC, strD, iMyUid, AbstractC0246j.b(context));
                    }
                } else {
                    iC = AbstractC0245i.c((AppOpsManager) AbstractC0245i.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static ColorStateList c(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        l lVar = new l(resources, theme);
        synchronized (o.f2502c) {
            try {
                SparseArray sparseArray = (SparseArray) o.f2501b.get(lVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (kVar = (k) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (kVar.f2495b.equals(resources.getConfiguration())) {
                        if (theme != null || kVar.f2496c != 0) {
                            if (theme == null || kVar.f2496c != theme.hashCode()) {
                            }
                        }
                        colorStateList = kVar.a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = o.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = K.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return K.j.b(resources, i10, theme);
        }
        o.a(lVar, i10, colorStateListA, theme);
        return colorStateListA;
    }

    public static String d(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(E0.a.i("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        int i11 = i10 & 2;
        if (i11 == 0 && (i10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            e.a(context, broadcastReceiver, intentFilter, null, null, i10);
            return;
        }
        if (i12 >= 26) {
            d.a(context, broadcastReceiver, intentFilter, null, null, i10);
        } else if ((i10 & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, d(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }
}
