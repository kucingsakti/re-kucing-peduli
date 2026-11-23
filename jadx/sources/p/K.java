package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class K extends A0 implements L {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence f13958V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public H f13959W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Rect f13960X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f13961Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f13962Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(androidx.appcompat.widget.c cVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f13962Z = cVar;
        this.f13960X = new Rect();
        this.f13908G = cVar;
        this.f13917Q = true;
        this.f13918R.setFocusable(true);
        this.f13909H = new I(this, 0);
    }

    @Override // p.L
    public final void g(CharSequence charSequence) {
        this.f13958V = charSequence;
    }

    @Override // p.L
    public final void j(int i10) {
        this.f13961Y = i10;
    }

    @Override // p.L
    public final void l(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        C0736x c0736x = this.f13918R;
        boolean zIsShowing = c0736x.isShowing();
        s();
        this.f13918R.setInputMethodMode(2);
        a();
        C0722p0 c0722p0 = this.f13921u;
        c0722p0.setChoiceMode(1);
        c0722p0.setTextDirection(i10);
        c0722p0.setTextAlignment(i11);
        androidx.appcompat.widget.c cVar = this.f13962Z;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        C0722p0 c0722p1 = this.f13921u;
        if (c0736x.isShowing() && c0722p1 != null) {
            c0722p1.setListSelectionHidden(false);
            c0722p1.setSelection(selectedItemPosition);
            if (c0722p1.getChoiceMode() != 0) {
                c0722p1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = cVar.getViewTreeObserver()) == null) {
            return;
        }
        p118m3.k kVar = new p118m3.k(this, 4);
        viewTreeObserver.addOnGlobalLayoutListener(kVar);
        this.f13918R.setOnDismissListener(new J(this, kVar));
    }

    @Override // p.L
    public final CharSequence o() {
        return this.f13958V;
    }

    @Override // p.A0, p.L
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f13959W = (H) listAdapter;
    }

    public final void s() {
        int i10;
        C0736x c0736x = this.f13918R;
        Drawable background = c0736x.getBackground();
        androidx.appcompat.widget.c cVar = this.f13962Z;
        if (background != null) {
            background.getPadding(cVar.f6285z);
            boolean z6 = f1.a;
            int layoutDirection = cVar.getLayoutDirection();
            Rect rect = cVar.f6285z;
            i10 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = cVar.f6285z;
            rect2.right = 0;
            rect2.left = 0;
            i10 = 0;
        }
        int paddingLeft = cVar.getPaddingLeft();
        int paddingRight = cVar.getPaddingRight();
        int width = cVar.getWidth();
        int i11 = cVar.f6284y;
        if (i11 == -2) {
            int iA = cVar.a(this.f13959W, c0736x.getBackground());
            int i12 = cVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = cVar.f6285z;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (iA > i13) {
                iA = i13;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z10 = f1.a;
        this.f13924x = cVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f13923w) - this.f13961Y) + i10 : paddingLeft + this.f13961Y + i10;
    }
}
