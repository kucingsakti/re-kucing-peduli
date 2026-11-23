package O7;

import A1.J;
import J7.j;
import android.os.CancellationSignal;
import java.util.concurrent.atomic.AtomicReference;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference implements L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3607s = 1;

    public /* synthetic */ a() {
    }

    public boolean a() {
        return b.h((L7.b) get());
    }

    @Override // L7.b
    public final void f() {
        p045e7.a aVar;
        switch (this.f3607s) {
            case 0:
                if (get() != null && (aVar = (p045e7.a) getAndSet(null)) != null) {
                    try {
                        switch (aVar.a) {
                            case 0:
                                ((J) ((Y1.c) aVar.f10709b).f5671u).f();
                                break;
                            default:
                                ((CancellationSignal) aVar.f10709b).cancel();
                                break;
                        }
                    } catch (Exception e10) {
                        l.n(e10);
                        j.y(e10);
                        return;
                    }
                    break;
                }
                break;
            default:
                b.g(this);
                break;
        }
    }

    public /* synthetic */ a(Object obj) {
        super(obj);
    }
}
