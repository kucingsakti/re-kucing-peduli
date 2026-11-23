package p046e8;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10733s;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10733s) {
            case 0:
                return a.a;
            case 1:
                return c.a;
            case 2:
                return d.a;
            default:
                return e.a;
        }
    }
}
