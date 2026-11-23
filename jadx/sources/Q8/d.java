package Q8;

import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import R8.r;
import java.util.ArrayList;
import p210v8.i;
import p220w9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f4341b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f4342c = new d();

    public f a(p009a9.c cVar) {
        i.f(cVar, "javaElement");
        return new f((r) cVar);
    }

    @Override // p220w9.j
    public void b(InterfaceC0271e interfaceC0271e, ArrayList arrayList) {
        i.f(interfaceC0271e, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC0271e.getName() + ", unresolved classes " + arrayList);
    }

    @Override // p220w9.j
    public void c(InterfaceC0269c interfaceC0269c) {
        i.f(interfaceC0269c, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC0269c);
    }
}
