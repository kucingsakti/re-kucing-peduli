package J3;

import A1.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements h, p158q2.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f2373u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2374v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2375w;

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i10) {
        this.f2371s = i10;
        this.f2372t = gVar;
        this.f2375w = obj;
        this.f2373u = j;
        this.f2374v = timeUnit;
    }

    @Override // J3.h
    public ScheduledFuture a(r rVar) {
        switch (this.f2371s) {
            case 0:
                g gVar = (g) this.f2372t;
                return gVar.f2394t.schedule(new e(gVar, (Runnable) this.f2375w, rVar, 1), this.f2373u, (TimeUnit) this.f2374v);
            default:
                g gVar2 = (g) this.f2372t;
                return gVar2.f2394t.schedule(new f(gVar2, (Callable) this.f2375w, rVar, 0), this.f2373u, (TimeUnit) this.f2374v);
        }
    }

    @Override // p158q2.a
    public Object b() {
        p138o2.h hVar = (p138o2.h) this.f2372t;
        p148p2.g gVar = (p148p2.g) hVar.f13697c;
        gVar.getClass();
        Iterable iterable = (Iterable) this.f2375w;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + p148p2.g.j(iterable);
            SQLiteDatabase sQLiteDatabaseA = gVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gVar.h(cursorRawQuery.getInt(0), p108l2.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        gVar.c(new com.unity3d.services.core.network.core.a(hVar.f13701g.k() + this.f2373u, (i2.i) this.f2374v));
        return null;
    }

    public /* synthetic */ b(p138o2.h hVar, Iterable iterable, i2.i iVar, long j) {
        this.f2371s = 2;
        this.f2372t = hVar;
        this.f2375w = iterable;
        this.f2374v = iVar;
        this.f2373u = j;
    }
}
