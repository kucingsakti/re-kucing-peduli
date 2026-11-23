package C8;

import F8.m0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f962c = new x(null, null);
    public final y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f963b;

    public x(y yVar, m0 m0Var) {
        String str;
        this.a = yVar;
        this.f963b = m0Var;
        if ((yVar == null) == (m0Var == null)) {
            return;
        }
        if (yVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + yVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && p210v8.i.a(this.f963b, xVar.f963b);
    }

    public final int hashCode() {
        y yVar = this.a;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        m0 m0Var = this.f963b;
        return iHashCode + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        y yVar = this.a;
        int i10 = yVar == null ? -1 : w.a[yVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        m0 m0Var = this.f963b;
        if (i10 == 1) {
            return String.valueOf(m0Var);
        }
        if (i10 == 2) {
            return "in " + m0Var;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + m0Var;
    }
}
