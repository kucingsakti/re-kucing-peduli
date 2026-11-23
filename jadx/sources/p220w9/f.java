package p220w9;

import p096j9.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15656b;

    public f(b bVar, d dVar) {
        i.f(bVar, "classId");
        this.a = bVar;
        this.f15656b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return i.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
