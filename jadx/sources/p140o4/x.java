package p140o4;

import X2.j;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p188t1.G;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f13804i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f13806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f13807d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f13809f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f13811h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f13808e = new e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13810g = false;

    public x(FirebaseMessaging firebaseMessaging, j jVar, v vVar, G g8, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f13807d = firebaseMessaging;
        this.f13805b = jVar;
        this.f13811h = vVar;
        this.f13806c = g8;
        this.a = context;
        this.f13809f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void d() {
        if (Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT != 23) {
            return;
        }
        Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        String strA = this.f13807d.a();
        G g8 = this.f13806c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(g8.j(g8.D(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f13807d.a();
        G g8 = this.f13806c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(g8.j(g8.D(strA, "/topics/" + str, bundle)));
    }

    public final void e(u uVar) {
        synchronized (this.f13808e) {
            try {
                String str = uVar.f13795c;
                if (this.f13808e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f13808e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f13808e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f(boolean z6) {
        this.f13810g = z6;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0039  */
    public final boolean g() throws IOException {
        u uVarA;
        byte b3;
        while (true) {
            synchronized (this) {
                try {
                    uVarA = this.f13811h.a();
                    if (uVarA == null) {
                        d();
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = uVarA.f13794b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                } else if (str.equals("S")) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
                String str2 = uVarA.a;
                if (b3 == 0) {
                    b(str2);
                    d();
                } else if (b3 != 1) {
                    d();
                } else {
                    c(str2);
                    d();
                }
                this.f13811h.c(uVarA);
                e(uVarA);
            } catch (IOException e10) {
                if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    e10.getMessage();
                } else if (e10.getMessage() != null) {
                    throw e10;
                }
                return false;
            }
        }
    }

    public final void h(long j10) {
        long jMin = Math.min(Math.max(30L, 2 * j10), f13804i);
        this.f13809f.schedule(new z(this, this.a, this.f13805b, jMin), j10, TimeUnit.SECONDS);
        f(true);
    }
}
