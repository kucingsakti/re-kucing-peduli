package p170r3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p062g3.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable.ConstantState {
    public j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f14471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f14472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f14473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f14474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f14475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f14476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14478i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.Style f14485q;

    public f(j jVar) {
        this.f14472c = null;
        this.f14473d = null;
        this.f14474e = null;
        this.f14475f = PorterDuff.Mode.SRC_IN;
        this.f14476g = null;
        this.f14477h = 1.0f;
        this.f14478i = 1.0f;
        this.f14479k = 255;
        this.f14480l = 0.0f;
        this.f14481m = 0.0f;
        this.f14482n = 0;
        this.f14483o = 0;
        this.f14484p = 0;
        this.f14485q = Paint.Style.FILL_AND_STROKE;
        this.a = jVar;
        this.f14471b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f14505w = true;
        return gVar;
    }

    public f(f fVar) {
        this.f14472c = null;
        this.f14473d = null;
        this.f14474e = null;
        this.f14475f = PorterDuff.Mode.SRC_IN;
        this.f14476g = null;
        this.f14477h = 1.0f;
        this.f14478i = 1.0f;
        this.f14479k = 255;
        this.f14480l = 0.0f;
        this.f14481m = 0.0f;
        this.f14482n = 0;
        this.f14483o = 0;
        this.f14484p = 0;
        this.f14485q = Paint.Style.FILL_AND_STROKE;
        this.a = fVar.a;
        this.f14471b = fVar.f14471b;
        this.j = fVar.j;
        this.f14472c = fVar.f14472c;
        this.f14473d = fVar.f14473d;
        this.f14475f = fVar.f14475f;
        this.f14474e = fVar.f14474e;
        this.f14479k = fVar.f14479k;
        this.f14477h = fVar.f14477h;
        this.f14483o = fVar.f14483o;
        this.f14478i = fVar.f14478i;
        this.f14480l = fVar.f14480l;
        this.f14481m = fVar.f14481m;
        this.f14482n = fVar.f14482n;
        this.f14484p = fVar.f14484p;
        this.f14485q = fVar.f14485q;
        if (fVar.f14476g != null) {
            this.f14476g = new Rect(fVar.f14476g);
        }
    }
}
