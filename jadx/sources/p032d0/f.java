package p032d0;

import A1.RunnableC0094c;
import J0.s;
import U.U;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f10513x = new s(2);
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10514b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f10516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f10517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f10518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f10519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f10520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f10521i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f10523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f10529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f10530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f10531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f10533v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10515c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RunnableC0094c f10534w = new RunnableC0094c(this, 23);

    public f(Context context, ViewGroup viewGroup, e eVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10533v = viewGroup;
        this.f10530s = eVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10527p = i10;
        this.f10526o = i10;
        this.f10514b = viewConfiguration.getScaledTouchSlop();
        this.f10524m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10525n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10529r = new OverScroller(context, f10513x);
    }

    public final void a() {
        this.f10515c = -1;
        float[] fArr = this.f10516d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10517e, 0.0f);
            Arrays.fill(this.f10518f, 0.0f);
            Arrays.fill(this.f10519g, 0.0f);
            Arrays.fill(this.f10520h, 0);
            Arrays.fill(this.f10521i, 0);
            Arrays.fill(this.j, 0);
            this.f10522k = 0;
        }
        VelocityTracker velocityTracker = this.f10523l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10523l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f10533v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f10531t = view;
        this.f10515c = i10;
        this.f10530s.onViewCaptured(view, i10);
        o(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f10520h[i10] & i11) == i11 && (this.f10528q & i11) != 0 && (this.j[i10] & i11) != i11 && (this.f10521i[i10] & i11) != i11) {
            float f12 = this.f10514b;
            if (fAbs > f12 || fAbs2 > f12) {
                if (fAbs < fAbs2 * 0.5f && this.f10530s.onEdgeLock(i11)) {
                    int[] iArr = this.j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f10521i[i10] & i11) == 0 && fAbs > this.f10514b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean d(View view, float f10, float f11) {
        if (view != null) {
            e eVar = this.f10530s;
            boolean z6 = eVar.getViewHorizontalDragRange(view) > 0;
            boolean z10 = eVar.getViewVerticalDragRange(view) > 0;
            if (z6 && z10) {
                float f12 = (f11 * f11) + (f10 * f10);
                int i10 = this.f10514b;
                if (f12 > i10 * i10) {
                    return true;
                }
            } else if (!z6 ? !(!z10 || Math.abs(f11) <= this.f10514b) : Math.abs(f10) > this.f10514b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i10) {
        float[] fArr = this.f10516d;
        if (fArr != null) {
            int i11 = this.f10522k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f10517e[i10] = 0.0f;
                this.f10518f[i10] = 0.0f;
                this.f10519g[i10] = 0.0f;
                this.f10520h[i10] = 0;
                this.f10521i[i10] = 0;
                this.j[i10] = 0;
                this.f10522k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f10533v.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.f10529r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f10531t.getLeft();
            int top = currY - this.f10531t.getTop();
            if (left != 0) {
                View view = this.f10531t;
                WeakHashMap weakHashMap = U.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10531t;
                WeakHashMap weakHashMap2 = U.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f10530s.onViewPositionChanged(this.f10531t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f10533v.post(this.f10534w);
            }
        }
        return this.a == 2;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f10533v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f10530s.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f10531t.getLeft();
        int top = this.f10531t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f10529r;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            o(0);
            return false;
        }
        View view = this.f10531t;
        int i16 = (int) this.f10525n;
        int i17 = (int) this.f10524m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f10525n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i18) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i19 = iAbs5 + iAbs6;
        int i20 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i19;
        } else {
            f10 = iAbs3;
            f11 = i20;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i19;
        } else {
            f12 = iAbs4;
            f13 = i20;
        }
        float f15 = f12 / f13;
        e eVar = this.f10530s;
        overScroller.startScroll(left, top, i14, i15, (int) ((f(i15, i13, eVar.getViewVerticalDragRange(view)) * f15) + (f(i14, i12, eVar.getViewHorizontalDragRange(view)) * f14)));
        o(2);
        return true;
    }

    public final void j(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10523l == null) {
            this.f10523l = VelocityTracker.obtain();
        }
        this.f10523l.addMovement(motionEvent);
        int i11 = 0;
        e eVar = this.f10530s;
        if (actionMasked == 0) {
            float x8 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x8, (int) y6);
            m(x8, y6, pointerId);
            s(viewH, pointerId);
            int i12 = this.f10520h[pointerId] & this.f10528q;
            if (i12 != 0) {
                eVar.onEdgeTouched(i12, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    int pointerId2 = motionEvent.getPointerId(i13);
                    if ((this.f10522k & (1 << pointerId2)) != 0) {
                        float x10 = motionEvent.getX(i13);
                        float y8 = motionEvent.getY(i13);
                        float f10 = x10 - this.f10516d[pointerId2];
                        float f11 = y8 - this.f10517e[pointerId2];
                        l(f10, f11, pointerId2);
                        if (this.a == 1) {
                            break;
                        }
                        View viewH2 = h((int) x10, (int) y8);
                        if (d(viewH2, f10, f11) && s(viewH2, pointerId2)) {
                            break;
                        }
                    }
                }
                n(motionEvent);
                return;
            }
            int i14 = this.f10515c;
            if ((this.f10522k & (1 << i14)) != 0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f10518f;
                int i15 = this.f10515c;
                int i16 = (int) (x11 - fArr[i15]);
                int i17 = (int) (y10 - this.f10519g[i15]);
                int left = this.f10531t.getLeft() + i16;
                int top = this.f10531t.getTop() + i17;
                int left2 = this.f10531t.getLeft();
                int top2 = this.f10531t.getTop();
                if (i16 != 0) {
                    left = eVar.clampViewPositionHorizontal(this.f10531t, left, i16);
                    WeakHashMap weakHashMap = U.a;
                    this.f10531t.offsetLeftAndRight(left - left2);
                }
                int i18 = left;
                if (i17 != 0) {
                    top = eVar.clampViewPositionVertical(this.f10531t, top, i17);
                    WeakHashMap weakHashMap2 = U.a;
                    this.f10531t.offsetTopAndBottom(top - top2);
                }
                int i19 = top;
                if (i16 != 0 || i17 != 0) {
                    this.f10530s.onViewPositionChanged(this.f10531t, i18, i19, i18 - left2, i19 - top2);
                }
                n(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                this.f10532u = true;
                eVar.onViewReleased(this.f10531t, 0.0f, 0.0f);
                this.f10532u = false;
                if (this.a == 1) {
                    o(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x12 = motionEvent.getX(actionIndex);
            float y11 = motionEvent.getY(actionIndex);
            m(x12, y11, pointerId3);
            if (this.a == 0) {
                s(h((int) x12, (int) y11), pointerId3);
                int i20 = this.f10520h[pointerId3] & this.f10528q;
                if (i20 != 0) {
                    eVar.onEdgeTouched(i20, pointerId3);
                    return;
                }
                return;
            }
            int i21 = (int) x12;
            int i22 = (int) y11;
            View view = this.f10531t;
            if (view != null && i21 >= view.getLeft() && i21 < view.getRight() && i22 >= view.getTop() && i22 < view.getBottom()) {
                s(this.f10531t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.a == 1 && pointerId4 == this.f10515c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f10515c) {
                    View viewH3 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view2 = this.f10531t;
                    if (viewH3 == view2 && s(view2, pointerId5)) {
                        i10 = this.f10515c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                k();
            }
        }
        e(pointerId4);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f10523l;
        float f10 = this.f10524m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f10523l.getXVelocity(this.f10515c);
        float f11 = this.f10525n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f10523l.getYVelocity(this.f10515c);
        float f12 = this.f10525n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f12) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f10532u = true;
        this.f10530s.onViewReleased(this.f10531t, xVelocity, f10);
        this.f10532u = false;
        if (this.a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [d0.e] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r10 = zC;
        if (c(f11, f10, i10, 4)) {
            r10 = (zC ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (c(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (c(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f10521i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f10530s.onEdgeDragStarted(r12, i10);
    }

    public final void m(float f10, float f11, int i10) {
        float[] fArr = this.f10516d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10517e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10518f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10519g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10520h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10521i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10516d = fArr2;
            this.f10517e = fArr3;
            this.f10518f = fArr4;
            this.f10519g = fArr5;
            this.f10520h = iArr;
            this.f10521i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f10516d;
        this.f10518f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f10517e;
        this.f10519g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f10520h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f10533v;
        int i14 = i12 < viewGroup.getLeft() + this.f10526o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f10526o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f10526o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f10526o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f10522k |= 1 << i10;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if ((this.f10522k & (1 << pointerId)) != 0) {
                float x8 = motionEvent.getX(i10);
                float y6 = motionEvent.getY(i10);
                this.f10518f[pointerId] = x8;
                this.f10519g[pointerId] = y6;
            }
        }
    }

    public final void o(int i10) {
        this.f10533v.removeCallbacks(this.f10534w);
        if (this.a != i10) {
            this.a = i10;
            this.f10530s.onViewDragStateChanged(i10);
            if (this.a == 0) {
                this.f10531t = null;
            }
        }
    }

    public final boolean p(int i10, int i11) {
        if (this.f10532u) {
            return i(i10, i11, (int) this.f10523l.getXVelocity(this.f10515c), (int) this.f10523l.getYVelocity(this.f10515c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    public final boolean q(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10523l == null) {
            this.f10523l = VelocityTracker.obtain();
        }
        this.f10523l.addMovement(motionEvent);
        e eVar = this.f10530s;
        if (actionMasked == 0) {
            float x8 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m(x8, y6, pointerId);
            View viewH2 = h((int) x8, (int) y6);
            if (viewH2 == this.f10531t && this.a == 2) {
                s(viewH2, pointerId);
            }
            int i10 = this.f10520h[pointerId] & this.f10528q;
            if (i10 != 0) {
                eVar.onEdgeTouched(i10, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y8 = motionEvent.getY(actionIndex);
                m(x10, y8, pointerId2);
                int i11 = this.a;
                if (i11 == 0) {
                    int i12 = this.f10520h[pointerId2] & this.f10528q;
                    if (i12 != 0) {
                        eVar.onEdgeTouched(i12, pointerId2);
                    }
                } else if (i11 == 2 && (viewH = h((int) x10, (int) y8)) == this.f10531t) {
                    s(viewH, pointerId2);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f10516d != null && this.f10517e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if ((this.f10522k & (1 << pointerId3)) != 0) {
                    float x11 = motionEvent.getX(i13);
                    float y10 = motionEvent.getY(i13);
                    float f10 = x11 - this.f10516d[pointerId3];
                    float f11 = y10 - this.f10517e[pointerId3];
                    View viewH3 = h((int) x11, (int) y10);
                    boolean z6 = viewH3 != null && d(viewH3, f10, f11);
                    if (!z6) {
                        l(f10, f11, pointerId3);
                        if (this.a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        int i14 = (int) f10;
                        int iClampViewPositionHorizontal = eVar.clampViewPositionHorizontal(viewH3, left + i14, i14);
                        int top = viewH3.getTop();
                        int i15 = (int) f11;
                        int iClampViewPositionVertical = eVar.clampViewPositionVertical(viewH3, top + i15, i15);
                        int viewHorizontalDragRange = eVar.getViewHorizontalDragRange(viewH3);
                        int viewVerticalDragRange = eVar.getViewVerticalDragRange(viewH3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                            break;
                        }
                        l(f10, f11, pointerId3);
                        if (this.a != 1 || (z6 && s(viewH3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            n(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean r(View view, int i10, int i11) {
        this.f10531t = view;
        this.f10515c = -1;
        boolean zI = i(i10, i11, 0, 0);
        if (!zI && this.a == 0 && this.f10531t != null) {
            this.f10531t = null;
        }
        return zI;
    }

    public final boolean s(View view, int i10) {
        if (view == this.f10531t && this.f10515c == i10) {
            return true;
        }
        if (view == null || !this.f10530s.tryCaptureView(view, i10)) {
            return false;
        }
        this.f10515c = i10;
        b(view, i10);
        return true;
    }
}
