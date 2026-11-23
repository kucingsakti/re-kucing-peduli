package F8;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends Error {
    public p0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String str, int i10) {
        super(str);
        switch (i10) {
            case 2:
                p210v8.i.f(str, "message");
                super(str);
                break;
            default:
                p210v8.i.f(str, "message");
                break;
        }
    }
}
