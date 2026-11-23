package N9;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p210v8.k implements p200u8.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f3477t = new r(2, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f3478u = new r(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3479s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f3479s = i11;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3479s) {
            case 0:
                return ((p123m8.i) obj).plus((p123m8.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((p123m8.i) obj).plus((p123m8.g) obj2);
        }
    }
}
