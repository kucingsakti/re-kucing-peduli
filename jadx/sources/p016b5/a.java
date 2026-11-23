package p016b5;

import android.database.Cursor;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p005a5.a {
    private final Cursor _cursor;

    public a(Cursor cursor) {
        i.f(cursor, "_cursor");
        this._cursor = cursor;
    }

    @Override // p005a5.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // p005a5.a
    public float getFloat(String str) {
        i.f(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    @Override // p005a5.a
    public int getInt(String str) {
        i.f(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    @Override // p005a5.a
    public long getLong(String str) {
        i.f(str, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    @Override // p005a5.a
    public Float getOptFloat(String str) {
        i.f(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // p005a5.a
    public Integer getOptInt(String str) {
        i.f(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // p005a5.a
    public Long getOptLong(String str) {
        i.f(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // p005a5.a
    public String getOptString(String str) {
        i.f(str, "column");
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // p005a5.a
    public String getString(String str) {
        i.f(str, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(str));
        i.e(string, "_cursor.getString(_cursor.getColumnIndex(column))");
        return string;
    }

    @Override // p005a5.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // p005a5.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
