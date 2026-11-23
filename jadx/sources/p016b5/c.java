package p016b5;

import L9.n;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.debug.internal.logging.b;
import com.onesignal.session.internal.outcomes.impl.o;
import java.io.IOException;
import java.util.ArrayList;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class c extends SQLiteOpenHelper implements p005a5.c {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final int DB_VERSION = 9;
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private final o _outcomeTableProvider;
    public static final a Companion = new a(null);
    private static final Object LOCK = new Object();
    private static final String[] SQL_INDEX_ENTRIES = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i10, int i11, e eVar) {
        this(oVar, context, (i11 & 4) != 0 ? 9 : i10);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                i.e(writableDatabase, "{\n                writableDatabase\n            }");
            } catch (SQLiteCantOpenDatabaseException e10) {
                throw e10;
            } catch (SQLiteDatabaseLockedException e11) {
                throw e11;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i10 = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e10) {
                    i10++;
                    if (i10 >= 5) {
                        throw e10;
                    }
                    SystemClock.sleep(i10 * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e11) {
                    i10++;
                    if (i10 >= 5) {
                        throw e11;
                    }
                    SystemClock.sleep(i10 * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 2 && i11 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 < 3 && i11 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i10 < 4 && i11 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i10 < 5 && i11 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i10 == 5 && i11 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i10 < 7 && i11 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i10 < 8 && i11 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i10 < 9 && i11 >= 9) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    private final void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private final void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private final void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private final void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        upgradeFromV5ToV6(sQLiteDatabase);
    }

    private final void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private final synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        this._outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV9(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision3To4(sQLiteDatabase);
    }

    @Override // p005a5.c
    public void delete(String str, String str2, String[] strArr) {
        String str3;
        String str4;
        i.f(str, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.delete(str, str2, strArr);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str4 = "Error closing transaction! ";
                            b.error(str4, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            b.error(str3, e);
                        }
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e12) {
                            b.error("Error closing transaction! ", e12);
                        } catch (IllegalStateException e13) {
                            b.error("Error closing transaction! ", e13);
                        }
                        throw th;
                    }
                } catch (SQLiteException e14) {
                    b.error("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                } catch (IllegalStateException e17) {
                    b.error("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e17);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p005a5.c
    public void insert(String str, String str2, ContentValues contentValues) {
        String str3;
        String str4;
        i.f(str, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insert(str, str2, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str4 = "Error closing transaction! ";
                            b.error(str4, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            b.error(str3, e);
                        }
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e12) {
                            b.error("Error closing transaction! ", e12);
                        } catch (IllegalStateException e13) {
                            b.error("Error closing transaction! ", e13);
                        }
                        throw th;
                    }
                } catch (SQLiteException e14) {
                    b.error("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                } catch (IllegalStateException e17) {
                    b.error("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e17);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p005a5.c
    public void insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        String str3;
        String str4;
        i.f(str, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insertOrThrow(str, str2, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e10) {
                            e = e10;
                            str4 = "Error closing transaction! ";
                            b.error(str4, e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            str3 = "Error closing transaction! ";
                            b.error(str3, e);
                        }
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e12) {
                            b.error("Error closing transaction! ", e12);
                        } catch (IllegalStateException e13) {
                            b.error("Error closing transaction! ", e13);
                        }
                        throw th;
                    }
                } catch (SQLiteException e14) {
                    b.error("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                } catch (IllegalStateException e17) {
                    b.error("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e17);
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e18) {
                        e = e18;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e19) {
                        e = e19;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        i.f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        sQLiteDatabase.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            sQLiteDatabase.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws IOException {
        i.f(sQLiteDatabase, "db");
        b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList<String> arrayList = new ArrayList(cursorRawQuery.getCount());
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(0);
                i.e(string, "it.getString(0)");
                arrayList.add(string);
            }
            for (String str : arrayList) {
                if (!n.I(str, "sqlite_", false)) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            cursorRawQuery.close();
            onCreate(sQLiteDatabase);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(cursorRawQuery, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        i.f(sQLiteDatabase, "db");
        b.debug$default("OneSignal Database onUpgrade from: " + i10 + " to: " + i11, null, 2, null);
        try {
            internalOnUpgrade(sQLiteDatabase, i10, i11);
        } catch (SQLiteException e10) {
            b.error("Error in upgrade, migration may have already run! Skipping!", e10);
        }
    }

    @Override // p005a5.c
    public void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, p200u8.b bVar) throws IOException {
        Cursor cursorQuery;
        i.f(str, "table");
        i.f(bVar, "action");
        synchronized (LOCK) {
            try {
                if (str6 == null) {
                    cursorQuery = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5);
                    i.e(cursorQuery, "getSQLiteDatabaseWithRet…By,\n                    )");
                } else {
                    cursorQuery = getSQLiteDatabaseWithRetries().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
                    i.e(cursorQuery, "getSQLiteDatabaseWithRet…it,\n                    )");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            bVar.invoke(new p016b5.a(cursorQuery));
            cursorQuery.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                com.bumptech.glide.c.c(cursorQuery, th2);
                throw th3;
            }
        }
    }

    @Override // p005a5.c
    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3;
        String str4;
        i.f(str, "table");
        i.f(contentValues, "values");
        String string = contentValues.toString();
        i.e(string, "values.toString()");
        int iUpdate = 0;
        if (string.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    iUpdate = sQLiteDatabaseWithRetries.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e10) {
                        e = e10;
                        str4 = "Error closing transaction! ";
                        b.error(str4, e);
                    } catch (IllegalStateException e11) {
                        e = e11;
                        str3 = "Error closing transaction! ";
                        b.error(str3, e);
                    }
                } catch (Throwable th) {
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e12) {
                        b.error("Error closing transaction! ", e12);
                    } catch (IllegalStateException e13) {
                        b.error("Error closing transaction! ", e13);
                    }
                    throw th;
                }
            } catch (SQLiteException e14) {
                b.error("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e15) {
                    e = e15;
                    str4 = "Error closing transaction! ";
                    b.error(str4, e);
                } catch (IllegalStateException e16) {
                    e = e16;
                    str3 = "Error closing transaction! ";
                    b.error(str3, e);
                }
            } catch (IllegalStateException e17) {
                b.error("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e17);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e18) {
                    e = e18;
                    str4 = "Error closing transaction! ";
                    b.error(str4, e);
                } catch (IllegalStateException e19) {
                    e = e19;
                    str3 = "Error closing transaction! ";
                    b.error(str3, e);
                }
            }
        }
        return iUpdate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, Context context, int i10) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i10);
        i.f(oVar, "_outcomeTableProvider");
        this._outcomeTableProvider = oVar;
    }
}
