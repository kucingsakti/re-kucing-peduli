package O3;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f3541t;

    public n(o oVar, long j) {
        this.f3541t = oVar;
        this.f3540s = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f3540s);
        this.f3541t.f3551k.z(bundle);
        return null;
    }
}
