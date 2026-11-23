package com.smarteist.autoimageslider;

import A1.C0099h;
import A1.RunnableC0094c;
import N6.g;
import N6.i;
import N6.l;
import N6.m;
import N6.o;
import O6.b;
import T6.f;
import W6.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;
import p007a7.a;
import p040e1.j;
import p053f4.e;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public class SliderView extends FrameLayout implements Runnable, View.OnTouchListener, g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f10318A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10319B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10320C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10321D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f10322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f10327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f10328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l f10329z;

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10322s = new Handler();
        this.f10319B = true;
        this.f10320C = true;
        this.f10321D = -1;
        setupSlideView(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N6.a.f3337b, 0, 0);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        int i10 = typedArrayObtainStyledAttributes.getInt(0, 250);
        int i11 = typedArrayObtainStyledAttributes.getInt(17, 2);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        int i12 = typedArrayObtainStyledAttributes.getInt(1, 0);
        setSliderAnimationDuration(i10);
        setScrollTimeInSec(i11);
        setAutoCycle(z10);
        setAutoCycleDirection(i12);
        setAutoCycle(z11);
        setIndicatorEnabled(z6);
        if (this.f10320C) {
            d();
            W6.b bVar = typedArrayObtainStyledAttributes.getInt(11, 0) == 0 ? W6.b.f5347s : W6.b.f5348t;
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(13, C4.a.q(2));
            int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(12, C4.a.q(3));
            int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(6, C4.a.q(12));
            int dimension4 = (int) typedArrayObtainStyledAttributes.getDimension(8, C4.a.q(12));
            int dimension5 = (int) typedArrayObtainStyledAttributes.getDimension(10, C4.a.q(12));
            int dimension6 = (int) typedArrayObtainStyledAttributes.getDimension(9, C4.a.q(12));
            int dimension7 = (int) typedArrayObtainStyledAttributes.getDimension(7, C4.a.q(12));
            int i13 = typedArrayObtainStyledAttributes.getInt(5, 81);
            int color = typedArrayObtainStyledAttributes.getColor(16, Color.parseColor("#33ffffff"));
            int color2 = typedArrayObtainStyledAttributes.getColor(15, Color.parseColor("#ffffff"));
            int i14 = typedArrayObtainStyledAttributes.getInt(3, 350);
            int i15 = typedArrayObtainStyledAttributes.getInt(14, 1);
            c cVar = i15 != 0 ? i15 != 1 ? c.f5352u : c.f5351t : c.f5350s;
            setIndicatorOrientation(bVar);
            setIndicatorRadius(dimension);
            setIndicatorPadding(dimension2);
            setIndicatorMargin(dimension3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10327x.getLayoutParams();
            layoutParams.setMargins(dimension4, dimension5, dimension6, dimension7);
            this.f10327x.setLayoutParams(layoutParams);
            setIndicatorGravity(i13);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f10327x.getLayoutParams();
            layoutParams2.setMargins(dimension4, dimension5, dimension6, dimension7);
            this.f10327x.setLayoutParams(layoutParams2);
            setIndicatorUnselectedColor(color);
            setIndicatorSelectedColor(color2);
            setIndicatorAnimationDuration(i14);
            setIndicatorRtlMode(cVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int getAdapterItemsCount() {
        try {
            return getSliderAdapter().c();
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupSlideView(Context context) {
        l lVar = new l(context);
        this.f10329z = lVar;
        lVar.setOverScrollMode(1);
        this.f10329z.setId(View.generateViewId());
        addView(this.f10329z, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f10329z.setOnTouchListener(this);
        l lVar2 = this.f10329z;
        if (lVar2.f3384l0 == null) {
            lVar2.f3384l0 = new ArrayList();
        }
        lVar2.f3384l0.add(this);
    }

    @Override // N6.g
    public final void a(int i10) {
    }

    @Override // N6.g
    public final void b(int i10) {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01d3 A[PHI: r10
      0x01d3: PHI (r10v14 float) = (r10v6 float), (r10v7 float) binds: [B:50:0x01d1, B:53:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        int i10;
        c cVar;
        int i11 = 12;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (this.f10327x == null) {
            b bVar = new b(getContext());
            if (bVar.getId() == -1) {
                int i12 = Z6.a.a;
                bVar.setId(View.generateViewId());
            }
            C0099h c0099h = new C0099h(22, (boolean) (objArr4 == true ? 1 : 0));
            c0099h.f105v = bVar;
            C0099h c0099h2 = new C0099h(26, (boolean) (objArr3 == true ? 1 : 0));
            W6.a aVar = new W6.a();
            c0099h2.f103t = aVar;
            C0099h c0099h3 = new C0099h(28, (boolean) (objArr2 == true ? 1 : 0));
            c0099h3.f105v = aVar;
            X6.a aVar2 = new X6.a();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            Y6.a aVar3 = new Y6.a((Object) paint, (Object) aVar);
            Paint paint2 = new Paint();
            aVar3.f5695u = paint2;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(aVar.f5332g);
            aVar2.a = aVar3;
            aVar2.f5412b = new Y6.b(paint, aVar);
            aVar2.f5413c = new Y6.b(paint, aVar);
            aVar2.f5414d = new Y6.a(paint, aVar);
            aVar2.f5415e = new Y6.b(paint, aVar);
            Y6.a aVar4 = new Y6.a((Object) paint, (Object) aVar);
            Paint paint3 = new Paint();
            aVar4.f5695u = paint3;
            paint3.setStyle(style);
            paint3.setAntiAlias(true);
            aVar2.f5416f = aVar4;
            aVar2.f5417g = new Y6.c(paint, aVar);
            aVar2.f5418h = new Y6.b(paint, aVar);
            aVar2.f5419i = new Y6.b(paint, aVar);
            aVar2.j = new Y6.b(paint, aVar);
            c0099h3.f104u = aVar2;
            c0099h2.f104u = c0099h3;
            c0099h2.f105v = new p204v1.g(i11);
            W6.a aVar5 = (W6.a) c0099h2.f103t;
            c0099h.f103t = c0099h2;
            W6.a aVarH = c0099h2.h();
            j jVar = new j(23, (boolean) (objArr == true ? 1 : 0));
            Q6.a aVar6 = new Q6.a();
            Q6.b bVar2 = new Q6.b();
            bVar2.j = c0099h;
            aVar6.a = bVar2;
            aVar6.f4326b = c0099h;
            aVar6.f4328d = aVarH;
            jVar.f10697t = aVar6;
            c0099h.f104u = jVar;
            bVar.f3603s = c0099h;
            TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(null, N6.a.a, 0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(15, -1);
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(2, true);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(4, false);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, -1);
            int i14 = i13 != -1 ? i13 : 3;
            int i15 = typedArrayObtainStyledAttributes.getInt(11, 0);
            if (i15 < 0) {
                i15 = 0;
            } else if (i14 > 0 && i15 > (i10 = i14 - 1)) {
                i15 = i10;
            }
            aVar5.f5343s = resourceId;
            aVar5.f5336l = z6;
            aVar5.f5337m = z10;
            aVar5.f5339o = i14;
            aVar5.f5340p = i15;
            aVar5.f5341q = i15;
            aVar5.f5342r = i15;
            int color = typedArrayObtainStyledAttributes.getColor(14, Color.parseColor("#33ffffff"));
            int color2 = typedArrayObtainStyledAttributes.getColor(12, Color.parseColor("#ffffff"));
            aVar5.f5334i = color;
            aVar5.j = color2;
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            int i16 = typedArrayObtainStyledAttributes.getInt(0, 350);
            if (i16 < 0) {
                i16 = 0;
            }
            int i17 = typedArrayObtainStyledAttributes.getInt(1, 0);
            f fVar = f.f4681s;
            f fVar2 = f.f4686x;
            switch (i17) {
                case 1:
                    fVar = f.f4682t;
                    break;
                case 2:
                    fVar = f.f4683u;
                    break;
                case 3:
                    fVar = f.f4684v;
                    break;
                case 4:
                    fVar = f.f4685w;
                    break;
                case 5:
                    fVar = fVar2;
                    break;
                case 6:
                    fVar = f.f4687y;
                    break;
                case 7:
                    fVar = f.f4688z;
                    break;
                case 8:
                    fVar = f.f4678A;
                    break;
                case 9:
                    fVar = f.f4679B;
                    break;
            }
            int i18 = typedArrayObtainStyledAttributes.getInt(9, 1);
            if (i18 != 0) {
                cVar = i18 != 1 ? c.f5352u : c.f5351t;
            } else {
                cVar = c.f5350s;
            }
            aVar5.f5338n = i16;
            aVar5.f5335k = z11;
            aVar5.f5345u = fVar;
            aVar5.f5346v = cVar;
            W6.b bVar3 = typedArrayObtainStyledAttributes.getInt(6, 0) == 0 ? W6.b.f5347s : W6.b.f5348t;
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(8, C4.a.q(6));
            if (dimension < 0) {
                dimension = 0;
            }
            int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(7, C4.a.q(8));
            if (dimension2 < 0) {
                dimension2 = 0;
            }
            float f10 = typedArrayObtainStyledAttributes.getFloat(10, 0.7f);
            float f11 = 0.3f;
            if (f10 < 0.3f) {
                f10 = f11;
            } else {
                f11 = 1.0f;
                if (f10 > 1.0f) {
                    f10 = f11;
                }
            }
            int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(13, C4.a.q(1));
            if (dimension3 > dimension) {
                dimension3 = dimension;
            }
            int i19 = aVar5.a() == fVar2 ? dimension3 : 0;
            aVar5.a = dimension;
            aVar5.f5344t = bVar3;
            aVar5.f5327b = dimension2;
            aVar5.f5333h = f10;
            aVar5.f5332g = i19;
            typedArrayObtainStyledAttributes.recycle();
            W6.a aVarH2 = ((C0099h) bVar.f3603s.f103t).h();
            aVarH2.f5328c = bVar.getPaddingLeft();
            aVarH2.f5329d = bVar.getPaddingTop();
            aVarH2.f5330e = bVar.getPaddingRight();
            aVarH2.f5331f = bVar.getPaddingBottom();
            bVar.f3606v = aVarH2.f5335k;
            this.f10327x = bVar;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.setMargins(20, 20, 20, 20);
            addView(this.f10327x, 1, layoutParams);
        }
        this.f10327x.setViewPager(this.f10329z);
        this.f10327x.setDynamicCount(true);
    }

    public final void e() {
        int currentItem = this.f10329z.getCurrentItem();
        int adapterItemsCount = getAdapterItemsCount();
        if (adapterItemsCount > 1) {
            if (this.f10325v == 2) {
                if (currentItem % (adapterItemsCount - 1) == 0 && this.f10321D != getAdapterItemsCount() - 1 && this.f10321D != 0) {
                    this.f10323t = !this.f10323t;
                }
                if (this.f10323t) {
                    this.f10329z.t(currentItem + 1, true);
                } else {
                    this.f10329z.t(currentItem - 1, true);
                }
            }
            if (this.f10325v == 1) {
                this.f10329z.t(currentItem - 1, true);
            }
            if (this.f10325v == 0) {
                this.f10329z.t(currentItem + 1, true);
            }
        }
        this.f10321D = currentItem;
    }

    public int getAutoCycleDirection() {
        return this.f10325v;
    }

    public int getCurrentPagePosition() {
        if (getSliderAdapter() != null) {
            return getSliderPager().getCurrentItem();
        }
        throw new NullPointerException("Adapter not set");
    }

    public int getIndicatorRadius() {
        return this.f10327x.getRadius();
    }

    public int getIndicatorSelectedColor() {
        return this.f10327x.getSelectedColor();
    }

    public int getIndicatorUnselectedColor() {
        return this.f10327x.getUnselectedColor();
    }

    public b getPagerIndicator() {
        return this.f10327x;
    }

    public int getScrollTimeInMillis() {
        return this.f10326w;
    }

    public int getScrollTimeInSec() {
        return this.f10326w / 1000;
    }

    public Z0.a getSliderAdapter() {
        return this.f10328y;
    }

    public l getSliderPager() {
        return this.f10329z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f10324u) {
            return false;
        }
        int action = motionEvent.getAction();
        Handler handler = this.f10322s;
        if (action == 2) {
            handler.removeCallbacks(this);
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        handler.postDelayed(new RunnableC0094c(this, 12), 2000L);
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.f10322s;
        try {
            e();
        } finally {
            if (this.f10324u) {
                handler.postDelayed(this, this.f10326w);
            }
        }
    }

    public void setAutoCycle(boolean z6) {
        this.f10324u = z6;
    }

    public void setAutoCycleDirection(int i10) {
        this.f10325v = i10;
    }

    public void setCurrentPagePosition(int i10) {
        this.f10329z.t(i10, true);
    }

    public void setCustomSliderTransformAnimation(i iVar) {
        this.f10329z.v(iVar);
    }

    public void setIndicatorAnimation(f fVar) {
        this.f10327x.setAnimationType(fVar);
    }

    public void setIndicatorAnimationDuration(long j) {
        this.f10327x.setAnimationDuration(j);
    }

    public void setIndicatorEnabled(boolean z6) {
        this.f10320C = z6;
        if (this.f10327x == null && z6) {
            d();
        }
    }

    public void setIndicatorGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10327x.getLayoutParams();
        layoutParams.gravity = i10;
        this.f10327x.setLayoutParams(layoutParams);
    }

    public void setIndicatorMargin(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10327x.getLayoutParams();
        layoutParams.setMargins(i10, i10, i10, i10);
        this.f10327x.setLayoutParams(layoutParams);
    }

    public void setIndicatorOrientation(W6.b bVar) {
        this.f10327x.setOrientation(bVar);
    }

    public void setIndicatorPadding(int i10) {
        this.f10327x.setPadding(i10);
    }

    public void setIndicatorRadius(int i10) {
        this.f10327x.setRadius(i10);
    }

    public void setIndicatorRtlMode(c cVar) {
        this.f10327x.setRtlMode(cVar);
    }

    public void setIndicatorSelectedColor(int i10) {
        this.f10327x.setSelectedColor(i10);
    }

    public void setIndicatorUnselectedColor(int i10) {
        this.f10327x.setUnselectedColor(i10);
    }

    public void setIndicatorVisibility(boolean z6) {
        if (z6) {
            this.f10327x.setVisibility(0);
        } else {
            this.f10327x.setVisibility(8);
        }
    }

    public void setInfiniteAdapterEnabled(boolean z6) {
        o oVar = this.f10328y;
        if (oVar != null) {
            this.f10319B = z6;
            if (z6) {
                setSliderAdapter(oVar);
            } else {
                this.f10328y = oVar;
                this.f10329z.setAdapter(oVar);
            }
        }
    }

    public void setOffscreenPageLimit(int i10) {
        this.f10329z.setOffscreenPageLimit(i10);
    }

    public void setOnIndicatorClickListener(V6.a aVar) {
        this.f10327x.setClickListener(aVar);
    }

    public void setPageIndicatorView(b bVar) {
        this.f10327x = bVar;
        d();
    }

    public void setScrollTimeInMillis(int i10) {
        this.f10326w = i10;
    }

    public void setScrollTimeInSec(int i10) {
        this.f10326w = i10 * 1000;
    }

    public void setSliderAdapter(o oVar) {
        this.f10328y = oVar;
        a aVar = new a();
        aVar.f6006c = oVar;
        this.f10318A = aVar;
        this.f10329z.setAdapter(aVar);
        this.f10328y.f3401c = this;
        setCurrentPagePosition(0);
    }

    public void setSliderAnimationDuration(int i10) {
        this.f10329z.setScrollDuration(i10);
    }

    public void setSliderTransformAnimation(N6.b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                this.f10329z.v(new d(14));
                break;
            case 1:
                this.f10329z.v(new za.c(14));
                break;
            case 2:
                this.f10329z.v(new K3.d(15));
                break;
            case 3:
                this.f10329z.v(new e(15));
                break;
            case 4:
                this.f10329z.v(new p170r3.e(15));
                break;
            case 5:
                this.f10329z.v(new p204v1.g(15));
                break;
            case 6:
                this.f10329z.v(new d(15));
                break;
            case 7:
                this.f10329z.v(new za.c(15));
                break;
            case 8:
                this.f10329z.v(new K3.d(16));
                break;
            case 9:
                this.f10329z.v(new e(16));
                break;
            case 10:
                this.f10329z.v(new p170r3.e(16));
                break;
            case 11:
                this.f10329z.v(new p204v1.g(16));
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.f10329z.v(new d(16));
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.f10329z.v(new za.c(16));
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.f10329z.v(new K3.d(17));
                break;
            case 15:
                this.f10329z.v(new e(17));
                break;
            case 16:
            default:
                this.f10329z.v(new p170r3.e(17));
                break;
            case 17:
                this.f10329z.v(new p204v1.g(17));
                break;
            case 18:
                this.f10329z.v(new d(17));
                break;
            case 19:
                this.f10329z.v(new za.c(17));
                break;
            case 20:
                this.f10329z.v(new K3.d(18));
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                this.f10329z.v(new e(18));
                break;
        }
    }

    public void setCurrentPageListener(m mVar) {
    }

    @Override // N6.g
    public final void c(int i10, float f10) {
    }
}
