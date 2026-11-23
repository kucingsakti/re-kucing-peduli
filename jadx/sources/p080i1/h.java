package p080i1;

import M2.O;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import p050f1.q;
import p078i.ExecutorC0659p;
import p147p1.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f12149t;

    public /* synthetic */ h(i iVar, int i10) {
        this.f12148s = i10;
        this.f12149t = iVar;
    }

    private final void a() {
        q qVarA;
        i iVar;
        int i10 = 1;
        synchronized (this.f12149t.f12158y) {
            i iVar2 = this.f12149t;
            iVar2.f12159z = (Intent) iVar2.f12158y.get(0);
        }
        Intent intent = this.f12149t.f12159z;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f12149t.f12159z.getIntExtra("KEY_START_ID", 0);
            q qVarA2 = q.a();
            String str = i.f12150B;
            Objects.toString(this.f12149t.f12159z);
            qVarA2.getClass();
            PowerManager.WakeLock wakeLockA = m.a(this.f12149t.f12152s, action + " (" + intExtra + ")");
            try {
                try {
                    q qVarA3 = q.a();
                    wakeLockA.toString();
                    qVarA3.getClass();
                    wakeLockA.acquire();
                    i iVar3 = this.f12149t;
                    iVar3.f12157x.b(iVar3.f12159z, intExtra, iVar3);
                    q qVarA4 = q.a();
                    wakeLockA.toString();
                    qVarA4.getClass();
                    wakeLockA.release();
                    i iVar4 = this.f12149t;
                    ((O) iVar4.f12153t.f5672v).execute(new h(iVar4, i10));
                } finally {
                    qVarA = q.a();
                    String str2 = i.f12150B;
                    wakeLockA.toString();
                    qVarA.getClass();
                    wakeLockA.release();
                    iVar = this.f12149t;
                    ((O) iVar.f12153t.f5672v).execute(new h(iVar, i10));
                }
            } catch (Throwable unused) {
                q qVarA5 = q.a();
                String str3 = i.f12150B;
                qVarA5.getClass();
                qVarA = q.a();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12148s) {
            case 0:
                a();
                return;
            default:
                i iVar = this.f12149t;
                iVar.getClass();
                q.a().getClass();
                i.b();
                synchronized (iVar.f12158y) {
                    try {
                        if (iVar.f12159z != null) {
                            q qVarA = q.a();
                            Objects.toString(iVar.f12159z);
                            qVarA.getClass();
                            if (!((Intent) iVar.f12158y.remove(0)).equals(iVar.f12159z)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            iVar.f12159z = null;
                        }
                        ExecutorC0659p executorC0659p = (ExecutorC0659p) iVar.f12153t.f5670t;
                        if (!iVar.f12157x.a() && iVar.f12158y.isEmpty() && !executorC0659p.b()) {
                            q.a().getClass();
                            SystemAlarmService systemAlarmService = iVar.f12151A;
                            if (systemAlarmService != null) {
                                systemAlarmService.b();
                            }
                        } else if (!iVar.f12158y.isEmpty()) {
                            iVar.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
