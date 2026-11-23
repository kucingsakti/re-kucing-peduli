package C8;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z extends p210v8.h implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final z f968A = new z(1, E.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        p210v8.i.f(type, "p0");
        return E.d(type);
    }
}
