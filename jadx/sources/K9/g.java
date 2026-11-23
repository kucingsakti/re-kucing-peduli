package K9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2684c;

    public g(l lVar, boolean z6, p200u8.b bVar) {
        this.a = lVar;
        this.f2683b = z6;
        this.f2684c = bVar;
    }

    @Override // K9.l
    public final Iterator iterator() {
        return new f(this);
    }
}
