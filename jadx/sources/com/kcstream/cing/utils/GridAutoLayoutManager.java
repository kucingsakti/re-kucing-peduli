package com.kcstream.cing.utils;

import J0.D;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.GridLayoutManager;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kcstream/cing/utils/GridAutoLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GridAutoLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f10279N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f10280O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f10281Q;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.w
    public final void j0(A a, D d3) {
        i.f(d3, AdOperationMetric.INIT_STATE);
        int i10 = this.f7133o;
        int i11 = this.f7134p;
        if (i10 != this.f10281Q) {
            this.P = true;
            this.f10281Q = i10;
        }
        if ((this.f10280O && this.f10279N > 0 && i10 > 0 && i11 > 0) || this.P) {
            v1(Math.max(1, (this.f6897q == 1 ? (i10 - K()) - J() : (i11 - L()) - I()) / this.f10279N));
            this.f10280O = false;
            this.P = false;
        }
        super.j0(a, d3);
    }
}
