package C0;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import p078i.C0650g;
import p078i.DialogInterfaceC0653j;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends DialogInterfaceOnCancelListenerC0756o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public DialogPreference f863J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public CharSequence f864K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public CharSequence f865L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public CharSequence f866M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CharSequence f867N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f868O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public BitmapDrawable f869P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f870Q0;

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public void C(Bundle bundle) {
        super.C(bundle);
        androidx.fragment.app.b bVarS = s(true);
        if (!(bVarS instanceof r)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        r rVar = (r) bVarS;
        Bundle bundle2 = this.f6656y;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        String string = bundle2.getString("key");
        if (bundle != null) {
            this.f864K0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f865L0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f866M0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f867N0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f868O0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f869P0 = new BitmapDrawable(q(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) rVar.g0(string);
        this.f863J0 = dialogPreference;
        this.f864K0 = dialogPreference.f0;
        this.f865L0 = dialogPreference.f6785i0;
        this.f866M0 = dialogPreference.f6786j0;
        this.f867N0 = dialogPreference.f6783g0;
        this.f868O0 = dialogPreference.f6787k0;
        Drawable drawable = dialogPreference.f6784h0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f869P0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f869P0 = new BitmapDrawable(q(), bitmapCreateBitmap);
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public void O(Bundle bundle) {
        super.O(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f864K0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f865L0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f866M0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f867N0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f868O0);
        BitmapDrawable bitmapDrawable = this.f869P0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final Dialog k0() {
        this.f870Q0 = -2;
        A1.l lVar = new A1.l(X());
        CharSequence charSequence = this.f864K0;
        C0650g c0650g = (C0650g) lVar.f123t;
        c0650g.f12042d = charSequence;
        c0650g.f12041c = this.f869P0;
        lVar.f(this.f865L0, this);
        c0650g.f12047i = this.f866M0;
        c0650g.j = this;
        X();
        int i10 = this.f868O0;
        View viewInflate = i10 != 0 ? n().inflate(i10, (ViewGroup) null) : null;
        if (viewInflate != null) {
            p0(viewInflate);
            c0650g.f12056s = viewInflate;
            c0650g.f12055r = 0;
        } else {
            c0650g.f12044f = this.f867N0;
        }
        r0(lVar);
        DialogInterfaceC0653j dialogInterfaceC0653jC = lVar.c();
        if (this instanceof c) {
            Window window = dialogInterfaceC0653jC.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                n.a(window);
                return dialogInterfaceC0653jC;
            }
            c cVar = (c) this;
            cVar.U0 = SystemClock.currentThreadTimeMillis();
            cVar.s0();
        }
        return dialogInterfaceC0653jC;
    }

    public final DialogPreference o0() {
        if (this.f863J0 == null) {
            Bundle bundle = this.f6656y;
            if (bundle == null) {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
            this.f863J0 = (DialogPreference) ((r) s(true)).g0(bundle.getString("key"));
        }
        return this.f863J0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f870Q0 = i10;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        q0(this.f870Q0 == -1);
    }

    public void p0(View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f867N0;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    public abstract void q0(boolean z6);

    public void r0(A1.l lVar) {
    }
}
