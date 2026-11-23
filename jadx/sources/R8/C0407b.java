package R8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: R8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0407b extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0407b f4457t = new C0407b(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0407b f4458u = new C0407b(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0407b f4459v = new C0407b(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0407b f4460w = new C0407b(1, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4461s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0407b(int i10, int i11) {
        super(i10);
        this.f4461s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f4461s) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                p210v8.i.f(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                p210v8.i.f(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                p210v8.i.e(actualTypeArguments, "it.actualTypeArguments");
                return p086i8.i.m(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!p096j9.f.k(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return p096j9.f.j(simpleName);
                }
                return null;
        }
    }
}
