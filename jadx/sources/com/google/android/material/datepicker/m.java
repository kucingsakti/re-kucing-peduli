package com.google.android.material.datepicker;

import J0.C0264n;
import U.U;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class m<S> extends u {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public RecyclerView f9666A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f9667B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public View f9668C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public View f9669D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public View f9670E0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f9671u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CalendarConstraints f9672v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Month f9673w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f9674x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public d f9675y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public RecyclerView f9676z0;

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f6656y;
        }
        this.f9671u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f9672v0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f9673w0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f9671u0);
        this.f9675y0 = new d(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f9672v0.f9636s;
        if (n.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = com.kcstream.cing.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.kcstream.cing.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = X().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = q.f9701d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.kcstream.cing.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.kcstream.cing.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.kcstream.cing.R.id.mtrl_calendar_days_of_week);
        U.n(gridView, new p000a0.h(1));
        int i13 = this.f9672v0.f9640w;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new e(i13) : new e()));
        gridView.setNumColumns(month.f9648v);
        gridView.setEnabled(false);
        this.f9666A0 = (RecyclerView) viewInflate.findViewById(com.kcstream.cing.R.id.mtrl_calendar_months);
        this.f9666A0.setLayoutManager(new g(this, i11, i11));
        this.f9666A0.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f9672v0, new h(this));
        this.f9666A0.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.kcstream.cing.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.kcstream.cing.R.id.mtrl_calendar_year_selector_frame);
        this.f9676z0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9676z0.setLayoutManager(new GridLayoutManager(integer));
            this.f9676z0.setAdapter(new z(this));
            this.f9676z0.i(new i(this));
        }
        if (viewInflate.findViewById(com.kcstream.cing.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.kcstream.cing.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            U.n(materialButton, new C0.w(this, 4));
            View viewFindViewById = viewInflate.findViewById(com.kcstream.cing.R.id.month_navigation_previous);
            this.f9667B0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.kcstream.cing.R.id.month_navigation_next);
            this.f9668C0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f9669D0 = viewInflate.findViewById(com.kcstream.cing.R.id.mtrl_calendar_year_selector_frame);
            this.f9670E0 = viewInflate.findViewById(com.kcstream.cing.R.id.mtrl_calendar_day_selector_frame);
            h0(1);
            materialButton.setText(this.f9673w0.h());
            this.f9666A0.j(new j(this, tVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            this.f9668C0.setOnClickListener(new l(this, tVar));
            this.f9667B0.setOnClickListener(new f(this, tVar));
        }
        if (!n.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0264n(1).a(this.f9666A0);
        }
        this.f9666A0.g0(tVar.f9709d.f9636s.i(this.f9673w0));
        U.n(this.f9666A0, new p000a0.h(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.b
    public final void O(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9671u0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9672v0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9673w0);
    }

    public final void g0(Month month) {
        t tVar = (t) this.f9666A0.getAdapter();
        int i10 = tVar.f9709d.f9636s.i(month);
        int i11 = i10 - tVar.f9709d.f9636s.i(this.f9673w0);
        boolean z6 = Math.abs(i11) > 3;
        boolean z10 = i11 > 0;
        this.f9673w0 = month;
        if (z6 && z10) {
            this.f9666A0.g0(i10 - 3);
            this.f9666A0.post(new R.a(i10, 2, this));
        } else if (!z6) {
            this.f9666A0.post(new R.a(i10, 2, this));
        } else {
            this.f9666A0.g0(i10 + 3);
            this.f9666A0.post(new R.a(i10, 2, this));
        }
    }

    public final void h0(int i10) {
        this.f9674x0 = i10;
        if (i10 == 2) {
            this.f9676z0.getLayoutManager().w0(this.f9673w0.f9647u - ((z) this.f9676z0.getAdapter()).f9714d.f9672v0.f9636s.f9647u);
            this.f9669D0.setVisibility(0);
            this.f9670E0.setVisibility(8);
            this.f9667B0.setVisibility(8);
            this.f9668C0.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f9669D0.setVisibility(8);
            this.f9670E0.setVisibility(0);
            this.f9667B0.setVisibility(0);
            this.f9668C0.setVisibility(0);
            g0(this.f9673w0);
        }
    }
}
