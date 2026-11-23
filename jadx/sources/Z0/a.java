package Z0;

import N6.l;
import N6.n;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final DataSetObservable a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f5828b;

    public abstract void a(l lVar, int i10, Object obj);

    public abstract int c();

    public abstract void d();

    public abstract n g(l lVar, int i10);

    public abstract boolean h(View view, Object obj);

    public void i() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f5828b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.notifyChanged();
    }

    public void j(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f5828b = dataSetObserver;
        }
    }

    public void p(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public void b() {
    }

    public void f() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void o() {
    }

    public void e(int i10) {
    }
}
