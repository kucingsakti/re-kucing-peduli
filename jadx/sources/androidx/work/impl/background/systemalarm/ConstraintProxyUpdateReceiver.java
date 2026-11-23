package androidx.work.impl.background.systemalarm;

import B4.I;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p050f1.q;
import p061g1.o;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        q.c("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            o.b(context).f11500d.t(new I(intent, context, goAsync(), 14, false));
        } else {
            q.a().getClass();
        }
    }
}
