package W0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {
    public q a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatorSet f5251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f5252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p212w.e f5253d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
