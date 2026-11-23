package com.tonyodev.fetch2.database;

import I.D;
import K0.b;
import K0.i;
import O0.a;
import O0.c;
import android.content.Context;
import java.util.HashMap;
import p061g1.m;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadDatabase_Impl extends DownloadDatabase {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile r f10345k;

    @Override // K0.m
    public final i d() {
        return new i(this, new HashMap(0), new HashMap(0), "requests");
    }

    @Override // K0.m
    public final c e(b bVar) {
        D d3 = new D(bVar, new m(this), "460643a974555d792b8f5a6e1a5d323c", "946eca6b182e63ebe50cf82e483715bf");
        Context context = bVar.a;
        p210v8.i.f(context, "context");
        return bVar.f2513c.a(new a(context, bVar.f2512b, d3, false, false));
    }

    @Override // com.tonyodev.fetch2.database.DownloadDatabase
    public final r q() {
        r rVar;
        if (this.f10345k != null) {
            return this.f10345k;
        }
        synchronized (this) {
            try {
                if (this.f10345k == null) {
                    this.f10345k = new r(this);
                }
                rVar = this.f10345k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
