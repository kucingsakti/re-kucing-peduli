package p126n0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import oa.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13295c;

    public g(TextView textView) {
        this.f13295c = new f(textView);
    }

    @Override // oa.b
    public final InputFilter[] e(InputFilter[] inputFilterArr) {
        return !(p106l0.g.f12850k != null) ? inputFilterArr : this.f13295c.e(inputFilterArr);
    }

    @Override // oa.b
    public final boolean j() {
        return this.f13295c.f13294e;
    }

    @Override // oa.b
    public final void l(boolean z6) {
        if (p106l0.g.f12850k != null) {
            this.f13295c.l(z6);
        }
    }

    @Override // oa.b
    public final void m(boolean z6) {
        boolean z10 = p106l0.g.f12850k != null;
        f fVar = this.f13295c;
        if (z10) {
            fVar.m(z6);
        } else {
            fVar.f13294e = z6;
        }
    }

    @Override // oa.b
    public final TransformationMethod q(TransformationMethod transformationMethod) {
        return !(p106l0.g.f12850k != null) ? transformationMethod : this.f13295c.q(transformationMethod);
    }
}
