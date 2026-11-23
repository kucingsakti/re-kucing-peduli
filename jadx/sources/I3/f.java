package I3;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p073h4.b {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // p073h4.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                l lVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new J3.g(Executors.newFixedThreadPool(4, new J3.a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9983d.get());
            case 3:
                l lVar2 = ExecutorsRegistrar.a;
                return new J3.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new J3.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9983d.get());
            case 4:
                l lVar3 = ExecutorsRegistrar.a;
                return new J3.g(Executors.newCachedThreadPool(new J3.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f9983d.get());
            case 5:
                l lVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new J3.a("Firebase Scheduler", 0, null));
            default:
                p081i3.b bVar = FirebaseMessaging.f9984k;
                return null;
        }
    }
}
