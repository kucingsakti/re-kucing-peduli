package M2;

import com.google.android.gms.measurement.internal.zznc;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends n0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3053u;

    public m0(zznc zzncVar) {
        super(zzncVar);
        this.f3055t.f9289J++;
    }

    public final void a1() {
        if (!this.f3053u) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void b1() {
        if (this.f3053u) {
            throw new IllegalStateException("Can't initialize twice");
        }
        c1();
        this.f3055t.f9290K++;
        this.f3053u = true;
    }

    public abstract boolean c1();
}
