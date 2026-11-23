package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class zzau {
    public static HashSet a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void b(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        int i10 = com.google.android.gms.internal.measurement.zzcj.a;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        zzfy zzfyVar = zzfwVar.f9047A;
        if (!readable) {
            zzfyVar.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzfyVar.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzfyVar.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzfyVar.b("Failed to turn on database write permission for owner");
    }

    public static void c(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean zMoveToFirst;
        zzfy zzfyVar = zzfwVar.f9047A;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{MediationMetaData.KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e10) {
                zzfyVar.c("Error querying for table", str, e10);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetA = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetA.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                        if (!hashSetA.remove(strArr[i10])) {
                            sQLiteDatabase.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSetA.isEmpty()) {
                    return;
                }
                zzfyVar.c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSetA));
            } catch (SQLiteException e11) {
                zzfwVar.f9056x.a(str, "Failed to verify columns on table that was just created");
                throw e11;
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }
}
