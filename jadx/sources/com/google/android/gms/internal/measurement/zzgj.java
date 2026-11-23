package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzgj implements zzgp {
    public /* synthetic */ zzgk a;

    public final Object a() {
        String[] strArr = zzgk.f8640A;
        zzgk zzgkVar = this.a;
        Cursor cursorQuery = zzgkVar.f8642s.query(zzgkVar.f8643t, strArr, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map eVar = count <= 256 ? new p212w.e(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return eVar;
        } finally {
            cursorQuery.close();
        }
    }
}
