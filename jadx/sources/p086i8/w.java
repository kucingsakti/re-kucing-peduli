package p086i8;

import java.util.Iterator;
import p219w8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Iterator, a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
