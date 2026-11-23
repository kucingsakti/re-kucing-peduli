package L8;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2815s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2817u;

    public /* synthetic */ e0() {
    }

    public Integer a(e0 e0Var) {
        p210v8.i.f(e0Var, "visibility");
        p095j8.e eVar = d0.a;
        if (this == e0Var) {
            return 0;
        }
        p095j8.e eVar2 = d0.a;
        Integer num = (Integer) eVar2.get(this);
        Integer num2 = (Integer) eVar2.get(e0Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.f2817u;
    }

    public abstract p136o.l e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i10);

    public abstract void q(CharSequence charSequence);

    public abstract void s(boolean z6);

    public String toString() {
        switch (this.f2815s) {
            case 0:
                return d();
            default:
                return super.toString();
        }
    }

    public e0(String str, boolean z6) {
        this.f2817u = str;
        this.f2816t = z6;
    }

    public e0 l() {
        return this;
    }
}
