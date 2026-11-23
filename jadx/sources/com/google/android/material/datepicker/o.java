package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o<S> extends u {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f9699u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CalendarConstraints f9700v0;

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f6656y;
        }
        this.f9699u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f9700v0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.f9699u0));
        throw null;
    }

    @Override // androidx.fragment.app.b
    public final void O(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9699u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9700v0);
    }
}
