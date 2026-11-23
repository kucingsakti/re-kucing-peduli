package K0;

import A1.RunnableC0094c;
import android.database.sqlite.SQLiteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f2529m = {"UPDATE", "DELETE", "INSERT"};
    public final m a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f2532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2533e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f2534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile P0.j f2535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f2536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p166r.f f2537i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RunnableC0094c f2539l;

    public i(m mVar, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.a = mVar;
        this.f2530b = map;
        this.f2536h = new g(strArr.length);
        p210v8.i.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f2537i = new p166r.f();
        this.j = new Object();
        this.f2538k = new Object();
        this.f2531c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            p210v8.i.e(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            p210v8.i.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f2531c.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f2530b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f2532d = strArr2;
        for (Map.Entry entry : this.f2530b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            p210v8.i.e(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            p210v8.i.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f2531c.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                p210v8.i.e(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f2531c;
                linkedHashMap.put(lowerCase4, y.v(linkedHashMap, lowerCase3));
            }
        }
        this.f2539l = new RunnableC0094c(this, 7);
    }

    public final boolean a() {
        if (!this.a.l()) {
            return false;
        }
        if (!this.f2534f) {
            this.a.g().S();
        }
        return this.f2534f;
    }

    public final void b(qa.b bVar) {
        synchronized (this.f2537i) {
        }
    }

    public final void c(P0.c cVar, int i10) {
        cVar.h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f2532d[i10];
        String[] strArr = f2529m;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + oa.b.h(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            p210v8.i.e(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.h(str3);
        }
    }

    public final void d(P0.c cVar) {
        p210v8.i.f(cVar, "database");
        if (cVar.i()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.f2562h.readLock();
            p210v8.i.e(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    try {
                        int[] iArrG = this.f2536h.g();
                        if (iArrG != null) {
                            if (cVar.j()) {
                                cVar.b();
                            } else {
                                cVar.a();
                            }
                            try {
                                int length = iArrG.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length) {
                                    int i12 = iArrG[i10];
                                    int i13 = i11 + 1;
                                    if (i12 == 1) {
                                        c(cVar, i11);
                                    } else if (i12 == 2) {
                                        String str = this.f2532d[i11];
                                        String[] strArr = f2529m;
                                        for (int i14 = 0; i14 < 3; i14++) {
                                            String str2 = "DROP TRIGGER IF EXISTS " + oa.b.h(str, strArr[i14]);
                                            p210v8.i.e(str2, "StringBuilder().apply(builderAction).toString()");
                                            cVar.h(str2);
                                        }
                                    }
                                    i10++;
                                    i11 = i13;
                                }
                                cVar.o();
                                cVar.g();
                            } catch (Throwable th) {
                                cVar.g();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lock.unlock();
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
