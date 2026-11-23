package J2;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zzak {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzag f2362u;

    public a(zzag zzagVar, int i10) {
        int size = zzagVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(zzs.c(i10, "index", size));
        }
        this.f2360s = size;
        this.f2361t = i10;
        this.f2362u = zzagVar;
    }

    public final Object a(int i10) {
        return this.f2362u.get(i10);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2361t < this.f2360s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2361t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2361t;
        this.f2361t = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2361t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f2361t - 1;
        this.f2361t = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2361t - 1;
    }
}
