package A3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f221c;

    public C(D d3) {
        Object[] objArr = (Object[]) d3.f226b;
        this.f226b = Arrays.copyOf(objArr, objArr.length);
        int i10 = d3.a;
        this.a = i10;
        this.f221c = new HashSet(J7.a.b(i10));
        for (int i11 = 0; i11 < this.a; i11++) {
            HashSet hashSet = this.f221c;
            Object obj = ((Object[]) this.f226b)[i11];
            Objects.requireNonNull(obj);
            hashSet.add(obj);
        }
    }

    @Override // A3.E
    public final E a(Object obj) {
        obj.getClass();
        if (this.f221c.add(obj)) {
            b(obj);
        }
        return this;
    }

    @Override // A3.E
    public final F c() {
        int i10 = this.a;
        if (i10 == 0) {
            int i11 = F.f227t;
            return V.f246A;
        }
        if (i10 != 1) {
            return new N(this.f221c, AbstractC0119q.o(this.a, (Object[]) this.f226b));
        }
        Object obj = ((Object[]) this.f226b)[0];
        Objects.requireNonNull(obj);
        int i12 = F.f227t;
        return new Y(obj);
    }
}
