package p045e7;

import A1.J;
import J0.C0256f;
import J7.j;
import J7.n;
import K7.e;
import L7.a;
import O7.b;
import X2.i;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c2.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kcstream.cing.R;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le7/h;", "LX2/i;", "<init>", "()V", "e7/c", "biometricauth-rxjava2_release"}, k = 1, mv = {1, 4, 2})
@TargetApi(23)
public final class h extends i {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f10722J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextView f10723K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public TextView f10724L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ImageView f10725M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ImageView f10726N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f10727O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public Button f10728P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public J f10729Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public f f10730R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final a f10731S0 = new a(0);

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public long f10732T0;
    public R7.a U0;

    public static final J7.h o0(h hVar) {
        Bundle bundle = hVar.f6656y;
        if (bundle != null) {
            WeakReference weakReference = (WeakReference) b.f10711v.get(Integer.valueOf(bundle.getInt("req_id")));
            if (weakReference != null) {
                return (J7.h) weakReference.get();
            }
        }
        return null;
    }

    public static final void p0(h hVar, CharSequence charSequence) {
        R7.a aVar = hVar.U0;
        boolean z6 = (aVar == null || aVar.e()) ? false : true;
        R7.a aVar2 = hVar.U0;
        if (aVar2 != null) {
            b.g(aVar2);
        }
        hVar.U0 = null;
        TextView textView = hVar.f10727O0;
        if (textView == null) {
            p210v8.i.n("iconTextView");
            throw null;
        }
        textView.setText(charSequence);
        TextView textView2 = hVar.f10727O0;
        if (textView2 == null) {
            p210v8.i.n("iconTextView");
            throw null;
        }
        textView2.setTextColor(J.b.a(textView2.getContext(), R.color.biometric_icon_text_color_error));
        if (z6) {
            AnimationSet animationSetQ0 = q0();
            animationSetQ0.addAnimation(hVar.r0(true));
            ImageView imageView = hVar.f10726N0;
            if (imageView == null) {
                p210v8.i.n("errorIconImageView");
                throw null;
            }
            imageView.startAnimation(animationSetQ0);
        } else {
            hVar.s0(false);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n nVar = p046e8.f.a;
        P7.a.a(timeUnit, "unit is null");
        P7.a.a(nVar, "scheduler is null");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        e eVar = K7.b.a;
        if (eVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        R7.a aVar3 = new R7.a(f.f10719u, 0, new d(hVar));
        try {
            S7.a aVar4 = new S7.a(aVar3, eVar);
            try {
                S7.b bVar = new S7.b(aVar4);
                aVar4.b(bVar);
                b.i(bVar, nVar.c(bVar, 2L, TimeUnit.SECONDS));
                hVar.f10731S0.a(aVar3);
                hVar.U0 = aVar3;
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th) {
                l.n(th);
                j.y(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            l.n(th2);
            j.y(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    public static AnimationSet q0() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setFillEnabled(true);
        return animationSet;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        this.f10729Q0 = new J(4);
        this.f10730R0 = new f(X());
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        a aVar = this.f10731S0;
        if (!aVar.f2786t) {
            synchronized (aVar) {
                try {
                    if (!aVar.f2786t) {
                        C0256f c0256f = (C0256f) aVar.f2787u;
                        aVar.f2787u = null;
                        a.e(c0256f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f6634a0 = true;
    }

    @Override // X2.i, p078i.G, p156q0.DialogInterfaceOnCancelListenerC0756o
    public final Dialog k0() {
        c cVar = new c(X(), this.f14351y0);
        cVar.setContentView(R.layout.dialog_fingerprint);
        View viewFindViewById = cVar.findViewById(R.id.bottom_sheet_container);
        Object parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        BottomSheetBehavior bottomSheetBehaviorB = view != null ? BottomSheetBehavior.B(view) : null;
        this.f10732T0 = q().getInteger(android.R.integer.config_shortAnimTime);
        View viewFindViewById2 = cVar.findViewById(R.id.title);
        p210v8.i.c(viewFindViewById2);
        this.f10722J0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = cVar.findViewById(R.id.subtitle);
        p210v8.i.c(viewFindViewById3);
        this.f10723K0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = cVar.findViewById(R.id.description);
        p210v8.i.c(viewFindViewById4);
        this.f10724L0 = (TextView) viewFindViewById4;
        View viewFindViewById5 = cVar.findViewById(R.id.icon);
        p210v8.i.c(viewFindViewById5);
        this.f10725M0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = cVar.findViewById(R.id.error_icon);
        p210v8.i.c(viewFindViewById6);
        this.f10726N0 = (ImageView) viewFindViewById6;
        View viewFindViewById7 = cVar.findViewById(R.id.icon_text);
        p210v8.i.c(viewFindViewById7);
        this.f10727O0 = (TextView) viewFindViewById7;
        View viewFindViewById8 = cVar.findViewById(R.id.cancel);
        p210v8.i.c(viewFindViewById8);
        this.f10728P0 = (Button) viewFindViewById8;
        Bundle bundle = this.f6656y;
        if (bundle != null) {
            TextView textView = this.f10722J0;
            if (textView == null) {
                p210v8.i.n("title");
                throw null;
            }
            textView.setText(bundle.getCharSequence("title"));
            TextView textView2 = this.f10723K0;
            if (textView2 == null) {
                p210v8.i.n("subtitle");
                throw null;
            }
            CharSequence charSequence = bundle.getCharSequence("subtitle");
            if (charSequence == null || L9.n.D(charSequence)) {
                textView2.setText((CharSequence) null);
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
            TextView textView3 = this.f10724L0;
            if (textView3 == null) {
                p210v8.i.n("description");
                throw null;
            }
            CharSequence charSequence2 = bundle.getCharSequence("description");
            if (charSequence2 == null || L9.n.D(charSequence2)) {
                textView3.setText((CharSequence) null);
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(charSequence2);
            }
            Button button = this.f10728P0;
            if (button == null) {
                p210v8.i.n("cancelButton");
                throw null;
            }
            button.setText(bundle.getCharSequence("negative"));
            TextView textView4 = this.f10727O0;
            if (textView4 == null) {
                p210v8.i.n("iconTextView");
                throw null;
            }
            textView4.setText(bundle.getCharSequence("prompt"));
        }
        Button button2 = this.f10728P0;
        if (button2 == null) {
            p210v8.i.n("cancelButton");
            throw null;
        }
        button2.setOnClickListener(new e(this));
        cVar.setOnShowListener(new g(this, view, bottomSheetBehaviorB));
        return cVar;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p210v8.i.f(dialogInterface, "dialog");
        R7.a aVar = this.U0;
        if (aVar != null) {
            b.g(aVar);
        }
        J j = this.f10729Q0;
        J7.h hVar = null;
        if (j == null) {
            p210v8.i.n("cancellationSignal");
            throw null;
        }
        j.f();
        Bundle bundle = this.f6656y;
        if (bundle != null) {
            WeakReference weakReference = (WeakReference) b.f10711v.get(Integer.valueOf(bundle.getInt("req_id")));
            if (weakReference != null) {
                hVar = (J7.h) weakReference.get();
            }
        }
        if (hVar != null) {
            ((U7.b) hVar).a(new BiometricAuthenticationCancelledException());
        }
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p210v8.i.f(dialogInterface, "dialog");
        R7.a aVar = this.U0;
        if (aVar != null) {
            b.g(aVar);
        }
        super.onDismiss(dialogInterface);
    }

    public final RotateAnimation r0(boolean z6) {
        RotateAnimation rotateAnimation = new RotateAnimation(z6 ? 0.0f : 360.0f, z6 ? 360.0f : 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(this.f10732T0);
        rotateAnimation.setFillAfter(true);
        return rotateAnimation;
    }

    public final void s0(boolean z6) {
        AnimationSet animationSetQ0 = q0();
        boolean z10 = !z6;
        animationSetQ0.addAnimation(r0(z10));
        AlphaAnimation alphaAnimation = new AlphaAnimation(!z6 ? 1.0f : 0.0f, !z6 ? 0.0f : 1.0f);
        alphaAnimation.setDuration(this.f10732T0);
        alphaAnimation.setFillAfter(true);
        animationSetQ0.addAnimation(alphaAnimation);
        ImageView imageView = this.f10725M0;
        if (imageView == null) {
            p210v8.i.n("iconImageView");
            throw null;
        }
        imageView.startAnimation(animationSetQ0);
        AnimationSet animationSetQ1 = q0();
        animationSetQ1.addAnimation(r0(z10));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(z6 ? 1.0f : 0.0f, z6 ? 0.0f : 1.0f);
        alphaAnimation2.setDuration(this.f10732T0);
        alphaAnimation2.setFillAfter(true);
        animationSetQ1.addAnimation(alphaAnimation2);
        ImageView imageView2 = this.f10726N0;
        if (imageView2 == null) {
            p210v8.i.n("errorIconImageView");
            throw null;
        }
        imageView2.startAnimation(animationSetQ1);
        if (!z6) {
            ImageView imageView3 = this.f10726N0;
            if (imageView3 == null) {
                p210v8.i.n("errorIconImageView");
                throw null;
            }
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = this.f10726N0;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        } else {
            p210v8.i.n("errorIconImageView");
            throw null;
        }
    }
}
