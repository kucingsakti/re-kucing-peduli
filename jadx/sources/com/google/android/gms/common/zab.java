package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zab implements SuccessContinuation {
    static {
        new zab();
    }

    private /* synthetic */ zab() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task m(Object obj) {
        Object obj2 = GoogleApiAvailability.f7831c;
        return Tasks.e(null);
    }
}
