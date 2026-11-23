package p097k;

import W0.e;
import android.graphics.drawable.Animatable;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Animatable f12578e;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.f12577d = i10;
        this.f12578e = animatable;
    }

    @Override // qa.b
    public final void C() {
        switch (this.f12577d) {
            case 0:
                this.f12578e.start();
                break;
            default:
                ((e) this.f12578e).start();
                break;
        }
    }

    @Override // qa.b
    public final void D() {
        switch (this.f12577d) {
            case 0:
                this.f12578e.stop();
                break;
            default:
                ((e) this.f12578e).stop();
                break;
        }
    }
}
