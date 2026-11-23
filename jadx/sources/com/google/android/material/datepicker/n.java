package com.google.android.material.datepicker;

import E4.L;
import U.C0;
import U.D0;
import U.E0;
import U.H;
import U.U;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.kcstream.cing.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p086i8.C;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public final class n<S> extends DialogInterfaceOnCancelListenerC0756o {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final LinkedHashSet f9677J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final LinkedHashSet f9678K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f9679L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public u f9680M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CalendarConstraints f9681N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public m f9682O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f9683P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public CharSequence f9684Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f9685R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f9686S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f9687T0;
    public CharSequence U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f9688V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public CharSequence f9689W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f9690X0;
    public CharSequence Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f9691Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public CharSequence f9692a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f9693b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public CheckableImageButton f9694c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public p170r3.g f9695d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f9696e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public CharSequence f9697f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public CharSequence f9698g1;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f9677J0 = new LinkedHashSet();
        this.f9678K0 = new LinkedHashSet();
    }

    public static int p0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(x.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f9648v;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean q0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4.a.D(R.attr.materialCalendarStyle, context, m.class.getCanonicalName()).data, new int[]{i10});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f6656y;
        }
        this.f9679L0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f9681N0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f9683P0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9684Q0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f9686S0 = bundle.getInt("INPUT_MODE_KEY");
        this.f9687T0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.U0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f9688V0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f9689W0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f9690X0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f9691Z0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f9692a1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f9684Q0;
        if (text == null) {
            text = X().getResources().getText(this.f9683P0);
        }
        this.f9697f1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f9698g1 = text;
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f9685R0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f9685R0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = U.a;
        textView.setAccessibilityLiveRegion(1);
        this.f9694c1 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f9693b1 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f9694c1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f9694c1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, p068ga.l.g(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], p068ga.l.g(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f9694c1.setChecked(this.f9686S0 != 0);
        U.n(this.f9694c1, null);
        CheckableImageButton checkableImageButton2 = this.f9694c1;
        this.f9694c1.setContentDescription(this.f9686S0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f9694c1.setOnClickListener(new L(this, 3));
        o0();
        throw null;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9679L0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.f9681N0;
        b bVar = new b();
        int i10 = b.f9652b;
        int i11 = b.f9652b;
        long j = calendarConstraints.f9636s.f9650x;
        long j10 = calendarConstraints.f9637t.f9650x;
        bVar.a = Long.valueOf(calendarConstraints.f9639v.f9650x);
        m mVar = this.f9682O0;
        Month month = mVar == null ? null : mVar.f9673w0;
        if (month != null) {
            bVar.a = Long.valueOf(month.f9650x);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", calendarConstraints.f9638u);
        Month monthG = Month.g(j);
        Month monthG2 = Month.g(j10);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = bVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthG, monthG2, dateValidator, l4 == null ? null : Month.g(l4.longValue()), calendarConstraints.f9640w));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9683P0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9684Q0);
        bundle.putInt("INPUT_MODE_KEY", this.f9686S0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f9687T0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.U0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9688V0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9689W0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f9690X0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Y0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9691Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9692a1);
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void P() {
        u uVar;
        J7.j d3;
        J7.j d8;
        super.P();
        Window window = l0().getWindow();
        if (this.f9685R0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9695d1);
            if (!this.f9696e1) {
                View viewFindViewById = Y().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListI = C.i(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListI != null ? Integer.valueOf(colorStateListI.getDefaultColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z6 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iF = J7.a.f(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iF);
                }
                D3.b.B(window, false);
                window.getContext();
                int iD = i10 < 27 ? L.a.d(J7.a.f(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z11 = J7.a.m(0) || J7.a.m(numValueOf.intValue());
                p170r3.e eVar = new p170r3.e(window.getDecorView());
                if (i10 >= 30) {
                    E0 e10 = new E0(window.getInsetsController(), eVar);
                    e10.f4780c = window;
                    d3 = e10;
                } else {
                    d3 = i10 >= 26 ? new D0(window, eVar) : new C0(window, eVar);
                }
                d3.F(z11);
                boolean zM = J7.a.m(iF);
                if (J7.a.m(iD) || (iD == 0 && zM)) {
                    z6 = true;
                }
                p170r3.e eVar2 = new p170r3.e(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    E0 e11 = new E0(window.getInsetsController(), eVar2);
                    e11.f4780c = window;
                    d8 = e11;
                } else {
                    d8 = i11 >= 26 ? new D0(window, eVar2) : new C0(window, eVar2);
                }
                d8.E(z6);
                int paddingTop = viewFindViewById.getPaddingTop();
                int i12 = viewFindViewById.getLayoutParams().height;
                E.g gVar = new E.g();
                gVar.f1164s = i12;
                gVar.f1166u = viewFindViewById;
                gVar.f1165t = paddingTop;
                WeakHashMap weakHashMap = U.a;
                H.u(viewFindViewById, gVar);
                this.f9696e1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9695d1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p041e3.a(l0(), rect));
        }
        X();
        int i13 = this.f9679L0;
        if (i13 == 0) {
            o0();
            throw null;
        }
        o0();
        CalendarConstraints calendarConstraints = this.f9681N0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i13);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f9639v);
        mVar.b0(bundle);
        this.f9682O0 = mVar;
        if (this.f9686S0 == 1) {
            uVar = mVar;
            o0();
            CalendarConstraints calendarConstraints2 = this.f9681N0;
            o oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i13);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            oVar.b0(bundle2);
            uVar = oVar;
        }
        uVar = mVar;
        this.f9680M0 = uVar;
        this.f9693b1.setText((this.f9686S0 == 1 && q().getConfiguration().orientation == 2) ? this.f9698g1 : this.f9697f1);
        o0();
        throw null;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void Q() {
        this.f9680M0.f9712t0.clear();
        super.Q();
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final Dialog k0() {
        Context contextX = X();
        X();
        int i10 = this.f9679L0;
        if (i10 == 0) {
            o0();
            throw null;
        }
        Dialog dialog = new Dialog(contextX, i10);
        Context context = dialog.getContext();
        this.f9685R0 = q0(context, android.R.attr.windowFullscreen);
        this.f9695d1 = new p170r3.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, Q2.a.f4028w, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f9695d1.j(context);
        this.f9695d1.l(ColorStateList.valueOf(color));
        p170r3.g gVar = this.f9695d1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = U.a;
        gVar.k(H.i(decorView));
        return dialog;
    }

    public final void o0() {
        if (this.f6656y.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f9677J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f9678K0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.c0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
