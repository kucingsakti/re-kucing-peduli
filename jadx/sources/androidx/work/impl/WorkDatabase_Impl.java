package androidx.work.impl;

import I.D;
import K0.b;
import K0.i;
import O0.a;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.c;
import o1.e;
import o1.f;
import o1.h;
import o1.k;
import o1.m;
import o1.p;
import o1.r;
import p061g1.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile p f7216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile c f7217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile r f7218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile h f7219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile k f7220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile m f7221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile e f7222q;

    @Override // K0.m
    public final i d() {
        return new i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // K0.m
    public final O0.c e(b bVar) {
        D d3 = new D(bVar, new p061g1.m(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = bVar.a;
        p210v8.i.f(context, "context");
        return bVar.f2513c.a(new a(context, bVar.f2512b, d3, false, false));
    }

    @Override // K0.m
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new d(13, 14, 9), new d());
    }

    @Override // K0.m
    public final Set h() {
        return new HashSet();
    }

    @Override // K0.m
    public final Map i() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(p.class, list);
        map.put(c.class, list);
        map.put(r.class, list);
        map.put(h.class, list);
        map.put(k.class, list);
        map.put(m.class, list);
        map.put(e.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c q() {
        c cVar;
        if (this.f7217l != null) {
            return this.f7217l;
        }
        synchronized (this) {
            try {
                if (this.f7217l == null) {
                    this.f7217l = new c(this);
                }
                cVar = this.f7217l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e r() {
        e eVar;
        if (this.f7222q != null) {
            return this.f7222q;
        }
        synchronized (this) {
            try {
                if (this.f7222q == null) {
                    this.f7222q = new e(this);
                }
                eVar = this.f7222q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h s() {
        h hVar;
        if (this.f7219n != null) {
            return this.f7219n;
        }
        synchronized (this) {
            try {
                if (this.f7219n == null) {
                    this.f7219n = new h(this);
                }
                hVar = this.f7219n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k t() {
        k kVar;
        if (this.f7220o != null) {
            return this.f7220o;
        }
        synchronized (this) {
            try {
                if (this.f7220o == null) {
                    k kVar2 = new k();
                    kVar2.f13638s = this;
                    kVar2.f13639t = new o1.b(this, 3);
                    this.f7220o = kVar2;
                }
                kVar = this.f7220o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m u() {
        m mVar;
        if (this.f7221p != null) {
            return this.f7221p;
        }
        synchronized (this) {
            try {
                if (this.f7221p == null) {
                    m mVar2 = new m();
                    mVar2.f13641s = this;
                    mVar2.f13642t = new o1.b(this, 4);
                    mVar2.f13643u = new p085i7.d(this, 3);
                    mVar2.f13644v = new p085i7.d(this, 4);
                    this.f7221p = mVar2;
                }
                mVar = this.f7221p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p v() {
        p pVar;
        if (this.f7216k != null) {
            return this.f7216k;
        }
        synchronized (this) {
            try {
                if (this.f7216k == null) {
                    this.f7216k = new p(this);
                }
                pVar = this.f7216k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r w() {
        r rVar;
        if (this.f7218m != null) {
            return this.f7218m;
        }
        synchronized (this) {
            try {
                if (this.f7218m == null) {
                    this.f7218m = new r(this);
                }
                rVar = this.f7218m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
