package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzdc extends zzdf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8555b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8556c;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i0(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdc.i0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle h0(long j) {
        Bundle bundle;
        synchronized (this.f8555b) {
            if (!this.f8556c) {
                try {
                    this.f8555b.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f8555b.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdg
    public final void l(Bundle bundle) {
        synchronized (this.f8555b) {
            try {
                try {
                    this.f8555b.set(bundle);
                    this.f8556c = true;
                    this.f8555b.notify();
                } catch (Throwable th) {
                    this.f8555b.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
