package p126n0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p106l0.g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f13290b;

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return g.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        g gVarA = g.a();
        if (this.f13290b == null) {
            this.f13290b = new c(textView, this);
        }
        gVarA.f(this.f13290b);
        return charSequence;
    }
}
