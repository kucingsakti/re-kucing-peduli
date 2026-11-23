package K0;

import A1.r;
import E4.C0187a;
import android.app.ActivityManager;
import android.content.Context;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p086i8.t;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f2546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f2547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0187a f2548i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f2553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f2554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f2555q;

    public l(Context context, Class cls, String str) {
        p210v8.i.f(context, "context");
        this.a = context;
        this.f2541b = cls;
        this.f2542c = str;
        this.f2543d = new ArrayList();
        this.f2544e = new ArrayList();
        this.f2545f = new ArrayList();
        this.f2549k = 1;
        this.f2550l = true;
        this.f2552n = -1L;
        this.f2553o = new r(18);
        this.f2554p = new LinkedHashSet();
    }

    public final void a(L0.a... aVarArr) {
        p210v8.i.f(aVarArr, "migrations");
        if (this.f2555q == null) {
            this.f2555q = new HashSet();
        }
        for (L0.a aVar : aVarArr) {
            HashSet hashSet = this.f2555q;
            p210v8.i.c(hashSet);
            hashSet.add(Integer.valueOf(aVar.a));
            HashSet hashSet2 = this.f2555q;
            p210v8.i.c(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f2732b));
        }
        this.f2553o.H((L0.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public final m b() {
        int i10;
        boolean zContainsKey;
        Executor executor = this.f2546g;
        if (executor == null && this.f2547h == null) {
            G0.b bVar = p155q.a.f14245e;
            this.f2547h = bVar;
            this.f2546g = bVar;
        } else if (executor != null && this.f2547h == null) {
            this.f2547h = executor;
        } else if (executor == null) {
            this.f2546g = this.f2547h;
        }
        HashSet hashSet = this.f2555q;
        LinkedHashSet linkedHashSet = this.f2554p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC0487g.g(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        O0.b dVar = this.f2548i;
        if (dVar == null) {
            dVar = new K3.d(10);
        }
        O0.b bVar2 = dVar;
        if (this.f2552n > 0) {
            if (this.f2542c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f2543d;
        boolean z6 = this.j;
        int i11 = this.f2549k;
        if (i11 == 0) {
            throw null;
        }
        Context context = this.a;
        p210v8.i.f(context, "context");
        if (i11 != 1) {
            i10 = i11;
        } else {
            Object systemService = context.getSystemService("activity");
            p210v8.i.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (((ActivityManager) systemService).isLowRamDevice()) {
                i11 = 2;
                i10 = i11;
            } else {
                i10 = 3;
            }
        }
        Executor executor2 = this.f2546g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f2547h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b bVar3 = new b(context, this.f2542c, bVar2, this.f2553o, arrayList, z6, i10, executor2, executor3, this.f2550l, this.f2551m, linkedHashSet, this.f2544e, this.f2545f);
        Class cls = this.f2541b;
        Package r10 = cls.getPackage();
        p210v8.i.c(r10);
        String name = r10.getName();
        String canonicalName = cls.getCanonicalName();
        p210v8.i.c(canonicalName);
        p210v8.i.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            p210v8.i.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = L9.n.F(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, cls.getClassLoader());
            p210v8.i.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            m mVar = (m) cls2.newInstance();
            mVar.getClass();
            mVar.f2557c = mVar.e(bVar3);
            Set setH = mVar.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = mVar.f2561g;
                ArrayList arrayList2 = bVar3.f2523n;
                if (zHasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    while (true) {
                        int i12 = size - 1;
                        if (cls3.isAssignableFrom(arrayList2.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        if (i12 < 0) {
                            size = -1;
                            break;
                        }
                        size = i12;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls3, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size2 = i13;
                        }
                    }
                    for (L0.a aVar : mVar.f(linkedHashMap)) {
                        int i14 = aVar.a;
                        r rVar = bVar3.f2514d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) rVar.f167t;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                            if (map == null) {
                                map = t.f12329s;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(aVar.f2732b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            rVar.H(aVar);
                        }
                    }
                    mVar.g().setWriteAheadLoggingEnabled(bVar3.f2517g == 3);
                    mVar.f2560f = bVar3.f2515e;
                    mVar.f2556b = bVar3.f2518h;
                    p210v8.i.f(bVar3.f2519i, "executor");
                    new ArrayDeque();
                    mVar.f2559e = bVar3.f2516f;
                    Map mapI = mVar.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = bVar3.f2522m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i15 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i15 >= 0) {
                                        size3 = i15;
                                    }
                                }
                            }
                            return mVar;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 < 0) {
                                size4 = -1;
                                break;
                            }
                            while (true) {
                                int i16 = size4 - 1;
                                if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                    bitSet2.set(size4);
                                    break;
                                }
                                if (i16 < 0) {
                                    size4 = -1;
                                    break;
                                }
                                size4 = i16;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            mVar.j.put(cls5, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }
}
