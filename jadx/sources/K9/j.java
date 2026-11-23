package K9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2691t = -2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f2692u;

    public j(k kVar) {
        this.f2692u = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [u8.a, v8.k] */
    public final void a() {
        Object objInvoke;
        int i10 = this.f2691t;
        k kVar = this.f2692u;
        if (i10 == -2) {
            objInvoke = ((p210v8.k) kVar.f2693b).invoke();
        } else {
            p200u8.b bVar = (p200u8.b) kVar.f2694c;
            Object obj = this.f2690s;
            p210v8.i.c(obj);
            objInvoke = bVar.invoke(obj);
        }
        this.f2690s = objInvoke;
        this.f2691t = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2691t < 0) {
            a();
        }
        return this.f2691t == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2691t < 0) {
            a();
        }
        if (this.f2691t == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2690s;
        p210v8.i.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2691t = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
