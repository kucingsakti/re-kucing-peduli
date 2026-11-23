package y0;

import C8.InterfaceC0175c;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: y0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869g extends U implements T {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public N0.e f15919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0525u f15920t;

    @Override // androidx.lifecycle.U
    public final void a(androidx.lifecycle.Q q10) {
        N0.e eVar = this.f15919s;
        if (eVar != null) {
            C0525u c0525u = this.f15920t;
            p210v8.i.c(c0525u);
            androidx.lifecycle.L.a(q10, eVar, c0525u);
        }
    }

    @Override // androidx.lifecycle.T
    public final androidx.lifecycle.Q e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f15920t == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        N0.e eVar = this.f15919s;
        p210v8.i.c(eVar);
        C0525u c0525u = this.f15920t;
        p210v8.i.c(c0525u);
        androidx.lifecycle.K kB = androidx.lifecycle.L.b(eVar, c0525u, canonicalName, null);
        C0870h c0870h = new C0870h(kB.f6731t);
        c0870h.a(kB);
        return c0870h;
    }

    @Override // androidx.lifecycle.T
    public final androidx.lifecycle.Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        return i(p068ga.d.o(interfaceC0175c), bVar);
    }

    @Override // androidx.lifecycle.T
    public final androidx.lifecycle.Q i(Class cls, u0.b bVar) {
        String str = (String) ((LinkedHashMap) bVar.f577s).get(p203v0.b.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        N0.e eVar = this.f15919s;
        if (eVar == null) {
            return new C0870h(androidx.lifecycle.L.d(bVar));
        }
        p210v8.i.c(eVar);
        C0525u c0525u = this.f15920t;
        p210v8.i.c(c0525u);
        androidx.lifecycle.K kB = androidx.lifecycle.L.b(eVar, c0525u, str, null);
        C0870h c0870h = new C0870h(kB.f6731t);
        c0870h.a(kB);
        return c0870h;
    }
}
