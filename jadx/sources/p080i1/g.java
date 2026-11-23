package p080i1;

import M2.O;
import X2.a;
import Y1.c;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k1.b;
import o1.o;
import p050f1.q;
import p061g1.i;
import p078i.ExecutorC0659p;
import p147p1.m;
import p147p1.r;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b, r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final O f12136A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PowerManager.WakeLock f12137B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12138C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final i f12139D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f12140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o1.i f12142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f12143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f12144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ExecutorC0659p f12147z;

    static {
        q.c("DelayMetCommandHandler");
    }

    public g(Context context, int i10, i iVar, i iVar2) {
        this.f12140s = context;
        this.f12141t = i10;
        this.f12143v = iVar;
        this.f12142u = iVar2.a;
        this.f12139D = iVar2;
        p140o4.r rVar = iVar.f12156w.j;
        c cVar = iVar.f12153t;
        this.f12147z = (ExecutorC0659p) cVar.f5670t;
        this.f12136A = (O) cVar.f5672v;
        this.f12144w = new c(rVar, this);
        this.f12138C = false;
        this.f12146y = 0;
        this.f12145x = new Object();
    }

    public static void a(g gVar) {
        o1.i iVar = gVar.f12142u;
        if (gVar.f12146y >= 2) {
            q.a().getClass();
            return;
        }
        gVar.f12146y = 2;
        q.a().getClass();
        Context context = gVar.f12140s;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, iVar);
        i iVar2 = gVar.f12143v;
        int i10 = gVar.f12141t;
        a aVar = new a(iVar2, intent, i10, 3);
        O o10 = gVar.f12136A;
        o10.execute(aVar);
        if (!iVar2.f12155v.e(iVar.a)) {
            q.a().getClass();
            return;
        }
        q.a().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, iVar);
        o10.execute(new a(iVar2, intent2, i10, 3));
    }

    public final void b() {
        synchronized (this.f12145x) {
            try {
                this.f12144w.L();
                this.f12143v.f12154u.a(this.f12142u);
                PowerManager.WakeLock wakeLock = this.f12137B;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q qVarA = q.a();
                    Objects.toString(this.f12137B);
                    Objects.toString(this.f12142u);
                    qVarA.getClass();
                    this.f12137B.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.b
    public final void c(ArrayList arrayList) {
        this.f12147z.execute(new f(this, 0));
    }

    @Override // k1.b
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C3.a.g((o) it.next()).equals(this.f12142u)) {
                this.f12147z.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void e() {
        o1.i iVar = this.f12142u;
        StringBuilder sb = new StringBuilder();
        String str = iVar.a;
        sb.append(str);
        sb.append(" (");
        this.f12137B = m.a(this.f12140s, E0.a.j(sb, this.f12141t, ")"));
        q qVarA = q.a();
        Objects.toString(this.f12137B);
        qVarA.getClass();
        this.f12137B.acquire();
        o oVarG = this.f12143v.f12156w.f11499c.v().g(str);
        if (oVarG == null) {
            this.f12147z.execute(new f(this, 0));
            return;
        }
        boolean zB = oVarG.b();
        this.f12138C = zB;
        if (zB) {
            this.f12144w.K(Collections.singletonList(oVarG));
        } else {
            q.a().getClass();
            d(Collections.singletonList(oVarG));
        }
    }

    public final void f(boolean z6) {
        q qVarA = q.a();
        o1.i iVar = this.f12142u;
        Objects.toString(iVar);
        qVarA.getClass();
        b();
        int i10 = this.f12141t;
        i iVar2 = this.f12143v;
        O o10 = this.f12136A;
        Context context = this.f12140s;
        if (z6) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, iVar);
            o10.execute(new a(iVar2, intent, i10, 3));
        }
        if (this.f12138C) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            o10.execute(new a(iVar2, intent2, i10, 3));
        }
    }
}
