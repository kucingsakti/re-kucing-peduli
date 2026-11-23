package B9;

import A9.AbstractC0130c;
import A9.C0141n;
import A9.M;
import A9.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f798t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f799u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s[] f801w;

    static {
        q qVar = new q();
        f797s = qVar;
        o oVar = new o();
        f798t = oVar;
        r rVar = new r();
        f799u = rVar;
        p pVar = new p();
        f800v = pVar;
        f801w = new s[]{qVar, oVar, rVar, pVar};
    }

    public static s g(d0 d0Var) {
        p210v8.i.f(d0Var, "<this>");
        if (d0Var.H()) {
            return f798t;
        }
        if (d0Var instanceof C0141n) {
        }
        return AbstractC0130c.g(g.l(false, null, 24), AbstractC0130c.l(d0Var), M.f340b) ? f800v : f799u;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f801w.clone();
    }

    public abstract s f(d0 d0Var);
}
