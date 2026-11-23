package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Storage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f7769c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Storage f7770d;
    public final ReentrantLock a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7771b;

    public Storage(Context context) {
        this.f7771b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.f7771b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
