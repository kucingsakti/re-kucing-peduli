package K9;

import java.util.Iterator;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class p implements l {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2699b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.f2699b = obj;
    }

    @Override // K9.l
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return (Iterator) this.f2699b;
            case 1:
                return x.g((Object[]) this.f2699b);
            default:
                return ((Iterable) this.f2699b).iterator();
        }
    }
}
