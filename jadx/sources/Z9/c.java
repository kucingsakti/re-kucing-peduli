package Z9;

import java.io.IOException;
import ma.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f5924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f5925v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ma.b bVar, g gVar, d dVar) {
        super(bVar);
        this.f5924u = gVar;
        this.f5925v = dVar;
    }

    @Override // ma.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f5923t) {
            return;
        }
        this.f5923t = true;
        g gVar = this.f5924u;
        d dVar = this.f5925v;
        synchronized (gVar) {
            int i10 = dVar.f5932h - 1;
            dVar.f5932h = i10;
            if (i10 == 0 && dVar.f5930f) {
                gVar.t(dVar);
            }
        }
    }
}
