package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final za.c a = new za.c(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K3.d f6733b = new K3.d(14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p230x9.d f6734c = new p230x9.d(13);

    public static final void a(Q q10, N0.e eVar, C0525u c0525u) {
        AutoCloseable autoCloseable;
        p210v8.i.f(eVar, "registry");
        p210v8.i.f(c0525u, "lifecycle");
        p203v0.a aVar = q10.a;
        if (aVar != null) {
            synchronized (aVar.a) {
                autoCloseable = (AutoCloseable) aVar.f15378b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        K k3 = (K) autoCloseable;
        if (k3 == null || k3.f6732u) {
            return;
        }
        k3.a(eVar, c0525u);
        h(eVar, c0525u);
    }

    public static final K b(N0.e eVar, C0525u c0525u, String str, Bundle bundle) {
        p210v8.i.f(eVar, "registry");
        p210v8.i.f(c0525u, "lifecycle");
        Bundle bundleC = eVar.c(str);
        Class[] clsArr = J.f6725f;
        K k3 = new K(str, c(bundleC, bundle));
        k3.a(eVar, c0525u);
        h(eVar, c0525u);
        return k3;
    }

    public static J c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new J();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                p210v8.i.e(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new J(map);
        }
        ClassLoader classLoader = J.class.getClassLoader();
        p210v8.i.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = parcelableArrayList.get(i10);
            p210v8.i.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
        }
        return new J(linkedHashMap);
    }

    public static final J d(u0.b bVar) {
        za.c cVar = a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f577s;
        N0.f fVar = (N0.f) linkedHashMap.get(cVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w2 = (W) linkedHashMap.get(f6733b);
        if (w2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f6734c);
        String str = (String) linkedHashMap.get(p203v0.b.a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        N0.d dVarD = fVar.a().d();
        M m2 = dVarD instanceof M ? (M) dVarD : null;
        if (m2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(w2).f6738b;
        J j = (J) linkedHashMap2.get(str);
        if (j != null) {
            return j;
        }
        Class[] clsArr = J.f6725f;
        m2.b();
        Bundle bundle2 = m2.f6736c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m2.f6736c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m2.f6736c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m2.f6736c = null;
        }
        J jC = c(bundle3, bundle);
        linkedHashMap2.put(str, jC);
        return jC;
    }

    public static final void e(N0.f fVar) {
        EnumC0519n enumC0519n = fVar.g().f6763c;
        if (enumC0519n != EnumC0519n.f6756t && enumC0519n != EnumC0519n.f6757u) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.a().d() == null) {
            M m2 = new M(fVar.a(), (W) fVar);
            fVar.a().f("androidx.lifecycle.internal.SavedStateHandlesProvider", m2);
            fVar.g().a(new N0.b(m2, 3));
        }
    }

    public static final N f(W w2) {
        p053f4.e eVar = new p053f4.e(14);
        V vE = w2.e();
        B1.a aVarD = w2 instanceof InterfaceC0514i ? ((InterfaceC0514i) w2).d() : u0.a.f15287t;
        p210v8.i.f(vE, "store");
        p210v8.i.f(aVarD, "defaultCreationExtras");
        return (N) new Y1.c(vE, eVar, aVarD).A("androidx.lifecycle.internal.SavedStateHandlesVM", p068ga.d.r(N.class));
    }

    public static final void g(View view, InterfaceC0523s interfaceC0523s) {
        p210v8.i.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0523s);
    }

    public static void h(N0.e eVar, C0525u c0525u) {
        EnumC0519n enumC0519n = c0525u.f6763c;
        if (enumC0519n == EnumC0519n.f6756t || enumC0519n.compareTo(EnumC0519n.f6758v) >= 0) {
            eVar.g();
        } else {
            c0525u.a(new C0511f(c0525u, 1, eVar));
        }
    }
}
