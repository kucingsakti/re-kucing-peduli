package B1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(0);
        this.f583t = i10;
    }

    public final j X0() {
        switch (this.f583t) {
            case 0:
                return new e(this);
            default:
                return new l(this);
        }
    }
}
