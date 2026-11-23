package O6;

import android.database.DataSetObserver;
import p.A0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends DataSetObserver {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3602b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.f3602b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ((b) this.f3602b).g();
                break;
            default:
                A0 a10 = (A0) this.f3602b;
                if (a10.f13918R.isShowing()) {
                    a10.a();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.a) {
            case 1:
                ((A0) this.f3602b).dismiss();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
