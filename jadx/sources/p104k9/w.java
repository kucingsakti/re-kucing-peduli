package p104k9;

import androidx.datastore.preferences.protobuf.C0485e;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f12825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0485e f12826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12827u;

    public w(x xVar) {
        v vVar = new v(xVar);
        this.f12825s = vVar;
        this.f12826t = new C0485e(vVar.next());
        this.f12827u = xVar.f12829t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12827u > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12826t.hasNext()) {
            this.f12826t = new C0485e(this.f12825s.next());
        }
        this.f12827u--;
        return Byte.valueOf(this.f12826t.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
