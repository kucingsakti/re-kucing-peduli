package p233y2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ServiceConnection, zzt {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f16027s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16028t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public IBinder f16030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zzo f16031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ComponentName f16032x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f16033y;

    public c(d dVar, zzo zzoVar) {
        this.f16033y = dVar;
        this.f16031w = zzoVar;
    }

    public final void a(String str, Executor executor) throws Throwable {
        this.f16028t = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            d dVar = this.f16033y;
            ConnectionTracker connectionTracker = dVar.f16037g;
            Context context = dVar.f16035e;
            try {
                boolean zD = connectionTracker.d(context, str, this.f16031w.a(context), this, 4225, executor);
                this.f16029u = zD;
                if (zD) {
                    this.f16033y.f16036f.sendMessageDelayed(this.f16033y.f16036f.obtainMessage(1, this.f16031w), this.f16033y.f16039i);
                } else {
                    this.f16028t = 2;
                    try {
                        d dVar2 = this.f16033y;
                        dVar2.f16037g.c(dVar2.f16035e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f16033y.f16034d) {
            try {
                this.f16033y.f16036f.removeMessages(1, this.f16031w);
                this.f16030v = iBinder;
                this.f16032x = componentName;
                Iterator it = this.f16027s.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f16028t = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f16033y.f16034d) {
            try {
                this.f16033y.f16036f.removeMessages(1, this.f16031w);
                this.f16030v = null;
                this.f16032x = componentName;
                Iterator it = this.f16027s.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f16028t = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
