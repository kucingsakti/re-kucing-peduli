package p091j3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public CharSequence a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f12483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12485d;
    public boolean j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f12486e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12487f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12488g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12489h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12490i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f12491k = null;

    public x(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.a = charSequence;
        this.f12483b = textPaint;
        this.f12484c = i10;
        this.f12485d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.f12484c);
        CharSequence charSequenceEllipsize = this.a;
        int i10 = this.f12487f;
        TextPaint textPaint = this.f12483b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f12491k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f12485d);
        this.f12485d = iMin;
        if (this.j && this.f12487f == 1) {
            this.f12486e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f12486e);
        builderObtain.setIncludePad(this.f12490i);
        builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f12491k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f12487f);
        float f10 = this.f12488g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f12487f > 1) {
            builderObtain.setHyphenationFrequency(this.f12489h);
        }
        return builderObtain.build();
    }
}
