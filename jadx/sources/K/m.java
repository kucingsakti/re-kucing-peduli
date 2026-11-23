package K;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2500u;

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f2498s = i11;
        this.f2500u = obj;
        this.f2499t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2498s) {
            case 0:
                ((b) this.f2500u).i(this.f2499t);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2500u;
                View view = (View) sideSheetBehavior.f9791H.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f2499t, false);
                }
                break;
        }
    }
}
