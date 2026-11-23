package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class C extends SeekBar {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D f13927s;

    public C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        N0.a(this, getContext());
        D d3 = new D(this);
        this.f13927s = d3;
        d3.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        D d3 = this.f13927s;
        Drawable drawable = d3.f13929f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C c10 = d3.f13928e;
        if (drawable.setState(c10.getDrawableState())) {
            c10.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13927s.f13929f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13927s.g(canvas);
    }
}
