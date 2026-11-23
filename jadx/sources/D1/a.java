package D1;

import android.os.Process;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1033s = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    private final void a() {
        ma.c cVarB;
        while (true) {
            try {
                synchronized (ma.c.class) {
                    ma.c cVar = ma.c.j;
                    cVarB = C.b();
                    if (cVarB == ma.c.j) {
                        ma.c.j = null;
                        return;
                    }
                }
                if (cVarB != null) {
                    cVarB.j();
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.f1033s) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            case 2:
            default:
                super.run();
                return;
            case 3:
                a();
                return;
        }
    }

    public /* synthetic */ a(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ a(String str) {
        super(str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
