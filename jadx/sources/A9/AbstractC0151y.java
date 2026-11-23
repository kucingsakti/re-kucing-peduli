package A9;

import java.util.List;

/* JADX INFO: renamed from: A9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0151y implements M8.a, D9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f394s;

    public abstract O D();

    public abstract d0 D0();

    public abstract t9.n E0();

    public abstract boolean H();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0151y)) {
            return false;
        }
        AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
        if (H() == abstractC0151y.H()) {
            return AbstractC0130c.u(B9.e.f779t, D0(), abstractC0151y.D0());
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f394s;
        if (i10 != 0) {
            return i10;
        }
        if (AbstractC0130c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (H() ? 1 : 0) + ((l().hashCode() + (D().hashCode() * 31)) * 31);
        }
        this.f394s = iHashCode;
        return iHashCode;
    }

    public abstract List l();

    public abstract AbstractC0151y l0(B9.f fVar);

    public abstract K o();

    @Override // M8.a
    public final M8.h q() {
        return AbstractC0137j.a(o());
    }
}
