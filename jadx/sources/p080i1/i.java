package p080i1;

import M2.O;
import X2.a;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p050f1.q;
import p061g1.c;
import p061g1.e;
import p061g1.o;
import p147p1.m;
import p147p1.t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f12150B = q.c("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SystemAlarmService f12151A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f12152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Y1.c f12153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f12154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f12155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f12156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f12157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f12158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Intent f12159z;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f12152s = applicationContext;
        this.f12157x = new c(applicationContext, new S(14));
        o oVarB = o.b(systemAlarmService);
        this.f12156w = oVarB;
        this.f12154u = new t(oVarB.f11498b.f11391e);
        e eVar = oVarB.f11502f;
        this.f12155v = eVar;
        this.f12153t = oVarB.f11500d;
        eVar.a(this);
        this.f12158y = new ArrayList();
        this.f12159z = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i10, Intent intent) {
        q qVarA = q.a();
        String str = f12150B;
        Objects.toString(intent);
        qVarA.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.a().d(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && c()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f12158y) {
            try {
                boolean zIsEmpty = this.f12158y.isEmpty();
                this.f12158y.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        b();
        synchronized (this.f12158y) {
            try {
                Iterator it = this.f12158y.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        b();
        PowerManager.WakeLock wakeLockA = m.a(this.f12152s, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f12156w.f11500d.t(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // p061g1.c
    public final void f(o1.i iVar, boolean z6) {
        O o10 = (O) this.f12153t.f5672v;
        String str = c.f12127w;
        Intent intent = new Intent(this.f12152s, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        c.d(intent, iVar);
        o10.execute(new a(this, intent, 0, 3));
    }
}
