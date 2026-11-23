package G9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1777t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1778u;

    public /* synthetic */ q(Object obj, int i10) {
        this.f1776s = i10;
        this.f1778u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1776s) {
            case 0:
                break;
        }
        return this.f1777t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1776s) {
            case 0:
                if (!this.f1777t) {
                    throw new NoSuchElementException();
                }
                this.f1777t = false;
                return ((r) this.f1778u).f1779s;
            default:
                if (!this.f1777t) {
                    throw new NoSuchElementException();
                }
                this.f1777t = false;
                return this.f1778u;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1776s) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
