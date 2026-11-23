package T2;

import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState$State;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p091j3.C;
import p091j3.y;
import p091j3.z;
import p139o3.d;
import p170r3.g;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f4627A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f4628B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f4629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public WeakReference f4630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public WeakReference f4631E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakReference f4632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f4633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z f4634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f4635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f4636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f4637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f4638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4639z;

    public a(Context context, BadgeState$State badgeState$State) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f4632s = weakReference;
        C.c(context, C.f12370b, "Theme.MaterialComponents");
        this.f4635v = new Rect();
        z zVar = new z(this);
        this.f4634u = zVar;
        TextPaint textPaint = zVar.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, badgeState$State);
        this.f4636w = cVar;
        boolean zF = f();
        BadgeState$State badgeState$State2 = cVar.f4640b;
        g gVar = new g(j.a(context, zF ? badgeState$State2.f9470y.intValue() : badgeState$State2.f9468w.intValue(), f() ? badgeState$State2.f9471z.intValue() : badgeState$State2.f9469x.intValue()).a());
        this.f4633t = gVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && zVar.f12497g != (dVar = new d(context2, badgeState$State2.f9467v.intValue()))) {
            zVar.b(dVar, context2);
            textPaint.setColor(badgeState$State2.f9466u.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i10 = badgeState$State2.f9446D;
        if (i10 != -2) {
            this.f4639z = ((int) Math.pow(10.0d, ((double) i10) - 1.0d)) - 1;
        } else {
            this.f4639z = badgeState$State2.f9447E;
        }
        zVar.f12495e = true;
        j();
        invalidateSelf();
        zVar.f12495e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f9465t.intValue());
        if (gVar.f14501s.f14472c != colorStateListValueOf) {
            gVar.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.f9466u.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f4630D;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f4630D.get();
            WeakReference weakReference3 = this.f4631E;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(badgeState$State2.f9454L.booleanValue(), false);
    }

    @Override // p091j3.y
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int i10 = this.f4639z;
        c cVar = this.f4636w;
        BadgeState$State badgeState$State = cVar.f4640b;
        String str = badgeState$State.f9444B;
        boolean z6 = str != null;
        WeakReference weakReference = this.f4632s;
        if (!z6) {
            if (!g()) {
                return null;
            }
            BadgeState$State badgeState$State2 = cVar.f4640b;
            if (i10 == -2 || e() <= i10) {
                return NumberFormat.getInstance(badgeState$State2.f9448F).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State2.f9448F, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i10), "+");
        }
        int i11 = badgeState$State.f9446D;
        if (i11 == -2 || str == null || str.length() <= i11) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i11 - 1), "…");
    }

    public final CharSequence c() {
        Context context;
        int i10 = this.f4639z;
        if (!isVisible()) {
            return null;
        }
        c cVar = this.f4636w;
        BadgeState$State badgeState$State = cVar.f4640b;
        String str = badgeState$State.f9444B;
        if (str != null) {
            String str2 = badgeState$State.f9449G;
            return str2 != null ? str2 : str;
        }
        boolean zG = g();
        BadgeState$State badgeState$State2 = cVar.f4640b;
        if (!zG) {
            return badgeState$State2.f9450H;
        }
        if (badgeState$State2.f9451I == 0 || (context = (Context) this.f4632s.get()) == null) {
            return null;
        }
        return (i10 == -2 || e() <= i10) ? context.getResources().getQuantityString(badgeState$State2.f9451I, e(), Integer.valueOf(e())) : context.getString(badgeState$State2.f9452J, Integer.valueOf(i10));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f4631E;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4633t.draw(canvas);
        if (!f() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        z zVar = this.f4634u;
        zVar.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f4638y - rect.exactCenterY();
        canvas.drawText(strB, this.f4637x, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), zVar.a);
    }

    public final int e() {
        int i10 = this.f4636w.f4640b.f9445C;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public final boolean f() {
        return this.f4636w.f4640b.f9444B != null || g();
    }

    public final boolean g() {
        BadgeState$State badgeState$State = this.f4636w.f4640b;
        return badgeState$State.f9444B == null && badgeState$State.f9445C != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4636w.f4640b.f9443A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4635v.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4635v.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f4632s.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        c cVar = this.f4636w;
        this.f4633t.setShapeAppearanceModel(j.a(context, zF ? cVar.f4640b.f9470y.intValue() : cVar.f4640b.f9468w.intValue(), f() ? cVar.f4640b.f9471z.intValue() : cVar.f4640b.f9469x.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f4630D = new WeakReference(view);
        this.f4631E = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    public final void j() {
        float y6;
        float x8;
        float y8;
        float x10;
        float height;
        float width;
        float f10;
        float f11;
        WeakReference weakReference = this.f4632s;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f4630D;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f4635v;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f4631E;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        c cVar = this.f4636w;
        float f12 = zF ? cVar.f4642d : cVar.f4641c;
        this.f4627A = f12;
        if (f12 != -1.0f) {
            this.f4628B = f12;
            this.f4629C = f12;
        } else {
            this.f4628B = Math.round((f() ? cVar.f4645g : cVar.f4643e) / 2.0f);
            this.f4629C = Math.round((f() ? cVar.f4646h : cVar.f4644f) / 2.0f);
        }
        if (f()) {
            String strB = b();
            float f13 = this.f4628B;
            z zVar = this.f4634u;
            if (zVar.f12495e) {
                zVar.a(strB);
                f10 = zVar.f12493c;
            } else {
                f10 = zVar.f12493c;
            }
            this.f4628B = Math.max(f13, (f10 / 2.0f) + cVar.f4640b.f9455M.intValue());
            float f14 = this.f4629C;
            if (zVar.f12495e) {
                zVar.a(strB);
                f11 = zVar.f12494d;
            } else {
                f11 = zVar.f12494d;
            }
            float fMax = Math.max(f14, (f11 / 2.0f) + cVar.f4640b.f9456N.intValue());
            this.f4629C = fMax;
            this.f4628B = Math.max(this.f4628B, fMax);
        }
        int iIntValue = cVar.f4640b.P.intValue();
        boolean zF2 = f();
        BadgeState$State badgeState$State = cVar.f4640b;
        if (zF2) {
            iIntValue = badgeState$State.f9459R.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = R2.a.c(iIntValue, R2.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - badgeState$State.f9462U.intValue());
            }
        }
        int i10 = cVar.f4648k;
        if (i10 == 0) {
            iIntValue -= Math.round(this.f4629C);
        }
        int iIntValue2 = badgeState$State.f9461T.intValue() + iIntValue;
        int iIntValue3 = badgeState$State.f9453K.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f4638y = rect3.bottom - iIntValue2;
        } else {
            this.f4638y = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? badgeState$State.f9458Q.intValue() : badgeState$State.f9457O.intValue();
        if (i10 == 1) {
            iIntValue4 += f() ? cVar.j : cVar.f4647i;
        }
        int iIntValue5 = badgeState$State.f9460S.intValue() + iIntValue4;
        int iIntValue6 = badgeState$State.f9453K.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = U.a;
            this.f4637x = view.getLayoutDirection() == 0 ? (rect3.left - this.f4628B) + iIntValue5 : (rect3.right + this.f4628B) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = U.a;
            this.f4637x = view.getLayoutDirection() == 0 ? (rect3.right + this.f4628B) - iIntValue5 : (rect3.left - this.f4628B) + iIntValue5;
        }
        if (badgeState$State.f9463V.booleanValue()) {
            View viewD = d();
            if (viewD != null) {
                FrameLayout frameLayoutD = d();
                if (frameLayoutD == null || frameLayoutD.getId() != R.id.mtrl_anchor_parent) {
                    y6 = 0.0f;
                    x8 = 0.0f;
                } else if (viewD.getParent() instanceof View) {
                    y6 = viewD.getY();
                    x8 = viewD.getX();
                    viewD = (View) viewD.getParent();
                }
                y8 = viewD.getY() + (this.f4638y - this.f4629C) + y6;
                x10 = viewD.getX() + (this.f4637x - this.f4628B) + x8;
                if (viewD.getParent() instanceof View) {
                    height = ((this.f4638y + this.f4629C) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y6;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.f4637x + this.f4628B) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x8;
                } else {
                    width = 0.0f;
                }
                if (y8 < 0.0f) {
                    this.f4638y = Math.abs(y8) + this.f4638y;
                }
                if (x10 < 0.0f) {
                    this.f4637x = Math.abs(x10) + this.f4637x;
                }
                if (height > 0.0f) {
                    this.f4638y -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f4637x -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y10 = view.getY();
                x8 = view.getX();
                View view2 = (View) view.getParent();
                y6 = y10;
                viewD = view2;
                y8 = viewD.getY() + (this.f4638y - this.f4629C) + y6;
                x10 = viewD.getX() + (this.f4637x - this.f4628B) + x8;
                if (viewD.getParent() instanceof View) {
                    height = ((this.f4638y + this.f4629C) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y6;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.f4637x + this.f4628B) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x8;
                } else {
                    width = 0.0f;
                }
                if (y8 < 0.0f) {
                    this.f4638y = Math.abs(y8) + this.f4638y;
                }
                if (x10 < 0.0f) {
                    this.f4637x = Math.abs(x10) + this.f4637x;
                }
                if (height > 0.0f) {
                    this.f4638y -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f4637x -= Math.abs(width);
                }
            }
        }
        float f15 = this.f4637x;
        float f16 = this.f4638y;
        float f17 = this.f4628B;
        float f18 = this.f4629C;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.f4627A;
        g gVar = this.f4633t;
        if (f19 != -1.0f) {
            I4.b bVarF = gVar.f14501s.a.f();
            bVarF.c(f19);
            gVar.setShapeAppearanceModel(bVarF.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        gVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, p091j3.y
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f4636w;
        cVar.a.f9443A = i10;
        cVar.f4640b.f9443A = i10;
        this.f4634u.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
