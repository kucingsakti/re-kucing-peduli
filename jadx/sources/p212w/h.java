package p212w;

import java.util.ConcurrentModificationException;
import p210v8.i;
import p221x.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15503b = new Object();

    public static final void a(j jVar) {
        int i10 = jVar.f15510v;
        int[] iArr = jVar.f15508t;
        Object[] objArr = jVar.f15509u;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f15503b) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        jVar.f15507s = false;
        jVar.f15510v = i11;
    }

    public static final void b(f fVar, int i10) {
        i.f(fVar, "<this>");
        fVar.f15496s = new int[i10];
        fVar.f15497t = new Object[i10];
    }

    public static final int c(f fVar, Object obj, int i10) {
        i.f(fVar, "<this>");
        int i11 = fVar.f15498u;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = a.a(fVar.f15498u, i10, fVar.f15496s);
            if (iA < 0 || i.a(obj, fVar.f15497t[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.f15496s[i12] == i10) {
                if (i.a(obj, fVar.f15497t[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.f15496s[i13] == i10; i13--) {
                if (i.a(obj, fVar.f15497t[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
