package I3;

import Q3.u0;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f f2025z = new f(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f2026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f2027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f2028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f2029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f2030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference f2031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p170r3.e f2032y;

    public g(ArrayList arrayList, ArrayList arrayList2, p170r3.e eVar) {
        J3.k kVar = J3.k.f2402s;
        this.f2026s = new HashMap();
        this.f2027t = new HashMap();
        this.f2028u = new HashMap();
        this.f2029v = new HashSet();
        this.f2031x = new AtomicReference();
        k kVar2 = new k();
        this.f2030w = kVar2;
        this.f2032y = eVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(kVar2, k.class, p042e4.c.class, p042e4.b.class));
        arrayList3.add(b.c(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p073h4.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f2032y.g(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((b) it4.next()).f2018b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f2029v.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f2029v.add(obj.toString());
                    }
                }
            }
            if (this.f2026s.isEmpty()) {
                u0.c(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f2026s.keySet());
                arrayList6.addAll(arrayList3);
                u0.c(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f2026s.put(bVar2, new l(new D3.c(this, 1, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f2031x.get();
        if (bool != null) {
            g(this.f2026s, bool.booleanValue());
        }
    }

    @Override // I3.c
    public final Object a(Class cls) {
        return b(p.a(cls));
    }

    @Override // I3.c
    public final Object b(p pVar) {
        p073h4.b bVarF = f(pVar);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    @Override // I3.c
    public final Set c(p pVar) {
        p073h4.b bVar;
        synchronized (this) {
            bVar = (m) this.f2028u.get(pVar);
            if (bVar == null) {
                bVar = f2025z;
            }
        }
        return (Set) bVar.get();
    }

    @Override // I3.c
    public final p073h4.b d(Class cls) {
        return f(p.a(cls));
    }

    @Override // I3.c
    public final n e(p pVar) {
        p073h4.b bVarF = f(pVar);
        if (bVarF == null) {
            return new n(n.f2043c, n.f2044d);
        }
        return bVarF instanceof n ? (n) bVarF : new n(null, bVarF);
    }

    @Override // I3.c
    public final synchronized p073h4.b f(p pVar) {
        p181s3.a.b(pVar, "Null interface requested.");
        return (p073h4.b) this.f2027t.get(pVar);
    }

    public final void g(HashMap map, boolean z6) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            p073h4.b bVar2 = (p073h4.b) entry.getValue();
            int i10 = bVar.f2020d;
            if (i10 == 1 || (i10 == 2 && z6)) {
                bVar2.get();
            }
        }
        k kVar = this.f2030w;
        synchronized (kVar) {
            arrayDeque = kVar.f2038b;
            if (arrayDeque != null) {
                kVar.f2038b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw E0.a.e(it);
            }
        }
    }

    public final void h() {
        for (b bVar : this.f2026s.keySet()) {
            for (j jVar : bVar.f2019c) {
                boolean z6 = jVar.f2036b == 2;
                p pVar = jVar.a;
                if (z6) {
                    HashMap map = this.f2028u;
                    if (!map.containsKey(pVar)) {
                        Set set = Collections.EMPTY_SET;
                        m mVar = new m();
                        mVar.f2042b = null;
                        mVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        mVar.a.addAll(set);
                        map.put(pVar, mVar);
                    }
                }
                HashMap map2 = this.f2027t;
                if (map2.containsKey(pVar)) {
                    continue;
                } else {
                    int i10 = jVar.f2036b;
                    if (i10 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + pVar);
                    }
                    if (i10 != 2) {
                        map2.put(pVar, new n(n.f2043c, n.f2044d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f2021e == 0) {
                p073h4.b bVar2 = (p073h4.b) this.f2026s.get(bVar);
                for (p pVar : bVar.f2018b) {
                    HashMap map = this.f2027t;
                    if (map.containsKey(pVar)) {
                        arrayList2.add(new D4.a((n) ((p073h4.b) map.get(pVar)), 2, bVar2));
                    } else {
                        map.put(pVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2026s.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f2021e != 0) {
                p073h4.b bVar2 = (p073h4.b) entry.getValue();
                for (p pVar : bVar.f2018b) {
                    if (!map.containsKey(pVar)) {
                        map.put(pVar, new HashSet());
                    }
                    ((Set) map.get(pVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f2028u;
            if (map2.containsKey(key)) {
                m mVar = (m) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new D4.a(mVar, 3, (p073h4.b) it.next()));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f2042b = null;
                mVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.a.addAll(set);
                map2.put(pVar2, mVar2);
            }
        }
        return arrayList;
    }
}
