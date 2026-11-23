package P8;

import L8.Y;
import L8.Z;
import L8.a0;
import L8.d0;
import L8.e0;
import p095j8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f3899v = new a("package", false);

    @Override // L8.e0
    public final Integer a(e0 e0Var) {
        i.f(e0Var, "visibility");
        if (this == e0Var) {
            return 0;
        }
        e eVar = d0.a;
        return (e0Var == Y.f2807v || e0Var == Z.f2808v) ? 1 : -1;
    }

    @Override // L8.e0
    public final String d() {
        return "public/*package*/";
    }

    @Override // L8.e0
    public final e0 l() {
        return a0.f2809v;
    }
}
