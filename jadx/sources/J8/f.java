package J8;

import java.util.List;
import p086i8.s;
import t9.h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    @Override // t9.h
    public final List h() {
        c cVar = (c) this.f15249b;
        int iOrdinal = cVar.f2450y.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? s.f12328s : com.bumptech.glide.d.u(o1.f.d(cVar, true));
        }
        return com.bumptech.glide.d.u(o1.f.d(cVar, false));
    }
}
