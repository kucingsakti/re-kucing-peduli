package Z7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends J7.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5883b = new k("RxNewThreadScheduler", false, Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final k a = f5883b;

    @Override // J7.n
    public final J7.m a() {
        return new j(this.a);
    }
}
