package B1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    public final f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f582c;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // B1.j
    public final void a() {
        this.a.R0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f581b == eVar.f581b && this.f582c == eVar.f582c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f581b * 31;
        Class cls = this.f582c;
        return i10 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f581b + "array=" + this.f582c + '}';
    }
}
