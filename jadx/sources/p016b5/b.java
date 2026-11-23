package p016b5;

import X4.f;
import com.onesignal.session.internal.outcomes.impl.o;
import p005a5.c;
import p005a5.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f fVar) {
        i.f(fVar, "_application");
        this._application = fVar;
        this.lock = new Object();
    }

    @Override // p005a5.d
    public c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                }
            }
        }
        c cVar = this.osDatabase;
        i.c(cVar);
        return cVar;
    }
}
