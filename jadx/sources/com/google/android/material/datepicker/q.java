package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kcstream.cing.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class q extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9701d = x.c(null).getMaximum(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9702e = (x.c(null).getMaximum(7) + x.c(null).getMaximum(5)) - 1;
    public final Month a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f9703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarConstraints f9704c;

    public q(Month month, CalendarConstraints calendarConstraints) {
        this.a = month;
        this.f9704c = calendarConstraints;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f9704c.f9640w;
        Month month = this.a;
        Calendar calendar = month.f9645s;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + month.f9648v : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = x.a(this.a.f9645s);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.f9649w) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f9702e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.a.f9648v;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f9703b == null) {
            this.f9703b = new d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i10 - a();
        if (iA >= 0) {
            Month month = this.a;
            if (iA >= month.f9649w) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i10) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        x.b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
