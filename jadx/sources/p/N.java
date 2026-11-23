package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class N extends K.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13971i;
    public final /* synthetic */ WeakReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f13972k;

    public N(T t7, int i10, int i11, WeakReference weakReference) {
        this.f13972k = t7;
        this.f13970h = i10;
        this.f13971i = i11;
        this.j = weakReference;
    }

    @Override // K.b
    public final void j(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f13970h) != -1) {
            typeface = S.a(typeface, i10, (this.f13971i & 2) != 0);
        }
        T t7 = this.f13972k;
        if (t7.f13992m) {
            t7.f13991l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new X2.a(textView, typeface, t7.j, 5));
                } else {
                    textView.setTypeface(typeface, t7.j);
                }
            }
        }
    }

    @Override // K.b
    public final void i(int i10) {
    }
}
