package L1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2739b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.f2739b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 1:
                return ((Drawable.ConstantState) this.f2739b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return ((Drawable.ConstantState) this.f2739b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                return new c(this);
            case 1:
                W0.e eVar = new W0.e(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2739b).newDrawable();
                eVar.f5261s = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f5259x);
                return eVar;
            default:
                return (p081i3.a) this.f2739b;
        }
    }

    public b(p081i3.a aVar) {
        this.a = 2;
        this.f2739b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                return new c(this);
            case 1:
                W0.e eVar = new W0.e(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2739b).newDrawable(resources);
                eVar.f5261s = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f5259x);
                return eVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 1:
                W0.e eVar = new W0.e(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2739b).newDrawable(resources, theme);
                eVar.f5261s = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f5259x);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
