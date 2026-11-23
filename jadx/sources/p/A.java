package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class A extends RatingBar {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0738y f13898s;

    public A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        N0.a(this, getContext());
        C0738y c0738y = new C0738y(this);
        this.f13898s = c0738y;
        c0738y.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f13898s.f14159c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
