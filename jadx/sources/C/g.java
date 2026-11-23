package C;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f830m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f823e = 2;
        } else {
            this.f823e = 3;
        }
    }

    @Override // C.f
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f825g = i10;
        for (d dVar : this.f828k) {
            dVar.a(dVar);
        }
    }
}
