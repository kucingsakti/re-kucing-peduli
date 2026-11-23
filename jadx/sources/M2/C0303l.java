package M2;

import java.util.Iterator;

/* JADX INFO: renamed from: M2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303l implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f3047t;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3046s) {
            case 0:
                break;
        }
        return this.f3047t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3046s) {
            case 0:
                break;
        }
        return (String) this.f3047t.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3046s) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
