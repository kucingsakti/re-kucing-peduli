package N9;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC0337u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f3429w = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p086i8.h f3432v;

    public final void A(G g8) {
        p086i8.h hVar = this.f3432v;
        if (hVar == null) {
            hVar = new p086i8.h();
            this.f3432v = hVar;
        }
        hVar.k(g8);
    }

    public abstract Thread B();

    public final void E(boolean z6) {
        this.f3430t = (z6 ? 4294967296L : 1L) + this.f3430t;
        if (z6) {
            return;
        }
        this.f3431u = true;
    }

    public abstract long G();

    public final boolean H() {
        p086i8.h hVar = this.f3432v;
        if (hVar == null) {
            return false;
        }
        G g8 = (G) (hVar.isEmpty() ? null : hVar.v());
        if (g8 == null) {
            return false;
        }
        g8.run();
        return true;
    }

    public void J(long j, P p10) {
        A.f3407A.X(j, p10);
    }

    public abstract void shutdown();

    public final void t(boolean z6) {
        long j = this.f3430t - (z6 ? 4294967296L : 1L);
        this.f3430t = j;
        if (j <= 0 && this.f3431u) {
            shutdown();
        }
    }
}
