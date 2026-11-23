package com.google.android.material.datepicker;

import J0.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ int f9659F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ m f9660G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, int i10, int i11) {
        super(i10);
        this.f9660G = mVar;
        this.f9659F = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final void G0(RecyclerView recyclerView, int i10) {
        v vVar = new v(recyclerView.getContext());
        vVar.a = i10;
        H0(vVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(D d3, int[] iArr) {
        int i10 = this.f9659F;
        m mVar = this.f9660G;
        if (i10 == 0) {
            iArr[0] = mVar.f9666A0.getWidth();
            iArr[1] = mVar.f9666A0.getWidth();
        } else {
            iArr[0] = mVar.f9666A0.getHeight();
            iArr[1] = mVar.f9666A0.getHeight();
        }
    }
}
