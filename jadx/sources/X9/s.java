package X9;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class s extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f5638c;
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5639b;

    static {
        Pattern pattern = A.f5431d;
        f5638c = p068ga.d.k("application/x-www-form-urlencoded");
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        p210v8.i.f(arrayList, "encodedNames");
        p210v8.i.f(arrayList2, "encodedValues");
        this.a = Y9.c.x(arrayList);
        this.f5639b = Y9.c.x(arrayList2);
    }

    @Override // X9.J
    public final long a() {
        return e(null, true);
    }

    @Override // X9.J
    public final A b() {
        return f5638c;
    }

    @Override // X9.J
    public final void d(ma.g gVar) throws EOFException {
        e(gVar, false);
    }

    public final long e(ma.g gVar, boolean z6) throws EOFException {
        ma.f fVarD;
        if (z6) {
            fVarD = new ma.f();
        } else {
            p210v8.i.c(gVar);
            fVarD = gVar.d();
        }
        List list = this.a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                fVarD.d0(38);
            }
            fVarD.i0((String) list.get(i10));
            fVarD.d0(61);
            fVarD.i0((String) this.f5639b.get(i10));
            i10 = i11;
        }
        if (!z6) {
            return 0L;
        }
        long j = fVarD.f13190t;
        fVarD.a();
        return j;
    }
}
