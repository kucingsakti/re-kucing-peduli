package p215w3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p170r3.f;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f15552r;

    public e(j jVar, RectF rectF) {
        super(jVar);
        this.f15552r = rectF;
    }

    @Override // p170r3.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.f15554Q = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(e eVar) {
        super(eVar);
        this.f15552r = eVar.f15552r;
    }
}
