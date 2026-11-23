package p166r;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f14447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f14448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f14449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f14450v;

    public c(Object obj, Object obj2) {
        this.f14447s = obj;
        this.f14448t = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14447s.equals(cVar.f14447s) && this.f14448t.equals(cVar.f14448t);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14447s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14448t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f14447s.hashCode() ^ this.f14448t.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f14447s + "=" + this.f14448t;
    }
}
