package N6;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class j extends DataSetObserver {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.e();
    }
}
