package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends IllegalArgumentException {
    public M0(int i10, int i11) {
        super(AbstractC0487g.h("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
