package X2;

import U.B0;
import U.n0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f5411e;

    public static String c(D3.g gVar) {
        gVar.a();
        D3.j jVar = gVar.f1050c;
        String str = jVar.f1066e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = jVar.f1063b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f5410d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f5410d;
    }

    public synchronized String b() {
        try {
            if (((String) this.f5411e) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f5411e;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f5409c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0070, B:35:0x0075, B:34:0x0073), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0070, B:35:0x0075, B:34:0x0073), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0070, B:35:0x0075, B:34:0x0073), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:13:0x0020, B:15:0x0026, B:17:0x0038, B:19:0x003e, B:24:0x0045, B:26:0x0058, B:28:0x005e, B:31:0x0063, B:33:0x0070, B:35:0x0075, B:34:0x0073), top: B:42:0x0001 }] */
    public boolean e() {
        int i10;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i10 = this.f5408b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f5409c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i10 = 0;
                } else if (PlatformVersion.a()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.a()) {
                            this.f5408b = 2;
                        } else {
                            this.f5408b = 1;
                        }
                        i10 = this.f5408b;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.a()) {
                            this.f5408b = 2;
                        } else {
                            this.f5408b = 1;
                        }
                        i10 = this.f5408b;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (PlatformVersion.a()) {
                                this.f5408b = 2;
                            } else {
                                this.f5408b = 1;
                            }
                            i10 = this.f5408b;
                        } else {
                            this.f5408b = 2;
                            i10 = 2;
                        }
                    } else {
                        this.f5408b = 1;
                        i10 = 1;
                    }
                }
            }
        }
        return i10 != 0;
    }

    public void f(B0 b3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            if ((n0Var.a.c() & 8) != 0) {
                ((View) this.f5410d).setTranslationY(R2.a.c(this.f5408b, n0Var.a.b(), 0));
                return;
            }
        }
    }

    public synchronized void g() {
        PackageInfo packageInfoD = d(((Context) this.f5409c).getPackageName());
        if (packageInfoD != null) {
            this.f5410d = Integer.toString(packageInfoD.versionCode);
            this.f5411e = packageInfoD.versionName;
        }
    }
}
