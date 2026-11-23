package y0;

import C8.InterfaceC0175c;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;

/* JADX INFO: renamed from: y0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871i extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0872j f15923t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871i(C0872j c0872j, int i10) {
        super(0);
        this.f15922s = i10;
        this.f15923t = c0872j;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f15922s) {
            case 0:
                C0872j c0872j = this.f15923t;
                Context context = c0872j.f15927s;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new androidx.lifecycle.O(applicationContext instanceof Application ? (Application) applicationContext : null, c0872j, c0872j.b());
            default:
                C0872j c0872j2 = this.f15923t;
                if (!c0872j2.f15925B) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0525u c0525u = c0872j2.f15934z;
                if (c0525u.f6763c == EnumC0519n.f6755s) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0869g c0869g = new C0869g();
                c0869g.f15919s = (N0.e) c0872j2.f15924A.f3308d;
                c0869g.f15920t = c0525u;
                Y1.c cVar = new Y1.c(c0872j2.e(), c0869g, c0872j2.d());
                InterfaceC0175c interfaceC0175cR = p068ga.d.r(C0870h.class);
                String strS = interfaceC0175cR.s();
                if (strS != null) {
                    return ((C0870h) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR)).f15921b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
