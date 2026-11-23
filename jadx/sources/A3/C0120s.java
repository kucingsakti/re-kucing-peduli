package A3;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: A3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120s extends Z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Iterator f281t;

    public /* synthetic */ C0120s(Iterator it, int i10) {
        this.f280s = i10;
        this.f281t = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f280s) {
            case 0:
                return ((Z) this.f281t).hasNext();
            case 1:
                return ((Z) this.f281t).hasNext();
            default:
                return this.f281t.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f280s) {
            case 0:
                return ((Map.Entry) ((Z) this.f281t).next()).getKey();
            case 1:
                return ((Map.Entry) ((Z) this.f281t).next()).getValue();
            default:
                return this.f281t.next();
        }
    }

    public C0120s(C0127z c0127z) {
        this.f280s = 1;
        this.f281t = c0127z.f292t.entrySet().iterator();
    }
}
