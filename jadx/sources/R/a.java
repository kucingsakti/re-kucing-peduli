package R;

import A1.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.material.datepicker.m;
import java.util.ArrayList;
import java.util.List;
import p022c1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4414u;

    public /* synthetic */ a(int i10, int i11, Object obj) {
        this.f4412s = i11;
        this.f4414u = obj;
        this.f4413t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar;
        w wVar2;
        switch (this.f4412s) {
            case 0:
                K.b bVar = (K.b) ((r) this.f4414u).f167t;
                if (bVar != null) {
                    bVar.i(this.f4413t);
                }
                break;
            case 1:
                l lVar = (l) this.f4414u;
                if (!lVar.P && (wVar = lVar.f6928F) != null) {
                    wVar.G0(lVar, this.f4413t);
                }
                break;
            case 2:
                RecyclerView recyclerView = ((m) this.f4414u).f9666A0;
                if (!recyclerView.P && (wVar2 = recyclerView.f6928F) != null) {
                    wVar2.G0(recyclerView, this.f4413t);
                }
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f4414u;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f4413t == 1) {
                    while (i10 < size) {
                        ((p106l0.e) arrayList.get(i10)).b();
                        i10++;
                    }
                } else {
                    while (i10 < size) {
                        ((p106l0.e) arrayList.get(i10)).a();
                        i10++;
                    }
                }
                break;
            case 4:
                ((p118m3.d) this.f4414u).i(this.f4413t);
                break;
            case 5:
                ((SystemForegroundService) this.f4414u).f7234w.cancel(this.f4413t);
                break;
            default:
                ((zabq) this.f4414u).f(this.f4413t);
                break;
        }
    }

    public a(int i10, l lVar) {
        this.f4412s = 1;
        this.f4413t = i10;
        this.f4414u = lVar;
    }

    public a(List list, int i10, Throwable th) {
        this.f4412s = 3;
        xa.d.d(list, "initCallbacks cannot be null");
        this.f4414u = new ArrayList(list);
        this.f4413t = i10;
    }
}
