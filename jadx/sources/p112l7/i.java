package p112l7;

import J4.c;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f12962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DownloadInfo f12963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f12964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12965v;

    public i(c cVar, DownloadInfo downloadInfo, List list, int i10) {
        this.f12962s = cVar;
        this.f12963t = downloadInfo;
        this.f12964u = list;
        this.f12965v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f12962s.j(this.f12963t, this.f12964u, this.f12965v);
    }
}
