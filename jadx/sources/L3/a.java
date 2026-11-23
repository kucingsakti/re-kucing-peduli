package L3;

import Q3.C0389l0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import i2.i;
import p138o2.h;
import p148p2.e;
import p148p2.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p073h4.a, p158q2.a, e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f2776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2778u;

    public /* synthetic */ a(long j, Object obj, Object obj2) {
        this.f2777t = obj;
        this.f2778u = obj2;
        this.f2776s = j;
    }

    @Override // p148p2.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((p108l2.c) this.f2778u).f12908s;
        String string = Integer.toString(i10);
        String str = (String) this.f2777t;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z6 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f2776s;
            if (z6) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p158q2.a
    public Object b() {
        h hVar = (h) this.f2777t;
        long jK = hVar.f13701g.k() + this.f2776s;
        g gVar = (g) hVar.f13697c;
        i iVar = (i) this.f2778u;
        gVar.getClass();
        gVar.c(new com.unity3d.services.core.network.core.a(jK, iVar));
        return null;
    }

    @Override // p073h4.a
    public void c(p073h4.b bVar) {
        b bVar2 = (b) bVar.get();
        C0389l0 c0389l0 = (C0389l0) this.f2778u;
        bVar2.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        bVar2.a.a(new a((String) this.f2777t, this.f2776s, c0389l0));
    }

    public /* synthetic */ a(String str, long j, C0389l0 c0389l0) {
        this.f2777t = str;
        this.f2776s = j;
        this.f2778u = c0389l0;
    }
}
