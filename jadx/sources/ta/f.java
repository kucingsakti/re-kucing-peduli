package ta;

/* JADX INFO: loaded from: classes.dex */
public final class f extends m {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15273c;

    public f(String str, int i10, String str2, boolean z6) {
        this.f15273c = i10;
        qa.b.u(str);
        qa.b.u(str2);
        this.a = J7.j.v(str);
        boolean z10 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z10 ? str2.substring(1, str2.length() - 1) : str2;
        String strT = (!z6 && z10) ? J7.j.t(str2) : J7.j.v(str2);
        this.f15272b = strT;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        switch (this.f15273c) {
            case 0:
                String str = this.a;
                if (kVar2.m(str)) {
                    if (this.f15272b.equalsIgnoreCase(kVar2.d(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = this.a;
                return kVar2.m(str2) && J7.j.t(kVar2.d(str2)).contains(this.f15272b);
            case 2:
                String str3 = this.a;
                return kVar2.m(str3) && J7.j.t(kVar2.d(str3)).endsWith(this.f15272b);
            case 3:
                return !this.f15272b.equalsIgnoreCase(kVar2.d(this.a));
            default:
                String str4 = this.a;
                return kVar2.m(str4) && J7.j.t(kVar2.d(str4)).startsWith(this.f15272b);
        }
    }

    public final String toString() {
        switch (this.f15273c) {
            case 0:
                return "[" + this.a + "=" + this.f15272b + "]";
            case 1:
                return "[" + this.a + "*=" + this.f15272b + "]";
            case 2:
                return "[" + this.a + "$=" + this.f15272b + "]";
            case 3:
                return "[" + this.a + "!=" + this.f15272b + "]";
            default:
                return "[" + this.a + "^=" + this.f15272b + "]";
        }
    }
}
