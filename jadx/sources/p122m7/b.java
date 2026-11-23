package p122m7;

import J4.c;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlock;
import h7.d;
import h7.f;
import java.util.List;
import p085i7.g;
import p152p7.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public volatile boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f13142c;

    public b(a aVar, c cVar) {
        i.g(cVar, "fetchListener");
        this.f13141b = aVar;
        this.f13142c = cVar;
    }

    public final void a(DownloadInfo downloadInfo, DownloadBlock downloadBlock, int i10) {
        i.g(downloadInfo, "download");
        i.g(downloadBlock, "downloadBlock");
        if (this.a) {
            return;
        }
        this.f13142c.d(downloadInfo, downloadBlock, i10);
    }

    public final void b(DownloadInfo downloadInfo, h7.b bVar, Exception exc) {
        i.g(downloadInfo, "download");
        if (this.a) {
            return;
        }
        h7.b bVar2 = h7.b.NONE;
        f fVar = f.QUEUED;
        if (downloadInfo.f10348C == h7.b.NO_NETWORK_CONNECTION) {
            downloadInfo.f10347B = fVar;
            d dVar = a.a;
            downloadInfo.f10348C = bVar2;
            this.f13141b.b(downloadInfo);
            this.f13142c.h(downloadInfo, true);
            return;
        }
        int i10 = downloadInfo.f10357L;
        if (i10 >= 2) {
            downloadInfo.f10347B = f.FAILED;
            this.f13141b.b(downloadInfo);
            this.f13142c.e(downloadInfo, bVar, exc);
        } else {
            downloadInfo.f10357L = i10 + 1;
            downloadInfo.f10347B = fVar;
            d dVar2 = a.a;
            downloadInfo.f10348C = bVar2;
            this.f13141b.b(downloadInfo);
            this.f13142c.h(downloadInfo, true);
        }
    }

    public final void c(DownloadInfo downloadInfo, long j, long j10) {
        i.g(downloadInfo, "download");
        if (this.a) {
            return;
        }
        this.f13142c.g(downloadInfo, j, j10);
    }

    public final void d(DownloadInfo downloadInfo, List list, int i10) throws Throwable {
        i.g(downloadInfo, "download");
        if (this.a) {
            return;
        }
        downloadInfo.f10347B = f.DOWNLOADING;
        this.f13141b.b(downloadInfo);
        this.f13142c.j(downloadInfo, list, i10);
    }

    public final void e(DownloadInfo downloadInfo) {
        i.g(downloadInfo, "download");
        if (this.a) {
            return;
        }
        downloadInfo.f10347B = f.DOWNLOADING;
        g gVar = this.f13141b.a;
        gVar.getClass();
        i.g(downloadInfo, "downloadInfo");
        synchronized (gVar.f12301s) {
            gVar.f12302t.o(downloadInfo);
        }
    }
}
