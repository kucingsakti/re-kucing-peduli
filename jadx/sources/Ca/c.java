package Ca;

import C8.InterfaceC0175c;
import C8.InterfaceC0178f;
import Fa.d;
import Fa.e;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import o1.k;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public class c extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f1027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f1028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f1031i;

    public c(List list) {
        i.g(list, "items");
        this.f1031i = list;
        this.f1027e = new e(0);
        this.f1028f = new k(3);
        this.f1029g = new ArrayList();
        this.f1030h = new ArrayList();
        List list2 = this.f1031i;
        i.g(list2, "items");
        List listB = x.b(list2);
        this.f1031i = listB;
        this.f1026d = listB.size();
    }

    @Override // androidx.recyclerview.widget.s
    public int a() {
        return this.f1026d;
    }

    @Override // androidx.recyclerview.widget.s
    public int c(int i10) {
        Object obj = this.f1031i.get(i10);
        e eVar = this.f1027e;
        eVar.getClass();
        i.g(obj, "item");
        eVar.f1659t = null;
        HashMap map = (HashMap) eVar.f1662w;
        Class<?> cls = obj.getClass();
        v vVar = u.a;
        InterfaceC0175c interfaceC0175c = (InterfaceC0175c) map.get(com.bumptech.glide.e.h(vVar.b(cls)));
        eVar.f1659t = interfaceC0175c;
        if (interfaceC0175c == null) {
            throw new RuntimeException(String.format("Fatal error! Mapping of ViewHolder to item '%s' does not exist", Arrays.copyOf(new Object[]{com.bumptech.glide.e.h(vVar.b(obj.getClass()))}, 1)));
        }
        SparseArray sparseArray = (SparseArray) eVar.f1660u;
        int iHashCode = com.bumptech.glide.e.h(interfaceC0175c).hashCode();
        sparseArray.put(iHashCode, interfaceC0175c);
        return iHashCode;
    }

    @Override // androidx.recyclerview.widget.s
    public final boolean h(RecyclerView.a aVar) {
        return false;
    }

    @Override // androidx.recyclerview.widget.s
    public final void j(RecyclerView.a aVar) {
        Iterator it = this.f1030h.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    @Override // androidx.recyclerview.widget.s
    public final void k(RecyclerView.a aVar) {
    }

    public final void m(List list) {
        i.g(list, "items");
        this.f1031i.addAll(list);
        int iA = a();
        int size = list.size();
        this.f1026d = this.f1031i.size();
        this.a.d(iA, size);
    }

    @Override // androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(int i10, Ga.c cVar) {
        cVar.a(this.f1031i.get(i10));
    }

    @Override // androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Ga.c f(ViewGroup viewGroup, int i10) {
        Object[] objArr;
        i.g(viewGroup, "parent");
        e eVar = this.f1027e;
        eVar.getClass();
        InterfaceC0175c interfaceC0175c = (InterfaceC0175c) ((SparseArray) eVar.f1660u).get(i10);
        eVar.f1659t = interfaceC0175c;
        if (interfaceC0175c == null) {
            i.l();
            throw null;
        }
        d dVar = (d) eVar.f1661v;
        dVar.getClass();
        InterfaceC0178f interfaceC0178f = (InterfaceC0178f) dVar.a.get(interfaceC0175c);
        try {
            if (interfaceC0178f == null) {
                i.l();
                throw null;
            }
            InterfaceC0175c interfaceC0175c2 = (InterfaceC0175c) eVar.f1659t;
            if (interfaceC0175c2 == null) {
                i.l();
                throw null;
            }
            boolean zR = interfaceC0175c2.r();
            if (zR) {
                objArr = new Object[]{null, viewGroup};
            } else {
                if (zR) {
                    throw new NoWhenBranchMatchedException();
                }
                objArr = new Object[]{viewGroup};
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            i.g(objArrCopyOf, "args");
            Object objV = interfaceC0178f.v(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            if (objV == null) {
                throw new TypeCastException("null cannot be cast to non-null type VH");
            }
            Ga.c cVar = (Ga.c) objV;
            HashMap map = (HashMap) eVar.f1663x;
            Class<?> cls = cVar.getClass();
            v vVar = u.a;
            k kVar = this.f1028f;
            kVar.getClass();
            HashMap map2 = (HashMap) kVar.f13638s;
            kVar.o(cVar, (SparseArray) map2.get(vVar.b(Ga.c.class)));
            for (Map.Entry entry : map2.entrySet()) {
                InterfaceC0175c interfaceC0175c3 = (InterfaceC0175c) entry.getKey();
                SparseArray sparseArray = (SparseArray) entry.getValue();
                boolean zA = i.a(interfaceC0175c3, u.a.b(Ga.c.class));
                boolean zIsAssignableFrom = p068ga.d.o(interfaceC0175c3).isAssignableFrom(cVar.getClass());
                if (!zA && zIsAssignableFrom) {
                    kVar.o(cVar, sparseArray);
                }
            }
            return cVar;
        } catch (Exception e10) {
            InterfaceC0175c interfaceC0175c4 = (InterfaceC0175c) eVar.f1659t;
            if (interfaceC0175c4 != null) {
                throw new RuntimeException(String.format("Could not invoke constructor for '%s', '%s'", Arrays.copyOf(new Object[]{interfaceC0175c4.toString(), e10.getMessage()}, 2)), e10);
            }
            i.l();
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(Ga.c cVar) {
        Iterator it = this.f1029g.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    public final void q() {
        this.f1026d = this.f1031i.size();
        this.a.b();
    }
}
