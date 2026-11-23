package androidx.work;

import K3.d;
import R0.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import p050f1.q;
import p061g1.o;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {
    static {
        q.c("WrkMgrInitializer");
    }

    @Override // R0.b
    public final Object create(Context context) {
        q.a().getClass();
        o.c(context, new p050f1.b(new d(21)));
        return o.b(context);
    }

    @Override // R0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
