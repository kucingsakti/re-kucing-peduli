package p106l0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p053f4.e;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Spannable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12889s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Spannable f12890t;

    public u(Spannable spannable) {
        this.f12890t = spannable;
    }

    public final void a() {
        Spannable spannable = this.f12890t;
        if (!this.f12889s) {
            if ((Build.VERSION.SDK_INT < 28 ? new e(23) : new t(23)).q(spannable)) {
                this.f12890t = new SpannableString(spannable);
            }
        }
        this.f12889s = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f12890t.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f12890t.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f12890t.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f12890t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f12890t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f12890t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f12890t.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12890t.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f12890t.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f12890t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f12890t.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f12890t.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f12890t.toString();
    }
}
