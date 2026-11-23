package p167r0;

import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final b a = b.a;

    public static b a(b bVar) {
        while (bVar != null) {
            if (bVar.v()) {
                bVar.p();
            }
            bVar = bVar.f6624Q;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (e.K(3)) {
            violation.f6704s.getClass();
        }
    }

    public static final void c(b bVar, String str) {
        i.f(bVar, "fragment");
        i.f(str, "previousFragmentId");
        b(new FragmentReuseViolation(bVar, "Attempting to reuse fragment " + bVar + " with previous ID " + str));
        a(bVar).getClass();
    }
}
