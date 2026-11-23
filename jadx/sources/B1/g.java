package B1;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final r a = new r(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f584b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f585c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f586d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f588f;

    public g(int i10) {
        this.f587e = i10;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i10, Class cls) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void c(int i10) {
        while (this.f588f > i10) {
            Object objW = this.a.w();
            U1.f.b(objW);
            c cVarE = e(objW.getClass());
            this.f588f -= cVarE.b() * cVarE.a(objW);
            b(cVarE.a(objW), objW.getClass());
            if (Log.isLoggable(cVarE.c(), 2)) {
                cVarE.a(objW);
            }
        }
    }

    public final synchronized Object d(int i10, Class cls) {
        e eVar;
        int i11;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i10));
            if (num == null || ((i11 = this.f588f) != 0 && this.f587e / i11 < 2 && num.intValue() > i10 * 8)) {
                f fVar = this.f584b;
                j jVarX0 = (j) ((ArrayDeque) fVar.f577s).poll();
                if (jVarX0 == null) {
                    jVarX0 = fVar.X0();
                }
                eVar = (e) jVarX0;
                eVar.f581b = i10;
                eVar.f582c = cls;
            } else {
                f fVar2 = this.f584b;
                int iIntValue = num.intValue();
                j jVarX1 = (j) ((ArrayDeque) fVar2.f577s).poll();
                if (jVarX1 == null) {
                    jVarX1 = fVar2.X0();
                }
                eVar = (e) jVarX1;
                eVar.f581b = iIntValue;
                eVar.f582c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(eVar, cls);
    }

    public final c e(Class cls) {
        c cVar;
        HashMap map = this.f586d;
        c cVar2 = (c) map.get(cls);
        if (cVar2 != null) {
            return cVar2;
        }
        if (cls.equals(int[].class)) {
            cVar = new c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            cVar = new c(0);
        }
        map.put(cls, cVar);
        return cVar;
    }

    public final Object f(e eVar, Class cls) {
        c cVarE = e(cls);
        Object objN = this.a.n(eVar);
        if (objN != null) {
            this.f588f -= cVarE.b() * cVarE.a(objN);
            b(cVarE.a(objN), cls);
        }
        if (objN != null) {
            return objN;
        }
        Log.isLoggable(cVarE.c(), 2);
        int i10 = eVar.f581b;
        switch (cVarE.a) {
            case 0:
                return new byte[i10];
            default:
                return new int[i10];
        }
    }

    public final NavigableMap g(Class cls) {
        HashMap map = this.f585c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        c cVarE = e(cls);
        int iA = cVarE.a(obj);
        int iB = cVarE.b() * iA;
        if (iB <= this.f587e / 2) {
            f fVar = this.f584b;
            j jVarX0 = (j) ((ArrayDeque) fVar.f577s).poll();
            if (jVarX0 == null) {
                jVarX0 = fVar.X0();
            }
            e eVar = (e) jVarX0;
            eVar.f581b = iA;
            eVar.f582c = cls;
            this.a.s(eVar, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(eVar.f581b));
            Integer numValueOf = Integer.valueOf(eVar.f581b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f588f += iB;
            c(this.f587e);
        }
    }

    public final synchronized void i(int i10) {
        try {
            if (i10 >= 40) {
                a();
            } else if (i10 >= 20 || i10 == 15) {
                c(this.f587e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
