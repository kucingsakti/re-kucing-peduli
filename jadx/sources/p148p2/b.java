package p148p2;

import i2.h;
import i2.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f14206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f14207c;

    public b(long j, i iVar, h hVar) {
        this.a = j;
        this.f14206b = iVar;
        this.f14207c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.f14206b.equals(bVar.f14206b) && this.f14207c.equals(bVar.f14207c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f14206b.hashCode()) * 1000003) ^ this.f14207c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.f14206b + ", event=" + this.f14207c + "}";
    }
}
