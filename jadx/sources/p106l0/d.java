package p106l0;

import C8.E;
import K3.b;
import R.a;
import Y1.c;
import android.os.Build;
import java.util.ArrayList;
import o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12849b;

    public d(b bVar) {
        this.f12849b = bVar;
    }

    @Override // C8.E
    public final void x(Throwable th) {
        ((g) this.f12849b.a).d(th);
    }

    @Override // C8.E
    public final void y(h hVar) {
        b bVar = this.f12849b;
        bVar.f2578c = hVar;
        h hVar2 = (h) bVar.f2578c;
        g gVar = (g) bVar.a;
        bVar.f2577b = new c(hVar2, gVar.f12856g, gVar.f12858i, Build.VERSION.SDK_INT >= 34 ? j.a() : D3.b.l());
        g gVar2 = (g) bVar.a;
        gVar2.getClass();
        ArrayList arrayList = new ArrayList();
        gVar2.a.writeLock().lock();
        try {
            gVar2.f12852c = 1;
            arrayList.addAll(gVar2.f12851b);
            gVar2.f12851b.clear();
            gVar2.a.writeLock().unlock();
            gVar2.f12853d.post(new a(arrayList, gVar2.f12852c, (Throwable) null));
        } catch (Throwable th) {
            gVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
