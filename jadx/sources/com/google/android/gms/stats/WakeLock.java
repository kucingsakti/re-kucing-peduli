package com.google.android.gms.stats;

import O2.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class WakeLock {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f9381n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f9382o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f9383p = new Object();
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f9384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f9386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f9388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzb f9390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DefaultClock f9391i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f9392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f9394m;

    public WakeLock(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.f9385c = 0;
        this.f9388f = new HashSet();
        this.f9389g = true;
        this.f9391i = DefaultClock.a;
        this.f9392k = new HashMap();
        this.f9393l = new AtomicInteger(0);
        Preconditions.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f9390h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f9384b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (WorkSourceUtil.a(context)) {
            int i10 = Strings.a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = Wrappers.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i11 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method = WorkSourceUtil.f8262b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method2 = WorkSourceUtil.a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f9384b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f9382o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f9383p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f9382o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f9382o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f9394m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j) {
        this.f9393l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f9381n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.f9390h = zzb.f8876s;
                    this.f9384b.acquire();
                    this.f9391i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f9385c++;
                if (this.f9389g) {
                    TextUtils.isEmpty(null);
                }
                a aVar = (a) this.f9392k.get(null);
                if (aVar == null) {
                    aVar = new a();
                    this.f9392k.put(null, aVar);
                }
                aVar.a++;
                this.f9391i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.f9387e) {
                    this.f9387e = j10;
                    ScheduledFuture scheduledFuture = this.f9386d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f9386d = this.f9394m.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock wakeLock = this.f9395s;
                            synchronized (wakeLock.a) {
                                try {
                                    if (wakeLock.b()) {
                                        String.valueOf(wakeLock.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                                        wakeLock.d();
                                        if (wakeLock.b()) {
                                            wakeLock.f9385c = 1;
                                            wakeLock.e();
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z6;
        synchronized (this.a) {
            z6 = this.f9385c > 0;
        }
        return z6;
    }

    public final void c() {
        if (this.f9393l.decrementAndGet() < 0) {
            String.valueOf(this.j).concat(" release without a matched acquire!");
        }
        synchronized (this.a) {
            try {
                if (this.f9389g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f9392k.containsKey(null)) {
                    a aVar = (a) this.f9392k.get(null);
                    if (aVar != null) {
                        int i10 = aVar.a - 1;
                        aVar.a = i10;
                        if (i10 == 0) {
                            this.f9392k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f9388f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.f9389g) {
                        int i10 = this.f9385c - 1;
                        this.f9385c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f9385c = 0;
                    }
                    d();
                    Iterator it = this.f9392k.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a = 0;
                    }
                    this.f9392k.clear();
                    ScheduledFuture scheduledFuture = this.f9386d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f9386d = null;
                        this.f9387e = 0L;
                    }
                    if (this.f9384b.isHeld()) {
                        try {
                            try {
                                this.f9384b.release();
                                if (this.f9390h != null) {
                                    this.f9390h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                String.valueOf(this.j).concat(" failed to release!");
                                if (this.f9390h != null) {
                                    this.f9390h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f9390h != null) {
                                this.f9390h = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.j).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
