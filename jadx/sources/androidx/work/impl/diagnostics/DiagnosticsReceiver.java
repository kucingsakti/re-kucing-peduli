package androidx.work.impl.diagnostics;

import Y1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import p050f1.q;
import p061g1.j;
import p061g1.o;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        q.c("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q.a().getClass();
        try {
            o oVarB = o.b(context);
            List listSingletonList = Collections.singletonList(new c(DiagnosticsWorker.class).k());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new j(oVarB, null, listSingletonList).s();
        } catch (IllegalStateException unused) {
            q.a().getClass();
        }
    }
}
