package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import p224x2.h;

/* JADX INFO: loaded from: classes.dex */
public final class zaaj implements zabf {
    public final zabi a;

    public zaaj(zabi zabiVar) {
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
        zabi zabiVar = this.a;
        zabiVar.f();
        zabiVar.f7990o.t(i10);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean f() {
        zabi zabiVar = this.a;
        zabiVar.f7989n.getClass();
        zabiVar.f();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = this.a;
        try {
            zadc zadcVar = zabiVar.f7989n.f7970O;
            zadcVar.a.add(apiMethodImpl);
            apiMethodImpl.f7896e.set(zadcVar.f8015b);
            Api.Client client = (Api.Client) zabiVar.f7989n.f7962G.get(null);
            Preconditions.j(client, "Appropriate Api was not requested.");
            if (!client.a() && zabiVar.f7984h.containsKey(null)) {
                apiMethodImpl.k(new Status(17, null, null, null));
                return apiMethodImpl;
            }
            try {
                apiMethodImpl.j();
            } catch (DeadObjectException e10) {
                apiMethodImpl.k(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                apiMethodImpl.k(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (DeadObjectException unused) {
            b bVar = new b(this, this);
            h hVar = zabiVar.f7982f;
            hVar.sendMessage(hVar.obtainMessage(1, bVar));
        }
        return apiMethodImpl;
    }
}
