package W0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f5297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f5298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f5299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f5301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f5302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5304i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f5306l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
