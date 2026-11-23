package K4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {
    public final void a(int i10, String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            writableDatabase.delete("bookmark", "post_type='" + str + "' AND post_id=" + i10, null);
        } catch (Throwable unused) {
        }
        writableDatabase.close();
    }

    public final boolean b(int i10, String str) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM bookmark WHERE post_id=" + i10 + " AND post_type='" + str + '\'', null);
        try {
            return cursorRawQuery.getCount() != 0;
        } catch (Exception unused) {
            return false;
        } finally {
            cursorRawQuery.close();
            readableDatabase.close();
        }
    }

    public final void c(int i10, String str, int i11, String str2, String str3) {
        p210v8.i.f(str2, "image");
        p210v8.i.f(str3, "title");
        ContentValues contentValues = new ContentValues();
        contentValues.put("post_type", str);
        contentValues.put("post_id", Integer.valueOf(i11));
        contentValues.put(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, Integer.valueOf(i10));
        contentValues.put("title", str3);
        contentValues.put("image", str2);
        contentValues.put(p084i6.e.TIME, Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            if (writableDatabase.update("bookmark", contentValues, "post_id=" + i11 + " AND post_type='" + str + '\'', null) == 0) {
                writableDatabase.insertWithOnConflict("bookmark", "post_id", contentValues, 5);
            }
        } catch (Throwable unused) {
        }
        writableDatabase.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        p210v8.i.f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE bookmark (id INTEGER PRIMARY KEY, post_type TEXT NOT NULL, post_id INT NOT NULL, type INT NOT NULL, title TEXT NOT NULL, image TEXT NOT NULL, time INT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        p210v8.i.f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bookmark");
    }
}
