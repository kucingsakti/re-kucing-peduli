package A1;

import android.os.Process;
import android.util.Log;

/* JADX INFO: renamed from: A1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0092a implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f84s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f85t;

    public /* synthetic */ RunnableC0092a(Runnable runnable, int i10) {
        this.f84s = i10;
        this.f85t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f84s) {
            case 0:
                Process.setThreadPriority(10);
                this.f85t.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f85t.run();
                break;
            case 2:
                this.f85t.run();
                break;
            default:
                try {
                    this.f85t.run();
                } catch (Exception unused) {
                    Log.isLoggable(com.bumptech.glide.d.q("Executor"), 6);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f84s) {
            case 2:
                return this.f85t.toString();
            default:
                return super.toString();
        }
    }
}
