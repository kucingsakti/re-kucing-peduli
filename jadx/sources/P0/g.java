package P0;

import I.D;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f3815z = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f3816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f3817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f3818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q0.a f3821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3822y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final D d3, boolean z6) {
        String string;
        super(context, str, null, d3.a, new DatabaseErrorHandler() { // from class: P0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                p210v8.i.f(d3, "$callback");
                d dVar2 = dVar;
                int i10 = g.f3815z;
                p210v8.i.e(sQLiteDatabase, "dbObj");
                c cVarH = com.bumptech.glide.c.h(dVar2, sQLiteDatabase);
                SQLiteDatabase sQLiteDatabase2 = cVarH.f3808s;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        D.b(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = cVarH.f3809t;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        cVarH.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            p210v8.i.e(obj, "p.second");
                            D.b((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            D.b(path2);
                        }
                    }
                }
            }
        });
        p210v8.i.f(context, "context");
        p210v8.i.f(d3, "callback");
        this.f3816s = context;
        this.f3817t = dVar;
        this.f3818u = d3;
        this.f3819v = z6;
        if (str == null) {
            string = UUID.randomUUID().toString();
            p210v8.i.e(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        File cacheDir = context.getCacheDir();
        p210v8.i.e(cacheDir, "context.cacheDir");
        this.f3821x = new Q0.a(string, cacheDir, false);
    }

    public final c a(boolean z6) {
        Q0.a aVar = this.f3821x;
        try {
            aVar.a((this.f3822y || getDatabaseName() == null) ? false : true);
            this.f3820w = false;
            SQLiteDatabase sQLiteDatabaseC = c(z6);
            if (!this.f3820w) {
                return com.bumptech.glide.c.h(this.f3817t, sQLiteDatabaseC);
            }
            close();
            return a(z6);
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase b(boolean z6) {
        if (z6) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            p210v8.i.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        p210v8.i.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase c(boolean z6) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f3816s;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z6);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z6);
            } catch (Throwable th) {
                super.close();
                if (th instanceof f) {
                    f fVar = th;
                    int iD = p239z.e.d(fVar.f3813s);
                    Throwable th2 = fVar.f3814t;
                    if (iD == 0 || iD == 1 || iD == 2 || iD == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f3819v) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z6);
                } catch (f e10) {
                    throw e10.f3814t;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        Q0.a aVar = this.f3821x;
        try {
            aVar.a(aVar.a);
            super.close();
            this.f3817t.f3811t = null;
            this.f3822y = false;
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        p210v8.i.f(sQLiteDatabase, "db");
        try {
            D d3 = this.f3818u;
            com.bumptech.glide.c.h(this.f3817t, sQLiteDatabase);
            d3.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        p210v8.i.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3818u.d(com.bumptech.glide.c.h(this.f3817t, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        p210v8.i.f(sQLiteDatabase, "db");
        this.f3820w = true;
        try {
            this.f3818u.f(com.bumptech.glide.c.h(this.f3817t, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        p210v8.i.f(sQLiteDatabase, "db");
        if (!this.f3820w) {
            try {
                this.f3818u.e(com.bumptech.glide.c.h(this.f3817t, sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f3822y = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        p210v8.i.f(sQLiteDatabase, "sqLiteDatabase");
        this.f3820w = true;
        try {
            this.f3818u.f(com.bumptech.glide.c.h(this.f3817t, sQLiteDatabase), i10, i11);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
