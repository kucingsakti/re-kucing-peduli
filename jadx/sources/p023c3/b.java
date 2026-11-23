package p023c3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p091j3.y;
import p091j3.z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D3.b {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7458b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.f7458b = obj;
    }

    @Override // D3.b
    public final void y(int i10) {
        switch (this.a) {
            case 0:
                break;
            default:
                z zVar = (z) this.f7458b;
                zVar.f12495e = true;
                y yVar = (y) zVar.f12496f.get();
                if (yVar != null) {
                    yVar.a();
                }
                break;
        }
    }

    @Override // D3.b
    public final void z(Typeface typeface, boolean z6) {
        switch (this.a) {
            case 0:
                Chip chip = (Chip) this.f7458b;
                f fVar = chip.f9626w;
                chip.setText(fVar.f7488V0 ? fVar.f7491X : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z6) {
                    z zVar = (z) this.f7458b;
                    zVar.f12495e = true;
                    y yVar = (y) zVar.f12496f.get();
                    if (yVar != null) {
                        yVar.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void I(int i10) {
    }
}
