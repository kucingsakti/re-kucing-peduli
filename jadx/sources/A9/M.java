package A9;

import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0130c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f340b = new M(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f341c = new M(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f342d = new M(2);
    public final /* synthetic */ int a;

    public /* synthetic */ M(int i10) {
        this.a = i10;
    }

    @Override // A9.AbstractC0130c
    public final D9.d y(N n10, D9.c cVar) {
        switch (this.a) {
            case 0:
                p210v8.i.f(n10, AdOperationMetric.INIT_STATE);
                p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
                return n10.f344c.o(cVar);
            case 1:
                p210v8.i.f(n10, AdOperationMetric.INIT_STATE);
                p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
                throw new UnsupportedOperationException("Should not be called");
            default:
                p210v8.i.f(n10, AdOperationMetric.INIT_STATE);
                p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
                return n10.f344c.u0(cVar);
        }
    }
}
