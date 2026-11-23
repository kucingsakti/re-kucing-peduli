package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class i extends J0.x {
    public final /* synthetic */ m a;

    public i(m mVar) {
        this.a = mVar;
        x.c(null);
        x.c(null);
    }

    @Override // J0.x
    public final void b(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.a.getClass();
            throw null;
        }
    }
}
