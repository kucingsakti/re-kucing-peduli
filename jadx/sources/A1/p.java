package A1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f159b = new p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f160c = new p(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f161d = new p(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f162e = new p(3);
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    public final boolean a(int i10) {
        switch (this.a) {
            case 0:
                return i10 == 2;
            case 1:
                return false;
            case 2:
                return (i10 == 3 || i10 == 5) ? false : true;
            default:
                return i10 == 2;
        }
    }
}
