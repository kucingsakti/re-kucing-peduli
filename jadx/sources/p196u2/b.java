package p196u2;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzj;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o1.k;
import p196u2.b;
import p196u2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15292s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Messenger f15293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k f15294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque f15295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseArray f15296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zzv f15297x;

    public b(zzv zzvVar) {
        this.f15297x = zzvVar;
        zzf zzfVar = new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                b bVar = this.f7805s;
                synchronized (bVar) {
                    try {
                        c cVar = (c) bVar.f15296w.get(i10);
                        if (cVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        bVar.f15296w.remove(i10);
                        bVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            cVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (cVar.f15301e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    cVar.b(new zzt("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    cVar.toString();
                                }
                                cVar.f15298b.b(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle(JsonStorageKeyNames.DATA_KEY);
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    cVar.toString();
                                    String.valueOf(bundle);
                                }
                                cVar.f15298b.b(bundle);
                                return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f15293t = new Messenger(zzfVar);
        this.f15295v = new ArrayDeque();
        this.f15296w = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i10 = this.f15292s;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f15292s = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f15292s = 4;
            ConnectionTracker.b().c(this.f15297x.a, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f15295v.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(zztVar);
            }
            this.f15295v.clear();
            for (int i11 = 0; i11 < this.f15296w.size(); i11++) {
                ((c) this.f15296w.valueAt(i11)).b(zztVar);
            }
            this.f15296w.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.f15292s == 2 && this.f15295v.isEmpty() && this.f15296w.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f15292s = 3;
            ConnectionTracker.b().c(this.f15297x.a, this);
        }
    }

    public final synchronized boolean d(c cVar) {
        try {
            int i10 = this.f15292s;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f15295v.add(cVar);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                this.f15295v.add(cVar);
                this.f15297x.f7809b.execute(new zzj(this));
                return true;
            }
            this.f15295v.add(cVar);
            Preconditions.l(this.f15292s == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f15292s = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.b().a(this.f15297x.a, intent, this, 1)) {
                    this.f15297x.f7809b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            b bVar = this.f7803s;
                            synchronized (bVar) {
                                if (bVar.f15292s == 1) {
                                    bVar.a("Timed out while binding");
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    a("Unable to bind to service");
                }
            } catch (SecurityException e10) {
                b("Unable to bind to service", e10);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f15297x.f7809b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = this.f7800s;
                IBinder iBinder2 = iBinder;
                synchronized (bVar) {
                    if (iBinder2 == null) {
                        bVar.a("Null service connection");
                        return;
                    }
                    try {
                        bVar.f15294u = new k(iBinder2);
                        bVar.f15292s = 2;
                        bVar.f15297x.f7809b.execute(new zzj(bVar));
                    } catch (RemoteException e10) {
                        bVar.a(e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f15297x.f7809b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.f7804s.a("Service disconnected");
            }
        });
    }
}
