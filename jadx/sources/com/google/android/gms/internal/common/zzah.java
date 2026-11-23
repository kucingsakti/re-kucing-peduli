package com.google.android.gms.internal.common;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzah {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(AbstractC0487g.g(i11, "at index "));
            }
        }
    }
}
