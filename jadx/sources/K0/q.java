package K0;

import A0.r;
import L8.M;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2575d;

    public q(p067g9.f fVar, p067g9.g gVar, M m2) {
        this.f2573b = fVar;
        this.f2574c = gVar;
        this.f2575d = m2;
    }

    public P0.j a() {
        ((m) this.f2573b).a();
        return ((AtomicBoolean) this.f2574c).compareAndSet(false, true) ? (P0.j) ((p076h8.j) this.f2575d).getValue() : b();
    }

    public P0.j b() {
        String strC = c();
        m mVar = (m) this.f2573b;
        mVar.getClass();
        mVar.a();
        mVar.b();
        return mVar.g().S().c(strC);
    }

    public abstract String c();

    public abstract p096j9.c d();

    public void e(P0.j jVar) {
        p210v8.i.f(jVar, "statement");
        if (jVar == ((P0.j) ((p076h8.j) this.f2575d).getValue())) {
            ((AtomicBoolean) this.f2574c).set(false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return getClass().getSimpleName() + ": " + d();
            default:
                return super.toString();
        }
    }

    public q(m mVar) {
        p210v8.i.f(mVar, "database");
        this.f2573b = mVar;
        this.f2574c = new AtomicBoolean(false);
        this.f2575d = D3.b.s(new r(this, 15));
    }
}
