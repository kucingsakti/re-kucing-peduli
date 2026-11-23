package p112l7;

import J4.c;
import com.tonyodev.fetch2.database.DownloadInfo;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f12958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DownloadInfo f12959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f12960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f12961v;

    public h(c cVar, DownloadInfo downloadInfo, long j, long j10) {
        this.f12958s = cVar;
        this.f12959t = downloadInfo;
        this.f12960u = j;
        this.f12961v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12958s.g(this.f12959t, this.f12960u, this.f12961v);
    }
}
