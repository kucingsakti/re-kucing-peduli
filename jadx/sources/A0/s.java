package A0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.kcstream.cing.R;
import kotlin.Metadata;
import p078i.AbstractActivityC0655l;
import p156q0.C0742a;
import y0.B;
import y0.C0864b;
import y0.Q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LA0/s;", "Landroidx/fragment/app/b;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class s extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final p076h8.j f40t0 = D3.b.s(new r(this, 0));

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f41u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f42v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f43w0;

    @Override // androidx.fragment.app.b
    public final void B(AbstractActivityC0655l abstractActivityC0655l) {
        p210v8.i.f(abstractActivityC0655l, "context");
        super.B(abstractActivityC0655l);
        if (this.f43w0) {
            C0742a c0742a = new C0742a(p());
            c0742a.o(this);
            c0742a.f();
        }
    }

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        g0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f43w0 = true;
            C0742a c0742a = new C0742a(p());
            c0742a.o(this);
            c0742a.f();
        }
        super.C(bundle);
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p210v8.i.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        p210v8.i.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i10 = this.f6625R;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        this.f6634a0 = true;
        View view = this.f41u0;
        if (view != null) {
            B b3 = (B) K9.n.v(K9.n.A(K9.n.x(view, C0864b.f15902C), C0864b.f15903D));
            if (b3 == null) {
                throw new IllegalStateException("View " + view + " does not have a NavController set");
            }
            if (b3 == g0()) {
                view.setTag(R.id.nav_controller_view_tag, null);
            }
        }
        this.f41u0 = null;
    }

    @Override // androidx.fragment.app.b
    public final void J(Context context, AttributeSet attributeSet, Bundle bundle) {
        p210v8.i.f(context, "context");
        p210v8.i.f(attributeSet, "attrs");
        super.J(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q.f15896b);
        p210v8.i.e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f42v0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.f45c);
        p210v8.i.e(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f43w0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.b
    public final void O(Bundle bundle) {
        if (this.f43w0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        p210v8.i.f(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, g0());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            p210v8.i.d(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f41u0 = view2;
            if (view2.getId() == this.f6625R) {
                View view3 = this.f41u0;
                p210v8.i.c(view3);
                view3.setTag(R.id.nav_controller_view_tag, g0());
            }
        }
    }

    public final B g0() {
        return (B) this.f40t0.getValue();
    }
}
