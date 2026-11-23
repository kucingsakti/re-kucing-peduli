package sa;

/* JADX INFO: loaded from: classes.dex */
public final class L extends M {
    public L() {
        this.a = 2;
    }

    @Override // sa.M, K0.n
    /* JADX INFO: renamed from: A */
    public final M q() {
        super.q();
        this.f14836l = null;
        return this;
    }

    public final String toString() {
        if (!w() || this.f14836l.f13863s <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str = this.f14827b;
            return E0.a.l(sb, str != null ? str : "[unset]", ">");
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str2 = this.f14827b;
        sb2.append(str2 != null ? str2 : "[unset]");
        sb2.append(" ");
        sb2.append(this.f14836l.toString());
        sb2.append(">");
        return sb2.toString();
    }
}
