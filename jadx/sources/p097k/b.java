package p097k;

import M.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import p212w.g;
import p212w.h;
import p212w.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12579A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorFilter f12580B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12581C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f12582D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f12583E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12584F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f12585G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[][] f12586H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public g f12587I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public j f12588J;
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f12589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f12593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f12594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12596i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f12597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12612z;

    public b(b bVar, e eVar, Resources resources) {
        this.f12596i = false;
        this.f12598l = false;
        this.f12609w = true;
        this.f12611y = 0;
        this.f12612z = 0;
        this.a = eVar;
        this.f12589b = resources != null ? resources : bVar != null ? bVar.f12589b : null;
        int i10 = bVar != null ? bVar.f12590c : 0;
        int i11 = e.f12617L;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f12590c = i10;
        if (bVar != null) {
            this.f12591d = bVar.f12591d;
            this.f12592e = bVar.f12592e;
            this.f12607u = true;
            this.f12608v = true;
            this.f12596i = bVar.f12596i;
            this.f12598l = bVar.f12598l;
            this.f12609w = bVar.f12609w;
            this.f12610x = bVar.f12610x;
            this.f12611y = bVar.f12611y;
            this.f12612z = bVar.f12612z;
            this.f12579A = bVar.f12579A;
            this.f12580B = bVar.f12580B;
            this.f12581C = bVar.f12581C;
            this.f12582D = bVar.f12582D;
            this.f12583E = bVar.f12583E;
            this.f12584F = bVar.f12584F;
            this.f12585G = bVar.f12585G;
            if (bVar.f12590c == i10) {
                if (bVar.j) {
                    this.f12597k = bVar.f12597k != null ? new Rect(bVar.f12597k) : null;
                    this.j = true;
                }
                if (bVar.f12599m) {
                    this.f12600n = bVar.f12600n;
                    this.f12601o = bVar.f12601o;
                    this.f12602p = bVar.f12602p;
                    this.f12603q = bVar.f12603q;
                    this.f12599m = true;
                }
            }
            if (bVar.f12604r) {
                this.f12605s = bVar.f12605s;
                this.f12604r = true;
            }
            if (bVar.f12606t) {
                this.f12606t = true;
            }
            Drawable[] drawableArr = bVar.f12594g;
            this.f12594g = new Drawable[drawableArr.length];
            this.f12595h = bVar.f12595h;
            SparseArray sparseArray = bVar.f12593f;
            if (sparseArray != null) {
                this.f12593f = sparseArray.clone();
            } else {
                this.f12593f = new SparseArray(this.f12595h);
            }
            int i12 = this.f12595h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12593f.put(i13, constantState);
                    } else {
                        this.f12594g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f12594g = new Drawable[10];
            this.f12595h = 0;
        }
        if (bVar != null) {
            this.f12586H = bVar.f12586H;
        } else {
            this.f12586H = new int[this.f12594g.length][];
        }
        if (bVar != null) {
            this.f12587I = bVar.f12587I;
            this.f12588J = bVar.f12588J;
        } else {
            this.f12587I = new g();
            this.f12588J = new j(0);
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.f12595h;
        if (i10 >= this.f12594g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f12594g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f12594g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f12586H, 0, iArr, 0, i10);
            this.f12586H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.f12594g[i10] = drawable;
        this.f12595h++;
        this.f12592e = drawable.getChangingConfigurations() | this.f12592e;
        this.f12604r = false;
        this.f12606t = false;
        this.f12597k = null;
        this.j = false;
        this.f12599m = false;
        this.f12607u = false;
        return i10;
    }

    public final void b() {
        this.f12599m = true;
        c();
        int i10 = this.f12595h;
        Drawable[] drawableArr = this.f12594g;
        this.f12601o = -1;
        this.f12600n = -1;
        this.f12603q = 0;
        this.f12602p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12600n) {
                this.f12600n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12601o) {
                this.f12601o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12602p) {
                this.f12602p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12603q) {
                this.f12603q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12593f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f12593f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12593f.valueAt(i10);
                Drawable[] drawableArr = this.f12594g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f12589b);
                M.b.b(drawableNewDrawable, this.f12610x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f12593f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f12595h;
        Drawable[] drawableArr = this.f12594g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12593f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (a.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f12594g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12593f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f12593f.valueAt(iIndexOfKey)).newDrawable(this.f12589b);
        M.b.b(drawableNewDrawable, this.f12610x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.a);
        this.f12594g[i10] = drawableMutate;
        this.f12593f.removeAt(iIndexOfKey);
        if (this.f12593f.size() == 0) {
            this.f12593f = null;
        }
        return drawableMutate;
    }

    public final int e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        j jVar = this.f12588J;
        Object obj2 = 0;
        int iA = p221x.a.a(jVar.f15510v, i10, jVar.f15508t);
        if (iA >= 0 && (obj = jVar.f15509u[iA]) != h.f15503b) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f12586H;
        int i10 = this.f12595h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f12591d | this.f12592e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
