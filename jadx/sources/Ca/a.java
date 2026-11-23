package Ca;

import A1.RunnableC0094c;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f1020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ga.c f1021t;

    public a(b bVar, Ga.c cVar) {
        this.f1020s = bVar;
        this.f1021t = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1021t.f7003s.post(new RunnableC0094c(this, 4));
    }
}
