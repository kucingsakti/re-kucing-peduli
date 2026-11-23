package p080i1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    static {
        q.c("ConstraintProxy");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q qVarA = q.a();
        Objects.toString(intent);
        qVarA.getClass();
        String str = c.f12127w;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
