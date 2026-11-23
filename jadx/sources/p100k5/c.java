package p100k5;

import U4.d;
import java.util.Iterator;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final d services;

    public c(d dVar) {
        i.f(dVar, "services");
        this.services = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scheduleStart$lambda-2, reason: not valid java name */
    public static final void m70scheduleStart$lambda2(c cVar) {
        i.f(cVar, "this$0");
        Iterator it = cVar.services.getAllServices(b.class).iterator();
        while (it.hasNext()) {
            ((b) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(a.class).iterator();
        while (it.hasNext()) {
            ((a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new B6.d(this, 20)).start();
    }
}
