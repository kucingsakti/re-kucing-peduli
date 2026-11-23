package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzge implements zzgg {
    public final String a(ContentResolver contentResolver, String str) {
        Cursor cursorQuery = contentResolver.query(zzfy.a, null, null, new String[]{str}, null);
        try {
            if (cursorQuery == null) {
                throw new zzgf("Failed to connect to GservicesProvider");
            }
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(1);
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final Map b(ContentResolver contentResolver, String[] strArr, zzgc zzgcVar) {
        Cursor cursorQuery = contentResolver.query(zzfy.f8628b, null, null, strArr, null);
        try {
            if (cursorQuery == null) {
                throw new zzgf("Failed to connect to GservicesProvider");
            }
            HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
            while (cursorQuery.moveToNext()) {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
            return map;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
