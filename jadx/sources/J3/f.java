package J3;

import A1.r;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2392v;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i10) {
        this.f2389s = i10;
        this.f2390t = obj;
        this.f2391u = obj2;
        this.f2392v = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2389s) {
            case 0:
                g gVar = (g) this.f2390t;
                return gVar.f2393s.submit(new D4.a((Callable) this.f2391u, 5, (r) this.f2392v));
            default:
                WorkDatabase workDatabase = ((p061g1.e) this.f2390t).f11479w;
                o1.r rVarW = workDatabase.w();
                String str = (String) this.f2392v;
                ((ArrayList) this.f2391u).addAll(rVarW.p(str));
                return workDatabase.v().g(str);
        }
    }
}
