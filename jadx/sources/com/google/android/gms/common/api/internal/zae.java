package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class zae extends zai {
    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        new Status(10, runtimeException.getClass().getSimpleName() + ": " + runtimeException.getLocalizedMessage(), null, null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) {
        try {
            Api.Client client = zabqVar.f7992c;
            throw null;
        } catch (RuntimeException e10) {
            b(e10);
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zaad zaadVar, boolean z6) {
        zaadVar.a.put(null, Boolean.valueOf(z6));
        throw null;
    }
}
