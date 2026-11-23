package B4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import p078i.AbstractActivityC0655l;
import p156q0.C0742a;

/* JADX INFO: renamed from: B4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156d extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C0154b f663t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f664u0 = false;

    public static void h0(Activity activity, C0154b c0154b) {
        p156q0.M m2 = ((AbstractActivityC0655l) activity).m();
        C0156d c0156d = (C0156d) m2.E("AgentWebActionFragment");
        if (c0156d == null) {
            c0156d = new C0156d();
            C0742a c0742a = new C0742a(m2);
            c0742a.j(0, c0156d, "AgentWebActionFragment", 1);
            c0742a.g(true, true);
        }
        c0156d.f663t0 = c0154b;
        if (c0156d.f664u0) {
            c0156d.g0();
        }
    }

    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        C0154b c0154b = this.f663t0;
        if (c0154b != null && i10 == 596) {
            c0154b.getClass();
        }
    }

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle != null) {
            bundle.toString();
            String str = AbstractC0162j.a;
        } else {
            this.f664u0 = true;
            g0();
        }
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void M(int i10, String[] strArr, int[] iArr) {
        if (((InterfaceC0155c) this.f663t0.f662d) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_FROM_INTENTION", this.f663t0.f660b);
            ((InterfaceC0155c) this.f663t0.f662d).u(strArr, bundle);
        }
    }

    public final void g0() {
        ArrayList arrayList;
        C0154b c0154b = this.f663t0;
        if (c0154b == null || c0154b.a != 1 || (arrayList = (ArrayList) c0154b.f661c) == null || arrayList.isEmpty()) {
            return;
        }
        this.f663t0.getClass();
        if (((InterfaceC0155c) this.f663t0.f662d) != null) {
            V((String[]) arrayList.toArray(new String[0]));
        }
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
    }
}
