package p061g1;

import B4.I;
import J.d;
import J3.f;
import M2.O;
import Y1.c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o1.i;
import o1.o;
import p050f1.b;
import p050f1.q;
import p078i.ExecutorC0659p;
import p147p1.m;
import p157q1.a;
import p157q1.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f11470E = q.c("Processor");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f11471A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f11476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f11477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f11478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WorkDatabase f11479w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f11481y = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f11480x = new HashMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashSet f11472B = new HashSet();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f11473C = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PowerManager.WakeLock f11475s = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f11474D = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f11482z = new HashMap();

    public e(Context context, b bVar, c cVar, WorkDatabase workDatabase, List list) {
        this.f11476t = context;
        this.f11477u = bVar;
        this.f11478v = cVar;
        this.f11479w = workDatabase;
        this.f11471A = list;
    }

    public static boolean c(p pVar) {
        if (pVar == null) {
            q.a().getClass();
            return false;
        }
        pVar.f11516J = true;
        pVar.k();
        pVar.f11515I.cancel(true);
        if (pVar.f11522x == null || !(pVar.f11515I.f14401s instanceof a)) {
            Objects.toString(pVar.f11521w);
            q.a().getClass();
        } else {
            pVar.f11522x.stop();
        }
        q.a().getClass();
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f11474D) {
            this.f11473C.add(cVar);
        }
    }

    public final o b(String str) {
        synchronized (this.f11474D) {
            try {
                p pVar = (p) this.f11480x.get(str);
                if (pVar == null) {
                    pVar = (p) this.f11481y.get(str);
                }
                if (pVar == null) {
                    return null;
                }
                return pVar.f11521w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.f11474D) {
            zContains = this.f11472B.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z6;
        synchronized (this.f11474D) {
            try {
                z6 = this.f11481y.containsKey(str) || this.f11480x.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // p061g1.c
    public final void f(i iVar, boolean z6) {
        synchronized (this.f11474D) {
            try {
                p pVar = (p) this.f11481y.get(iVar.a);
                if (pVar != null && iVar.equals(C3.a.g(pVar.f11521w))) {
                    this.f11481y.remove(iVar.a);
                }
                q.a().getClass();
                Iterator it = this.f11473C.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f(iVar, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(c cVar) {
        synchronized (this.f11474D) {
            this.f11473C.remove(cVar);
        }
    }

    public final void h(i iVar) {
        c cVar = this.f11478v;
        ((O) cVar.f5672v).execute(new D4.a(this, 14, iVar));
    }

    public final void i(String str, p050f1.i iVar) {
        synchronized (this.f11474D) {
            try {
                q.a().b(f11470E, "Moving WorkSpec (" + str + ") to the foreground");
                p pVar = (p) this.f11481y.remove(str);
                if (pVar != null) {
                    if (this.f11475s == null) {
                        PowerManager.WakeLock wakeLockA = m.a(this.f11476t, "ProcessorForegroundLck");
                        this.f11475s = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f11480x.put(str, pVar);
                    Intent intentB = p127n1.a.b(this.f11476t, C3.a.g(pVar.f11521w), iVar);
                    Context context = this.f11476t;
                    if (Build.VERSION.SDK_INT >= 26) {
                        d.b(context, intentB);
                    } else {
                        context.startService(intentB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(i iVar, c cVar) throws Throwable {
        Throwable th;
        i iVar2 = iVar.a;
        String str = iVar2.a;
        ArrayList arrayList = new ArrayList();
        o oVar = (o) this.f11479w.n(new f(this, arrayList, str, 1));
        if (oVar == null) {
            q.a().d(f11470E, "Didn't find WorkSpec for id " + iVar2);
            h(iVar2);
            return false;
        }
        synchronized (this.f11474D) {
            try {
                try {
                    try {
                        if (e(str)) {
                            Set set = (Set) this.f11482z.get(str);
                            if (((i) set.iterator().next()).a.f13636b == iVar2.f13636b) {
                                set.add(iVar);
                                q qVarA = q.a();
                                iVar2.toString();
                                qVarA.getClass();
                            } else {
                                h(iVar2);
                            }
                            return false;
                        }
                        if (oVar.f13663t != iVar2.f13636b) {
                            h(iVar2);
                            return false;
                        }
                        Context context = this.f11476t;
                        b bVar = this.f11477u;
                        c cVar2 = this.f11478v;
                        WorkDatabase workDatabase = this.f11479w;
                        V3.b bVar2 = new V3.b();
                        bVar2.f5179i = new c(8);
                        bVar2.a = context.getApplicationContext();
                        bVar2.f5173c = cVar2;
                        bVar2.f5172b = this;
                        bVar2.f5174d = bVar;
                        bVar2.f5175e = workDatabase;
                        bVar2.f5176f = oVar;
                        bVar2.f5178h = arrayList;
                        bVar2.f5177g = this.f11471A;
                        if (cVar != null) {
                            bVar2.f5179i = cVar;
                        }
                        p pVar = new p(bVar2);
                        k kVar = pVar.f11514H;
                        kVar.f(new I(this, iVar.a, kVar, 13, false), (O) this.f11478v.f5672v);
                        this.f11481y.put(str, pVar);
                        HashSet hashSet = new HashSet();
                        hashSet.add(iVar);
                        this.f11482z.put(str, hashSet);
                        ((ExecutorC0659p) this.f11478v.f5670t).execute(pVar);
                        q qVarA2 = q.a();
                        iVar2.toString();
                        qVarA2.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }

    public final void k(String str) {
        synchronized (this.f11474D) {
            this.f11480x.remove(str);
            l();
        }
    }

    public final void l() {
        synchronized (this.f11474D) {
            try {
                if (this.f11480x.isEmpty()) {
                    Context context = this.f11476t;
                    String str = p127n1.a.f13300B;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f11476t.startService(intent);
                    } catch (Throwable unused) {
                        q.a().getClass();
                    }
                    PowerManager.WakeLock wakeLock = this.f11475s;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f11475s = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(i iVar) {
        String str = iVar.a.a;
        synchronized (this.f11474D) {
            try {
                p pVar = (p) this.f11481y.remove(str);
                if (pVar == null) {
                    q.a().getClass();
                    return;
                }
                Set set = (Set) this.f11482z.get(str);
                if (set != null && set.contains(iVar)) {
                    q.a().getClass();
                    this.f11482z.remove(str);
                    c(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
