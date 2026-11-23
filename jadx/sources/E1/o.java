package E1;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class o extends U1.j {
    @Override // U1.j
    public final void c(Object obj, Object obj2) {
        p pVar = (p) obj;
        pVar.getClass();
        ArrayDeque arrayDeque = p.f1324b;
        synchronized (arrayDeque) {
            arrayDeque.offer(pVar);
        }
    }
}
