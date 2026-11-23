package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.recyclerview.widget.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f9714d;

    public z(m mVar) {
        this.f9714d = mVar;
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f9714d.f9672v0.f9641x;
    }

    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        m mVar = this.f9714d;
        int i11 = mVar.f9672v0.f9636s.f9647u + i10;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((y) aVar).f9713M;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(x.b().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        d dVar = mVar.f9675y0;
        if (x.b().get(1) == i11) {
            c cVar = dVar.f9653b;
        } else {
            c cVar2 = dVar.a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        return new y((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
