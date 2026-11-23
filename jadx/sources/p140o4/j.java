package p140o4;

import G0.b;
import Y9.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13763c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static D f13764d;
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13765b;

    public j(ExecutorService executorService) {
        this.f13765b = new e(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z6) {
        D d3;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (f13763c) {
            try {
                if (f13764d == null) {
                    f13764d = new D(context);
                }
                d3 = f13764d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6) {
            return d3.b(intent).d(new b(0), new a(6));
        }
        if (r.n().w(context)) {
            A.c(context, d3, intent);
        } else {
            d3.b(intent);
        }
        return Tasks.e(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zA = PlatformVersion.a();
        final Context context = (Context) this.a;
        boolean z6 = zA && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        if (z6 && !z10) {
            return a(context, intent, z10);
        }
        b bVar = (b) this.f13765b;
        return Tasks.c(bVar, new Callable() { // from class: o4.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i10;
                Context context2 = context;
                Intent intent2 = intent;
                r rVarN = r.n();
                rVarN.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) rVarN.f13785w).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (rVarN) {
                    try {
                        str = (String) rVarN.f13782t;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                str = null;
                            } else {
                                if (str2.startsWith(".")) {
                                    rVarN.f13782t = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    rVarN.f13782t = serviceInfo.name;
                                }
                                str = (String) rVarN.f13782t;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i10 = (rVarN.w(context2) ? A.d(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e10) {
                    e10.toString();
                    i10 = 402;
                } catch (SecurityException unused) {
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            }
        }).e(bVar, new Continuation() { // from class: o4.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object C(Task task) {
                if (!PlatformVersion.a() || ((Integer) task.g()).intValue() != 402) {
                    return task;
                }
                return j.a(context, intent, z10).d(new b(0), new a(5));
            }
        });
    }

    public j(Context context) {
        this.a = context;
        this.f13765b = new b(0);
    }
}
