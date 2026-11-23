package R;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4429s;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f4429s = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4429s);
        super.run();
    }
}
