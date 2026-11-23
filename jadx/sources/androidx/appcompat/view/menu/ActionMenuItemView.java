package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.bumptech.glide.e;
import p.InterfaceC0711k;
import p.X;
import p069h.a;
import p136o.AbstractC0685c;
import p136o.C0684b;
import p136o.k;
import p136o.l;
import p136o.n;
import p136o.y;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends X implements y, View.OnClickListener, InterfaceC0711k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f6039A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f6040B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public k f6041C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0684b f6042D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC0685c f6043E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6044F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6045G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f6046H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6047I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f6048J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f6049z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f6044F = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f11611c, 0, 0);
        this.f6046H = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6048J = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f6047I = -1;
        setSaveEnabled(false);
    }

    @Override // p136o.y
    public final void a(n nVar) {
        this.f6049z = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f13538s);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f6042D == null) {
            this.f6042D = new C0684b(this);
        }
    }

    @Override // p.InterfaceC0711k
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.InterfaceC0711k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f6049z.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p136o.y
    public n getItemData() {
        return this.f6049z;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z6 = true;
        boolean z10 = !TextUtils.isEmpty(this.f6039A);
        if (this.f6040B != null && ((this.f6049z.f13533Q & 4) != 4 || (!this.f6044F && !this.f6045G))) {
            z6 = false;
        }
        boolean z11 = z10 & z6;
        setText(z11 ? this.f6039A : null);
        CharSequence charSequence = this.f6049z.f13526I;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f6049z.f13542w);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f6049z.f13527J;
        if (TextUtils.isEmpty(charSequence2)) {
            e.r(this, z11 ? null : this.f6049z.f13542w);
        } else {
            e.r(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k kVar = this.f6041C;
        if (kVar != null) {
            kVar.c(this.f6049z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6044F = h();
        i();
    }

    @Override // p.X, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f6047I) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f6046H;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f6040B == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f6040B.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0684b c0684b;
        if (this.f6049z.hasSubMenu() && (c0684b = this.f6042D) != null && c0684b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f6045G != z6) {
            this.f6045G = z6;
            n nVar = this.f6049z;
            if (nVar != null) {
                l lVar = nVar.f13523F;
                lVar.f13494C = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6040B = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f6048J;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(k kVar) {
        this.f6041C = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f6047I = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0685c abstractC0685c) {
        this.f6043E = abstractC0685c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f6039A = charSequence;
        i();
    }
}
