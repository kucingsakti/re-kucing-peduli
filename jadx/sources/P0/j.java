package P0;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements O0.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SQLiteStatement f3831t;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3831t = sQLiteStatement;
    }

    public final int a() {
        return this.f3831t.executeUpdateDelete();
    }
}
