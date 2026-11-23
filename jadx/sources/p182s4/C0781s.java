package p182s4;

import p210v8.i;

/* JADX INFO: renamed from: s4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781s {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14716d;

    public C0781s(int i10, int i11, String str, boolean z6) {
        this.a = str;
        this.f14714b = i10;
        this.f14715c = i11;
        this.f14716d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0781s)) {
            return false;
        }
        C0781s c0781s = (C0781s) obj;
        return i.a(this.a, c0781s.a) && this.f14714b == c0781s.f14714b && this.f14715c == c0781s.f14715c && this.f14716d == c0781s.f14716d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.f14714b) * 31) + this.f14715c) * 31;
        boolean z6 = this.f14716d;
        ?? r10 = z6;
        if (z6) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.f14714b + ", importance=" + this.f14715c + ", isDefaultProcess=" + this.f14716d + ')';
    }
}
