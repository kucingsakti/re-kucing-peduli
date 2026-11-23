package p140o4;

import B6.d;
import E4.C0187a;
import P2.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class D implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Intent f13731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f13732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque f13733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B f13734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13735x;

    public D(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f13733v = new ArrayDeque();
        this.f13735x = false;
        Context applicationContext = context.getApplicationContext();
        this.f13730s = applicationContext;
        this.f13731t = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f13732u = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f13733v.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                B b3 = this.f13734w;
                if (b3 == null || !b3.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f13735x) {
                        this.f13735x = true;
                        try {
                            if (!ConnectionTracker.b().a(this.f13730s, this.f13731t, this, 65)) {
                                this.f13735x = false;
                                while (true) {
                                    ArrayDeque arrayDeque = this.f13733v;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else {
                                        ((C) arrayDeque.poll()).f13729b.d(null);
                                    }
                                }
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.f13734w.a((C) this.f13733v.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized f b(Intent intent) {
        C c10;
        Log.isLoggable("FirebaseMessaging", 3);
        c10 = new C(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f13732u;
        c10.f13729b.a.m(scheduledThreadPoolExecutor, new C0187a(scheduledThreadPoolExecutor.schedule(new d(c10, 26), 20L, TimeUnit.SECONDS), 24));
        this.f13733v.add(c10);
        a();
        return c10.f13729b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f13735x = false;
            if (iBinder instanceof B) {
                this.f13734w = (B) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f13733v;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((C) arrayDeque.poll()).f13729b.d(null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
