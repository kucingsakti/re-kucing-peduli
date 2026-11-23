package com.google.android.gms.measurement.internal;

import M2.InterfaceC0307p;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9023f = new Object();
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0307p f9024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9026d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f9027e = null;

    public zzfj(String str, Object obj, InterfaceC0307p interfaceC0307p) {
        this.a = str;
        this.f9025c = obj;
        this.f9024b = interfaceC0307p;
    }

    public final Object a(Object obj) {
        synchronized (this.f9026d) {
        }
        if (obj != null) {
            return obj;
        }
        if (C.a == null) {
            return this.f9025c;
        }
        synchronized (f9023f) {
            try {
                if (zzab.a()) {
                    return this.f9027e == null ? this.f9025c : this.f9027e;
                }
                try {
                    for (zzfj zzfjVar : zzbf.a) {
                        if (zzab.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objB = null;
                        try {
                            InterfaceC0307p interfaceC0307p = zzfjVar.f9024b;
                            if (interfaceC0307p != null) {
                                objB = interfaceC0307p.b();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f9023f) {
                            zzfjVar.f9027e = objB;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC0307p interfaceC0307p2 = this.f9024b;
                if (interfaceC0307p2 == null) {
                    return this.f9025c;
                }
                try {
                    return interfaceC0307p2.b();
                } catch (IllegalStateException unused3) {
                    return this.f9025c;
                } catch (SecurityException unused4) {
                    return this.f9025c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
