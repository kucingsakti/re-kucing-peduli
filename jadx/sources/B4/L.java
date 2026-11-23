package B4;

import U.InterfaceC0419e0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f635b;

    public /* synthetic */ L(Object obj, int i10) {
        this.a = i10;
        this.f635b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((InterfaceC0419e0) this.f635b).b();
                break;
            case 10:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f635b;
                actionBarOverlayLayout.f6115O = null;
                actionBarOverlayLayout.f6102B = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                M m2 = (M) this.f635b;
                if (m2.f647z == 2 && m2.f636A == 100.0f) {
                    m2.setVisibility(8);
                    m2.f636A = 0.0f;
                    m2.setAlpha(1.0f);
                }
                m2.f647z = 0;
                break;
            case 1:
                ((InterfaceC0419e0) this.f635b).a();
                break;
            case 2:
                ((HideBottomViewOnScrollBehavior) this.f635b).f9479z = null;
                break;
            case 3:
                ((V0.p) this.f635b).p();
                animator.removeListener(this);
                break;
            case 4:
                W0.e eVar = (W0.e) this.f635b;
                ArrayList arrayList = new ArrayList(eVar.f5258w);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p129n3.c) arrayList.get(i10)).a(eVar);
                }
                break;
            case 5:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f635b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.f9523m0;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f9523m0.get()).requestLayout();
                    break;
                }
                break;
            case 6:
                p081i3.i iVar = (p081i3.i) this.f635b;
                iVar.f12255r = 0;
                iVar.f12249l = null;
                break;
            case 7:
                Y1.c cVar = (Y1.c) this.f635b;
                if (((ValueAnimator) cVar.f5671u) == animator) {
                    cVar.f5671u = null;
                }
                break;
            case 8:
                p109l3.f fVar = (p109l3.f) this.f635b;
                fVar.f12914b.setTranslationY(0.0f);
                fVar.b(0.0f);
                break;
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f635b;
                actionBarOverlayLayout.f6115O = null;
                actionBarOverlayLayout.f6102B = false;
                break;
            case 11:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f635b;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.f9791H;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f9791H.get()).requestLayout();
                    break;
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                p215w3.i iVar2 = (p215w3.i) this.f635b;
                iVar2.q();
                iVar2.f15568r.start();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ExpandableTransformationBehavior) this.f635b).f9970t = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 9:
                super.onAnimationRepeat(animator);
                p129n3.m mVar = (p129n3.m) this.f635b;
                mVar.f13374x = (mVar.f13374x + 1) % mVar.f13373w.f13390c.length;
                mVar.f13375y = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((InterfaceC0419e0) this.f635b).c();
                break;
            case 4:
                W0.e eVar = (W0.e) this.f635b;
                ArrayList arrayList = new ArrayList(eVar.f5258w);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p129n3.c) arrayList.get(i10)).b(eVar);
                }
                break;
            case 6:
                p081i3.i iVar = (p081i3.i) this.f635b;
                iVar.f12256s.a(0, false);
                iVar.f12255r = 2;
                iVar.f12249l = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public L(InterfaceC0419e0 interfaceC0419e0, View view) {
        this.a = 1;
        this.f635b = interfaceC0419e0;
    }
}
