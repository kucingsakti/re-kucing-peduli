package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final void a() {
        super.a();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result b(Status status) {
        return new BatchResult(status);
    }
}
