package U;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p086i8.AbstractC0665d;

/* JADX INFO: loaded from: classes.dex */
public class Z implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4793u;

    public /* synthetic */ Z(Object obj, int i10) {
        this.f4791s = i10;
        this.f4793u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4791s) {
            case 0:
                return this.f4792t < ((ViewGroup) this.f4793u).getChildCount();
            case 1:
                return this.f4792t < ((AbstractC0665d) this.f4793u).e();
            case 2:
                return this.f4792t < ((Object[]) this.f4793u).length;
            default:
                return this.f4792t < ((p212w.j) this.f4793u).h();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4791s) {
            case 0:
                int i10 = this.f4792t;
                this.f4792t = i10 + 1;
                View childAt = ((ViewGroup) this.f4793u).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f4792t;
                this.f4792t = i11 + 1;
                return ((AbstractC0665d) this.f4793u).get(i11);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f4793u;
                    int i12 = this.f4792t;
                    this.f4792t = i12 + 1;
                    return objArr[i12];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f4792t--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            default:
                int i13 = this.f4792t;
                this.f4792t = i13 + 1;
                return ((p212w.j) this.f4793u).i(i13);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4791s) {
            case 0:
                int i10 = this.f4792t - 1;
                this.f4792t = i10;
                ((ViewGroup) this.f4793u).removeViewAt(i10);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Z(Object[] objArr) {
        this.f4791s = 2;
        p210v8.i.f(objArr, "array");
        this.f4793u = objArr;
    }
}
