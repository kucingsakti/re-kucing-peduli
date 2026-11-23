package X2;

import C0.w;
import U.H;
import U.U;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p078i.F;

/* JADX INFO: loaded from: classes.dex */
public class h extends F {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f5396I = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public FrameLayout f5397A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5398B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5399C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5400D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public g f5401E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f5402F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Y1.c f5403G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final G7.d f5404H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BottomSheetBehavior f5405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FrameLayout f5406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CoordinatorLayout f5407z;

    public h(Context context) {
        this(context, 0);
        this.f5402F = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f5405x == null) {
            h();
        }
        super.cancel();
    }

    public final void h() {
        if (this.f5406y == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f5406y = frameLayout;
            this.f5407z = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f5406y.findViewById(R.id.design_bottom_sheet);
            this.f5397A = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.f5405x = bottomSheetBehaviorB;
            G7.d dVar = this.f5404H;
            ArrayList arrayList = bottomSheetBehaviorB.f9525o0;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            this.f5405x.G(this.f5398B);
            this.f5403G = new Y1.c(this.f5405x, this.f5397A);
        }
    }

    public final FrameLayout i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f5406y.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f5402F) {
            FrameLayout frameLayout = this.f5397A;
            P0.d dVar = new P0.d(this, 10);
            WeakHashMap weakHashMap = U.a;
            H.u(frameLayout, dVar);
        }
        this.f5397A.removeAllViews();
        if (layoutParams == null) {
            this.f5397A.addView(view);
        } else {
            this.f5397A.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new e(this));
        U.n(this.f5397A, new w(this, 2));
        this.f5397A.setOnTouchListener(new f(0));
        return this.f5406y;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z6 = this.f5402F && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f5406y;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z6);
            }
            CoordinatorLayout coordinatorLayout = this.f5407z;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z6);
            }
            D3.b.B(window, !z6);
            g gVar = this.f5401E;
            if (gVar != null) {
                gVar.e(window);
            }
        }
        Y1.c cVar = this.f5403G;
        if (cVar == null) {
            return;
        }
        boolean z10 = this.f5398B;
        View view = (View) cVar.f5672v;
        p109l3.c cVar2 = (p109l3.c) cVar.f5670t;
        if (z10) {
            if (cVar2 != null) {
                cVar2.b((p109l3.b) cVar.f5671u, view, false);
            }
        } else if (cVar2 != null) {
            cVar2.c(view);
        }
    }

    @Override // p078i.F, p031d.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        p109l3.c cVar;
        g gVar = this.f5401E;
        if (gVar != null) {
            gVar.e(null);
        }
        Y1.c cVar2 = this.f5403G;
        if (cVar2 == null || (cVar = (p109l3.c) cVar2.f5670t) == null) {
            return;
        }
        cVar.c((View) cVar2.f5672v);
    }

    @Override // p031d.n, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f5405x;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f9515d0 != 5) {
            return;
        }
        bottomSheetBehavior.I(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z6) {
        Y1.c cVar;
        super.setCancelable(z6);
        if (this.f5398B != z6) {
            this.f5398B = z6;
            BottomSheetBehavior bottomSheetBehavior = this.f5405x;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z6);
            }
            if (getWindow() == null || (cVar = this.f5403G) == null) {
                return;
            }
            boolean z10 = this.f5398B;
            View view = (View) cVar.f5672v;
            p109l3.c cVar2 = (p109l3.c) cVar.f5670t;
            if (z10) {
                if (cVar2 != null) {
                    cVar2.b((p109l3.b) cVar.f5671u, view, false);
                }
            } else if (cVar2 != null) {
                cVar2.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z6) {
        super.setCanceledOnTouchOutside(z6);
        if (z6 && !this.f5398B) {
            this.f5398B = true;
        }
        this.f5399C = z6;
        this.f5400D = true;
    }

    @Override // p078i.F, p031d.n, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(i(null, i10, null));
    }

    @Override // p078i.F, p031d.n, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // p078i.F, p031d.n, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }

    public h(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i10);
        this.f5398B = true;
        this.f5399C = true;
        this.f5404H = new G7.d(this, 1);
        d().g(1);
        this.f5402F = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
