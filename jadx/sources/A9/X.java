package A9;

/* JADX INFO: loaded from: classes.dex */
public final class X implements p200u8.b {
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        p096j9.c cVar = (p096j9.c) obj;
        if (cVar != null) {
            return Boolean.valueOf(!cVar.equals(I8.n.f2187y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
