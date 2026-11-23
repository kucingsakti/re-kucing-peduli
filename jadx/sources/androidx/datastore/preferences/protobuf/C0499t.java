package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0499t implements O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0499t f6512b = new C0499t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C0499t(int i10) {
        this.a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final Z a(Class cls) {
        switch (this.a) {
            case 0:
                if (!AbstractC0502w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Z) AbstractC0502w.e(cls.asSubclass(AbstractC0502w.class)).d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return AbstractC0502w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
