package p159q3;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f14406i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f14407k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f14408l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f14409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f14410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f14414g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f14415h;

    public a() {
        Paint paint = new Paint();
        this.f14415h = paint;
        this.a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f14409b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f14410c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f14411d = L.a.d(i10, 68);
        this.f14412e = L.a.d(i10, 20);
        this.f14413f = L.a.d(i10, 0);
        this.a.setColor(this.f14411d);
    }
}
