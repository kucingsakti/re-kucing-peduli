package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class BooleanResult implements Result {
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return null;
    }
}
