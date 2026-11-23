package A1;

import java.security.MessageDigest;

/* JADX INFO: renamed from: A1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098g implements p232y1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p232y1.e f100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p232y1.e f101c;

    public C0098g(p232y1.e eVar, p232y1.e eVar2) {
        this.f100b = eVar;
        this.f101c = eVar2;
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        this.f100b.b(messageDigest);
        this.f101c.b(messageDigest);
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof C0098g) {
            C0098g c0098g = (C0098g) obj;
            if (this.f100b.equals(c0098g.f100b) && this.f101c.equals(c0098g.f101c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return this.f101c.hashCode() + (this.f100b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f100b + ", signature=" + this.f101c + '}';
    }
}
