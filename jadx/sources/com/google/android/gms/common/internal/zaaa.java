package com.google.android.gms.common.internal;

import android.widget.Button;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public static final int a(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException(AbstractC0487g.g(i10, "Unknown color scheme: "));
    }
}
