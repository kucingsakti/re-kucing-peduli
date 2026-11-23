package sa;

import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends K0.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14828c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14830e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14833h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public org.jsoup.nodes.c f14836l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f14829d = new StringBuilder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14831f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f14832g = new StringBuilder();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14834i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14835k = false;

    @Override // K0.n
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public M q() {
        this.f14827b = null;
        this.f14828c = null;
        K0.n.r(this.f14829d);
        this.f14830e = null;
        this.f14831f = false;
        K0.n.r(this.f14832g);
        this.f14833h = null;
        this.j = false;
        this.f14834i = false;
        this.f14835k = false;
        this.f14836l = null;
        return this;
    }

    public final void s(char c10) {
        this.f14834i = true;
        String str = this.f14833h;
        StringBuilder sb = this.f14832g;
        if (str != null) {
            sb.append(str);
            this.f14833h = null;
        }
        sb.append(c10);
    }

    public final void t(String str) {
        this.f14834i = true;
        String str2 = this.f14833h;
        StringBuilder sb = this.f14832g;
        if (str2 != null) {
            sb.append(str2);
            this.f14833h = null;
        }
        if (sb.length() == 0) {
            this.f14833h = str;
        } else {
            sb.append(str);
        }
    }

    public final void u(int[] iArr) {
        this.f14834i = true;
        String str = this.f14833h;
        StringBuilder sb = this.f14832g;
        if (str != null) {
            sb.append(str);
            this.f14833h = null;
        }
        for (int i10 : iArr) {
            sb.appendCodePoint(i10);
        }
    }

    public final void v(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f14827b;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f14827b = strReplace;
        this.f14828c = J7.j.t(strReplace.trim());
    }

    public final boolean w() {
        return this.f14836l != null;
    }

    public final String x() {
        String str = this.f14827b;
        if (str == null || str.length() == 0) {
            throw new ValidationException("Must be false");
        }
        return this.f14827b;
    }

    public final void y(String str) {
        this.f14827b = str;
        this.f14828c = J7.j.t(str.trim());
    }

    public final void z() {
        String string;
        if (this.f14836l == null) {
            this.f14836l = new org.jsoup.nodes.c();
        }
        boolean z6 = this.f14831f;
        StringBuilder sb = this.f14832g;
        StringBuilder sb2 = this.f14829d;
        if (z6 && this.f14836l.f13863s < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.f14830e).trim();
            if (strTrim.length() > 0) {
                if (this.f14834i) {
                    string = sb.length() > 0 ? sb.toString() : this.f14833h;
                } else {
                    string = this.j ? "" : null;
                }
                this.f14836l.d(strTrim, string);
            }
        }
        K0.n.r(sb2);
        this.f14830e = null;
        this.f14831f = false;
        K0.n.r(sb);
        this.f14833h = null;
        this.f14834i = false;
        this.j = false;
    }
}
