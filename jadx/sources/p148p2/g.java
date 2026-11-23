package p148p2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import i2.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import p051f2.c;
import p158q2.b;
import p169r2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d, b, c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f14209x = new c("proto");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f14210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f14211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f14212u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f14213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Provider f14214w;

    public g(a aVar, a aVar2, a aVar3, i iVar, Provider provider) {
        this.f14210s = iVar;
        this.f14211t = aVar;
        this.f14212u = aVar2;
        this.f14213v = aVar3;
        this.f14214w = provider;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(p180s2.a.a(iVar.f12182c))));
        byte[] bArr = iVar.f12181b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String j(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object l(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.f14210s;
        Objects.requireNonNull(iVar);
        a aVar = this.f14212u;
        long jK = aVar.k();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.k() >= ((long) this.f14213v.f14203c) + jK) {
                    throw new SynchronizationException("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(e eVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = eVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14210s.close();
    }

    public final ArrayList g(SQLiteDatabase sQLiteDatabase, i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, iVar);
        if (lB == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i10)), new p128n2.b(this, (Object) arrayList, iVar, 3));
        return arrayList;
    }

    public final void h(long j, p108l2.c cVar, String str) {
        c(new L3.a(j, str, cVar));
    }

    public final Object i(p158q2.a aVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        a aVar2 = this.f14212u;
        long jK = aVar2.k();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objB = aVar.b();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objB;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar2.k() >= ((long) this.f14213v.f14203c) + jK) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
