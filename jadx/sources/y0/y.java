package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16003s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f16005u;

    public y(z zVar) {
        this.f16005u = zVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16003s + 1 < this.f16005u.f16007C.h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16004t = true;
        p212w.j jVar = this.f16005u.f16007C;
        int i10 = this.f16003s + 1;
        this.f16003s = i10;
        return (x) jVar.i(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16004t) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        z zVar = this.f16005u;
        int i10 = this.f16003s;
        p212w.j jVar = zVar.f16007C;
        ((x) jVar.i(i10)).f15996t = null;
        int i11 = this.f16003s;
        Object[] objArr = jVar.f15509u;
        Object obj = objArr[i11];
        Object obj2 = p212w.h.f15503b;
        if (obj != obj2) {
            objArr[i11] = obj2;
            jVar.f15507s = true;
        }
        this.f16003s = i11 - 1;
        this.f16004t = false;
    }
}
