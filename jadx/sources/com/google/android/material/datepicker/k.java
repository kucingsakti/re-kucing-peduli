package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f9663s;

    public k(m mVar) {
        this.f9663s = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m mVar = this.f9663s;
        int i10 = mVar.f9674x0;
        if (i10 == 2) {
            mVar.h0(1);
        } else if (i10 == 1) {
            mVar.h0(2);
        }
    }
}
