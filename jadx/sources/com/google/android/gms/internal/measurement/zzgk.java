package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgk implements Q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ContentResolver f8642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f8643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f8644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O f8645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f8646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Map f8647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f8648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p212w.e f8641z = new p212w.e(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f8640A = {"key", "value"};

    public zzgk(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        O o10 = new O(this, 1);
        this.f8645v = o10;
        this.f8646w = new Object();
        this.f8648y = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f8642s = contentResolver;
        this.f8643t = uri;
        this.f8644u = runnable;
        contentResolver.registerContentObserver(uri, false, o10);
    }

    public static zzgk a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgk zzgkVar;
        synchronized (zzgk.class) {
            p212w.e eVar = f8641z;
            zzgkVar = (zzgk) eVar.get(uri);
            if (zzgkVar == null) {
                try {
                    zzgk zzgkVar2 = new zzgk(contentResolver, uri, runnable);
                    try {
                        eVar.put(uri, zzgkVar2);
                    } catch (SecurityException unused) {
                    }
                    zzgkVar = zzgkVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzgkVar;
    }

    public static synchronized void c() {
        try {
            for (zzgk zzgkVar : (p212w.d) f8641z.values()) {
                zzgkVar.f8642s.unregisterContentObserver(zzgkVar.f8645v);
            }
            f8641z.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Map b() {
        Map map;
        Object objA;
        Map map2 = this.f8647x;
        if (map2 == null) {
            synchronized (this.f8646w) {
                try {
                    map2 = this.f8647x;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                zzgj zzgjVar = new zzgj();
                                zzgjVar.a = this;
                                try {
                                    objA = zzgjVar.a();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objA = zzgjVar.a();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objA;
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                map = null;
                            }
                            this.f8647x = map;
                            map2 = map;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final /* synthetic */ Object k(String str) {
        return (String) b().get(str);
    }
}
