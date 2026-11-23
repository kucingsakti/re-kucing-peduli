package G7;

import X2.i;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG7/g;", "LX2/i;", "<init>", "()V", "colorsheet_release"}, k = 1, mv = {1, 4, 0})
public final class g extends i {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f1713J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public c f1714K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public HashMap f1715L0;

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p210v8.i.g(layoutInflater, "inflater");
        if (bundle != null) {
            g0();
        }
        return layoutInflater.inflate(R.layout.color_sheet, viewGroup, false);
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void G() {
        super.G();
        this.f1714K0 = null;
        HashMap map = this.f1715L0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        p210v8.i.g(view, "view");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, view));
        if (this.f1713J0 == 0.0f) {
            this.f1713J0 = q().getDimension(R.dimen.default_dialog_radius);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (J7.a.l(J7.a.t(X(), android.R.attr.textColorPrimary))) {
            gradientDrawable.setColor(J.b.a(X(), R.color.dialogPrimary));
        } else {
            gradientDrawable.setColor(J.b.a(X(), R.color.dialogDarkPrimary));
        }
        float f10 = this.f1713J0;
        gradientDrawable.setCornerRadii(new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f});
        view.setBackground(gradientDrawable);
        if (this.f1714K0 != null) {
            RecyclerView recyclerView = (RecyclerView) o0(R.id.colorSheetList);
            p210v8.i.b(recyclerView, "colorSheetList");
            recyclerView.setAdapter(this.f1714K0);
        }
        ((ImageView) o0(R.id.colorSheetClose)).setOnClickListener(new f(this));
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final int j0() {
        char c10 = J7.a.l(J7.a.t(X(), android.R.attr.textColorPrimary)) ? (char) 1 : (char) 2;
        if (c10 == 1) {
            return R.style.BaseTheme_ColorSheet_Light;
        }
        if (c10 == 2) {
            return R.style.BaseTheme_ColorSheet_Dark;
        }
        throw null;
    }

    public final View o0(int i10) {
        if (this.f1715L0 == null) {
            this.f1715L0 = new HashMap();
        }
        View view = (View) this.f1715L0.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View view2 = this.c0;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i10);
        this.f1715L0.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }
}
