package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class DataBufferRef {
    public int a;

    public final boolean equals(Object obj) {
        return (obj instanceof DataBufferRef) && Objects.a(Integer.valueOf(((DataBufferRef) obj).a), Integer.valueOf(this.a)) && Objects.a(0, 0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 0, null});
    }
}
