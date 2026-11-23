package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ListenerHolder<L> {

    @KeepForSdk
    public static final class ListenerKey<L> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
    }
}
