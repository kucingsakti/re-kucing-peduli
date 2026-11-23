package p220w9;

import L8.M;
import p047e9.C0618j;
import p067g9.a;
import p067g9.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0618j f15653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f15655d;

    public d(f fVar, C0618j c0618j, a aVar, M m2) {
        i.f(fVar, "nameResolver");
        i.f(c0618j, "classProto");
        i.f(m2, "sourceElement");
        this.a = fVar;
        this.f15653b = c0618j;
        this.f15654c = aVar;
        this.f15655d = m2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.f15653b, dVar.f15653b) && i.a(this.f15654c, dVar.f15654c) && i.a(this.f15655d, dVar.f15655d);
    }

    public final int hashCode() {
        return this.f15655d.hashCode() + ((this.f15654c.hashCode() + ((this.f15653b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.f15653b + ", metadataVersion=" + this.f15654c + ", sourceElement=" + this.f15655d + ')';
    }
}
