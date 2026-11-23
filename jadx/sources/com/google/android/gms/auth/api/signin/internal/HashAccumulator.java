package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class HashAccumulator {
    public int a = 1;

    public final void a(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}
