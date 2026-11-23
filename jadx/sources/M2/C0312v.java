package M2;

import A1.RunnableC0094c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zznc;

/* JADX INFO: renamed from: M2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312v extends BroadcastReceiver {
    public final zznc a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3123c;

    public C0312v(zznc zzncVar) {
        Preconditions.i(zzncVar);
        this.a = zzncVar;
    }

    public final void a() {
        zznc zzncVar = this.a;
        zzncVar.c0();
        zzncVar.l().W0();
        zzncVar.l().W0();
        if (this.f3122b) {
            zzncVar.i().f9052F.b("Unregistering connectivity change receiver");
            this.f3122b = false;
            this.f3123c = false;
            try {
                zzncVar.f9283D.f9140s.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                zzncVar.i().f9056x.a(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zznc zzncVar = this.a;
        zzncVar.c0();
        String action = intent.getAction();
        zzncVar.i().f9052F.a(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzncVar.i().f9047A.a(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        zzfz zzfzVar = zzncVar.f9305t;
        zznc.n(zzfzVar);
        boolean zE1 = zzfzVar.e1();
        if (this.f3123c != zE1) {
            this.f3123c = zE1;
            zzncVar.l().f1(new RunnableC0094c(this, zE1));
        }
    }
}
