package p112l7;

import J4.c;
import com.tonyodev.fetch2.Download;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f12956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Download f12957u;

    public /* synthetic */ g(c cVar, Download download, int i10) {
        this.f12955s = i10;
        this.f12956t = cVar;
        this.f12957u = download;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12955s) {
            case 0:
                this.f12956t.a(this.f12957u);
                break;
            case 1:
                this.f12956t.b(this.f12957u);
                break;
            case 2:
                this.f12956t.c(this.f12957u);
                break;
            case 3:
                this.f12956t.f(this.f12957u);
                break;
            case 4:
                this.f12956t.i(this.f12957u);
                break;
            default:
                this.f12956t.k(this.f12957u);
                break;
        }
    }
}
