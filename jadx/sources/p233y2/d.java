package p233y2;

import B4.C0163k;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends GmsClientSupervisor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f16034d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f16035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zzi f16036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectionTracker f16037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f16039i;

    public d(Context context, Looper looper) {
        C0163k c0163k = new C0163k(this, 3);
        this.f16035e = context.getApplicationContext();
        zzi zziVar = new zzi(looper, c0163k);
        Looper.getMainLooper();
        this.f16036f = zziVar;
        this.f16037g = ConnectionTracker.b();
        this.f16038h = 5000L;
        this.f16039i = 300000L;
    }

    public final void c(zzo zzoVar, ServiceConnection serviceConnection) {
        Preconditions.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f16034d) {
            try {
                c cVar = (c) this.f16034d.get(zzoVar);
                if (cVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(zzoVar.toString()));
                }
                if (!cVar.f16027s.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(zzoVar.toString()));
                }
                cVar.f16027s.remove(serviceConnection);
                if (cVar.f16027s.isEmpty()) {
                    this.f16036f.sendMessageDelayed(this.f16036f.obtainMessage(0, zzoVar), this.f16038h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(zzo zzoVar, zze zzeVar, String str, Executor executor) {
        boolean z6;
        synchronized (this.f16034d) {
            try {
                c cVar = (c) this.f16034d.get(zzoVar);
                if (executor == null) {
                    executor = null;
                }
                if (cVar == null) {
                    cVar = new c(this, zzoVar);
                    cVar.f16027s.put(zzeVar, zzeVar);
                    cVar.a(str, executor);
                    this.f16034d.put(zzoVar, cVar);
                } else {
                    this.f16036f.removeMessages(0, zzoVar);
                    if (cVar.f16027s.containsKey(zzeVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(zzoVar.toString()));
                    }
                    cVar.f16027s.put(zzeVar, zzeVar);
                    int i10 = cVar.f16028t;
                    if (i10 == 1) {
                        zzeVar.onServiceConnected(cVar.f16032x, cVar.f16030v);
                    } else if (i10 == 2) {
                        cVar.a(str, executor);
                    }
                }
                z6 = cVar.f16029u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }
}
