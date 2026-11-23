package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LR0/b;", "Landroidx/lifecycle/s;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements R0.b {
    @Override // R0.b
    public final Object create(Context context) {
        p210v8.i.f(context, "context");
        R0.a aVarC = R0.a.c(context);
        p210v8.i.e(aVarC, "getInstance(context)");
        if (!aVarC.f4432b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0521p.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            p210v8.i.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0520o());
        }
        F f10 = F.f6714A;
        f10.getClass();
        f10.f6719w = new Handler();
        f10.f6720x.d(EnumC0518m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        p210v8.i.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new E(f10));
        return f10;
    }

    @Override // R0.b
    public final List dependencies() {
        return p086i8.s.f12328s;
    }
}
