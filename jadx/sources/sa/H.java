package sa;

/* JADX INFO: loaded from: classes.dex */
public final class H extends K0.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f14820b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14821c;

    public H() {
        this.a = 4;
    }

    @Override // K0.n
    public final void q() {
        K0.n.r(this.f14820b);
        this.f14821c = null;
    }

    public final void s(char c10) {
        String str = this.f14821c;
        StringBuilder sb = this.f14820b;
        if (str != null) {
            sb.append(str);
            this.f14821c = null;
        }
        sb.append(c10);
    }

    public final void t(String str) {
        String str2 = this.f14821c;
        StringBuilder sb = this.f14820b;
        if (str2 != null) {
            sb.append(str2);
            this.f14821c = null;
        }
        if (sb.length() == 0) {
            this.f14821c = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<!--");
        String string = this.f14821c;
        if (string == null) {
            string = this.f14820b.toString();
        }
        return E0.a.l(sb, string, "-->");
    }
}
