package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p050f1.q;
import p061g1.o;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        q.c("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q qVarA = q.a();
        Objects.toString(intent);
        qVarA.getClass();
        try {
            o oVarB = o.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (o.f11497m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = oVarB.f11505i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    oVarB.f11505i = pendingResultGoAsync;
                    if (oVarB.f11504h) {
                        pendingResultGoAsync.finish();
                        oVarB.f11505i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException unused) {
            q.a().getClass();
        }
    }
}
