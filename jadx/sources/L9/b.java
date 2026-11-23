package L9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2845s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B8.c f2848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f2850x;

    public b(c cVar) {
        this.f2850x = cVar;
        cVar.getClass();
        int length = cVar.a.length();
        if (length < 0) {
            throw new IllegalArgumentException(E0.a.g("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2846t = length;
        this.f2847u = length;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [u8.c, v8.k] */
    public final void a() {
        p076h8.f fVar;
        int i10 = this.f2847u;
        if (i10 < 0) {
            this.f2845s = 0;
            this.f2848v = null;
            return;
        }
        c cVar = this.f2850x;
        int i11 = cVar.f2851b;
        CharSequence charSequence = cVar.a;
        if (i11 > 0) {
            int i12 = this.f2849w + 1;
            this.f2849w = i12;
            if (i12 >= i11) {
                this.f2848v = new B8.c(this.f2846t, f.L(charSequence), 1);
                this.f2847u = -1;
            } else if (i10 > charSequence.length() && (fVar = (p076h8.f) cVar.f2852c.invoke(charSequence, Integer.valueOf(this.f2847u))) != null) {
                int iIntValue = ((Number) fVar.f11789s).intValue();
                int iIntValue2 = ((Number) fVar.f11790t).intValue();
                this.f2848v = p181s3.a.w(this.f2846t, iIntValue);
                int i13 = iIntValue + iIntValue2;
                this.f2846t = i13;
                this.f2847u = i13 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f2848v = new B8.c(this.f2846t, f.L(charSequence), 1);
                this.f2847u = -1;
            }
        } else if (i10 > charSequence.length()) {
            this.f2848v = new B8.c(this.f2846t, f.L(charSequence), 1);
            this.f2847u = -1;
        } else {
            int iIntValue3 = ((Number) fVar.f11789s).intValue();
            int iIntValue4 = ((Number) fVar.f11790t).intValue();
            this.f2848v = p181s3.a.w(this.f2846t, iIntValue3);
            int i14 = iIntValue3 + iIntValue4;
            this.f2846t = i14;
            this.f2847u = i14 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f2845s = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2845s == -1) {
            a();
        }
        return this.f2845s == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2845s == -1) {
            a();
        }
        if (this.f2845s == 0) {
            throw new NoSuchElementException();
        }
        B8.c cVar = this.f2848v;
        p210v8.i.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2848v = null;
        this.f2845s = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
