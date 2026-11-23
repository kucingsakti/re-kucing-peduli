package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzy implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ zzy f7815s = new zzy();

    private /* synthetic */ zzy() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
