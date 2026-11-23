package J0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class M {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2260g;

    public M(int i10) {
        this.a = 1;
        this.f2255b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2259f = new p019b9.o(1);
        this.f2260g = new K3.d(28);
    }

    public static void l(Object obj, Object obj2) {
        p210v8.i.f(obj, "key");
        p210v8.i.f(obj2, "value");
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f2259f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        L l4 = (L) view.getLayoutParams();
        this.f2256c = ((StaggeredGridLayoutManager) this.f2260g).f7025s.b(view);
        l4.getClass();
    }

    public void b() {
        ((ArrayList) this.f2259f).clear();
        this.f2255b = Integer.MIN_VALUE;
        this.f2256c = Integer.MIN_VALUE;
        this.f2257d = 0;
    }

    public Object c(Object obj) {
        p210v8.i.f(obj, "key");
        return null;
    }

    public int d() {
        boolean z6 = ((StaggeredGridLayoutManager) this.f2260g).f7030x;
        ArrayList arrayList = (ArrayList) this.f2259f;
        return z6 ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        boolean z6 = ((StaggeredGridLayoutManager) this.f2260g).f7030x;
        ArrayList arrayList = (ArrayList) this.f2259f;
        return z6 ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2260g;
        int iK = staggeredGridLayoutManager.f7025s.k();
        int iG = staggeredGridLayoutManager.f7025s.g();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f2259f).get(i10);
            int iE = staggeredGridLayoutManager.f7025s.e(view);
            int iB = staggeredGridLayoutManager.f7025s.b(view);
            boolean z6 = iE <= iG;
            boolean z10 = iB >= iK;
            if (z6 && z10 && (iE < iK || iB > iG)) {
                return androidx.recyclerview.widget.w.M(view);
            }
            i10 += i12;
        }
        return -1;
    }

    public Object g(Object obj) {
        Object objPut;
        p210v8.i.f(obj, "key");
        synchronized (((K3.d) this.f2260g)) {
            p019b9.o oVar = (p019b9.o) this.f2259f;
            oVar.getClass();
            Object obj2 = oVar.a.get(obj);
            if (obj2 != null) {
                this.f2257d++;
                return obj2;
            }
            this.f2258e++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((K3.d) this.f2260g)) {
                p019b9.o oVar2 = (p019b9.o) this.f2259f;
                oVar2.getClass();
                objPut = oVar2.a.put(obj, objC);
                if (objPut != null) {
                    p019b9.o oVar3 = (p019b9.o) this.f2259f;
                    oVar3.getClass();
                    oVar3.a.put(obj, objPut);
                } else {
                    int i10 = this.f2256c;
                    l(obj, objC);
                    this.f2256c = i10 + 1;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            m(this.f2255b);
            return objC;
        }
    }

    public int h(int i10) {
        int i11 = this.f2256c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f2259f).size() == 0) {
            return i10;
        }
        a();
        return this.f2256c;
    }

    public View i(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f2260g;
        ArrayList arrayList = (ArrayList) this.f2259f;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f7030x && androidx.recyclerview.widget.w.M(view2) >= i10) || ((!staggeredGridLayoutManager.f7030x && androidx.recyclerview.widget.w.M(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f7030x && androidx.recyclerview.widget.w.M(view3) <= i10) || ((!staggeredGridLayoutManager.f7030x && androidx.recyclerview.widget.w.M(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public int j(int i10) {
        int i11 = this.f2255b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f2259f).size() == 0) {
            return i10;
        }
        View view = (View) ((ArrayList) this.f2259f).get(0);
        L l4 = (L) view.getLayoutParams();
        this.f2255b = ((StaggeredGridLayoutManager) this.f2260g).f7025s.e(view);
        l4.getClass();
        return this.f2255b;
    }

    public Object k(Object obj, Object obj2) {
        Object objPut;
        p210v8.i.f(obj, "key");
        synchronized (((K3.d) this.f2260g)) {
            int i10 = this.f2256c;
            l(obj, obj2);
            this.f2256c = i10 + 1;
            p019b9.o oVar = (p019b9.o) this.f2259f;
            oVar.getClass();
            objPut = oVar.a.put(obj, obj2);
            if (objPut != null) {
                int i11 = this.f2256c;
                l(obj, objPut);
                this.f2256c = i11 - 1;
            }
        }
        m(this.f2255b);
        return objPut;
    }

    public void m(int i10) {
        Object value;
        while (true) {
            synchronized (((K3.d) this.f2260g)) {
                try {
                    if (this.f2256c < 0 || (((p019b9.o) this.f2259f).a.isEmpty() && this.f2256c != 0)) {
                        break;
                    }
                    if (this.f2256c > i10 && !((p019b9.o) this.f2259f).a.isEmpty()) {
                        Set setEntrySet = ((p019b9.o) this.f2259f).a.entrySet();
                        p210v8.i.e(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) p086i8.k.U(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        value = entry.getValue();
                        p019b9.o oVar = (p019b9.o) this.f2259f;
                        oVar.getClass();
                        p210v8.i.f(key, "key");
                        oVar.a.remove(key);
                        int i11 = this.f2256c;
                        l(key, value);
                        this.f2256c = i11 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            p210v8.i.f(value, "oldValue");
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                synchronized (((K3.d) this.f2260g)) {
                    try {
                        int i10 = this.f2257d;
                        int i11 = this.f2258e + i10;
                        str = "LruCache[maxSize=" + this.f2255b + ",hits=" + this.f2257d + ",misses=" + this.f2258e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public M(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.a = 0;
        this.f2260g = staggeredGridLayoutManager;
        this.f2259f = new ArrayList();
        this.f2255b = Integer.MIN_VALUE;
        this.f2256c = Integer.MIN_VALUE;
        this.f2257d = 0;
        this.f2258e = i10;
    }
}
