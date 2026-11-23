package p129n3;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public p a;

    public final void a(Canvas canvas, Rect rect, float f10, boolean z6, boolean z10) {
        this.a.a();
        l lVar = (l) this;
        lVar.f13365b = rect.width();
        p pVar = lVar.a;
        float f11 = pVar.a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f11) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (pVar.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = lVar.f13365b / 2.0f;
        float f13 = f11 / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        int i10 = pVar.a;
        int i11 = i10 / 2;
        int i12 = pVar.f13389b;
        lVar.f13368e = i11 == i12;
        lVar.f13366c = i10 * f10;
        lVar.f13367d = Math.min(i11, i12) * f10;
        if (z6 || z10) {
            if ((z6 && pVar.f13392e == 2) || (z10 && pVar.f13393f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z6 || (z10 && pVar.f13393f != 3)) {
                canvas.translate(0.0f, ((1.0f - f10) * pVar.a) / 2.0f);
            }
        }
        if (z10 && pVar.f13393f == 3) {
            lVar.f13369f = f10;
        } else {
            lVar.f13369f = 1.0f;
        }
    }
}
