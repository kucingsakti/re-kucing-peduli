package p031d;

import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import p156q0.D;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC0522q, c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0525u f10484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f10485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f10486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f10487v;

    public u(x xVar, C0525u c0525u, D d3) {
        i.f(c0525u, "lifecycle");
        i.f(d3, "onBackPressedCallback");
        this.f10487v = xVar;
        this.f10484s = c0525u;
        this.f10485t = d3;
        c0525u.a(this);
    }

    @Override // p031d.c
    public final void cancel() {
        this.f10484s.f(this);
        this.f10485t.f14254b.remove(this);
        v vVar = this.f10486u;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f10486u = null;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        if (enumC0518m == EnumC0518m.ON_START) {
            x xVar = this.f10487v;
            D d3 = this.f10485t;
            i.f(d3, "onBackPressedCallback");
            xVar.f10491b.k(d3);
            v vVar = new v(xVar, d3);
            d3.f14254b.add(vVar);
            xVar.c();
            d3.f14255c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
            this.f10486u = vVar;
            return;
        }
        if (enumC0518m != EnumC0518m.ON_STOP) {
            if (enumC0518m == EnumC0518m.ON_DESTROY) {
                cancel();
            }
        } else {
            v vVar2 = this.f10486u;
            if (vVar2 != null) {
                vVar2.cancel();
            }
        }
    }
}
