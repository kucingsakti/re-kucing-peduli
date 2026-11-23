package com.google.android.gms.common.util.concurrent;

import A1.RunnableC0092a;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f8267t = new AtomicInteger();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ThreadFactory f8268u = Executors.defaultThreadFactory();

    public NumberedThreadFactory(String str) {
        this.f8266s = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8268u.newThread(new RunnableC0092a(runnable, 1));
        threadNewThread.setName(this.f8266s + "[" + this.f8267t.getAndIncrement() + "]");
        return threadNewThread;
    }
}
