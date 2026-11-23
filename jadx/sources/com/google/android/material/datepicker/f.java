package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f9657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f9658t;

    public f(m mVar, t tVar) {
        this.f9658t = mVar;
        this.f9657s = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m mVar = this.f9658t;
        int iU0 = ((LinearLayoutManager) mVar.f9666A0.getLayoutManager()).U0() - 1;
        if (iU0 >= 0) {
            Calendar calendarA = x.a(this.f9657s.f9709d.f9636s.f9645s);
            calendarA.add(2, iU0);
            mVar.g0(new Month(calendarA));
        }
    }
}
