package p089j1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ComponentName a;

    static {
        q.c("SystemJobInfoConverter");
    }

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
