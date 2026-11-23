package O6;

import A1.C0099h;
import N6.f;
import N6.g;
import N6.l;
import S6.d;
import S6.e;
import S6.h;
import W6.c;
import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.smarteist.autoimageslider.IndicatorView.draw.data.PositionSavedState;
import java.util.ArrayList;
import p040e1.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View implements g, f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0099h f3603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f3604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f3605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3606v;

    @Override // N6.g
    public final void a(int i10) {
        if (i10 == 0) {
            ((C0099h) this.f3603s.f103t).h().f5335k = this.f3606v;
        }
    }

    @Override // N6.g
    public final void b(int i10) {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        boolean z6 = (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
        int i11 = aVarH.f5339o;
        if (z6) {
            if (e()) {
                i10 = (i11 - 1) - i10;
            }
            setSelection(i10);
        }
    }

    @Override // N6.g
    public final void c(int i10, float f10) {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        T6.f fVarA = aVarH.a();
        boolean z6 = aVarH.f5335k;
        if ((getMeasuredHeight() == 0 && getMeasuredWidth() == 0) || !z6 || fVarA == T6.f.f4681s) {
            return;
        }
        boolean zE = e();
        int i11 = aVarH.f5339o;
        int i12 = aVarH.f5340p;
        if (zE) {
            i10 = (i11 - 1) - i10;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i14 = i11 - 1;
            if (i10 > i14) {
                i10 = i14;
            }
        }
        boolean z10 = i10 > i12;
        boolean z11 = !zE ? i10 + 1 >= i12 : i10 + (-1) >= i12;
        if (z10 || z11) {
            aVarH.f5340p = i10;
            i12 = i10;
        }
        float f11 = 0.0f;
        if (i12 != i10 || f10 == 0.0f) {
            f10 = 1.0f - f10;
        } else {
            i10 = zE ? i10 - 1 : i10 + 1;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        Pair pair = new Pair(Integer.valueOf(i10), Float.valueOf(f10));
        int iIntValue = ((Integer) pair.first).intValue();
        float fFloatValue = ((Float) pair.second).floatValue();
        W6.a aVarH2 = ((C0099h) this.f3603s.f103t).h();
        if (aVarH2.f5335k) {
            int i15 = aVarH2.f5339o;
            if (i15 > 0 && iIntValue >= 0 && iIntValue <= (i13 = i15 - 1)) {
                i13 = iIntValue;
            }
            if (fFloatValue >= 0.0f) {
                f11 = fFloatValue > 1.0f ? 1.0f : fFloatValue;
            }
            if (f11 == 1.0f) {
                aVarH2.f5342r = aVarH2.f5340p;
                aVarH2.f5340p = i13;
            }
            aVarH2.f5341q = i13;
            Q6.a aVar = (Q6.a) ((j) this.f3603s.f104u).f10697t;
            if (aVar != null) {
                aVar.f4330f = true;
                aVar.f4329e = f11;
                aVar.a();
            }
        }
    }

    public final void d(ViewParent viewParent) {
        View viewFindViewById;
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            return;
        }
        int i10 = ((C0099h) this.f3603s.f103t).h().f5343s;
        ViewGroup viewGroup = (ViewGroup) viewParent;
        l lVar = null;
        if (viewGroup.getChildCount() > 0 && (viewFindViewById = viewGroup.findViewById(i10)) != null && (viewFindViewById instanceof l)) {
            lVar = (l) viewFindViewById;
        }
        if (lVar != null) {
            setViewPager(lVar);
        } else {
            d(viewParent.getParent());
        }
    }

    public final boolean e() {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        if (aVarH.f5346v == null) {
            aVarH.f5346v = c.f5351t;
        }
        int iOrdinal = aVarH.f5346v.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal == 2 && TextUtils.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    public final void f() {
        l lVar;
        if (this.f3604t == null || (lVar = this.f3605u) == null || lVar.getAdapter() == null) {
            return;
        }
        try {
            this.f3605u.getAdapter().p(this.f3604t);
            this.f3604t = null;
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
        }
    }

    public final void g() {
        int iC;
        int currentItem;
        T6.a aVar;
        Animator animator;
        l lVar = this.f3605u;
        if (lVar == null || lVar.getAdapter() == null) {
            return;
        }
        if (this.f3605u.getAdapter() instanceof p007a7.a) {
            iC = ((p007a7.a) this.f3605u.getAdapter()).q();
            currentItem = iC > 0 ? this.f3605u.getCurrentItem() % iC : 0;
        } else {
            iC = this.f3605u.getAdapter().c();
            currentItem = this.f3605u.getCurrentItem();
        }
        if (e()) {
            currentItem = (iC - 1) - currentItem;
        }
        ((C0099h) this.f3603s.f103t).h().f5340p = currentItem;
        ((C0099h) this.f3603s.f103t).h().f5341q = currentItem;
        ((C0099h) this.f3603s.f103t).h().f5342r = currentItem;
        ((C0099h) this.f3603s.f103t).h().f5339o = iC;
        Q6.a aVar2 = (Q6.a) ((j) this.f3603s.f104u).f10697t;
        if (aVar2 != null && (aVar = aVar2.f4327c) != null && (animator = aVar.f4664c) != null && animator.isStarted()) {
            aVar.f4664c.end();
        }
        h();
        requestLayout();
    }

    public long getAnimationDuration() {
        return ((C0099h) this.f3603s.f103t).h().f5338n;
    }

    public int getCount() {
        return ((C0099h) this.f3603s.f103t).h().f5339o;
    }

    public int getPadding() {
        return ((C0099h) this.f3603s.f103t).h().f5327b;
    }

    public int getRadius() {
        return ((C0099h) this.f3603s.f103t).h().a;
    }

    public float getScaleFactor() {
        return ((C0099h) this.f3603s.f103t).h().f5333h;
    }

    public int getSelectedColor() {
        return ((C0099h) this.f3603s.f103t).h().j;
    }

    public int getSelection() {
        return ((C0099h) this.f3603s.f103t).h().f5340p;
    }

    public int getStrokeWidth() {
        return ((C0099h) this.f3603s.f103t).h().f5332g;
    }

    public int getUnselectedColor() {
        return ((C0099h) this.f3603s.f103t).h().f5334i;
    }

    public final void h() {
        if (((C0099h) this.f3603s.f103t).h().f5336l) {
            int i10 = ((C0099h) this.f3603s.f103t).h().f5339o;
            int visibility = getVisibility();
            if (visibility != 0 && i10 > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || i10 > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d(getParent());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0115 A[PHI: r12
      0x0115: PHI (r12v11 int) = (r12v7 int), (r12v8 int), (r12v7 int) binds: [B:62:0x011e, B:66:0x0126, B:57:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iX;
        int iX2;
        W6.a aVar;
        int i10;
        int i11;
        int i12;
        Paint paint;
        C0099h c0099h = (C0099h) ((C0099h) this.f3603s.f103t).f104u;
        W6.a aVar2 = (W6.a) c0099h.f105v;
        int i13 = aVar2.f5339o;
        int i14 = 0;
        while (i14 < i13) {
            W6.b bVarB = aVar2.b();
            W6.b bVar = W6.b.f5347s;
            T6.f fVar = T6.f.f4688z;
            if (bVarB == bVar) {
                iX = C3.b.x(aVar2, i14);
            } else {
                iX = aVar2.a;
                if (aVar2.a() == fVar) {
                    iX *= 3;
                }
            }
            int i15 = iX + aVar2.f5328c;
            if (aVar2.b() == bVar) {
                iX2 = aVar2.a;
                if (aVar2.a() == fVar) {
                    iX2 *= 3;
                }
            } else {
                iX2 = C3.b.x(aVar2, i14);
            }
            int i16 = iX2 + aVar2.f5329d;
            boolean z6 = aVar2.f5335k;
            int i17 = aVar2.f5340p;
            boolean z10 = (z6 && (i14 == i17 || i14 == aVar2.f5341q)) | (!z6 && (i14 == i17 || i14 == aVar2.f5342r));
            X6.a aVar3 = (X6.a) c0099h.f104u;
            aVar3.f5420k = i14;
            aVar3.f5421l = i15;
            aVar3.f5422m = i16;
            if (((R6.a) c0099h.f103t) == null || !z10) {
                aVar = aVar2;
                i10 = i13;
                i11 = i14;
                aVar3.a(canvas, z10);
            } else {
                switch (aVar2.a().ordinal()) {
                    case 0:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        aVar3.a(canvas, true);
                        continue;
                    case 1:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar4 = (R6.a) c0099h.f103t;
                        Y6.b bVar2 = aVar3.f5412b;
                        if (bVar2 == null) {
                            continue;
                        } else {
                            int i18 = aVar3.f5420k;
                            int i19 = aVar3.f5421l;
                            int i20 = aVar3.f5422m;
                            if (aVar4 instanceof S6.a) {
                                S6.a aVar5 = (S6.a) aVar4;
                                W6.a aVar6 = (W6.a) bVar2.f726t;
                                float f10 = aVar6.a;
                                int i21 = aVar6.j;
                                int i22 = aVar6.f5340p;
                                int i23 = aVar6.f5341q;
                                int i24 = aVar6.f5342r;
                                if (aVar6.f5335k) {
                                    if (i18 == i23) {
                                        i21 = aVar5.a;
                                    } else if (i18 == i22) {
                                        i21 = aVar5.f4530b;
                                    }
                                } else if (i18 == i22) {
                                    i21 = aVar5.a;
                                } else if (i18 == i24) {
                                    i21 = aVar5.f4530b;
                                }
                                Paint paint2 = (Paint) bVar2.f725s;
                                paint2.setColor(i21);
                                canvas.drawCircle(i19, i20, f10, paint2);
                            }
                        }
                        break;
                    case 2:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar7 = (R6.a) c0099h.f103t;
                        Y6.b bVar3 = aVar3.f5413c;
                        if (bVar3 == null) {
                            continue;
                        } else {
                            int i25 = aVar3.f5420k;
                            int i26 = aVar3.f5421l;
                            int i27 = aVar3.f5422m;
                            if (aVar7 instanceof d) {
                                d dVar = (d) aVar7;
                                W6.a aVar8 = (W6.a) bVar3.f726t;
                                float f11 = aVar8.a;
                                int i28 = aVar8.j;
                                int i29 = aVar8.f5340p;
                                int i30 = aVar8.f5341q;
                                int i31 = aVar8.f5342r;
                                if (aVar8.f5335k) {
                                    if (i25 == i30) {
                                        f11 = dVar.f4537c;
                                        i28 = dVar.a;
                                    } else if (i25 == i29) {
                                        f11 = dVar.f4538d;
                                        i28 = dVar.f4530b;
                                    }
                                } else if (i25 == i29) {
                                    f11 = dVar.f4537c;
                                    i28 = dVar.a;
                                } else if (i25 == i31) {
                                    f11 = dVar.f4538d;
                                    i28 = dVar.f4530b;
                                }
                                Paint paint3 = (Paint) bVar3.f725s;
                                paint3.setColor(i28);
                                canvas.drawCircle(i26, i27, f11, paint3);
                            }
                        }
                        break;
                    case 3:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar9 = (R6.a) c0099h.f103t;
                        Y6.a aVar10 = aVar3.f5414d;
                        if (aVar10 == null) {
                            continue;
                        } else {
                            int i32 = aVar3.f5421l;
                            int i33 = aVar3.f5422m;
                            if (aVar9 instanceof h) {
                                h hVar = (h) aVar9;
                                int i34 = hVar.a;
                                int i35 = hVar.f4541b;
                                W6.a aVar11 = (W6.a) aVar10.f726t;
                                int i36 = aVar11.a;
                                int i37 = aVar11.f5334i;
                                int i38 = aVar11.j;
                                W6.b bVarB2 = aVar11.b();
                                RectF rectF = (RectF) aVar10.f5695u;
                                if (bVarB2 == bVar) {
                                    rectF.left = i34;
                                    rectF.right = i35;
                                    rectF.top = i33 - i36;
                                    rectF.bottom = i33 + i36;
                                } else {
                                    rectF.left = i32 - i36;
                                    rectF.right = i32 + i36;
                                    rectF.top = i34;
                                    rectF.bottom = i35;
                                }
                                Paint paint4 = (Paint) aVar10.f725s;
                                paint4.setColor(i37);
                                float f12 = i32;
                                float f13 = i33;
                                float f14 = i36;
                                canvas.drawCircle(f12, f13, f14, paint4);
                                paint4.setColor(i38);
                                canvas.drawRoundRect(rectF, f14, f14, paint4);
                            }
                        }
                        break;
                    case 4:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar12 = (R6.a) c0099h.f103t;
                        Y6.b bVar4 = aVar3.f5415e;
                        if (bVar4 == null) {
                            continue;
                        } else {
                            int i39 = aVar3.f5421l;
                            int i40 = aVar3.f5422m;
                            if (aVar12 instanceof e) {
                                int i41 = ((e) aVar12).a;
                                W6.a aVar13 = (W6.a) bVar4.f726t;
                                int i42 = aVar13.f5334i;
                                int i43 = aVar13.j;
                                int i44 = aVar13.a;
                                Paint paint5 = (Paint) bVar4.f725s;
                                paint5.setColor(i42);
                                float f15 = i39;
                                float f16 = i40;
                                float f17 = i44;
                                canvas.drawCircle(f15, f16, f17, paint5);
                                paint5.setColor(i43);
                                if (aVar13.b() != bVar) {
                                    canvas.drawCircle(f15, i41, f17, paint5);
                                } else {
                                    canvas.drawCircle(i41, f16, f17, paint5);
                                }
                            }
                        }
                        break;
                    case 5:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar14 = (R6.a) c0099h.f103t;
                        Y6.a aVar15 = aVar3.f5416f;
                        if (aVar15 == null) {
                            continue;
                        } else {
                            int i45 = aVar3.f5420k;
                            int i46 = aVar3.f5421l;
                            int i47 = aVar3.f5422m;
                            if (aVar14 instanceof S6.c) {
                                S6.c cVar = (S6.c) aVar14;
                                W6.a aVar16 = (W6.a) aVar15.f726t;
                                int i48 = aVar16.f5334i;
                                float f18 = aVar16.a;
                                int i49 = aVar16.f5332g;
                                int i50 = aVar16.f5340p;
                                int i51 = aVar16.f5341q;
                                int i52 = aVar16.f5342r;
                                if (aVar16.f5335k) {
                                    if (i45 == i51) {
                                        i48 = cVar.a;
                                        f18 = cVar.f4533c;
                                        i49 = cVar.f4535e;
                                    } else if (i45 == i50) {
                                        i48 = cVar.f4530b;
                                        f18 = cVar.f4534d;
                                        i49 = cVar.f4536f;
                                    }
                                } else if (i45 == i50) {
                                    i48 = cVar.a;
                                    f18 = cVar.f4533c;
                                    i49 = cVar.f4535e;
                                } else if (i45 == i52) {
                                    i48 = cVar.f4530b;
                                    f18 = cVar.f4534d;
                                    i49 = cVar.f4536f;
                                }
                                Paint paint6 = (Paint) aVar15.f5695u;
                                paint6.setColor(i48);
                                paint6.setStrokeWidth(aVar16.f5332g);
                                float f19 = i46;
                                float f20 = i47;
                                canvas.drawCircle(f19, f20, aVar16.a, paint6);
                                paint6.setStrokeWidth(i49);
                                canvas.drawCircle(f19, f20, f18, paint6);
                            }
                        }
                        break;
                    case 6:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar17 = (R6.a) c0099h.f103t;
                        Y6.c cVar2 = aVar3.f5417g;
                        if (cVar2 == null) {
                            continue;
                        } else {
                            int i53 = aVar3.f5421l;
                            int i54 = aVar3.f5422m;
                            if (aVar17 instanceof S6.g) {
                                S6.g gVar = (S6.g) aVar17;
                                int i55 = gVar.a;
                                int i56 = gVar.f4541b;
                                int i57 = gVar.f4540c / 2;
                                W6.a aVar18 = (W6.a) cVar2.f726t;
                                int i58 = aVar18.a;
                                int i59 = aVar18.f5334i;
                                int i60 = aVar18.j;
                                W6.b bVarB3 = aVar18.b();
                                RectF rectF2 = (RectF) cVar2.f5695u;
                                if (bVarB3 == bVar) {
                                    rectF2.left = i55;
                                    rectF2.right = i56;
                                    rectF2.top = i54 - i57;
                                    rectF2.bottom = i57 + i54;
                                } else {
                                    rectF2.left = i53 - i57;
                                    rectF2.right = i57 + i53;
                                    rectF2.top = i55;
                                    rectF2.bottom = i56;
                                }
                                Paint paint7 = (Paint) cVar2.f725s;
                                paint7.setColor(i59);
                                float f21 = i53;
                                float f22 = i54;
                                float f23 = i58;
                                canvas.drawCircle(f21, f22, f23, paint7);
                                paint7.setColor(i60);
                                canvas.drawRoundRect(rectF2, f23, f23, paint7);
                            }
                        }
                        break;
                    case 7:
                        aVar = aVar2;
                        i10 = i13;
                        i11 = i14;
                        R6.a aVar19 = (R6.a) c0099h.f103t;
                        Y6.b bVar5 = aVar3.f5418h;
                        if (bVar5 == null) {
                            continue;
                        } else {
                            int i61 = aVar3.f5421l;
                            int i62 = aVar3.f5422m;
                            if (aVar19 instanceof S6.b) {
                                S6.b bVar6 = (S6.b) aVar19;
                                W6.a aVar20 = (W6.a) bVar5.f726t;
                                int i63 = aVar20.f5334i;
                                int i64 = aVar20.j;
                                float f24 = aVar20.a;
                                Paint paint8 = (Paint) bVar5.f725s;
                                paint8.setColor(i63);
                                canvas.drawCircle(i61, i62, f24, paint8);
                                paint8.setColor(i64);
                                if (aVar20.b() != bVar) {
                                    canvas.drawCircle(bVar6.f4531b, bVar6.a, bVar6.f4532c, paint8);
                                } else {
                                    canvas.drawCircle(bVar6.a, bVar6.f4531b, bVar6.f4532c, paint8);
                                }
                            }
                        }
                        break;
                    case 8:
                        R6.a aVar21 = (R6.a) c0099h.f103t;
                        Y6.b bVar7 = aVar3.f5419i;
                        if (bVar7 != null) {
                            int i65 = aVar3.f5420k;
                            int i66 = aVar3.f5421l;
                            int i67 = aVar3.f5422m;
                            if (aVar21 instanceof S6.f) {
                                S6.f fVar2 = (S6.f) aVar21;
                                W6.a aVar22 = (W6.a) bVar7.f726t;
                                int i68 = aVar22.j;
                                int i69 = aVar22.f5334i;
                                int i70 = aVar22.a;
                                int i71 = aVar22.f5340p;
                                aVar = aVar2;
                                int i72 = aVar22.f5341q;
                                i10 = i13;
                                int i73 = aVar22.f5342r;
                                i11 = i14;
                                int i74 = fVar2.a;
                                if (!aVar22.f5335k) {
                                    if (i65 != i73) {
                                        if (i65 == i71) {
                                            i12 = fVar2.f4539b;
                                            i68 = i69;
                                        }
                                        i68 = i69;
                                        i12 = i74;
                                    } else {
                                        i12 = i74;
                                    }
                                    paint = (Paint) bVar7.f725s;
                                    paint.setColor(i68);
                                    if (aVar22.b() == bVar) {
                                        canvas.drawCircle(i66, i12, i70, paint);
                                    } else {
                                        canvas.drawCircle(i12, i67, i70, paint);
                                    }
                                } else {
                                    if (i65 != i72) {
                                        if (i65 == i71) {
                                            i12 = fVar2.f4539b;
                                            i68 = i69;
                                        }
                                        i68 = i69;
                                        i12 = i74;
                                    } else {
                                        i12 = i74;
                                    }
                                    paint = (Paint) bVar7.f725s;
                                    paint.setColor(i68);
                                    if (aVar22.b() == bVar) {
                                        canvas.drawCircle(i66, i12, i70, paint);
                                    } else {
                                        canvas.drawCircle(i12, i67, i70, paint);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    case 9:
                        R6.a aVar23 = (R6.a) c0099h.f103t;
                        Y6.b bVar8 = aVar3.j;
                        if (bVar8 != null) {
                            int i75 = aVar3.f5420k;
                            int i76 = aVar3.f5421l;
                            int i77 = aVar3.f5422m;
                            if (aVar23 instanceof d) {
                                d dVar2 = (d) aVar23;
                                W6.a aVar24 = (W6.a) bVar8.f726t;
                                float f25 = aVar24.a;
                                int i78 = aVar24.j;
                                int i79 = aVar24.f5340p;
                                int i80 = aVar24.f5341q;
                                int i81 = aVar24.f5342r;
                                if (aVar24.f5335k) {
                                    if (i75 == i80) {
                                        f25 = dVar2.f4537c;
                                        i78 = dVar2.a;
                                    } else if (i75 == i79) {
                                        f25 = dVar2.f4538d;
                                        i78 = dVar2.f4530b;
                                    }
                                } else if (i75 == i79) {
                                    f25 = dVar2.f4537c;
                                    i78 = dVar2.a;
                                } else if (i75 == i81) {
                                    f25 = dVar2.f4538d;
                                    i78 = dVar2.f4530b;
                                }
                                Paint paint9 = (Paint) bVar8.f725s;
                                paint9.setColor(i78);
                                canvas.drawCircle(i76, i77, f25, paint9);
                            }
                        }
                        break;
                }
                aVar = aVar2;
                i10 = i13;
                i11 = i14;
            }
            i14 = i11 + 1;
            aVar2 = aVar;
            i13 = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        C0099h c0099h = (C0099h) this.f3603s.f103t;
        W6.a aVar = (W6.a) c0099h.f103t;
        ((p204v1.g) c0099h.f105v).getClass();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i14 = aVar.f5339o;
        int i15 = aVar.a;
        int i16 = aVar.f5332g;
        int i17 = aVar.f5327b;
        int i18 = aVar.f5328c;
        int i19 = aVar.f5329d;
        int i20 = aVar.f5330e;
        int i21 = aVar.f5331f;
        int i22 = i15 * 2;
        W6.b bVarB = aVar.b();
        W6.b bVar = W6.b.f5347s;
        if (i14 != 0) {
            i13 = (i22 * i14) + (i16 * 2 * i14) + ((i14 - 1) * i17);
            i12 = i22 + i16;
            if (bVarB != bVar) {
                i13 = i12;
                i12 = i13;
            }
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (aVar.a() == T6.f.f4688z) {
            if (bVarB == bVar) {
                i12 *= 2;
            } else {
                i13 *= 2;
            }
        }
        int i23 = i13 + i18 + i20;
        int i24 = i12 + i19 + i21;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i23, size) : i23;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i24, size2) : i24;
        }
        if (size < 0) {
            size = 0;
        }
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(size2 >= 0 ? size2 : 0));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        aVarH.f5340p = positionSavedState.f10312s;
        aVarH.f5341q = positionSavedState.f10313t;
        aVarH.f5342r = positionSavedState.f10314u;
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f10312s = aVarH.f5340p;
        positionSavedState.f10313t = aVarH.f5341q;
        positionSavedState.f10314u = aVarH.f5342r;
        return positionSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ((C0099h) ((C0099h) this.f3603s.f103t).f104u).getClass();
        if (motionEvent != null && motionEvent.getAction() == 1) {
            motionEvent.getX();
            motionEvent.getY();
        }
        return true;
    }

    public void setAnimationDuration(long j) {
        ((C0099h) this.f3603s.f103t).h().f5338n = j;
    }

    public void setAnimationType(T6.f fVar) {
        this.f3603s.p(null);
        if (fVar != null) {
            ((C0099h) this.f3603s.f103t).h().f5345u = fVar;
        } else {
            ((C0099h) this.f3603s.f103t).h().f5345u = T6.f.f4681s;
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z6) {
        if (!z6) {
            setVisibility(0);
        }
        ((C0099h) this.f3603s.f103t).h().f5336l = z6;
        h();
    }

    public void setClickListener(V6.a aVar) {
        ((C0099h) ((C0099h) this.f3603s.f103t).f104u).getClass();
    }

    public void setCount(int i10) {
        if (i10 < 0 || ((C0099h) this.f3603s.f103t).h().f5339o == i10) {
            return;
        }
        ((C0099h) this.f3603s.f103t).h().f5339o = i10;
        h();
        requestLayout();
    }

    public void setDynamicCount(boolean z6) {
        l lVar;
        ((C0099h) this.f3603s.f103t).h().f5337m = z6;
        if (!z6) {
            f();
            return;
        }
        if (this.f3604t != null || (lVar = this.f3605u) == null || lVar.getAdapter() == null) {
            return;
        }
        this.f3604t = new a(this, 0);
        try {
            this.f3605u.getAdapter().j(this.f3604t);
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
        }
    }

    public void setInteractiveAnimation(boolean z6) {
        ((C0099h) this.f3603s.f103t).h().f5335k = z6;
        this.f3606v = z6;
    }

    public void setOrientation(W6.b bVar) {
        if (bVar != null) {
            ((C0099h) this.f3603s.f103t).h().f5344t = bVar;
            requestLayout();
        }
    }

    public void setPadding(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        ((C0099h) this.f3603s.f103t).h().f5327b = C4.a.q(i10);
        invalidate();
    }

    public void setRadius(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        ((C0099h) this.f3603s.f103t).h().a = C4.a.q(i10);
        invalidate();
    }

    public void setRtlMode(c cVar) {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        if (cVar == null) {
            aVarH.f5346v = c.f5351t;
        } else {
            aVarH.f5346v = cVar;
        }
        if (this.f3605u == null) {
            return;
        }
        int currentItem = aVarH.f5340p;
        if (e()) {
            currentItem = (aVarH.f5339o - 1) - currentItem;
        } else {
            l lVar = this.f3605u;
            if (lVar != null) {
                currentItem = lVar.getCurrentItem();
            }
        }
        aVarH.f5342r = currentItem;
        aVarH.f5341q = currentItem;
        aVarH.f5340p = currentItem;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setScaleFactor(float f10) {
        float f11 = 1.0f;
        if (f10 > 1.0f) {
            f10 = f11;
        } else {
            f11 = 0.3f;
            if (f10 < 0.3f) {
                f10 = f11;
            }
        }
        ((C0099h) this.f3603s.f103t).h().f5333h = f10;
    }

    public void setSelected(int i10) {
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        T6.f fVarA = aVarH.a();
        aVarH.f5345u = T6.f.f4681s;
        setSelection(i10);
        aVarH.f5345u = fVarA;
    }

    public void setSelectedColor(int i10) {
        ((C0099h) this.f3603s.f103t).h().j = i10;
        invalidate();
    }

    public void setSelection(int i10) {
        Animator animator;
        W6.a aVarH = ((C0099h) this.f3603s.f103t).h();
        int i11 = ((C0099h) this.f3603s.f103t).h().f5339o - 1;
        if (i10 <= 0) {
            i10 = 0;
        } else if (i10 > i11) {
            i10 = i11;
        }
        int i12 = aVarH.f5340p;
        if (i10 == i12 || i10 == aVarH.f5341q) {
            return;
        }
        aVarH.f5335k = false;
        aVarH.f5342r = i12;
        aVarH.f5341q = i10;
        aVarH.f5340p = i10;
        Q6.a aVar = (Q6.a) ((j) this.f3603s.f104u).f10697t;
        if (aVar != null) {
            T6.a aVar2 = aVar.f4327c;
            if (aVar2 != null && (animator = aVar2.f4664c) != null && animator.isStarted()) {
                aVar2.f4664c.end();
            }
            aVar.f4330f = false;
            aVar.f4329e = 0.0f;
            aVar.a();
        }
    }

    public void setStrokeWidth(float f10) {
        int i10 = ((C0099h) this.f3603s.f103t).h().a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else {
            float f11 = i10;
            if (f10 > f11) {
                f10 = f11;
            }
        }
        ((C0099h) this.f3603s.f103t).h().f5332g = (int) f10;
        invalidate();
    }

    public void setUnselectedColor(int i10) {
        ((C0099h) this.f3603s.f103t).h().f5334i = i10;
        invalidate();
    }

    public void setViewPager(l lVar) {
        l lVar2 = this.f3605u;
        if (lVar2 != null) {
            ArrayList arrayList = lVar2.f3384l0;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            this.f3605u = null;
        }
        if (lVar == null) {
            return;
        }
        this.f3605u = lVar;
        if (lVar.f3384l0 == null) {
            lVar.f3384l0 = new ArrayList();
        }
        lVar.f3384l0.add(this);
        l lVar3 = this.f3605u;
        if (lVar3.f3386n0 == null) {
            lVar3.f3386n0 = new ArrayList();
        }
        lVar3.f3386n0.add(this);
        ((C0099h) this.f3603s.f103t).h().f5343s = this.f3605u.getId();
        setDynamicCount(((C0099h) this.f3603s.f103t).h().f5337m);
        g();
    }

    public void setPadding(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        ((C0099h) this.f3603s.f103t).h().f5327b = (int) f10;
        invalidate();
    }

    public void setRadius(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        ((C0099h) this.f3603s.f103t).h().a = (int) f10;
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        int iQ = C4.a.q(i10);
        int i11 = ((C0099h) this.f3603s.f103t).h().a;
        if (iQ < 0) {
            iQ = 0;
        } else if (iQ > i11) {
            iQ = i11;
        }
        ((C0099h) this.f3603s.f103t).h().f5332g = iQ;
        invalidate();
    }
}
