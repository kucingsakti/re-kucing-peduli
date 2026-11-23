package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class DataHolderResult implements Result, Releasable {
    @Override // com.google.android.gms.common.api.Releasable
    public final void g() {
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return null;
    }
}
