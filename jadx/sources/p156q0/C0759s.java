package p156q0;

import B6.h;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p031d.g;
import p049f.a;
import p049f.c;
import p049f.d;
import p049f.f;
import p068ga.l;
import p102k7.e;

/* JADX INFO: renamed from: q0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0759s extends AbstractC0761u {
    public final /* synthetic */ e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f14356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f14357e;

    public C0759s(h hVar, e eVar, AtomicReference atomicReference, l lVar, a aVar) {
        this.f14357e = hVar;
        this.a = eVar;
        this.f14354b = atomicReference;
        this.f14355c = lVar;
        this.f14356d = aVar;
    }

    @Override // p156q0.AbstractC0761u
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        h hVar = this.f14357e;
        sb.append(hVar.f6655x);
        sb.append("_rq#");
        sb.append(hVar.f6647p0.getAndIncrement());
        String string = sb.toString();
        h hVar2 = (h) this.a.f12743s;
        C0763w c0763w = hVar2.f6623O;
        g gVar = (c0763w instanceof p049f.g ? c0763w.f14372w : hVar2.W()).f10458B;
        gVar.getClass();
        C0525u c0525u = hVar.f6643l0;
        if (c0525u.f6763c.compareTo(EnumC0519n.f6758v) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + hVar + " is attempting to register while current state is " + c0525u.f6763c + ". LifecycleOwners must call register before they are STARTED.");
        }
        gVar.d(string);
        HashMap map = gVar.f10439c;
        f fVar = (f) map.get(string);
        if (fVar == null) {
            fVar = new f(c0525u);
        }
        a aVar = this.f14356d;
        l lVar = this.f14355c;
        c cVar = new c(gVar, string, aVar, lVar);
        fVar.a.a(cVar);
        fVar.f11385b.add(cVar);
        map.put(string, fVar);
        this.f14354b.set(new d(gVar, string, lVar, 0));
    }
}
