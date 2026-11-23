package G9;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements e {
    public final p210v8.k a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1803b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(String str, p200u8.b bVar) {
        this.a = (p210v8.k) bVar;
        this.f1803b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [u8.b, v8.k] */
    @Override // G9.e
    public final boolean a(W8.f fVar) {
        return p210v8.i.a(fVar.f3787y, this.a.invoke(p165q9.d.e(fVar)));
    }

    @Override // G9.e
    public final String b(W8.f fVar) {
        return D3.b.n(this, fVar);
    }

    @Override // G9.e
    public final String getDescription() {
        return this.f1803b;
    }
}
