package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f9705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f9706t;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f9706t = tVar;
        this.f9705s = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f9705s;
        q qVarA = materialCalendarGridView.a();
        if (i10 < qVarA.a() || i10 > qVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((DateValidatorPointForward) this.f9706t.f9710e.a.f9672v0.f9638u).f9643s) {
            throw null;
        }
    }
}
