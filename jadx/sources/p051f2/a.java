package p051f2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11423c;

    public a(Object obj, d dVar, b bVar) {
        this.a = obj;
        this.f11422b = dVar;
        this.f11423c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.getClass();
            if (this.a.equals(aVar.a) && this.f11422b.equals(aVar.f11422b)) {
                b bVar = aVar.f11423c;
                b bVar2 = this.f11423c;
                if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.f11422b.hashCode()) * 1000003;
        b bVar = this.f11423c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.f11422b + ", productData=" + this.f11423c + ", eventContext=null}";
    }
}
