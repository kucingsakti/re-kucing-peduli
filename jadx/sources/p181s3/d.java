package p181s3;

import E4.C0187a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedList;
import p032d0.f;
import p188t1.C0839b;
import p188t1.h0;
import p188t1.r0;
import p188t1.u0;
import p215w3.c;
import p215w3.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14596t;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14595s = i10;
        this.f14596t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14595s) {
            case 0:
                X2.d dVar = (X2.d) this.f14596t;
                dVar.f5388c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) dVar.f5390e;
                f fVar = sideSheetBehavior.f9784A;
                if (fVar != null && fVar.g()) {
                    dVar.a(dVar.f5387b);
                    return;
                } else {
                    if (sideSheetBehavior.f9806z == 2) {
                        sideSheetBehavior.x(dVar.f5387b);
                        return;
                    }
                    return;
                }
            case 1:
                break;
            case 2:
                r0 r0Var = (r0) this.f14596t;
                try {
                    Thread.sleep(r0Var.a.nextInt(3500) + 1000);
                    break;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                r0Var.b();
                return;
            case 3:
                u0 u0Var = (u0) this.f14596t;
                synchronized (u0Var) {
                    u0Var.n(p204v1.d.b(new C0187a(u0Var, 28)));
                    break;
                }
                return;
            case 4:
                ((c) this.f14596t).t(true);
                return;
            case 5:
                i iVar = (i) this.f14596t;
                boolean zIsPopupShowing = iVar.f15559h.isPopupShowing();
                iVar.t(zIsPopupShowing);
                iVar.f15563m = zIsPopupShowing;
                return;
            default:
                ((TextInputLayout) this.f14596t).f9919v.requestLayout();
                return;
        }
        while (true) {
            C0839b c0839b = (C0839b) this.f14596t;
            LinkedList linkedList = c0839b.f15009c;
            if (linkedList.isEmpty()) {
                return;
            }
            h0 h0Var = linkedList.isEmpty() ? null : (h0) linkedList.remove(0);
            if (h0Var != null) {
                c0839b.a(h0Var);
            }
        }
    }
}
