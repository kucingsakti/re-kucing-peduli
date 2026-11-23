package M2;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class K implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zzo f2914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f2915t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzhn f2916u;

    public K(zzhn zzhnVar, zzo zzoVar, Bundle bundle) {
        this.f2914s = zzoVar;
        this.f2915t = bundle;
        this.f2916u = zzhnVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        List list;
        zzhn zzhnVar = this.f2916u;
        zzhnVar.f9150b.b0();
        zznc zzncVar = zzhnVar.f9150b;
        zzncVar.l().W0();
        zzpg.a();
        zzag zzagVarS = zzncVar.S();
        zzo zzoVar = this.f2914s;
        if (!zzagVarS.h1(zzoVar.f9350s, zzbf.f9022z0) || (str = zzoVar.f9350s) == null) {
            return new ArrayList();
        }
        Bundle bundle = this.f2915t;
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzncVar.i().f9056x.b("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C0298g c0298g = zzncVar.f9306u;
                        zznc.n(c0298g);
                        int i11 = intArray[i10];
                        long j = longArray[i10];
                        Preconditions.e(str);
                        c0298g.W0();
                        c0298g.a1();
                        try {
                            int iDelete = c0298g.d1().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j)});
                            c0298g.i().f9052F.d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j));
                        } catch (SQLiteException e10) {
                            c0298g.i().f9056x.c("Error pruning trigger URIs. appId", zzfw.a1(str), e10);
                        }
                    }
                }
            }
        }
        C0298g c0298g2 = zzncVar.f9306u;
        zznc.n(c0298g2);
        Preconditions.e(str);
        c0298g2.W0();
        c0298g2.a1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c0298g2.d1().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzmu(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    list = arrayList;
                } else {
                    cursorQuery.close();
                    list = arrayList;
                }
            } catch (SQLiteException e11) {
                c0298g2.i().f9056x.c("Error querying trigger uris. appId", zzfw.a1(str), e11);
                List list2 = Collections.EMPTY_LIST;
                list = list2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                    list = list2;
                }
            }
            return list;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
