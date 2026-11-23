package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zaax implements zabf {
    public final zabi a;

    public zaax(zabi zabiVar) {
        this.a = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void b(ConnectionResult connectionResult, Api api, boolean z6) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void c(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d() {
        zabi zabiVar = this.a;
        Iterator it = ((p212w.d) zabiVar.f7983g.values()).iterator();
        while (it.hasNext()) {
            ((Api.Client) it.next()).q();
        }
        zabiVar.f7989n.f7963H = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
        zabi zabiVar = this.a;
        zabiVar.f7978b.lock();
        try {
            zabiVar.f7987l = new zaaw(zabiVar, zabiVar.f7985i, zabiVar.j, zabiVar.f7981e, zabiVar.f7986k, zabiVar.f7978b, zabiVar.f7980d);
            zabiVar.f7987l.d();
            zabiVar.f7979c.signalAll();
        } finally {
            zabiVar.f7978b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
