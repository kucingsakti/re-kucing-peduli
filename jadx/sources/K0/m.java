package K0;

import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p086i8.s;
import p086i8.t;
import p086i8.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public volatile P0.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f2556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.c f2557c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f2560f;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f2558d = d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2561g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f2562h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f2563i = new ThreadLocal();

    public m() {
        p210v8.i.e(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.j = new LinkedHashMap();
    }

    public static Object p(Class cls, O0.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof c) {
            return p(cls, ((c) cVar).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f2559e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().S().i() && this.f2563i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        P0.c cVarS = g().S();
        this.f2558d.d(cVarS);
        if (cVarS.j()) {
            cVarS.b();
        } else {
            cVarS.a();
        }
    }

    public abstract i d();

    public abstract O0.c e(b bVar);

    public List f(LinkedHashMap linkedHashMap) {
        p210v8.i.f(linkedHashMap, "autoMigrationSpecs");
        return s.f12328s;
    }

    public final O0.c g() {
        O0.c cVar = this.f2557c;
        if (cVar != null) {
            return cVar;
        }
        p210v8.i.n("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return u.f12330s;
    }

    public Map i() {
        return t.f12329s;
    }

    public final void j() {
        g().S().g();
        if (g().S().i()) {
            return;
        }
        i iVar = this.f2558d;
        if (iVar.f2533e.compareAndSet(false, true)) {
            Executor executor = iVar.a.f2556b;
            if (executor != null) {
                executor.execute(iVar.f2539l);
            } else {
                p210v8.i.n("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(P0.c cVar) {
        i iVar = this.f2558d;
        iVar.getClass();
        synchronized (iVar.f2538k) {
            if (iVar.f2534f) {
                return;
            }
            cVar.h("PRAGMA temp_store = MEMORY;");
            cVar.h("PRAGMA recursive_triggers='ON';");
            cVar.h("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            iVar.d(cVar);
            iVar.f2535g = cVar.c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            iVar.f2534f = true;
        }
    }

    public final boolean l() {
        P0.c cVar = this.a;
        return p210v8.i.a(cVar != null ? Boolean.valueOf(cVar.f3808s.isOpen()) : null, Boolean.TRUE);
    }

    public final Cursor m(O0.e eVar) {
        a();
        b();
        return g().S().l(eVar);
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            o();
            return objCall;
        } finally {
            j();
        }
    }

    public final void o() {
        g().S().o();
    }
}
