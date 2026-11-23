package U;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f4864b;
    public final B0 a;

    static {
        s0 q0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            q0Var = new r0();
        } else {
            q0Var = i10 >= 29 ? new q0() : new p0();
        }
        f4864b = q0Var.b().a.a().a.b().a.c();
    }

    public y0(B0 b3) {
        this.a = b3;
    }

    public B0 a() {
        return this.a;
    }

    public B0 b() {
        return this.a;
    }

    public B0 c() {
        return this.a;
    }

    public C0424j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return n() == y0Var.n() && m() == y0Var.m() && Objects.equals(j(), y0Var.j()) && Objects.equals(h(), y0Var.h()) && Objects.equals(e(), y0Var.e());
    }

    public L.c f(int i10) {
        return L.c.f2711e;
    }

    public L.c g() {
        return j();
    }

    public L.c h() {
        return L.c.f2711e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public L.c i() {
        return j();
    }

    public L.c j() {
        return L.c.f2711e;
    }

    public L.c k() {
        return j();
    }

    public B0 l(int i10, int i11, int i12, int i13) {
        return f4864b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(L.c[] cVarArr) {
    }

    public void p(B0 b3) {
    }

    public void q(L.c cVar) {
    }
}
