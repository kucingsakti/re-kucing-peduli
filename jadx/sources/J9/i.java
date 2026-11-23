package J9;

import G9.q;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractSet {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f2473u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2475t;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (p210v8.x.d(r2).add(r5) == false) goto L22;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = r4.f2475t
            if (r2 != 0) goto La
            r4.f2474s = r5
            goto L77
        La:
            if (r2 != r1) goto L21
            java.lang.Object r2 = r4.f2474s
            boolean r2 = p210v8.i.a(r2, r5)
            if (r2 == 0) goto L15
            goto L76
        L15:
            java.lang.Object r2 = r4.f2474s
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            r3[r1] = r5
            r4.f2474s = r3
            goto L77
        L21:
            r3 = 5
            if (r2 >= r3) goto L65
            java.lang.Object r2 = r4.f2474s
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            p210v8.i.d(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            boolean r3 = p086i8.i.n(r5, r2)
            if (r3 == 0) goto L34
            goto L76
        L34:
            int r0 = r4.f2475t
            r3 = 4
            if (r0 != r3) goto L54
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r2 = "elements"
            p210v8.i.f(r0, r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = p086i8.z.s(r3)
            r2.<init>(r3)
            p086i8.i.D(r0, r2)
            r2.add(r5)
            goto L62
        L54:
            int r0 = r0 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "copyOf(this, newSize)"
            p210v8.i.e(r2, r0)
            int r0 = r2.length
            int r0 = r0 - r1
            r2[r0] = r5
        L62:
            r4.f2474s = r2
            goto L77
        L65:
            java.lang.Object r2 = r4.f2474s
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            p210v8.i.d(r2, r3)
            java.util.Set r2 = p210v8.x.d(r2)
            boolean r5 = r2.add(r5)
            if (r5 != 0) goto L77
        L76:
            return r0
        L77:
            int r5 = r4.f2475t
            int r5 = r5 + r1
            r4.f2475t = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J9.i.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2474s = null;
        this.f2475t = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f2475t;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return p210v8.i.a(this.f2474s, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f2474s;
            p210v8.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return p086i8.i.n(obj, (Object[]) obj2);
        }
        Object obj3 = this.f2474s;
        p210v8.i.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f2475t;
        if (i10 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i10 == 1) {
            return new q(this.f2474s, 1);
        }
        if (i10 < 5) {
            Object obj = this.f2474s;
            p210v8.i.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new h((Object[]) obj);
        }
        Object obj2 = this.f2474s;
        p210v8.i.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return x.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2475t;
    }
}
