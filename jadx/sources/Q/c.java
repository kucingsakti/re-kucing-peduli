package Q;

import N9.C0324g;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0324g f3932s;

    public c(C0324g c0324g) {
        super(false);
        this.f3932s = c0324g;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f3932s.resumeWith(J7.a.d(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f3932s.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
