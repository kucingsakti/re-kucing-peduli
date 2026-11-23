package P0;

import L8.C0289x;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f3806u = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f3807v = new String[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SQLiteDatabase f3808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f3809t;

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f3808s = sQLiteDatabase;
        this.f3809t = sQLiteDatabase.getAttachedDbs();
    }

    public final void a() {
        this.f3808s.beginTransaction();
    }

    public final void b() {
        this.f3808s.beginTransactionNonExclusive();
    }

    public final j c(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f3808s.compileStatement(str);
        p210v8.i.e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new j(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3808s.close();
    }

    public final void g() {
        this.f3808s.endTransaction();
    }

    public final void h(String str) {
        p210v8.i.f(str, "sql");
        this.f3808s.execSQL(str);
    }

    public final boolean i() {
        return this.f3808s.inTransaction();
    }

    public final boolean j() {
        SQLiteDatabase sQLiteDatabase = this.f3808s;
        p210v8.i.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor l(O0.e eVar) {
        final b bVar = new b(eVar);
        Cursor cursorRawQueryWithFactory = this.f3808s.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: P0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                b bVar2 = bVar;
                p210v8.i.c(sQLiteQuery);
                bVar2.f3805s.b(new i(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.a(), f3807v, null);
        p210v8.i.e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final Cursor n(String str) {
        p210v8.i.f(str, "query");
        return l(new C0289x(str));
    }

    public final void o() {
        this.f3808s.setTransactionSuccessful();
    }
}
