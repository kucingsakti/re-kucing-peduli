package U9;

import G9.p;
import N9.AbstractC0342z;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f5050u;

    public i(Runnable runnable, long j, p pVar) {
        super(j, pVar);
        this.f5050u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5050u.run();
        } finally {
            this.f5049t.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5050u;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0342z.j(runnable));
        sb.append(", ");
        sb.append(this.f5048s);
        sb.append(", ");
        sb.append(this.f5049t);
        sb.append(']');
        return sb.toString();
    }
}
