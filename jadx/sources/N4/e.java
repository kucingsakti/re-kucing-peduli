package N4;

import B1.h;
import I.C0249m;
import I.q;
import I.s;
import J4.j;
import K4.o;
import K4.p;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.R;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.DownloadNotification;
import com.tonyodev.fetch2.database.DownloadInfo;
import h7.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p086i8.C;
import p210v8.i;
import zlc.season.claritypotion.ClarityPotion;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f3330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f3336h;

    public e(Context context) {
        this.f3336h = context;
        Context applicationContext = context.getApplicationContext();
        i.e(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        Object systemService = context.getSystemService("notification");
        i.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f3330b = notificationManager;
        this.f3331c = new LinkedHashMap();
        this.f3332d = new LinkedHashMap();
        this.f3333e = new LinkedHashSet();
        this.f3334f = "";
        String str = "DEFAULT_FETCH2_NOTIFICATION_MANAGER_ACTION_" + System.currentTimeMillis();
        this.f3335g = str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            applicationContext.registerReceiver(new j(this, 1), new IntentFilter(str), 2);
        } else {
            applicationContext.registerReceiver(new j(this, 1), new IntentFilter(str));
        }
        if (i10 >= 26) {
            String string = applicationContext.getString(R.string.fetch_notification_default_channel_id);
            i.e(string, "getString(...)");
            if (notificationManager.getNotificationChannel(string) == null) {
                String string2 = applicationContext.getString(R.string.fetch_notification_default_channel_name);
                i.e(string2, "getString(...)");
                h.l();
                notificationManager.createNotificationChannel(h.a(string, string2));
            }
        }
    }

    public static String c(Context context, long j) {
        long j10 = j / ((long) 1000);
        long j11 = 3600;
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        long j14 = 60;
        long j15 = j13 / j14;
        long j16 = j13 - (j14 * j15);
        if (j12 > 0) {
            String string = context.getString(R.string.fetch_notification_download_eta_hrs, Long.valueOf(j12), Long.valueOf(j15), Long.valueOf(j16));
            i.e(string, "getString(...)");
            return string;
        }
        if (j15 > 0) {
            String string2 = context.getString(R.string.fetch_notification_download_eta_min, Long.valueOf(j15), Long.valueOf(j16));
            i.e(string2, "getString(...)");
            return string2;
        }
        String string3 = context.getString(R.string.fetch_notification_download_eta_sec, Long.valueOf(j16));
        i.e(string3, "getString(...)");
        return string3;
    }

    public static void g(int i10, s sVar, ArrayList arrayList, Context context) {
        String strC;
        i.f(context, "context");
        q qVar = new q(1);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar.j = 0;
                sVar.f2008z.icon = android.R.drawable.stat_sys_download_done;
                sVar.f1988e = s.c(context.getString(R.string.fetch_notification_default_channel_name));
                sVar.f1989f = s.c("");
                sVar.i(qVar);
                sVar.e(8, true);
                sVar.f1998p = String.valueOf(i10);
                sVar.f1999q = true;
                return;
            }
            DownloadNotification downloadNotification = (DownloadNotification) it.next();
            i.f(downloadNotification, "downloadNotification");
            f fVar = downloadNotification.f10337s;
            if (fVar == f.COMPLETED) {
                strC = context.getString(R.string.fetch_notification_download_complete);
                i.e(strC, "getString(...)");
            } else if (fVar == f.FAILED) {
                strC = context.getString(R.string.fetch_notification_download_failed);
                i.e(strC, "getString(...)");
            } else if (fVar == f.PAUSED) {
                strC = context.getString(R.string.fetch_notification_download_paused);
                i.e(strC, "getString(...)");
            } else if (fVar == f.QUEUED) {
                strC = context.getString(R.string.fetch_notification_download_starting);
                i.e(strC, "getString(...)");
            } else {
                long j = downloadNotification.f10341w;
                if (j < 0) {
                    strC = context.getString(R.string.fetch_notification_download_downloading);
                    i.e(strC, "getString(...)");
                } else {
                    strC = c(context, j);
                }
            }
            String str = downloadNotification.f10343y + ' ' + strC;
            if (str != null) {
                ((ArrayList) qVar.f1983f).add(s.c(str));
            }
        }
    }

    public final void a() {
        synchronized (this.f3331c) {
            Iterator it = this.f3331c.values().iterator();
            while (it.hasNext()) {
                DownloadNotification downloadNotification = (DownloadNotification) it.next();
                f fVar = downloadNotification.f10337s;
                if (!(fVar == f.FAILED)) {
                    if (fVar == f.COMPLETED) {
                        continue;
                    } else {
                        this.f3330b.cancel(downloadNotification.f10339u);
                        this.f3332d.remove(Integer.valueOf(downloadNotification.f10339u));
                        this.f3333e.remove(Integer.valueOf(downloadNotification.f10339u));
                        it.remove();
                        e(downloadNotification.f10340v);
                    }
                }
            }
        }
    }

    public final PendingIntent b(DownloadNotification downloadNotification, int i10) {
        PendingIntent broadcast;
        AbstractC0487g.p(i10, "actionType");
        synchronized (this.f3331c) {
            Intent intent = new Intent(this.f3335g);
            intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", downloadNotification.f10335A);
            intent.putExtra("com.tonyodev.fetch2.extra.DOWNLOAD_ID", downloadNotification.f10339u);
            intent.putExtra("com.tonyodev.fetch2.extra.NOTIFICATION_ID", downloadNotification.f10339u);
            int i11 = 0;
            intent.putExtra("com.tonyodev.fetch2.extra.GROUP_ACTION", false);
            intent.putExtra("com.tonyodev.fetch2.extra.NOTIFICATION_GROUP_ID", downloadNotification.f10340v);
            int iD = p239z.e.d(i10);
            if (iD != 0) {
                i11 = 1;
                if (iD != 1) {
                    i11 = 4;
                    if (iD != 2) {
                        if (iD != 3) {
                            i11 = iD != 4 ? -1 : 5;
                        } else {
                            i11 = 2;
                        }
                    }
                }
            }
            intent.putExtra("com.tonyodev.fetch2.extra.ACTION_TYPE", i11);
            broadcast = PendingIntent.getBroadcast(this.a, downloadNotification.f10339u + i11, intent, 201326592);
            i.e(broadcast, "getBroadcast(...)");
        }
        return broadcast;
    }

    public final s d(int i10, int i11) {
        s sVar;
        synchronized (this.f3331c) {
            try {
                sVar = (s) this.f3332d.get(Integer.valueOf(i10));
                if (sVar == null) {
                    Context context = this.a;
                    i.f(context, "context");
                    String string = context.getString(R.string.fetch_notification_default_channel_id);
                    i.e(string, "getString(...)");
                    sVar = new s(context, string);
                }
                this.f3332d.put(Integer.valueOf(i10), sVar);
                sVar.f1998p = String.valueOf(i10);
                sVar.i(null);
                sVar.g(0, 0, false);
                sVar.f1988e = null;
                sVar.f1989f = null;
                sVar.f1990g = null;
                sVar.f1999q = false;
                sVar.f2005w = 31104000000L;
                sVar.e(2, false);
                sVar.f1998p = String.valueOf(i11);
                sVar.e(8, true);
                sVar.f2008z.icon = android.R.drawable.stat_sys_download_done;
                sVar.f1985b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0096 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x0003, B:5:0x0014, B:7:0x001a, B:9:0x0025, B:12:0x002c, B:13:0x0039, B:15:0x003f, B:17:0x0058, B:22:0x006b, B:27:0x0074, B:32:0x007d, B:37:0x0086, B:42:0x008f, B:47:0x00a4, B:52:0x00b1, B:46:0x0096), top: B:58:0x0003 }] */
    public final void e(int i10) {
        synchronized (this.f3331c) {
            try {
                Collection collectionValues = this.f3331c.values();
                ArrayList<DownloadNotification> arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((DownloadNotification) obj).f10340v == i10) {
                        arrayList.add(obj);
                    }
                }
                g(i10, d(i10, i10), arrayList, this.a);
                for (DownloadNotification downloadNotification : arrayList) {
                    i.f(downloadNotification, "downloadNotification");
                    if (!this.f3333e.contains(Integer.valueOf(downloadNotification.f10339u))) {
                        int i11 = downloadNotification.f10339u;
                        s sVarD = d(i11, i10);
                        f fVar = downloadNotification.f10337s;
                        if (fVar == f.CANCELLED) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        } else if (fVar == f.FAILED) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        } else if (fVar == f.DOWNLOADING) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        } else if (fVar == f.QUEUED) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        } else if (fVar == f.COMPLETED) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        } else if (fVar == f.PAUSED) {
                            h(sVarD, downloadNotification, this.a);
                            this.f3330b.notify(i11, sVarD.b());
                        }
                        int iOrdinal = downloadNotification.f10337s.ordinal();
                        if (iOrdinal == 4 || iOrdinal == 6) {
                            this.f3333e.add(Integer.valueOf(downloadNotification.f10339u));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Download download) {
        i.f(download, "download");
        synchronized (this.f3331c) {
            try {
                if (this.f3331c.size() > 50) {
                    this.f3332d.clear();
                    this.f3331c.clear();
                }
                DownloadNotification downloadNotification = (DownloadNotification) this.f3331c.get(Integer.valueOf(((DownloadInfo) download).f10360s));
                if (downloadNotification == null) {
                    downloadNotification = new DownloadNotification();
                }
                f fVar = ((DownloadInfo) download).f10347B;
                i.g(fVar, "<set-?>");
                downloadNotification.f10337s = fVar;
                downloadNotification.f10338t = ((DownloadInfo) download).c();
                downloadNotification.f10339u = ((DownloadInfo) download).f10360s;
                downloadNotification.f10340v = ((DownloadInfo) download).f10364w;
                downloadNotification.f10341w = ((DownloadInfo) download).f10358M;
                downloadNotification.f10342x = ((DownloadInfo) download).f10359N;
                downloadNotification.f10343y = ((DownloadInfo) download).f10346A;
                downloadNotification.f10344z = ((DownloadInfo) download).f10367z;
                String str = ((DownloadInfo) download).f10361t;
                i.g(str, "<set-?>");
                downloadNotification.f10335A = str;
                DownloadInfo downloadInfo = (DownloadInfo) download;
                String lastPathSegment = C3.b.v(downloadInfo.f10363v).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = Uri.parse(downloadInfo.f10362u).getLastPathSegment();
                }
                if (lastPathSegment == null) {
                    lastPathSegment = downloadInfo.f10362u;
                }
                i.g(lastPathSegment, "<set-?>");
                downloadNotification.f10336B = lastPathSegment;
                this.f3334f = ((DownloadInfo) download).f10363v;
                this.f3331c.put(Integer.valueOf(((DownloadInfo) download).f10360s), downloadNotification);
                if (this.f3333e.contains(Integer.valueOf(downloadNotification.f10339u))) {
                    f fVar2 = downloadNotification.f10337s;
                    if (!(fVar2 == f.FAILED)) {
                        if (!(fVar2 == f.COMPLETED)) {
                            this.f3333e.remove(Integer.valueOf(downloadNotification.f10339u));
                        }
                    }
                }
                e(((DownloadInfo) download).f10364w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(s sVar, DownloadNotification downloadNotification, Context context) {
        PendingIntent broadcast;
        i.f(context, "context");
        sVar.j = 0;
        String strConcat = downloadNotification.f10336B;
        try {
            String strSubstring = strConcat.substring(0, 32);
            i.e(strSubstring, "substring(...)");
            strConcat = strSubstring.concat("...");
        } catch (Exception unused) {
        }
        sVar.f1988e = s.c(strConcat);
        int iOrdinal = downloadNotification.f10337s.ordinal();
        sVar.e(2, iOrdinal == 1 || iOrdinal == 2);
        sVar.f1998p = "downlod_group";
        sVar.f1999q = true;
        f fVar = downloadNotification.f10337s;
        if (fVar == f.CANCELLED) {
            sVar.f2008z.icon = R.drawable.ic_c_download_canceled;
            sVar.f1989f = s.c("Dibatalkan");
            sVar.g(0, 0, false);
            sVar.e(8, true);
            sVar.i(null);
            sVar.e(2, false);
            sVar.a(new C0249m((IconCompat) null, "Ulangi unduh", b(downloadNotification, 5)));
            sVar.f2008z.deleteIntent = b(downloadNotification, 4);
            return;
        }
        if (fVar == f.FAILED) {
            sVar.f2008z.icon = R.drawable.ic_c_download_canceled;
            sVar.f1989f = s.c("Gagal");
            sVar.g(0, 0, false);
            sVar.e(8, true);
            sVar.i(null);
            sVar.e(2, false);
            sVar.a(new C0249m((IconCompat) null, "Ulangi unduh", b(downloadNotification, 5)));
            sVar.f2008z.deleteIntent = b(downloadNotification, 4);
            return;
        }
        if (fVar == f.COMPLETED) {
            Context context2 = ClarityPotion.f16351s;
            Activity activityG = C.g();
            if (activityG != null) {
                activityG.sendBroadcast(new Intent("com.kcstream.cing.broadcast.download.FINISHED"));
            }
            sVar.f2008z.icon = R.drawable.ic_c_download_completed;
            sVar.f1989f = s.c("Selesai");
            sVar.e(16, true);
            sVar.g(0, 0, false);
            sVar.e(8, true);
            sVar.i(null);
            String str = o.a;
            String str2 = this.f3334f;
            i.f(str2, "downloadInfo");
            String str3 = o.a;
            Intent intent = new Intent(C.h(), (Class<?>) p.class);
            intent.setAction(str3);
            intent.putExtra("download_path", str2);
            if (Build.VERSION.SDK_INT >= 31) {
                broadcast = PendingIntent.getBroadcast(C.h(), 100, intent, 33554432);
                i.c(broadcast);
            } else {
                broadcast = PendingIntent.getBroadcast(C.h(), 100, intent, 134217728);
                i.c(broadcast);
            }
            sVar.a(new C0249m(R.drawable.ic_c_play, "Buka", broadcast));
            sVar.e(2, false);
            return;
        }
        if (fVar == f.PAUSED) {
            sVar.f2008z.icon = R.drawable.ic_c_download_pause;
            sVar.f1989f = s.c("Dijeda");
            sVar.g(0, 0, false);
            sVar.e(8, true);
            sVar.i(null);
            sVar.e(2, false);
            sVar.a(new C0249m(R.drawable.ic_c_download_start, "Lanjutkan", b(downloadNotification, 2)));
            sVar.a(new C0249m(R.drawable.ic_c_download_canceled, "Batal", b(downloadNotification, 3)));
            return;
        }
        if (fVar == f.QUEUED) {
            sVar.f2008z.icon = R.drawable.ic_c_download_pause;
            sVar.f1989f = s.c("Menunggu");
            sVar.g(100, 0, true);
            sVar.i(null);
            sVar.e(8, true);
            sVar.e(2, true);
            return;
        }
        if (fVar == f.DOWNLOADING) {
            long j = downloadNotification.f10343y;
            boolean z6 = j == -1;
            int i10 = j == -1 ? 0 : 100;
            int i11 = downloadNotification.f10338t;
            if (i11 < 0) {
                i11 = 0;
            }
            sVar.f2005w = 10000L;
            sVar.g(i10, i11, z6);
            sVar.f2008z.icon = R.drawable.ic_c_downloading;
            Context context3 = ClarityPotion.f16351s;
            sVar.f1989f = s.c(c(C.h(), downloadNotification.f10341w));
            q qVar = new q(0);
            qVar.f1983f = s.c("T: " + D3.b.k(downloadNotification.f10343y) + " • D: " + D3.b.k(downloadNotification.f10344z) + " • S: " + D3.b.k(downloadNotification.f10342x) + "/s");
            sVar.i(qVar);
            sVar.g(i10, i11, z6);
            sVar.e(8, true);
            sVar.e(2, true);
            sVar.a(new C0249m(R.drawable.ic_c_download_pause, "Jeda", b(downloadNotification, 1)));
            sVar.a(new C0249m(R.drawable.ic_c_download_canceled, "Batal", b(downloadNotification, 3)));
        }
    }
}
