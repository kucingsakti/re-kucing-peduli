package R8;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class C extends r implements p009a9.b {
    public final A a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f4453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4455d;

    public C(A a, Annotation[] annotationArr, String str, boolean z6) {
        p210v8.i.f(annotationArr, "reflectAnnotations");
        this.a = a;
        this.f4453b = annotationArr;
        this.f4454c = str;
        this.f4455d = z6;
    }

    @Override // p009a9.b
    public final C0409d a(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        return qa.b.j(this.f4453b, cVar);
    }

    @Override // p009a9.b
    public final Collection q() {
        return qa.b.k(this.f4453b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C.class.getName());
        sb.append(": ");
        sb.append(this.f4455d ? "vararg " : "");
        String str = this.f4454c;
        sb.append(str != null ? p096j9.f.i(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
