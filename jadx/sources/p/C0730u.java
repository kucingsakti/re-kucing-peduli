package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: p.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0730u {
    public final TextView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p102k7.e f14132b;

    public C0730u(TextView textView) {
        this.a = textView;
        p102k7.e eVar = new p102k7.e();
        eVar.f12743s = new p126n0.g(textView);
        this.f14132b = eVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((oa.b) this.f14132b.f12743s).e(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, p069h.a.f11617i, i10, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z6) {
        ((oa.b) this.f14132b.f12743s).l(z6);
    }

    public final void d(boolean z6) {
        ((oa.b) this.f14132b.f12743s).m(z6);
    }
}
