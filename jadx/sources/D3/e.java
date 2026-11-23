package D3;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z6) {
        synchronized (g.f1047k) {
            try {
                for (g gVar : new ArrayList(g.f1048l.values())) {
                    if (gVar.f1052e.get()) {
                        Iterator it = gVar.f1056i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).a;
                            if (z6) {
                                gVar2.getClass();
                            } else {
                                ((p053f4.d) gVar2.f1055h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
