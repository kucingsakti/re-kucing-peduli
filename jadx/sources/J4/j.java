package J4;

import N1.r;
import O3.C0343a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kcstream.cing.fragment.TabsDownloadsFragment;
import com.tonyodev.fetch2.DownloadNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p086i8.s;
import p140o4.t;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BroadcastReceiver {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2421b;

    public void a() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        ((t) this.f2421b).f13791u.f9987b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        switch (this.a) {
            case 0:
                new Handler().postDelayed(new B6.d((TabsDownloadsFragment) this.f2421b, 3), 500L);
                break;
            case 1:
                N4.e eVar = (N4.e) this.f2421b;
                p210v8.i.g(eVar, "fetchNotificationManager");
                if (context != null && intent != null) {
                    String stringExtra = intent.getStringExtra("com.tonyodev.fetch2.extra.NAMESPACE");
                    int intExtra = intent.getIntExtra("com.tonyodev.fetch2.extra.DOWNLOAD_ID", -1);
                    int intExtra2 = intent.getIntExtra("com.tonyodev.fetch2.extra.ACTION_TYPE", -1);
                    intent.getIntExtra("com.tonyodev.fetch2.extra.NOTIFICATION_ID", -1);
                    int intExtra3 = intent.getIntExtra("com.tonyodev.fetch2.extra.NOTIFICATION_GROUP_ID", -1);
                    boolean booleanExtra = intent.getBooleanExtra("com.tonyodev.fetch2.extra.GROUP_ACTION", false);
                    Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra("con.tonyodev.fetch2.extra.DOWNLOAD_NOTIFICATIONS");
                    if (parcelableArrayListExtra == null) {
                        parcelableArrayListExtra = s.f12328s;
                    }
                    if (!booleanExtra) {
                        if (stringExtra != null && stringExtra.length() != 0 && intExtra != -1 && intExtra2 != -1) {
                            C0343a c0343aI = D3.b.i(eVar.f3336h);
                            synchronized (c0343aI.a) {
                            }
                            if (intExtra2 == 0) {
                                c0343aI.e(com.bumptech.glide.d.u(Integer.valueOf(intExtra)), new za.c(23));
                                break;
                            } else if (intExtra2 == 1) {
                                c0343aI.g(com.bumptech.glide.d.u(Integer.valueOf(intExtra)), new K3.d(24));
                                break;
                            } else if (intExtra2 == 2) {
                                c0343aI.c(com.bumptech.glide.d.u(Integer.valueOf(intExtra)), new p230x9.d(23));
                                break;
                            } else if (intExtra2 == 4) {
                                c0343aI.b(com.bumptech.glide.d.u(Integer.valueOf(intExtra)), new p204v1.g(23));
                                break;
                            } else if (intExtra2 == 5) {
                                c0343aI.h(com.bumptech.glide.d.u(Integer.valueOf(intExtra)), new p053f4.e(24));
                                break;
                            }
                        }
                    } else if (intExtra3 != -1 && !parcelableArrayListExtra.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : parcelableArrayListExtra) {
                            String str = ((DownloadNotification) obj).f10335A;
                            Object arrayList = linkedHashMap.get(str);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(str, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Iterable iterable = (Iterable) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(p086i8.m.H(iterable, 10));
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(((DownloadNotification) it.next()).f10339u));
                            }
                            p210v8.i.f(str2, "namespace");
                            C0343a c0343aI2 = D3.b.i(eVar.f3336h);
                            c0343aI2.d();
                            switch (intExtra2) {
                                case 6:
                                    c0343aI2.e(arrayList2, null);
                                    break;
                                case 7:
                                    c0343aI2.g(arrayList2, null);
                                    break;
                                case 8:
                                    c0343aI2.b(arrayList2, null);
                                    break;
                                case 9:
                                    c0343aI2.c(arrayList2, null);
                                    break;
                                case 10:
                                    c0343aI2.h(arrayList2, null);
                                    break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                N1.s sVar = (N1.s) this.f2421b;
                sVar.getClass();
                N1.s.f3299g.execute(new r(sVar, 2));
                break;
            case 3:
                ((B6.b) this.f2421b).n();
                break;
            case 4:
                p210v8.i.f(context, "context");
                p210v8.i.f(intent, "intent");
                ((p117m1.d) this.f2421b).j(intent);
                break;
            case 5:
                if (context != null && intent != null && (action = intent.getAction()) != null && action.hashCode() == -1500940653 && action.equals("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET") && !((p122m7.e) this.f2421b).f13151t) {
                    ((p122m7.e) this.f2421b).getClass();
                    ((p122m7.e) this.f2421b).getClass();
                    if ("LibGlobalFetchLib".equals(intent.getStringExtra("com.tonyodev.fetch2.extra.NAMESPACE"))) {
                        ((p122m7.e) this.f2421b).c();
                    }
                    break;
                }
                break;
            case 6:
                t tVar = (t) this.f2421b;
                if (tVar != null && tVar.a()) {
                    if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                    t tVar2 = (t) this.f2421b;
                    tVar2.f13791u.getClass();
                    FirebaseMessaging.b(tVar2, 0L);
                    ((t) this.f2421b).f13791u.f9987b.unregisterReceiver(this);
                    this.f2421b = null;
                }
                break;
            default:
                p143o7.a.a((p143o7.a) this.f2421b);
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.f2421b = obj;
    }
}
