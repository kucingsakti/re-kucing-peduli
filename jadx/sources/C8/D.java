package C8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D extends p210v8.h implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final D f953A = new D(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Class cls = (Class) obj;
        p210v8.i.f(cls, "p0");
        return cls.getComponentType();
    }
}
