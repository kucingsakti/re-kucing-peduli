package p050f1;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final /* synthetic */ int a = 0;

    static {
        q.c("WorkerFactory");
    }

    public final p a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        p pVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(p.class);
        } catch (Throwable unused) {
            q.a().getClass();
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                pVar = (p) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable unused2) {
                q.a().getClass();
            }
        }
        if (pVar == null || !pVar.isUsed()) {
            return pVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
