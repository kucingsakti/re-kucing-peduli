package p091j3;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p023c3.b;
import p139o3.d;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12494d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f12496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f12497g;
    public final TextPaint a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f12492b = new b(this, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12495e = true;

    public z(y yVar) {
        this.f12496f = new WeakReference(null);
        this.f12496f = new WeakReference(yVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.f12493c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f12494d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f12495e = false;
    }

    public final void b(d dVar, Context context) {
        if (this.f12497g != dVar) {
            this.f12497g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.a;
                b bVar = this.f12492b;
                dVar.f(context, textPaint, bVar);
                y yVar = (y) this.f12496f.get();
                if (yVar != null) {
                    textPaint.drawableState = yVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                this.f12495e = true;
            }
            y yVar2 = (y) this.f12496f.get();
            if (yVar2 != null) {
                yVar2.a();
                yVar2.onStateChange(yVar2.getState());
            }
        }
    }
}
