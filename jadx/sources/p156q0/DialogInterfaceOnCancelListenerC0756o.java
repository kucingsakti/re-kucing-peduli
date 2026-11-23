package p156q0;

import B4.u;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.lifecycle.A;
import androidx.lifecycle.L;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.kcstream.cing.R;
import p031d.n;
import p078i.AbstractActivityC0655l;
import p122m7.d;
import p166r.c;
import p166r.f;

/* JADX INFO: renamed from: q0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0756o extends b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f14339C0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Dialog f14341E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f14342F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f14343G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f14344H0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Handler f14346t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final d f14347u0 = new d(this, 4);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final u f14348v0 = new u(this, 2);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0753l f14349w0 = new DialogInterfaceOnDismissListenerC0753l(this);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f14350x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f14351y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14352z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f14337A0 = true;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f14338B0 = -1;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C0754m f14340D0 = new C0754m(this);

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f14345I0 = false;

    @Override // androidx.fragment.app.b
    public final void B(AbstractActivityC0655l abstractActivityC0655l) {
        Object obj;
        super.B(abstractActivityC0655l);
        A a = this.f6645n0;
        a.getClass();
        A.a("observeForever");
        C0754m c0754m = this.f14340D0;
        x xVar = new x(a, c0754m);
        f fVar = a.f6706b;
        c cVarD = fVar.d(c0754m);
        if (cVarD != null) {
            obj = cVarD.f14448t;
        } else {
            c cVar = new c(c0754m, xVar);
            fVar.f14457v++;
            c cVar2 = fVar.f14455t;
            if (cVar2 == null) {
                fVar.f14454s = cVar;
                fVar.f14455t = cVar;
            } else {
                cVar2.f14449u = cVar;
                cVar.f14450v = cVar2;
                fVar.f14455t = cVar;
            }
            obj = null;
        }
        z zVar = (z) obj;
        if (zVar instanceof y) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zVar == null) {
            xVar.a(true);
        }
        if (this.f14344H0) {
            return;
        }
        this.f14343G0 = false;
    }

    @Override // androidx.fragment.app.b
    public void C(Bundle bundle) {
        super.C(bundle);
        this.f14346t0 = new Handler();
        this.f14337A0 = this.f6626S == 0;
        if (bundle != null) {
            this.f14350x0 = bundle.getInt("android:style", 0);
            this.f14351y0 = bundle.getInt("android:theme", 0);
            this.f14352z0 = bundle.getBoolean("android:cancelable", true);
            this.f14337A0 = bundle.getBoolean("android:showsDialog", this.f14337A0);
            this.f14338B0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.b
    public void G() {
        this.f6634a0 = true;
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            this.f14342F0 = true;
            dialog.setOnDismissListener(null);
            this.f14341E0.dismiss();
            if (!this.f14343G0) {
                onDismiss(this.f14341E0);
            }
            this.f14341E0 = null;
            this.f14345I0 = false;
        }
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        this.f6634a0 = true;
        if (!this.f14344H0 && !this.f14343G0) {
            this.f14343G0 = true;
        }
        C0754m c0754m = this.f14340D0;
        A a = this.f6645n0;
        a.getClass();
        A.a("removeObserver");
        z zVar = (z) a.f6706b.e(c0754m);
        if (zVar == null) {
            return;
        }
        zVar.b();
        zVar.a(false);
    }

    @Override // androidx.fragment.app.b
    public final LayoutInflater I(Bundle bundle) {
        LayoutInflater layoutInflaterI = super.I(bundle);
        boolean z6 = this.f14337A0;
        if (z6 && !this.f14339C0) {
            if (z6 && !this.f14345I0) {
                try {
                    this.f14339C0 = true;
                    Dialog dialogK0 = k0();
                    this.f14341E0 = dialogK0;
                    if (this.f14337A0) {
                        m0(dialogK0, this.f14350x0);
                        Context contextM = m();
                        if (contextM instanceof Activity) {
                            this.f14341E0.setOwnerActivity((Activity) contextM);
                        }
                        this.f14341E0.setCancelable(this.f14352z0);
                        this.f14341E0.setOnCancelListener(this.f14348v0);
                        this.f14341E0.setOnDismissListener(this.f14349w0);
                        this.f14345I0 = true;
                    } else {
                        this.f14341E0 = null;
                    }
                    this.f14339C0 = false;
                } catch (Throwable th) {
                    this.f14339C0 = false;
                    throw th;
                }
            }
            if (e.K(2)) {
                toString();
            }
            Dialog dialog = this.f14341E0;
            if (dialog != null) {
                return layoutInflaterI.cloneInContext(dialog.getContext());
            }
        } else if (e.K(2)) {
            toString();
        }
        return layoutInflaterI;
    }

    @Override // androidx.fragment.app.b
    public void O(Bundle bundle) {
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f14350x0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f14351y0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z6 = this.f14352z0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z10 = this.f14337A0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f14338B0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.b
    public void P() {
        this.f6634a0 = true;
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            this.f14342F0 = false;
            dialog.show();
            View decorView = this.f14341E0.getWindow().getDecorView();
            L.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            xa.d.u(decorView, this);
        }
    }

    @Override // androidx.fragment.app.b
    public void Q() {
        this.f6634a0 = true;
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.b
    public final void S(Bundle bundle) {
        Bundle bundle2;
        this.f6634a0 = true;
        if (this.f14341E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f14341E0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.b
    public final void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T(layoutInflater, viewGroup, bundle);
        if (this.c0 != null || this.f14341E0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f14341E0.onRestoreInstanceState(bundle2);
    }

    public void g0() {
        i0(false, false);
    }

    @Override // androidx.fragment.app.b
    public final y h() {
        return new C0755n(this, new r(this));
    }

    public void h0() {
        i0(true, false);
    }

    public final void i0(boolean z6, boolean z10) {
        if (this.f14343G0) {
            return;
        }
        this.f14343G0 = true;
        this.f14344H0 = false;
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f14341E0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f14346t0.getLooper()) {
                    onDismiss(this.f14341E0);
                } else {
                    this.f14346t0.post(this.f14347u0);
                }
            }
        }
        this.f14342F0 = true;
        if (this.f14338B0 >= 0) {
            e eVarP = p();
            int i10 = this.f14338B0;
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC0487g.g(i10, "Bad id: "));
            }
            eVarP.x(new K(eVarP, null, i10), z6);
            this.f14338B0 = -1;
            return;
        }
        C0742a c0742a = new C0742a(p());
        c0742a.f14307p = true;
        c0742a.l(this);
        if (z6) {
            c0742a.g(true, true);
        } else {
            c0742a.f();
        }
    }

    public int j0() {
        return this.f14351y0;
    }

    public Dialog k0() {
        if (e.K(3)) {
            toString();
        }
        return new n(X(), j0());
    }

    public final Dialog l0() {
        Dialog dialog = this.f14341E0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void m0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void n0(e eVar, String str) {
        this.f14343G0 = false;
        this.f14344H0 = true;
        eVar.getClass();
        C0742a c0742a = new C0742a(eVar);
        c0742a.f14307p = true;
        c0742a.j(0, this, str, 1);
        c0742a.f();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f14342F0) {
            return;
        }
        if (e.K(3)) {
            toString();
        }
        i0(true, true);
    }

    @Override // androidx.fragment.app.b
    public final void z() {
        this.f6634a0 = true;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
