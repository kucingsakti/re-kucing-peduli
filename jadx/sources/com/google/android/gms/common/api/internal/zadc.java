package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p053f4.e;

/* JADX INFO: loaded from: classes.dex */
public final class zadc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Status f8014c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8015b = new e(this, 28);

    public final void a() {
        boolean zD;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.f7896e.set(null);
            synchronized (basePendingResult.a) {
                try {
                    if (((GoogleApiClient) basePendingResult.f7893b.get()) == null || !basePendingResult.f7900i) {
                        basePendingResult.a();
                    }
                    zD = basePendingResult.d();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zD) {
                this.a.remove(basePendingResult);
            }
        }
    }
}
