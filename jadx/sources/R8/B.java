package R8;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class B extends r implements p009a9.b {
    public final TypeVariable a;

    public B(TypeVariable typeVariable) {
        p210v8.i.f(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override // p009a9.b
    public final C0409d a(p096j9.c cVar) {
        Annotation[] declaredAnnotations;
        p210v8.i.f(cVar, "fqName");
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return qa.b.j(declaredAnnotations, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return p210v8.i.a(this.a, ((B) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p009a9.b
    public final Collection q() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? p086i8.s.f12328s : qa.b.k(declaredAnnotations);
    }

    public final String toString() {
        return B.class.getName() + ": " + this.a;
    }
}
