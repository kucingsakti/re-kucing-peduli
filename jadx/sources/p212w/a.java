package p212w;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15486w;

    public a(int i10) {
        this.f15482s = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15483t < this.f15482s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15483t;
        switch (this.f15485v) {
            case 0:
                objG = ((e) this.f15486w).g(i10);
                break;
            case 1:
                objG = ((e) this.f15486w).k(i10);
                break;
            default:
                objG = ((f) this.f15486w).f15497t[i10];
                break;
        }
        this.f15483t++;
        this.f15484u = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15484u) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f15483t - 1;
        this.f15483t = i10;
        switch (this.f15485v) {
            case 0:
                ((e) this.f15486w).i(i10);
                break;
            case 1:
                ((e) this.f15486w).i(i10);
                break;
            default:
                ((f) this.f15486w).e(i10);
                break;
        }
        this.f15482s--;
        this.f15484u = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f15498u);
        this.f15485v = 2;
        this.f15486w = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f15506u);
        this.f15485v = i10;
        switch (i10) {
            case 1:
                this.f15486w = eVar;
                this(eVar.f15506u);
                break;
            default:
                this.f15486w = eVar;
                break;
        }
    }
}
