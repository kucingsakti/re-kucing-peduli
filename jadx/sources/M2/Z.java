package M2;

import com.google.android.gms.measurement.internal.zzks;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzks f2961t;

    public /* synthetic */ Z(zzks zzksVar, int i10) {
        this.f2960s = i10;
        this.f2961t = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2960s) {
            case 0:
                zzks zzksVar = this.f2961t;
                zzksVar.f9237w = zzksVar.f9232B;
                break;
            default:
                this.f2961t.f9232B = null;
                break;
        }
    }
}
