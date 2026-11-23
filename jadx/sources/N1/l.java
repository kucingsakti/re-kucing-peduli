package N1;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l extends Fragment {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f3278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A1.r f3279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f3280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.l f3281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l f3282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Fragment f3283x;

    public l() {
        a aVar = new a();
        this.f3279t = new A1.r(this, 27);
        this.f3280u = new HashSet();
        this.f3278s = aVar;
    }

    public final void a(Activity activity) {
        l lVar = this.f3282w;
        if (lVar != null) {
            lVar.f3280u.remove(this);
            this.f3282w = null;
        }
        m mVar = com.bumptech.glide.b.b(activity).f7591w;
        mVar.getClass();
        l lVarH = mVar.h(activity.getFragmentManager(), null);
        this.f3282w = lVarH;
        if (equals(lVarH)) {
            return;
        }
        this.f3282w.f3280u.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f3278s.a();
        l lVar = this.f3282w;
        if (lVar != null) {
            lVar.f3280u.remove(this);
            this.f3282w = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        l lVar = this.f3282w;
        if (lVar != null) {
            lVar.f3280u.remove(this);
            this.f3282w = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f3278s;
        aVar.f3270t = true;
        Iterator it = U1.n.e(aVar.f3269s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a aVar = this.f3278s;
        aVar.f3270t = false;
        Iterator it = U1.n.e(aVar.f3269s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f3283x;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
