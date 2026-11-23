package J4;

import A1.r;
import E4.C0187a;
import O3.C0343a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p188t1.G;
import p210v8.u;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ4/d;", "LX2/i;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends X2.i {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public r f2407J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final ArrayList f2408K0 = new ArrayList();

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Ca.c f2409L0;

    public static final void o0(d dVar, Download download) {
        ArrayList arrayList = dVar.f2408K0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            p210v8.i.e(obj, "get(...)");
            DownloadInfo downloadInfo = (DownloadInfo) download;
            if (((a) obj).a == downloadInfo.f10360s) {
                int iOrdinal = downloadInfo.f10347B.ordinal();
                if (iOrdinal == 4) {
                    za.c cVar = Ha.a.a;
                    Object[] objArr = {String.valueOf(i10)};
                    cVar.getClass();
                    za.c.h(objArr);
                } else if (iOrdinal == 5) {
                    za.c cVar2 = Ha.a.a;
                    Object[] objArr2 = {String.valueOf(i10)};
                    cVar2.getClass();
                    za.c.h(objArr2);
                    arrayList.remove(i10);
                    Ca.c cVar3 = dVar.f2409L0;
                    if (cVar3 != null && !cVar3.f1031i.isEmpty()) {
                        cVar3.f1031i.remove(i10);
                        cVar3.f1026d = cVar3.f1031i.size();
                        cVar3.a.e(i10, 1);
                    }
                } else if (iOrdinal != 8) {
                    za.c cVar4 = Ha.a.a;
                    Object[] objArr3 = {String.valueOf(i10)};
                    cVar4.getClass();
                    za.c.h(objArr3);
                    Ca.c cVar5 = dVar.f2409L0;
                    if (cVar5 != null) {
                        cVar5.f1031i.set(i10, download);
                        cVar5.f1026d = cVar5.f1031i.size();
                        cVar5.a.c(i10, 1, null);
                    }
                } else {
                    za.c cVar6 = Ha.a.a;
                    Object[] objArr4 = {String.valueOf(i10)};
                    cVar6.getClass();
                    za.c.h(objArr4);
                    arrayList.remove(i10);
                    Ca.c cVar7 = dVar.f2409L0;
                    if (cVar7 != null && !cVar7.f1031i.isEmpty()) {
                        cVar7.f1031i.remove(i10);
                        cVar7.f1026d = cVar7.f1031i.size();
                        cVar7.a.e(i10, 1);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p210v8.i.f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.activity_downloadmanager, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.rv_download);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rv_download)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        this.f2407J0 = new r(relativeLayout, recyclerView);
        p210v8.i.e(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // androidx.fragment.app.b
    public final void L() {
        this.f6634a0 = true;
        C0343a c0343aI = D3.b.i(X());
        c cVar = new c(this, 0);
        synchronized (c0343aI.a) {
            ((p163q7.i) c0343aI.f3512d).d(new p112l7.b(c0343aI, cVar, 1));
        }
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.f6634a0 = true;
        C0343a c0343aI = D3.b.i(X());
        List listC = p086i8.l.C(h7.f.DOWNLOADING, h7.f.ADDED, h7.f.PAUSED, h7.f.QUEUED);
        C0187a c0187a = new C0187a(this, 6);
        synchronized (c0343aI.a) {
            ((p163q7.i) c0343aI.f3512d).d(new A0.j(c0343aI, listC, c0187a, 10));
        }
        c0343aI.a(new c(this, 0));
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        p210v8.i.f(view, "view");
        r rVar = this.f2407J0;
        if (rVar == null) {
            p210v8.i.n("binding");
            throw null;
        }
        G g8 = new G(new Ca.c(new ArrayList()));
        v vVar = u.a;
        g8.x(vVar.b(DownloadInfo.class), vVar.b(b.class));
        RecyclerView recyclerView = (RecyclerView) rVar.f167t;
        this.f2409L0 = g8.r(recyclerView);
        recyclerView.setItemAnimator(null);
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final int j0() {
        return R.style.BaseBottomSheetDialog;
    }
}
