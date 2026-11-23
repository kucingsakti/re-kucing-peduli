package p140o4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y extends BroadcastReceiver {
    public z a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        z zVar = this.a;
        if (zVar == null) {
            return;
        }
        if (zVar.c()) {
            if (!Log.isLoggable("FirebaseMessaging", 3) && Build.VERSION.SDK_INT == 23) {
                Log.isLoggable("FirebaseMessaging", 3);
            }
            z zVar2 = this.a;
            zVar2.f13818v.f13809f.schedule(zVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
