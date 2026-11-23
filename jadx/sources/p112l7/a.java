package p112l7;

import N4.e;
import V3.b;
import Y1.c;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import h7.d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import o1.k;
import p085i7.g;
import p163q7.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k f12927A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e f12928B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f12930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f12931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f12932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p102k7.a f12933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p122m7.e f12934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f12935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f12936z;

    public a(g gVar, p102k7.a aVar, p122m7.e eVar, f fVar, p185s7.a aVar2, d dVar, b bVar, Handler handler, k kVar, e eVar2, c cVar) {
        i.g(fVar, "logger");
        i.g(dVar, "fileServerDownloader");
        i.g(handler, "uiHandler");
        AbstractC0487g.v(1, "prioritySort");
        this.f12932v = gVar;
        this.f12933w = aVar;
        this.f12934x = eVar;
        this.f12935y = fVar;
        this.f12936z = bVar;
        this.f12927A = kVar;
        this.f12928B = eVar2;
        this.f12929s = UUID.randomUUID().hashCode();
        this.f12930t = new LinkedHashSet();
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadInfo downloadInfo = (DownloadInfo) it.next();
            p102k7.a aVar = this.f12933w;
            int i10 = downloadInfo.f10360s;
            synchronized (aVar.f12709s) {
                aVar.h(i10);
            }
        }
    }

    public final boolean b(boolean z6) {
        long j;
        Thread threadCurrentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        i.b(mainLooper, "Looper.getMainLooper()");
        if (i.a(threadCurrentThread, mainLooper.getThread())) {
            throw new FetchException("blocking_call_on_ui_thread");
        }
        g gVar = this.f12932v;
        synchronized (gVar.f12301s) {
            p085i7.f fVar = gVar.f12302t;
            j = -1;
            try {
                Cursor cursorN = fVar.f12296v.n(z6 ? fVar.f12298x : fVar.f12297w);
                long count = cursorN != null ? cursorN.getCount() : -1L;
                if (cursorN != null) {
                    cursorN.close();
                }
                j = count;
            } catch (Exception unused) {
            }
        }
        return j > 0;
    }

    public final ArrayList c(List list) {
        a(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadInfo downloadInfo = (DownloadInfo) it.next();
            i.g(downloadInfo, "download");
            int iOrdinal = downloadInfo.f10347B.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                downloadInfo.f10347B = h7.f.PAUSED;
                arrayList.add(downloadInfo);
            }
        }
        this.f12932v.i(arrayList);
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12931u) {
            return;
        }
        this.f12931u = true;
        synchronized (this.f12930t) {
            try {
                Iterator it = this.f12930t.iterator();
                while (it.hasNext()) {
                    this.f12936z.h(this.f12929s, (J4.c) it.next());
                }
                this.f12930t.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12936z.i(this.f12928B);
        this.f12936z.b(this.f12928B);
        this.f12934x.h();
        this.f12934x.close();
        this.f12933w.close();
        e.a();
    }

    public final ArrayList g(List list) {
        int iOrdinal;
        g gVar = this.f12932v;
        ArrayList<DownloadInfo> arrayListR = p086i8.k.R(gVar.a(list));
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : arrayListR) {
            if (!this.f12933w.i(downloadInfo.f10360s) && ((iOrdinal = downloadInfo.f10347B.ordinal()) == 1 || iOrdinal == 3 || iOrdinal == 9)) {
                downloadInfo.f10347B = h7.f.QUEUED;
                arrayList.add(downloadInfo);
            }
        }
        gVar.i(arrayList);
        i();
        return arrayList;
    }

    public final ArrayList h(List list) {
        g gVar = this.f12932v;
        ArrayList<DownloadInfo> arrayListR = p086i8.k.R(gVar.a(list));
        ArrayList arrayList = new ArrayList();
        for (DownloadInfo downloadInfo : arrayListR) {
            i.g(downloadInfo, "download");
            int iOrdinal = downloadInfo.f10347B.ordinal();
            if (iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 9) {
                downloadInfo.f10347B = h7.f.QUEUED;
                d dVar = p152p7.a.a;
                downloadInfo.f10348C = h7.b.NONE;
                arrayList.add(downloadInfo);
            }
        }
        gVar.i(arrayList);
        i();
        return arrayList;
    }

    public final void i() {
        p122m7.e eVar = this.f12934x;
        synchronized (eVar.f13150s) {
            Intent intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
            intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", "LibGlobalFetchLib");
            eVar.f13149E.sendBroadcast(intent);
        }
        if (!this.f12934x.f13151t || this.f12931u) {
            return;
        }
        this.f12934x.g();
    }
}
