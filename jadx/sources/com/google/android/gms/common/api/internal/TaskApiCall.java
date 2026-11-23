package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.service.zam;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    public final Feature[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7920b;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        public zam a;

        private Builder() {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.a = null;
        this.f7920b = false;
    }

    public TaskApiCall(Feature[] featureArr, boolean z6) {
        this.a = featureArr;
        boolean z10 = false;
        if (featureArr != null && z6) {
            z10 = true;
        }
        this.f7920b = z10;
    }
}
