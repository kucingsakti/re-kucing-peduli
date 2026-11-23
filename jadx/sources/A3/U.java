package A3;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0121t {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final U f242z = new U(AbstractC0121t.f282v, null, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Map.Entry[] f243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient C0123v[] f244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f245y;

    public U(Map.Entry[] entryArr, C0123v[] c0123vArr, int i10) {
        this.f243w = entryArr;
        this.f244x = c0123vArr;
        this.f245y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    public static AbstractC0121t h(int i10, Map.Entry[] entryArr) throws S {
        C0123v c0122u;
        Map.Entry[] entryArr2 = i10 == entryArr.length ? entryArr : new C0123v[i10];
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.2d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        C0123v[] c0123vArr = new C0123v[iHighestOneBit];
        int i11 = iHighestOneBit - 1;
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            Map.Entry entry = entryArr[i12];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            C3.a.c(key, value);
            int iF = C4.a.F(key.hashCode()) & i11;
            C0123v c0123v = c0123vArr[iF];
            int i13 = 0;
            for (C0123v c0123vA = c0123v; c0123vA != null; c0123vA = c0123vA.a()) {
                if (c0123vA.f270s.equals(key)) {
                    throw AbstractC0121t.a(c0123vA, key + "=" + value);
                }
                i13++;
                if (i13 > 8) {
                    throw new S();
                }
            }
            if (c0123v != null) {
                c0122u = new C0122u(key, value, c0123v);
            } else if (entry instanceof C0123v) {
                c0122u = (C0123v) entry;
                if (c0122u instanceof C0122u) {
                    c0122u = new C0123v(key, value);
                }
            } else {
                c0122u = new C0123v(key, value);
            }
            c0123vArr[iF] = c0122u;
            entryArr2[i12] = c0122u;
        }
        return new U(entryArr2, c0123vArr, i11);
    }

    @Override // A3.AbstractC0121t
    public final F b() {
        Map.Entry[] entryArr = this.f243w;
        return new C0124w(this, AbstractC0119q.o(entryArr.length, entryArr));
    }

    @Override // A3.AbstractC0121t
    public final F c() {
        return new C0126y(this, 1);
    }

    @Override // A3.AbstractC0121t
    public final AbstractC0113k e() {
        return new T(this);
    }

    @Override // java.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : this.f243w) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final Object get(Object obj) {
        C0123v[] c0123vArr;
        if (obj == null || (c0123vArr = this.f244x) == null) {
            return null;
        }
        for (C0123v c0123vA = c0123vArr[C4.a.F(obj.hashCode()) & this.f245y]; c0123vA != null; c0123vA = c0123vA.a()) {
            if (obj.equals(c0123vA.f270s)) {
                return c0123vA.f271t;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f243w.length;
    }
}
