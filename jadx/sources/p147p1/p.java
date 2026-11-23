package p147p1;

import Y1.c;
import androidx.work.impl.WorkDatabase;
import p050f1.q;
import p061g1.e;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f14192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1.p f14193c;

    static {
        q.c("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, e eVar, c cVar) {
        this.f14192b = eVar;
        this.a = cVar;
        this.f14193c = workDatabase.v();
    }
}
