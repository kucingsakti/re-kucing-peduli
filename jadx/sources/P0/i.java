package P0;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class i implements O0.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SQLiteProgram f3830s;

    public i(SQLiteProgram sQLiteProgram) {
        p210v8.i.f(sQLiteProgram, "delegate");
        this.f3830s = sQLiteProgram;
    }

    @Override // O0.d
    public final void I(int i10, long j) {
        this.f3830s.bindLong(i10, j);
    }

    @Override // O0.d
    public final void M(int i10, byte[] bArr) {
        this.f3830s.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3830s.close();
    }

    @Override // O0.d
    public final void m(int i10, String str) {
        p210v8.i.f(str, "value");
        this.f3830s.bindString(i10, str);
    }

    @Override // O0.d
    public final void v(int i10) {
        this.f3830s.bindNull(i10);
    }

    @Override // O0.d
    public final void w(int i10, double d3) {
        this.f3830s.bindDouble(i10, d3);
    }
}
