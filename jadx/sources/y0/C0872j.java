package y0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0514i;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: y0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0872j implements InterfaceC0523s, W, InterfaceC0514i, N0.f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15925B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public EnumC0519n f15926C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f15927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f15928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f15929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EnumC0519n f15930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0878p f15931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f15932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f15933y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0525u f15934z = new C0525u(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N1.t f15924A = new N1.t(this);

    public C0872j(Context context, x xVar, Bundle bundle, EnumC0519n enumC0519n, C0878p c0878p, String str, Bundle bundle2) {
        this.f15927s = context;
        this.f15928t = xVar;
        this.f15929u = bundle;
        this.f15930v = enumC0519n;
        this.f15931w = c0878p;
        this.f15932x = str;
        this.f15933y = bundle2;
        p076h8.j jVarS = D3.b.s(new C0871i(this, 0));
        D3.b.s(new C0871i(this, 1));
        this.f15926C = EnumC0519n.f6756t;
    }

    @Override // N0.f
    public final N0.e a() {
        return (N0.e) this.f15924A.f3308d;
    }

    public final Bundle b() {
        Bundle bundle = this.f15929u;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void c(EnumC0519n enumC0519n) {
        p210v8.i.f(enumC0519n, "maxState");
        this.f15926C = enumC0519n;
        f();
    }

    @Override // androidx.lifecycle.InterfaceC0514i
    public final u0.b d() {
        u0.b bVar = new u0.b(0);
        Context applicationContext = this.f15927s.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f577s;
        if (application != null) {
            linkedHashMap.put(S.f6746z, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.a, this);
        linkedHashMap.put(androidx.lifecycle.L.f6733b, this);
        Bundle bundleB = b();
        if (bundleB != null) {
            linkedHashMap.put(androidx.lifecycle.L.f6734c, bundleB);
        }
        return bVar;
    }

    @Override // androidx.lifecycle.W
    public final V e() {
        if (!this.f15925B) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f15934z.f6763c == EnumC0519n.f6755s) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C0878p c0878p = this.f15931w;
        if (c0878p == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f15932x;
        p210v8.i.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = c0878p.f15958b;
        V v4 = (V) linkedHashMap.get(str);
        if (v4 != null) {
            return v4;
        }
        V v10 = new V();
        linkedHashMap.put(str, v10);
        return v10;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C0872j)) {
            C0872j c0872j = (C0872j) obj;
            if (p210v8.i.a(this.f15932x, c0872j.f15932x) && p210v8.i.a(this.f15928t, c0872j.f15928t) && p210v8.i.a(this.f15934z, c0872j.f15934z) && p210v8.i.a((N0.e) this.f15924A.f3308d, (N0.e) c0872j.f15924A.f3308d)) {
                Bundle bundle = this.f15929u;
                Bundle bundle2 = c0872j.f15929u;
                if (p210v8.i.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    if (setKeySet.isEmpty()) {
                        return true;
                    }
                    for (String str : setKeySet) {
                        if (!p210v8.i.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        if (!this.f15925B) {
            N1.t tVar = this.f15924A;
            tVar.e();
            this.f15925B = true;
            if (this.f15931w != null) {
                androidx.lifecycle.L.e(this);
            }
            tVar.f(this.f15933y);
        }
        int iOrdinal = this.f15930v.ordinal();
        int iOrdinal2 = this.f15926C.ordinal();
        C0525u c0525u = this.f15934z;
        if (iOrdinal < iOrdinal2) {
            c0525u.g(this.f15930v);
        } else {
            c0525u.g(this.f15926C);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        return this.f15934z;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f15928t.hashCode() + (this.f15932x.hashCode() * 31);
        Bundle bundle = this.f15929u;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((N0.e) this.f15924A.f3308d).hashCode() + ((this.f15934z.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0872j.class.getSimpleName());
        sb.append("(" + this.f15932x + ')');
        sb.append(" destination=");
        sb.append(this.f15928t);
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
