package B9;

import A9.AbstractC0130c;
import A9.D;
import A9.N;
import A9.Z;
import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0130c {
    public final /* synthetic */ b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f777b;

    public a(b bVar, Z z6) {
        this.a = bVar;
        this.f777b = z6;
    }

    @Override // A9.AbstractC0130c
    public final D9.d y(N n10, D9.c cVar) {
        p210v8.i.f(n10, AdOperationMetric.INIT_STATE);
        p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        b bVar = this.a;
        D dU = bVar.U(this.f777b.g(1, bVar.o(cVar)));
        p210v8.i.c(dU);
        return dU;
    }
}
