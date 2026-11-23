package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void d(Task task) {
        Object objG;
        String message;
        Exception excF;
        if (task.k()) {
            objG = task.g();
            message = null;
        } else if (task.i() || (excF = task.f()) == null) {
            objG = null;
            message = null;
        } else {
            message = excF.getMessage();
            objG = null;
        }
        nativeOnComplete(0L, objG, task.k(), task.i(), message);
    }

    @KeepForSdk
    public native void nativeOnComplete(long j, Object obj, boolean z6, boolean z10, String str);
}
