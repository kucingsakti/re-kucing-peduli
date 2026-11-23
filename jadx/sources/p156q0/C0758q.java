package p156q0;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.lifecycle.L;

/* JADX INFO: renamed from: q0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758q extends AbstractC0761u {
    public final /* synthetic */ b a;

    public C0758q(b bVar) {
        this.a = bVar;
    }

    @Override // p156q0.AbstractC0761u
    public final void a() {
        b bVar = this.a;
        bVar.f6646o0.e();
        L.e(bVar);
        Bundle bundle = bVar.f6651t;
        bVar.f6646o0.f(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
