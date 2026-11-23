package X2;

import A1.RunnableC0094c;
import U.U;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f5389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G.b f5390e;

    public d(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.f5390e = sideSheetBehavior;
        this.f5389d = new p181s3.d(this, 0);
    }

    public final void a(int i10) {
        Runnable runnable = this.f5389d;
        G.b bVar = this.f5390e;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) bVar;
                WeakReference weakReference = bottomSheetBehavior.f9523m0;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5387b = i10;
                    if (!this.f5388c) {
                        WeakHashMap weakHashMap = U.a;
                        ((View) bottomSheetBehavior.f9523m0.get()).postOnAnimation((RunnableC0094c) runnable);
                        this.f5388c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) bVar;
                WeakReference weakReference2 = sideSheetBehavior.f9791H;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5387b = i10;
                    if (!this.f5388c) {
                        WeakHashMap weakHashMap2 = U.a;
                        ((View) sideSheetBehavior.f9791H.get()).postOnAnimation((p181s3.d) runnable);
                        this.f5388c = true;
                    }
                    break;
                }
                break;
        }
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.f5390e = bottomSheetBehavior;
        this.f5389d = new RunnableC0094c(this, 15);
    }
}
