package com.google.android.gms.measurement.internal;

import M2.AbstractC0305n;
import M2.C0299h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.onesignal.inAppMessages.internal.display.impl.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends AbstractC0305n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0299h f9028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9029v;

    public zzfp(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9028u = new C0299h(this, ((zzhj) this.f577s).f9140s);
    }

    public static long d1(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0154  */
    /* JADX WARN: Code duplicated, block: B:105:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x0165  */
    /* JADX WARN: Code duplicated, block: B:115:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1 A[Catch: all -> 0x0060, SQLiteException -> 0x0064, SQLiteDatabaseLockedException -> 0x006a, SQLiteFullException -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:24:0x0055, B:26:0x005b, B:40:0x007f, B:41:0x0083, B:42:0x0085, B:44:0x00a1, B:45:0x00a5, B:47:0x00a9, B:49:0x00b1, B:65:0x00d9), top: B:112:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105 A[Catch: all -> 0x0109, TryCatch #10 {all -> 0x0109, blocks: (B:78:0x00ff, B:80:0x0105, B:83:0x010d), top: B:121:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137  */
    public final boolean e1(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseH1;
        boolean z6;
        boolean z10;
        Cursor cursorRawQuery;
        long j;
        long j10;
        long jDelete;
        W0();
        boolean z11 = false;
        z11 = false;
        if (!this.f9029v) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(k.EVENT_TYPE_KEY, Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                Cursor cursor = null;
                cursor = null;
                cursor = null;
                cursor = null;
                cursor = null;
                Cursor cursor2 = null;
                Cursor cursor3 = null;
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseH1 = h1();
                    if (sQLiteDatabaseH1 == null) {
                        try {
                            try {
                                try {
                                    this.f9029v = true;
                                    if (sQLiteDatabaseH1 != null) {
                                        sQLiteDatabaseH1.close();
                                    }
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    z6 = z11 ? 1 : 0;
                                    i().f9056x.a(e, "Error writing entry; local database full");
                                    this.f9029v = true;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabaseH1 != null) {
                                        sQLiteDatabaseH1.close();
                                    }
                                    i11++;
                                    z11 = z6;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            z6 = z11 ? 1 : 0;
                            SystemClock.sleep(i12);
                            i12 += 20;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabaseH1 != null) {
                                sQLiteDatabaseH1.close();
                            }
                            i11++;
                            z11 = z6;
                        } catch (SQLiteException e11) {
                            e = e11;
                            z6 = z11 ? 1 : 0;
                            z10 = true;
                            cursorRawQuery = null;
                            sQLiteDatabase = sQLiteDatabaseH1;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseH1 = sQLiteDatabase;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseH1 != null) {
                                        sQLiteDatabaseH1.close();
                                    }
                                    throw th;
                                }
                            }
                            i().f9056x.a(e, "Error writing entry to local database");
                            this.f9029v = z10;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i11++;
                            z11 = z6;
                        }
                    } else {
                        try {
                            sQLiteDatabaseH1.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseH1.rawQuery("select count(1) from messages", null);
                            if (cursorRawQuery == null) {
                                j = 0;
                                if (j >= 100000) {
                                    i().f9056x.b("Data loss, local db full");
                                    j10 = 100001 - j;
                                    jDelete = sQLiteDatabaseH1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                                    if (jDelete != j10) {
                                        zzfy zzfyVar = i().f9056x;
                                        z6 = z11 ? 1 : 0;
                                        z10 = true;
                                        zzfyVar.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                                    } else {
                                        z6 = z11 ? 1 : 0;
                                        z10 = true;
                                    }
                                } else {
                                    z6 = z11 ? 1 : 0;
                                    z10 = true;
                                }
                                sQLiteDatabaseH1.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseH1.setTransactionSuccessful();
                                sQLiteDatabaseH1.endTransaction();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                sQLiteDatabaseH1.close();
                                return z10;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (cursorRawQuery.moveToFirst()) {
                                                j = cursorRawQuery.getLong(z11 ? 1 : 0);
                                            } else {
                                                j = 0;
                                            }
                                            if (j >= 100000) {
                                                try {
                                                    try {
                                                        i().f9056x.b("Data loss, local db full");
                                                        j10 = 100001 - j;
                                                        jDelete = sQLiteDatabaseH1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                                                        if (jDelete != j10) {
                                                            zzfy zzfyVar2 = i().f9056x;
                                                            z6 = z11 ? 1 : 0;
                                                            try {
                                                                try {
                                                                    z10 = true;
                                                                    try {
                                                                        zzfyVar2.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                                                                    } catch (SQLiteFullException e12) {
                                                                        e = e12;
                                                                        cursor3 = cursorRawQuery;
                                                                        i().f9056x.a(e, "Error writing entry; local database full");
                                                                        this.f9029v = true;
                                                                        if (cursor3 != null) {
                                                                            cursor3.close();
                                                                        }
                                                                        if (sQLiteDatabaseH1 != null) {
                                                                            sQLiteDatabaseH1.close();
                                                                        }
                                                                        i11++;
                                                                        z11 = z6;
                                                                    } catch (SQLiteException e13) {
                                                                        e = e13;
                                                                        sQLiteDatabase = sQLiteDatabaseH1;
                                                                        if (sQLiteDatabase != null) {
                                                                            if (sQLiteDatabase.inTransaction()) {
                                                                                sQLiteDatabase.endTransaction();
                                                                            }
                                                                        }
                                                                        i().f9056x.a(e, "Error writing entry to local database");
                                                                        this.f9029v = z10;
                                                                        if (cursorRawQuery != null) {
                                                                            cursorRawQuery.close();
                                                                        }
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.close();
                                                                        }
                                                                        i11++;
                                                                        z11 = z6;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                                    cursor2 = cursorRawQuery;
                                                                    SystemClock.sleep(i12);
                                                                    i12 += 20;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    if (sQLiteDatabaseH1 != null) {
                                                                        sQLiteDatabaseH1.close();
                                                                    }
                                                                    i11++;
                                                                    z11 = z6;
                                                                }
                                                            } catch (SQLiteFullException e14) {
                                                                e = e14;
                                                                cursor3 = cursorRawQuery;
                                                                i().f9056x.a(e, "Error writing entry; local database full");
                                                                this.f9029v = true;
                                                                if (cursor3 != null) {
                                                                    cursor3.close();
                                                                }
                                                                if (sQLiteDatabaseH1 != null) {
                                                                    sQLiteDatabaseH1.close();
                                                                }
                                                                i11++;
                                                                z11 = z6;
                                                            } catch (SQLiteException e15) {
                                                                e = e15;
                                                                z10 = true;
                                                                sQLiteDatabase = sQLiteDatabaseH1;
                                                                if (sQLiteDatabase != null) {
                                                                    if (sQLiteDatabase.inTransaction()) {
                                                                        sQLiteDatabase.endTransaction();
                                                                    }
                                                                }
                                                                i().f9056x.a(e, "Error writing entry to local database");
                                                                this.f9029v = z10;
                                                                if (cursorRawQuery != null) {
                                                                    cursorRawQuery.close();
                                                                }
                                                                if (sQLiteDatabase != null) {
                                                                    sQLiteDatabase.close();
                                                                }
                                                                i11++;
                                                                z11 = z6;
                                                            }
                                                        } else {
                                                            z6 = z11 ? 1 : 0;
                                                            z10 = true;
                                                        }
                                                    } catch (SQLiteFullException e16) {
                                                        e = e16;
                                                        z6 = z11 ? 1 : 0;
                                                    } catch (SQLiteException e17) {
                                                        e = e17;
                                                        z6 = z11 ? 1 : 0;
                                                    }
                                                } catch (SQLiteFullException e18) {
                                                    e = e18;
                                                    z6 = z11 ? 1 : 0;
                                                }
                                            } else {
                                                z6 = z11 ? 1 : 0;
                                                z10 = true;
                                            }
                                            sQLiteDatabaseH1.insertOrThrow("messages", null, contentValues);
                                            sQLiteDatabaseH1.setTransactionSuccessful();
                                            sQLiteDatabaseH1.endTransaction();
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            sQLiteDatabaseH1.close();
                                            return z10;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorRawQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseH1 != null) {
                                                sQLiteDatabaseH1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused3) {
                                        z6 = z11 ? 1 : 0;
                                        cursor2 = cursorRawQuery;
                                        SystemClock.sleep(i12);
                                        i12 += 20;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabaseH1 != null) {
                                            sQLiteDatabaseH1.close();
                                        }
                                        i11++;
                                        z11 = z6;
                                    }
                                } catch (SQLiteFullException e19) {
                                    e = e19;
                                    z6 = z11 ? 1 : 0;
                                    cursor3 = cursorRawQuery;
                                    i().f9056x.a(e, "Error writing entry; local database full");
                                    this.f9029v = true;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabaseH1 != null) {
                                        sQLiteDatabaseH1.close();
                                    }
                                    i11++;
                                    z11 = z6;
                                }
                            } catch (SQLiteException e20) {
                                e = e20;
                                z6 = z11 ? 1 : 0;
                                z10 = true;
                                sQLiteDatabase = sQLiteDatabaseH1;
                                if (sQLiteDatabase != null) {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                }
                                i().f9056x.a(e, "Error writing entry to local database");
                                this.f9029v = z10;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i11++;
                                z11 = z6;
                            }
                        } catch (SQLiteFullException e21) {
                            e = e21;
                            z6 = z11 ? 1 : 0;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z6 = z11 ? 1 : 0;
                    sQLiteDatabaseH1 = null;
                } catch (SQLiteFullException e22) {
                    e = e22;
                    z6 = z11 ? 1 : 0;
                    sQLiteDatabaseH1 = null;
                } catch (SQLiteException e23) {
                    e = e23;
                    z6 = z11 ? 1 : 0;
                    z10 = true;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseH1 = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabaseH1 != null) {
                    sQLiteDatabaseH1.close();
                }
                throw th;
            }
            boolean z12 = z11 ? 1 : 0;
            i().f9052F.b("Failed to write entry to local database");
            return z12;
        }
        return z11;
    }

    public final void f1() {
        int iDelete;
        W0();
        try {
            SQLiteDatabase sQLiteDatabaseH1 = h1();
            if (sQLiteDatabaseH1 == null || (iDelete = sQLiteDatabaseH1.delete("messages", null, null)) <= 0) {
                return;
            }
            i().f9052F.a(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            i().f9056x.a(e10, "Error resetting local analytics data. error");
        }
    }

    public final boolean g1() {
        W0();
        if (!this.f9029v && ((zzhj) this.f577s).f9140s.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseH1 = h1();
                            if (sQLiteDatabaseH1 != null) {
                                sQLiteDatabaseH1.beginTransaction();
                                sQLiteDatabaseH1.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseH1.setTransactionSuccessful();
                                sQLiteDatabaseH1.endTransaction();
                                sQLiteDatabaseH1.close();
                                return true;
                            }
                            this.f9029v = true;
                            if (sQLiteDatabaseH1 != null) {
                                sQLiteDatabaseH1.close();
                            }
                        } catch (SQLiteException e10) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            i().f9056x.a(e10, "Error deleting app launch break from local database");
                            this.f9029v = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e11) {
                    i().f9056x.a(e11, "Error deleting app launch break from local database");
                    this.f9029v = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            i().f9047A.b("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final SQLiteDatabase h1() {
        if (this.f9029v) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f9028u.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f9029v = true;
        return null;
    }
}
