package D4;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class d extends TimerTask {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1075s;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f1075s) {
            case 0:
                System.exit(-1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 1:
                System.exit(-1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            default:
                System.exit(-1);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
