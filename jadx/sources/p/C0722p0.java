package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.kcstream.cing.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: p.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0722p0 extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f14097A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14098B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p000a0.g f14099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p122m7.d f14100D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f14101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0718n0 f14107y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14108z;

    public C0722p0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f14101s = new Rect();
        this.f14102t = 0;
        this.f14103u = 0;
        this.f14104v = 0;
        this.f14105w = 0;
        this.f14097A = z6;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z6;
        boolean zA;
        View childAt;
        View childAt2;
        p000a0.g gVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z6 = true;
            } else if (actionMasked != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || z10) {
                this.f14098B = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f14106x - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z6) {
                if (this.f14099C == null) {
                    this.f14099C = new p000a0.g(this);
                }
                p000a0.g gVar2 = this.f14099C;
                boolean z11 = gVar2.f5980H;
                gVar2.f5980H = true;
                gVar2.onTouch(this, motionEvent);
            } else {
                gVar = this.f14099C;
                if (gVar != null) {
                    if (gVar.f5980H) {
                        gVar.d();
                    }
                    gVar.f5980H = false;
                }
            }
            return z6;
        }
        z6 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z6 = false;
        } else {
            int x8 = (int) motionEvent.getX(iFindPointerIndex);
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x8, y6);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x8;
                float f11 = y6;
                this.f14098B = true;
                int i11 = Build.VERSION.SDK_INT;
                AbstractC0712k0.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f14106x;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f14106x = iPointToPosition;
                AbstractC0712k0.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f14101s;
                rect.set(left, top, right, bottom);
                rect.left -= this.f14102t;
                rect.top -= this.f14103u;
                rect.right += this.f14104v;
                rect.bottom += this.f14105w;
                if (i11 >= 33) {
                    zA = AbstractC0716m0.a(this);
                } else {
                    Field field = AbstractC0720o0.a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z13 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0716m0.b(this, z13);
                    } else {
                        Field field2 = AbstractC0720o0.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    M.a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    M.a.e(selector2, f10, f11);
                }
                C0718n0 c0718n0 = this.f14107y;
                if (c0718n0 != null) {
                    c0718n0.f14087t = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z6 = true;
                z10 = false;
            }
        }
        if (z6) {
            this.f14098B = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f14106x - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f14098B = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f14106x - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z6) {
            if (this.f14099C == null) {
                this.f14099C = new p000a0.g(this);
            }
            p000a0.g gVar3 = this.f14099C;
            boolean z14 = gVar3.f5980H;
            gVar3.f5980H = true;
            gVar3.onTouch(this, motionEvent);
        } else {
            gVar = this.f14099C;
            if (gVar != null) {
                if (gVar.f5980H) {
                    gVar.d();
                }
                gVar.f5980H = false;
            }
        }
        return z6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14101s;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f14100D != null) {
            return;
        }
        super.drawableStateChanged();
        C0718n0 c0718n0 = this.f14107y;
        if (c0718n0 != null) {
            c0718n0.f14087t = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f14098B && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f14097A || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f14097A || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f14097A || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f14097A && this.f14108z) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f14100D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = 1;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14100D == null) {
            p122m7.d dVar = new p122m7.d(this, i10);
            this.f14100D = dVar;
            post(dVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i11 < 30 || !AbstractC0714l0.f14081d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0714l0.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0714l0.f14079b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0714l0.f14080c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f14098B && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14106x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        p122m7.d dVar = this.f14100D;
        if (dVar != null) {
            C0722p0 c0722p0 = (C0722p0) dVar.f13144t;
            c0722p0.f14100D = null;
            c0722p0.removeCallbacks(dVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f14108z = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0718n0 c0718n0 = null;
        if (drawable != null) {
            C0718n0 c0718n1 = new C0718n0();
            Drawable drawable2 = c0718n1.f14086s;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0718n1.f14086s = drawable;
            drawable.setCallback(c0718n1);
            c0718n1.f14087t = true;
            c0718n0 = c0718n1;
        }
        this.f14107y = c0718n0;
        super.setSelector(c0718n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f14102t = rect.left;
        this.f14103u = rect.top;
        this.f14104v = rect.right;
        this.f14105w = rect.bottom;
    }
}
