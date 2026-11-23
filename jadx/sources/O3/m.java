package O3;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f3539u;

    public m(o oVar, long j, String str) {
        this.f3539u = oVar;
        this.f3537s = j;
        this.f3538t = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o oVar = this.f3539u;
        t tVar = oVar.f3554n;
        if (tVar != null && tVar.f3583e.get()) {
            return null;
        }
        ((P3.c) oVar.f3550i.f3876t).m(this.f3538t, this.f3537s);
        return null;
    }
}
