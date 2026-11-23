package T0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final RectF a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f4591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f4592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f4593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4598i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f4603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f4605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4609u;

    public d() {
        Paint paint = new Paint();
        this.f4591b = paint;
        Paint paint2 = new Paint();
        this.f4592c = paint2;
        Paint paint3 = new Paint();
        this.f4593d = paint3;
        this.f4594e = 0.0f;
        this.f4595f = 0.0f;
        this.f4596g = 0.0f;
        this.f4597h = 5.0f;
        this.f4604p = 1.0f;
        this.f4608t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i10) {
        this.j = i10;
        this.f4609u = this.f4598i[i10];
    }
}
