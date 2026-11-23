package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7813c = 0;

    public zzw(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoB;
        if (this.f7812b == 0) {
            try {
                packageInfoB = Wrappers.a(this.a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.f7812b = packageInfoB.versionCode;
            }
        }
        return this.f7812b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x0025, B:14:0x002c, B:16:0x003e, B:26:0x0061, B:21:0x0047, B:23:0x005a, B:29:0x0065, B:33:0x0074), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public final synchronized int b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        try {
            int i10 = this.f7813c;
            if (i10 != 0) {
                return i10;
            }
            Context context = this.a;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i11 = 1;
            if (PlatformVersion.a()) {
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers != null) {
                }
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != PlatformVersion.a()) {
                    i11 = 2;
                }
                this.f7813c = i11;
                return i11;
            }
            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent3.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                    Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                    if (true != PlatformVersion.a()) {
                        i11 = 2;
                    }
                    this.f7813c = i11;
                    return i11;
                }
                i11 = 2;
            }
            this.f7813c = i11;
            return i11;
        } catch (Throwable th) {
            throw th;
        }
    }
}
