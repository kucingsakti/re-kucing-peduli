package com.google.android.material.datepicker;

import J0.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class j extends A {
    public final /* synthetic */ t a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f9661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f9662c;

    public j(m mVar, t tVar, MaterialButton materialButton) {
        this.f9662c = mVar;
        this.a = tVar;
        this.f9661b = materialButton;
    }

    @Override // J0.A
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f9661b.getText());
        }
    }

    @Override // J0.A
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m mVar = this.f9662c;
        int iT0 = i10 < 0 ? ((LinearLayoutManager) mVar.f9666A0.getLayoutManager()).T0() : ((LinearLayoutManager) mVar.f9666A0.getLayoutManager()).U0();
        CalendarConstraints calendarConstraints = this.a.f9709d;
        Calendar calendarA = x.a(calendarConstraints.f9636s.f9645s);
        calendarA.add(2, iT0);
        mVar.f9673w0 = new Month(calendarA);
        Calendar calendarA2 = x.a(calendarConstraints.f9636s.f9645s);
        calendarA2.add(2, iT0);
        this.f9661b.setText(new Month(calendarA2).h());
    }
}
