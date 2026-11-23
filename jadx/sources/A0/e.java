package A0;

import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import y0.B;
import y0.C0872j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0522q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9t;

    public /* synthetic */ e(Object obj, int i10) {
        this.f8s = i10;
        this.f9t = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        switch (this.f8s) {
            case 0:
                g gVar = (g) this.f9t;
                p210v8.i.f(gVar, "this$0");
                if (enumC0518m == EnumC0518m.ON_DESTROY) {
                    androidx.fragment.app.b bVar = (androidx.fragment.app.b) interfaceC0523s;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((Q9.t) ((Q9.m) gVar.b().f15942f.f3811t)).f()) {
                        if (p210v8.i.a(((C0872j) obj2).f15932x, bVar.f6627T)) {
                            obj = obj2;
                        }
                    }
                    C0872j c0872j = (C0872j) obj;
                    if (c0872j != null) {
                        if (g.n()) {
                            c0872j.toString();
                            interfaceC0523s.toString();
                        }
                        gVar.b().b(c0872j);
                    }
                }
                break;
            case 1:
                N0.e eVar = (N0.e) this.f9t;
                p210v8.i.f(eVar, "this$0");
                if (enumC0518m == EnumC0518m.ON_START) {
                    eVar.f3265c = true;
                } else if (enumC0518m == EnumC0518m.ON_STOP) {
                    eVar.f3265c = false;
                }
                break;
            default:
                B b3 = (B) this.f9t;
                p210v8.i.f(b3, "this$0");
                b3.f15848q = enumC0518m.f();
                if (b3.f15835c != null) {
                    for (C0872j c0872j2 : p086i8.k.t0(b3.f15839g)) {
                        c0872j2.getClass();
                        c0872j2.f15930v = enumC0518m.f();
                        c0872j2.f();
                    }
                }
                break;
        }
    }
}
