package p156q0;

import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f14285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14291i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f14292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f14293l;

    public U(int i10, int i11, f fVar) {
        AbstractC0487g.p(i10, "finalState");
        AbstractC0487g.p(i11, "lifecycleImpact");
        b bVar = fVar.f6701c;
        i.e(bVar, "fragmentStateManager.fragment");
        AbstractC0487g.p(i10, "finalState");
        AbstractC0487g.p(i11, "lifecycleImpact");
        i.f(bVar, "fragment");
        this.a = i10;
        this.f14284b = i11;
        this.f14285c = bVar;
        this.f14286d = new ArrayList();
        this.f14291i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f14292k = arrayList;
        this.f14293l = fVar;
    }

    public final void a(ViewGroup viewGroup) {
        i.f(viewGroup, "container");
        this.f14290h = false;
        if (this.f14287e) {
            return;
        }
        this.f14287e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (T t7 : k.s0(this.f14292k)) {
            t7.getClass();
            if (!t7.f14283b) {
                t7.a(viewGroup);
            }
            t7.f14283b = true;
        }
    }

    public final void b() {
        this.f14290h = false;
        if (!this.f14288f) {
            if (e.K(2)) {
                toString();
            }
            this.f14288f = true;
            Iterator it = this.f14286d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f14285c.f6614F = false;
        this.f14293l.k();
    }

    public final void c(T t7) {
        i.f(t7, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(t7) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        AbstractC0487g.p(i10, "finalState");
        AbstractC0487g.p(i11, "lifecycleImpact");
        int iD = p239z.e.d(i11);
        b bVar = this.f14285c;
        if (iD == 0) {
            if (this.a != 1) {
                if (e.K(2)) {
                    Objects.toString(bVar);
                    if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                        throw null;
                    }
                }
                this.a = i10;
                return;
            }
            return;
        }
        if (iD != 1) {
            if (iD != 2) {
                return;
            }
            if (e.K(2)) {
                Objects.toString(bVar);
            }
            this.a = 1;
            this.f14284b = 3;
            this.f14291i = true;
            return;
        }
        if (this.a == 1) {
            if (e.K(2)) {
                Objects.toString(bVar);
            }
            this.a = 2;
            this.f14284b = 2;
            this.f14291i = true;
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sbM = AbstractC0487g.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i10 = this.a;
        if (i10 == 1) {
            str = "REMOVED";
        } else if (i10 == 2) {
            str = "VISIBLE";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVISIBLE";
        } else {
            str = "GONE";
        }
        sbM.append(str);
        sbM.append(" lifecycleImpact = ");
        int i11 = this.f14284b;
        if (i11 == 1) {
            str2 = "NONE";
        } else if (i11 != 2) {
            str2 = i11 != 3 ? "null" : "REMOVING";
        } else {
            str2 = "ADDING";
        }
        sbM.append(str2);
        sbM.append(" fragment = ");
        sbM.append(this.f14285c);
        sbM.append('}');
        return sbM.toString();
    }
}
