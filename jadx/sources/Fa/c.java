package Fa;

import android.view.View;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnLongClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ga.c f1657s;

    public c(int i10, Ga.c cVar) {
        this.f1657s = cVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        i.b(view, "v");
        this.f1657s.c();
        throw null;
    }
}
