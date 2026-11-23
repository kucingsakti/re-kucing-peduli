package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f9664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f9665t;

    public l(m mVar, t tVar) {
        this.f9665t = mVar;
        this.f9664s = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m mVar = this.f9665t;
        int iT0 = ((LinearLayoutManager) mVar.f9666A0.getLayoutManager()).T0() + 1;
        if (iT0 < mVar.f9666A0.getAdapter().a()) {
            Calendar calendarA = x.a(this.f9664s.f9709d.f9636s.f9645s);
            calendarA.add(2, iT0);
            mVar.g0(new Month(calendarA));
        }
    }
}
