package Y8;

import L8.InterfaceC0271e;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class C extends J9.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f5725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p210v8.k f5726d;

    /* JADX WARN: Multi-variable type inference failed */
    public C(j jVar, Set set, p200u8.b bVar) {
        this.f5724b = jVar;
        this.f5725c = set;
        this.f5726d = (p210v8.k) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u8.b, v8.k] */
    @Override // J9.l
    public final boolean d(Object obj) {
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) obj;
        p210v8.i.f(interfaceC0271e, "current");
        if (interfaceC0271e == this.f5724b) {
            return true;
        }
        t9.n nVarV0 = interfaceC0271e.v0();
        p210v8.i.e(nVarV0, "current.staticScope");
        if (!(nVarV0 instanceof E)) {
            return true;
        }
        this.f5725c.addAll((Collection) this.f5726d.invoke(nVarV0));
        return false;
    }

    @Override // J9.l
    public final /* bridge */ /* synthetic */ Object k() {
        return p076h8.m.a;
    }
}
