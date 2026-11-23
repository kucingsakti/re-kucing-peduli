package p086i8;

import U.Z;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: i8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0663b extends Z implements ListIterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0665d f12315v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663b(AbstractC0665d abstractC0665d, int i10) {
        super(abstractC0665d, 1);
        this.f12315v = abstractC0665d;
        int iE = abstractC0665d.e();
        if (i10 < 0 || i10 > iE) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", iE));
        }
        this.f4792t = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4792t > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4792t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4792t - 1;
        this.f4792t = i10;
        return this.f12315v.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4792t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
