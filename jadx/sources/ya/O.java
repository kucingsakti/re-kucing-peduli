package ya;

/* JADX INFO: loaded from: classes.dex */
public final class O implements N {
    public static final O a = new O();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return N.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof N;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + N.class.getName() + "()";
    }
}
