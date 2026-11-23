package U5;

import android.content.Context;
import p050f1.w;
import p061g1.o;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();

    private h() {
    }

    private final void initializeWorkManager(Context context) {
        try {
            context.getApplicationContext();
            o.c(context, new p050f1.b(new K3.d(21)));
        } catch (IllegalStateException e10) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper initializing WorkManager failed: ", e10);
        }
    }

    public final synchronized w getInstance(Context context) {
        o oVarB;
        i.f(context, "context");
        try {
            oVarB = o.b(context);
        } catch (IllegalStateException e10) {
            com.onesignal.debug.internal.logging.b.error("OSWorkManagerHelper.getInstance failed, attempting to initialize: ", e10);
            initializeWorkManager(context);
            oVarB = o.b(context);
        }
        return oVarB;
    }
}
