package I;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f1948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f1949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f1950u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public HashSet f1951v = new HashSet();

    public I(Context context) {
        this.f1948s = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f1949t = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(H h10) {
        boolean z6;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = h10.a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            h10.f1946d.size();
        }
        if (h10.f1946d.isEmpty()) {
            return;
        }
        if (h10.f1944b) {
            z6 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f1948s;
            boolean zBindService = context.bindService(component, this, 33);
            h10.f1944b = zBindService;
            if (zBindService) {
                h10.f1947e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z6 = h10.f1944b;
        }
        if (!z6 || h10.f1945c == null) {
            b(h10);
            return;
        }
        while (true) {
            arrayDeque = h10.f1946d;
            F f10 = (F) arrayDeque.peek();
            if (f10 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    f10.toString();
                }
                f10.a(h10.f1945c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(h10);
    }

    public final void b(H h10) {
        Handler handler = this.f1949t;
        ComponentName componentName = h10.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = h10.f1947e;
        int i11 = i10 + 1;
        h10.f1947e = i11;
        if (i11 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i10) * 1000);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = h10.f1946d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(h10.f1947e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        p021c.c cVar = null;
        if (i10 == 0) {
            F f10 = (F) message.obj;
            String string = Settings.Secure.getString(this.f1948s.getContentResolver(), "enabled_notification_listeners");
            synchronized (J.f1952c) {
                if (string != null) {
                    try {
                        if (!string.equals(J.f1953d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            J.f1954e = hashSet2;
                            J.f1953d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = J.f1954e;
            }
            if (!hashSet.equals(this.f1951v)) {
                this.f1951v = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f1948s.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f1950u.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f1950u.put(componentName2, new H(componentName2));
                    }
                }
                Iterator it = this.f1950u.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        H h10 = (H) entry.getValue();
                        if (h10.f1944b) {
                            this.f1948s.unbindService(this);
                            h10.f1944b = false;
                        }
                        h10.f1945c = null;
                        it.remove();
                    }
                }
            }
            for (H h11 : this.f1950u.values()) {
                h11.f1946d.add(f10);
                a(h11);
            }
        } else if (i10 == 1) {
            G g8 = (G) message.obj;
            ComponentName componentName3 = g8.a;
            IBinder iBinder = g8.f1943b;
            H h12 = (H) this.f1950u.get(componentName3);
            if (h12 != null) {
                int i11 = p021c.b.f7414b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p021c.c.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p021c.c)) {
                        p021c.a aVar = new p021c.a();
                        aVar.f7413b = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (p021c.c) iInterfaceQueryLocalInterface;
                    }
                }
                h12.f1945c = cVar;
                h12.f1947e = 0;
                a(h12);
                return true;
            }
        } else if (i10 == 2) {
            H h13 = (H) this.f1950u.get((ComponentName) message.obj);
            if (h13 != null) {
                if (h13.f1944b) {
                    this.f1948s.unbindService(this);
                    h13.f1944b = false;
                }
                h13.f1945c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            H h14 = (H) this.f1950u.get((ComponentName) message.obj);
            if (h14 != null) {
                a(h14);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f1949t.obtainMessage(1, new G(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f1949t.obtainMessage(2, componentName).sendToTarget();
    }
}
