package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f9709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f9710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9711f;

    public t(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, h hVar) {
        Month month = calendarConstraints.f9636s;
        Month month2 = calendarConstraints.f9639v;
        if (month.f9645s.compareTo(month2.f9645s) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.f9645s.compareTo(calendarConstraints.f9637t.f9645s) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f9711f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * q.f9701d) + (n.q0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f9709d = calendarConstraints;
        this.f9710e = hVar;
        l(true);
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f9709d.f9642y;
    }

    @Override // androidx.recyclerview.widget.s
    public final long b(int i10) {
        Calendar calendarA = x.a(this.f9709d.f9636s.f9645s);
        calendarA.add(2, i10);
        return new Month(calendarA).f9645s.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        s sVar = (s) aVar;
        CalendarConstraints calendarConstraints = this.f9709d;
        Calendar calendarA = x.a(calendarConstraints.f9636s.f9645s);
        calendarA.add(2, i10);
        Month month = new Month(calendarA);
        sVar.f9707M.setText(month.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f9708N.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().a)) {
            new q(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!n.q0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new androidx.recyclerview.widget.x(-1, this.f9711f));
        return new s(linearLayout, true);
    }
}
