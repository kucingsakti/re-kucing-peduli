package p023c3;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import p170r3.w;
import p170r3.x;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7459b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.f7459b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                f fVar = ((Chip) this.f7459b).f9626w;
                if (fVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    fVar.getOutline(outline);
                }
                break;
            case 1:
                w wVar = (w) this.f7459b;
                if (wVar.f14553c != null && !wVar.f14554d.isEmpty()) {
                    RectF rectF = wVar.f14554d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, wVar.f14557g);
                    break;
                }
                break;
            default:
                Path path = ((x) this.f7459b).f14555e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                }
                break;
        }
    }
}
