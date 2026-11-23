package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class BatchResult implements Result {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Status f7850s;

    public BatchResult(Status status) {
        this.f7850s = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return this.f7850s;
    }
}
