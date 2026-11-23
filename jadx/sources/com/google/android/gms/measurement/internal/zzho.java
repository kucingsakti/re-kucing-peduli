package com.google.android.gms.measurement.internal;

import M2.C0298g;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzho implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzhn f9153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f9154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Bundle f9155u;

    @Override // java.lang.Runnable
    public final void run() {
        C0298g c0298g = this.f9153s.f9150b.f9306u;
        zznc.n(c0298g);
        c0298g.W0();
        c0298g.a1();
        String str = this.f9154t;
        byte[] bArrL = c0298g.X0().i1(new zzba((zzhj) c0298g.f577s, "", str, "dep", 0L, this.f9155u)).l();
        zzfw zzfwVarI = c0298g.i();
        zzfwVarI.f9052F.c("Saving default event parameters, appId, data size", ((zzhj) c0298g.f577s).f9119E.c(str), Integer.valueOf(bArrL.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrL);
        try {
            if (c0298g.d1().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c0298g.i().f9056x.a(zzfw.a1(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e10) {
            zzfw zzfwVarI2 = c0298g.i();
            zzfwVarI2.f9056x.c("Error storing default event parameters. appId", zzfw.a1(str), e10);
        }
    }
}
