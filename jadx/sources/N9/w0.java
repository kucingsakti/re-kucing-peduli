package N9;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractC0337u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w0 f3491t = new w0();

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        A0 a10 = (A0) iVar.get(A0.f3409t);
        if (a10 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        a10.f3410s = true;
    }

    @Override // N9.AbstractC0337u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
