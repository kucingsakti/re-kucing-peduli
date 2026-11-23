package com.google.android.gms.common.util.concurrent;

import A1.RunnableC0092a;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ThreadFactory f8265t = Executors.defaultThreadFactory();

    public NamedThreadFactory(String str) {
        this.f8264s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8265t.newThread(new RunnableC0092a(runnable, 1));
        threadNewThread.setName(this.f8264s);
        return threadNewThread;
    }
}
