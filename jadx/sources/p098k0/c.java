package p098k0;

import android.view.View;
import p129n3.f;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12653b;

    public /* synthetic */ c(int i10) {
        this.f12653b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p188t1.Y
    public final float p(f fVar) {
        switch (this.f12653b) {
            case 0:
                return ((View) fVar).getAlpha();
            case 1:
                return ((View) fVar).getScaleX();
            case 2:
                return ((View) fVar).getScaleY();
            case 3:
                return ((View) fVar).getRotation();
            case 4:
                return ((View) fVar).getRotationX();
            default:
                return ((View) fVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p188t1.Y
    public final void y(f fVar, float f10) {
        switch (this.f12653b) {
            case 0:
                ((View) fVar).setAlpha(f10);
                break;
            case 1:
                ((View) fVar).setScaleX(f10);
                break;
            case 2:
                ((View) fVar).setScaleY(f10);
                break;
            case 3:
                ((View) fVar).setRotation(f10);
                break;
            case 4:
                ((View) fVar).setRotationX(f10);
                break;
            default:
                ((View) fVar).setRotationY(f10);
                break;
        }
    }
}
