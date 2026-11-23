package p212w;

import java.util.Arrays;
import p210v8.i;
import p221x.a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ boolean f15507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int[] f15508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object[] f15509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f15510v;

    public j(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f15508t = new int[i14];
        this.f15509u = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f15510v;
        if (i11 != 0 && i10 <= this.f15508t[i11 - 1]) {
            f(i10, obj);
            return;
        }
        if (this.f15507s && i11 >= this.f15508t.length) {
            h.a(this);
        }
        int i12 = this.f15510v;
        if (i12 >= this.f15508t.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f15508t, i16);
            i.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15508t = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15509u, i16);
            i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15509u = objArrCopyOf;
        }
        this.f15508t[i12] = i10;
        this.f15509u[i12] = obj;
        this.f15510v = i12 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        i.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) objClone;
        jVar.f15508t = (int[]) this.f15508t.clone();
        jVar.f15509u = (Object[]) this.f15509u.clone();
        return jVar;
    }

    public final Object d(int i10) {
        Object obj;
        int iA = a.a(this.f15510v, i10, this.f15508t);
        if (iA < 0 || (obj = this.f15509u[iA]) == h.f15503b) {
            return null;
        }
        return obj;
    }

    public final int e(int i10) {
        if (this.f15507s) {
            h.a(this);
        }
        return this.f15508t[i10];
    }

    public final void f(int i10, Object obj) {
        int iA = a.a(this.f15510v, i10, this.f15508t);
        if (iA >= 0) {
            this.f15509u[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f15510v;
        if (i11 < i12) {
            Object[] objArr = this.f15509u;
            if (objArr[i11] == h.f15503b) {
                this.f15508t[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f15507s && i12 >= this.f15508t.length) {
            h.a(this);
            i11 = ~a.a(this.f15510v, i10, this.f15508t);
        }
        int i13 = this.f15510v;
        if (i13 >= this.f15508t.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f15508t, i17);
            i.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15508t = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15509u, i17);
            i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15509u = objArrCopyOf;
        }
        int i18 = this.f15510v;
        if (i18 - i11 != 0) {
            int[] iArr = this.f15508t;
            int i19 = i11 + 1;
            p086i8.i.p(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f15509u;
            p086i8.i.q(objArr2, objArr2, i19, i11, this.f15510v);
        }
        this.f15508t[i11] = i10;
        this.f15509u[i11] = obj;
        this.f15510v++;
    }

    public final int h() {
        if (this.f15507s) {
            h.a(this);
        }
        return this.f15510v;
    }

    public final Object i(int i10) {
        if (this.f15507s) {
            h.a(this);
        }
        return this.f15509u[i10];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15510v * 28);
        sb.append('{');
        int i10 = this.f15510v;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(e(i11));
            sb.append('=');
            Object objI = i(i11);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        i.e(string, "buffer.toString()");
        return string;
    }
}
