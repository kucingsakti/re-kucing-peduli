package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f6501s;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6501s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f6501s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
