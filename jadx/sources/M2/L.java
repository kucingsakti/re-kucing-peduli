package M2;

import com.google.android.gms.measurement.internal.zzhj;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends B1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2917t;

    public L(zzhj zzhjVar) {
        super(zzhjVar);
        ((zzhj) this.f577s).f9136W++;
    }

    public final void X0() {
        if (!this.f2917t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void Y0() {
        if (this.f2917t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (Z0()) {
            return;
        }
        ((zzhj) this.f577s).f9138Y.incrementAndGet();
        this.f2917t = true;
    }

    public abstract boolean Z0();
}
