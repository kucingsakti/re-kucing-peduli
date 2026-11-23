package p041e3;

import A1.l;
import C4.a;
import U.H;
import U.U;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p078i.C0650g;
import p078i.DialogInterfaceC0653j;
import p091j3.C;
import p170r3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f10707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f10708v;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context) {
        TypedValue typedValueB = a.B(context, R.attr.materialAlertDialogTheme);
        int i10 = typedValueB == null ? 0 : typedValueB.data;
        Context contextA = p225x3.a.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextA = i10 != 0 ? new p125n.b(contextA, i10) : contextA;
        TypedValue typedValueB2 = a.B(context, R.attr.materialAlertDialogTheme);
        super(contextA, typedValueB2 == null ? 0 : typedValueB2.data);
        ContextThemeWrapper contextThemeWrapper = ((C0650g) this.f123t).a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        int[] iArr = Q2.a.f4024s;
        C.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        C.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f10708v = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueD = a.D(R.attr.colorSurface, contextThemeWrapper, b.class.getCanonicalName());
        int i11 = typedValueD.resourceId;
        int iA = i11 != 0 ? J.b.a(contextThemeWrapper, i11) : typedValueD.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA);
        typedArrayObtainStyledAttributes2.recycle();
        g gVar = new g(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        gVar.j(contextThemeWrapper);
        gVar.l(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((C0650g) this.f123t).a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                I4.b bVarF = gVar.f14501s.a.f();
                bVarF.c(dimension);
                gVar.setShapeAppearanceModel(bVarF.a());
            }
        }
        this.f10707u = gVar;
    }

    @Override // A1.l
    public final DialogInterfaceC0653j c() {
        DialogInterfaceC0653j dialogInterfaceC0653jC = super.c();
        Window window = dialogInterfaceC0653jC.getWindow();
        View decorView = window.getDecorView();
        g gVar = this.f10707u;
        if (gVar instanceof g) {
            WeakHashMap weakHashMap = U.a;
            gVar.k(H.i(decorView));
        }
        Rect rect = this.f10708v;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(dialogInterfaceC0653jC, rect));
        return dialogInterfaceC0653jC;
    }

    @Override // A1.l
    public final l e(int i10, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // A1.l
    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.f(null, null);
    }

    public final void h(String str, DialogInterface.OnClickListener onClickListener) {
        C0650g c0650g = (C0650g) this.f123t;
        c0650g.f12047i = str;
        c0650g.j = onClickListener;
    }

    public final void i(String str, DialogInterface.OnClickListener onClickListener) {
        super.f(str, onClickListener);
    }
}
