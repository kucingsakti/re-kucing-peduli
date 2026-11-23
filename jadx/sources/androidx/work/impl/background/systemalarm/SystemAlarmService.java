package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0526v;
import java.util.LinkedHashMap;
import java.util.Map;
import p050f1.q;
import p080i1.i;
import p147p1.m;
import p147p1.n;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0526v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7223v = q.c("SystemAlarmService");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f7224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7225u;

    public final void b() {
        this.f7225u = true;
        q.a().getClass();
        String str = m.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (n.a) {
            linkedHashMap.putAll(n.f14184b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                q.a().d(m.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0526v, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f7224t = iVar;
        if (iVar.f12151A != null) {
            q.a().getClass();
        } else {
            iVar.f12151A = this;
        }
        this.f7225u = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0526v, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7225u = true;
        i iVar = this.f7224t;
        iVar.getClass();
        q.a().getClass();
        iVar.f12155v.g(iVar);
        iVar.f12151A = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7225u) {
            q.a().b(f7223v, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f7224t;
            iVar.getClass();
            q.a().getClass();
            iVar.f12155v.g(iVar);
            iVar.f12151A = null;
            i iVar2 = new i(this);
            this.f7224t = iVar2;
            if (iVar2.f12151A != null) {
                q.a().getClass();
            } else {
                iVar2.f12151A = this;
            }
            this.f7225u = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7224t.a(i11, intent);
        return 3;
    }
}
