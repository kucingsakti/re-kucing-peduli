package K9;

import java.util.Iterator;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2705t;

    public /* synthetic */ r(Object obj, int i10) {
        this.f2704s = i10;
        this.f2705t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u8.a, v8.k] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2704s) {
            case 0:
                return ((l) this.f2705t).iterator();
            case 1:
                return x.g((Object[]) this.f2705t);
            default:
                return new b((Iterator) ((p210v8.k) this.f2705t).invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(p200u8.a aVar) {
        this.f2704s = 2;
        this.f2705t = (p210v8.k) aVar;
    }
}
