package K4;

import N9.I;
import N9.InterfaceC0341y;
import N9.e0;
import android.os.Bundle;
import com.kcstream.cing.api.Service;
import kotlin.Metadata;
import p078i.AbstractActivityC0655l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LK4/g;", "Landroidx/fragment/app/b;", "LN9/y;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g extends androidx.fragment.app.b implements InterfaceC0341y {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public H4.a f2596t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public e0 f2597u0;

    @Override // androidx.fragment.app.b
    public void C(Bundle bundle) {
        super.C(bundle);
        AbstractActivityC0655l abstractActivityC0655lF = f();
        if (abstractActivityC0655lF != null) {
            this.f2596t0 = new Service(abstractActivityC0655lF).c();
        }
        this.f2597u0 = new e0();
    }

    @Override // N9.InterfaceC0341y
    public final p123m8.i c() {
        e0 e0Var = this.f2597u0;
        if (e0Var != null) {
            U9.d dVar = I.a;
            return com.bumptech.glide.e.l(e0Var, S9.n.a);
        }
        p210v8.i.n("job");
        throw null;
    }
}
