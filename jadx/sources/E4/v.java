package E4;

import N9.AbstractC0342z;
import android.os.Handler;
import android.os.Looper;
import com.kcstream.cing.activity.MainActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1442t;

    public /* synthetic */ v(MainActivity mainActivity, int i10) {
        this.f1441s = i10;
        this.f1442t = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f1442t;
        switch (this.f1441s) {
            case 0:
                int i10 = MainActivity.c0;
                p210v8.i.f(mainActivity, "this$0");
                mainActivity.f10196Y = false;
                break;
            case 1:
                int i11 = MainActivity.c0;
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                p210v8.i.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
                executorServiceNewSingleThreadExecutor.execute(new D4.a(mainActivity, 1, new Handler(Looper.getMainLooper())));
                break;
            default:
                int i12 = MainActivity.c0;
                AbstractC0342z.n(mainActivity, null, new A(mainActivity, null), 3);
                break;
        }
    }
}
