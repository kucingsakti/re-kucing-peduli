package N1;

import M2.P;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f3298t;

    public /* synthetic */ r(s sVar, int i10) {
        this.f3297s = i10;
        this.f3298t = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3297s) {
            case 0:
                s sVar = this.f3298t;
                sVar.f3302d = sVar.c();
                try {
                    s sVar2 = this.f3298t;
                    sVar2.a.registerReceiver(sVar2.f3304f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f3298t.f3303e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    this.f3298t.f3303e = false;
                    return;
                }
                break;
            case 1:
                if (this.f3298t.f3303e) {
                    this.f3298t.f3303e = false;
                    s sVar3 = this.f3298t;
                    sVar3.a.unregisterReceiver(sVar3.f3304f);
                    break;
                }
                break;
            default:
                boolean z6 = this.f3298t.f3302d;
                s sVar4 = this.f3298t;
                sVar4.f3302d = sVar4.c();
                if (z6 != this.f3298t.f3302d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z10 = this.f3298t.f3302d;
                    }
                    s sVar5 = this.f3298t;
                    U1.n.f().post(new P(sVar5, sVar5.f3302d, 2));
                }
                break;
        }
    }
}
