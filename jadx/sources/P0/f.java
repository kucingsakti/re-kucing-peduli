package P0;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Throwable f3814t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, Throwable th) {
        super(th);
        AbstractC0487g.p(i10, "callbackName");
        this.f3813s = i10;
        this.f3814t = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3814t;
    }
}
