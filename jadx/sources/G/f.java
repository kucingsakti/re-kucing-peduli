package G;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p081i3.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1680t;

    public /* synthetic */ f(Object obj, int i10) {
        this.f1679s = i10;
        this.f1680t = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f1679s) {
            case 0:
                ((CoordinatorLayout) this.f1680t).p(0);
                break;
            case 1:
                Log.isLoggable("ViewTarget", 2);
                R1.d dVar = (R1.d) ((WeakReference) this.f1680t).get();
                if (dVar != null) {
                    ArrayList arrayList = dVar.f4439b;
                    if (!arrayList.isEmpty()) {
                        ImageView imageView = dVar.a;
                        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int iA = dVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                        int iA2 = dVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((Q1.f) ((R1.b) it.next())).j(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(dVar.f4440c);
                                }
                                dVar.f4440c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                i iVar = (i) this.f1680t;
                float rotation = iVar.f12256s.getRotation();
                if (iVar.f12252o != rotation) {
                    iVar.f12252o = rotation;
                    iVar.p();
                }
                break;
        }
        return true;
    }

    public f(R1.d dVar) {
        this.f1679s = 1;
        this.f1680t = new WeakReference(dVar);
    }
}
