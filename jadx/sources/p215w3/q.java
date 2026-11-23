package p215w3;

import L.a;
import U.U;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ArrayAdapter {
    public ColorStateList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f15625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f15626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f15626c = rVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        r rVar = this.f15626c;
        ColorStateList colorStateList2 = rVar.f15630D;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f15625b = colorStateList;
        if (rVar.f15629C != 0 && rVar.f15630D != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a.b(rVar.f15630D.getColorForState(iArr3, 0), rVar.f15629C), a.b(rVar.f15630D.getColorForState(iArr2, 0), rVar.f15629C), rVar.f15629C});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            r rVar = this.f15626c;
            Drawable rippleDrawable = null;
            if (rVar.getText().toString().contentEquals(textView.getText()) && rVar.f15629C != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(rVar.f15629C);
                if (this.f15625b != null) {
                    M.a.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.f15625b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = U.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
