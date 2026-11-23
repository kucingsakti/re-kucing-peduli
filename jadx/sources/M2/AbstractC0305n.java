package M2;

import com.google.android.gms.measurement.internal.zzhj;

/* JADX INFO: renamed from: M2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0305n extends AbstractC0306o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3054t;

    public AbstractC0305n(zzhj zzhjVar) {
        super(zzhjVar);
        ((zzhj) this.f577s).f9136W++;
    }

    public final void a1() {
        if (!this.f3054t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void b1() {
        if (this.f3054t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (c1()) {
            return;
        }
        ((zzhj) this.f577s).f9138Y.incrementAndGet();
        this.f3054t = true;
    }

    public abstract boolean c1();
}
