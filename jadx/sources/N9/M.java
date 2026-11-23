package N9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3419s;

    public M(boolean z6) {
        this.f3419s = z6;
    }

    @Override // N9.Y
    public final boolean a() {
        return this.f3419s;
    }

    @Override // N9.Y
    public final l0 c() {
        return null;
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("Empty{"), this.f3419s ? "Active" : "New", '}');
    }
}
