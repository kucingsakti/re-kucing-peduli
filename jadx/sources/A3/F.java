package A3;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends AbstractC0113k implements Set {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f227t = 0;

    public static int o(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static F q(int i10, int i11, Object... objArr) {
        E eA;
        if (i10 == 0) {
            return V.f246A;
        }
        int i12 = 0;
        if (i10 == 1) {
            return new Y(objArr[0]);
        }
        D d3 = new D();
        d3.f226b = new Object[i11];
        d3.a = 0;
        d3.f222c = null;
        d3.f223d = 0;
        d3.f224e = 0;
        while (i12 < i10) {
            eA = d3;
            Object obj = objArr[i12];
            obj.getClass();
            i12++;
            eA = eA.a(obj);
        }
        eA = d3;
        return eA.A().c();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof F) && r() && ((F) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public boolean r() {
        return this instanceof C0115m;
    }
}
