package androidx.lifecycle;

import C8.InterfaceC0175c;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O extends U implements T {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Application f6739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S f6740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f6741u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0525u f6742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N0.e f6743w;

    public O(Application application, N0.f fVar, Bundle bundle) {
        S s9;
        p210v8.i.f(fVar, "owner");
        this.f6743w = fVar.a();
        this.f6742v = fVar.g();
        this.f6741u = bundle;
        this.f6739s = application;
        if (application != null) {
            if (S.f6745y == null) {
                S.f6745y = new S(application);
            }
            s9 = S.f6745y;
            p210v8.i.c(s9);
        } else {
            s9 = new S(null);
        }
        this.f6740t = s9;
    }

    @Override // androidx.lifecycle.U
    public final void a(Q q10) {
        C0525u c0525u = this.f6742v;
        if (c0525u != null) {
            N0.e eVar = this.f6743w;
            p210v8.i.c(eVar);
            L.a(q10, eVar, c0525u);
        }
    }

    public final Q b(String str, Class cls) {
        C0525u c0525u = this.f6742v;
        if (c0525u == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0506a.class.isAssignableFrom(cls);
        Application application = this.f6739s;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? P.a(cls, P.f6744b) : P.a(cls, P.a);
        if (constructorA == null) {
            if (application != null) {
                return this.f6740t.e(cls);
            }
            if (p204v1.g.f15400w == null) {
                p204v1.g.f15400w = new p204v1.g(14);
            }
            p210v8.i.c(p204v1.g.f15400w);
            return C3.a.e(cls);
        }
        N0.e eVar = this.f6743w;
        p210v8.i.c(eVar);
        K kB = L.b(eVar, c0525u, str, this.f6741u);
        J j = kB.f6731t;
        Q qB = (!zIsAssignableFrom || application == null) ? P.b(cls, constructorA, j) : P.b(cls, constructorA, application, j);
        qB.a(kB);
        return qB;
    }

    @Override // androidx.lifecycle.T
    public final Q e(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.T
    public final Q g(InterfaceC0175c interfaceC0175c, u0.b bVar) {
        return i(p068ga.d.o(interfaceC0175c), bVar);
    }

    @Override // androidx.lifecycle.T
    public final Q i(Class cls, u0.b bVar) {
        p203v0.b bVar2 = p203v0.b.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f577s;
        String str = (String) linkedHashMap.get(bVar2);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.a) == null || linkedHashMap.get(L.f6733b) == null) {
            if (this.f6742v != null) {
                return b(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(S.f6746z);
        boolean zIsAssignableFrom = AbstractC0506a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? P.a(cls, P.f6744b) : P.a(cls, P.a);
        if (constructorA == null) {
            return this.f6740t.i(cls, bVar);
        }
        return (!zIsAssignableFrom || application == null) ? P.b(cls, constructorA, L.d(bVar)) : P.b(cls, constructorA, application, L.d(bVar));
    }
}
