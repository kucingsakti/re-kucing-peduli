package p220w9;

import A9.AbstractC0151y;
import A9.D;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import java.util.ArrayList;
import p047e9.A;
import p047e9.Q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f15659b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f15660c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f15661d = new i();

    public static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i10 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int e(A a) {
        int i10 = a == null ? -1 : t.a[a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 3;
            }
            if (i10 == 3) {
                return 4;
            }
            if (i10 == 4) {
                return 2;
            }
        }
        return 1;
    }

    @Override // p220w9.k
    public AbstractC0151y a(Q q10, String str, D d3, D d8) {
        p210v8.i.f(q10, "proto");
        p210v8.i.f(str, "flexibleId");
        p210v8.i.f(d3, "lowerBound");
        p210v8.i.f(d8, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // p220w9.j
    public void b(InterfaceC0271e interfaceC0271e, ArrayList arrayList) {
        if (interfaceC0271e != null) {
            return;
        }
        d(0);
        throw null;
    }

    @Override // p220w9.j
    public void c(InterfaceC0269c interfaceC0269c) {
        if (interfaceC0269c != null) {
            return;
        }
        d(2);
        throw null;
    }
}
