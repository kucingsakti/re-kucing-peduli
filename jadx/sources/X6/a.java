package X6;

import T6.f;
import Y6.b;
import Y6.c;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public Y6.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f5413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y6.a f5414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y6.a f5416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f5417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f5418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f5419i;
    public b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5422m;

    public final void a(Canvas canvas, boolean z6) {
        Paint paint;
        if (this.f5412b != null) {
            int i10 = this.f5420k;
            int i11 = this.f5421l;
            int i12 = this.f5422m;
            Y6.a aVar = this.a;
            W6.a aVar2 = (W6.a) aVar.f726t;
            float f10 = aVar2.a;
            int i13 = aVar2.f5332g;
            float f11 = aVar2.f5333h;
            int i14 = aVar2.j;
            int i15 = aVar2.f5334i;
            int i16 = aVar2.f5340p;
            f fVarA = aVar2.a();
            if ((fVarA == f.f4683u && !z6) || (fVarA == f.f4679B && z6)) {
                f10 *= f11;
            }
            if (i10 != i16) {
                i14 = i15;
            }
            if (fVarA != f.f4686x || i10 == i16) {
                paint = (Paint) aVar.f725s;
            } else {
                paint = (Paint) aVar.f5695u;
                paint.setStrokeWidth(i13);
            }
            paint.setColor(i14);
            canvas.drawCircle(i11, i12, f10, paint);
        }
    }
}
