package p220w9;

import I4.c;
import I8.n;
import L8.InterfaceC0271e;
import java.util.Set;
import p086i8.C;
import p096j9.b;
import p210v8.i;
import p247z9.j;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f15657c = C.w(b.j(n.f2166c.g()));
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15658b;

    public g(c cVar) {
        i.f(cVar, "components");
        this.a = cVar;
        this.f15658b = ((l) cVar.a).c(new e2.b(this, 10));
    }

    public final InterfaceC0271e a(b bVar, d dVar) {
        i.f(bVar, "classId");
        return (InterfaceC0271e) this.f15658b.invoke(new f(bVar, dVar));
    }
}
