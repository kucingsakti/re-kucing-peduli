package p032d0;

import P0.d;
import U.U;
import V.j;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f10497u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.f10497u = bVar;
    }

    @Override // P0.d
    public final j p(int i10) {
        return new j(AccessibilityNodeInfo.obtain(this.f10497u.n(i10).a));
    }

    @Override // P0.d
    public final j t(int i10) {
        b bVar = this.f10497u;
        int i11 = i10 == 2 ? bVar.f10507k : bVar.f10508l;
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return p(i11);
    }

    @Override // P0.d
    public final boolean u(int i10, int i11, Bundle bundle) {
        int i12;
        b bVar = this.f10497u;
        Chip chip = bVar.f10506i;
        if (i10 == -1) {
            WeakHashMap weakHashMap = U.a;
            return chip.performAccessibilityAction(i11, bundle);
        }
        if (i11 == 1) {
            return bVar.p(i10);
        }
        if (i11 == 2) {
            return bVar.j(i10);
        }
        boolean z6 = false;
        if (i11 == 64) {
            AccessibilityManager accessibilityManager = bVar.f10505h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i12 = bVar.f10507k) == i10) {
                return false;
            }
            if (i12 != Integer.MIN_VALUE) {
                bVar.f10507k = Integer.MIN_VALUE;
                bVar.f10506i.invalidate();
                bVar.q(i12, 65536);
            }
            bVar.f10507k = i10;
            chip.invalidate();
            bVar.q(i10, 32768);
            return true;
        }
        if (i11 == 128) {
            if (bVar.f10507k != i10) {
                return false;
            }
            bVar.f10507k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i10, 65536);
            return true;
        }
        p023c3.d dVar = (p023c3.d) bVar;
        if (i11 == 16) {
            Chip chip2 = dVar.f7460q;
            if (i10 == 0) {
                return chip2.performClick();
            }
            if (i10 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f9629z;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z6 = true;
                }
                if (chip2.f9622L) {
                    chip2.f9621K.q(1, 1);
                }
            }
        }
        return z6;
    }
}
