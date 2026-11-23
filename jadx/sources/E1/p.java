package E1;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f1324b;
    public Object a;

    static {
        char[] cArr = U1.n.a;
        f1324b = new ArrayDeque(0);
    }

    public static p a(Object obj) {
        p pVar;
        ArrayDeque arrayDeque = f1324b;
        synchronized (arrayDeque) {
            pVar = (p) arrayDeque.poll();
        }
        if (pVar == null) {
            pVar = new p();
        }
        pVar.a = obj;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        pVar.getClass();
        return this.a.equals(pVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
