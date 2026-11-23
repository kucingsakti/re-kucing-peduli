package J0;

import U.U;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: J0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0256f {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2305d;

    public void a(L7.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f2305d;
        int i10 = this.a;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
        Object obj3 = objArr[i11];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj2 = objArr[i11];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i11] = bVar;
        int i12 = this.f2303b + 1;
        this.f2303b = i12;
        if (i12 < this.f2304c) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f2305d;
        int length = objArr2.length;
        int i13 = length << 1;
        int i14 = i13 - 1;
        Object[] objArr3 = new Object[i13];
        while (true) {
            int i15 = i12 - 1;
            if (i12 == 0) {
                this.a = i14;
                this.f2304c = (int) (i13 * 0.75f);
                this.f2305d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i16 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i14;
            if (objArr3[i16] != null) {
                do {
                    i16 = (i16 + 1) & i14;
                } while (objArr3[i16] != null);
            }
            objArr3[i16] = objArr2[length];
            i12 = i15;
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f2304c;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.f2305d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2305d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f2305d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f2305d;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f2304c++;
    }

    public void c() {
        int i10 = this.f2304c;
        View view = (View) this.f2305d;
        int top = i10 - (view.getTop() - this.a);
        WeakHashMap weakHashMap = U.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f2303b));
    }

    public void d(RecyclerView recyclerView, boolean z6) {
        this.f2304c = 0;
        int[] iArr = (int[]) this.f2305d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.w wVar = recyclerView.f6928F;
        if (recyclerView.f6926E == null || wVar == null || !wVar.j) {
            return;
        }
        if (z6) {
            if (!recyclerView.f6982w.g()) {
                wVar.j(recyclerView.f6926E.a(), this);
            }
        } else if (!recyclerView.O()) {
            wVar.i(this.a, this.f2303b, recyclerView.f6989z0, this);
        }
        int i10 = this.f2304c;
        if (i10 > wVar.f7129k) {
            wVar.f7129k = i10;
            wVar.f7130l = z6;
            recyclerView.f6978u.m();
        }
    }

    public void e(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f2303b--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i14 = (iHashCode ^ (iHashCode >>> 16)) & i11;
                    if (i10 > i12) {
                        if (i10 >= i14 && i14 > i12) {
                            break;
                        } else {
                            i13 = i12 + 1;
                        }
                    } else if (i10 >= i14 || i14 > i12) {
                        break;
                    } else {
                        i13 = i12 + 1;
                    }
                } else {
                    objArr[i10] = null;
                    return;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }
}
