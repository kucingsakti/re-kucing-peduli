package A3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends Z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f230t;

    public J(Object obj) {
        this.f230t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f229s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f229s) {
            throw new NoSuchElementException();
        }
        this.f229s = true;
        return this.f230t;
    }
}
