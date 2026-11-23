package A1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Appendable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Appendable f46s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47t = true;

    public A(Appendable appendable) {
        this.f46s = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        boolean z6 = this.f47t;
        Appendable appendable = this.f46s;
        if (z6) {
            this.f47t = false;
            appendable.append("  ");
        }
        this.f47t = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z6 = this.f47t;
        Appendable appendable = this.f46s;
        boolean z10 = false;
        if (z6) {
            this.f47t = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z10 = true;
        }
        this.f47t = z10;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
