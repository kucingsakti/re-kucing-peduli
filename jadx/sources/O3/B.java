package O3;

import E4.C0187a;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final ExecutorService a = g.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(Task task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.d(a, new C0187a(countDownLatch, 13));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.k()) {
            return task.g();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.j()) {
            throw new IllegalStateException(task.f());
        }
        throw new TimeoutException();
    }
}
