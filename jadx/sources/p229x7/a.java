package p229x7;

import Q3.u0;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import p199u7.b;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QueryInfo f15777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f15778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.c f15779e;

    public a(Context context, c cVar, QueryInfo queryInfo, com.unity3d.scar.adapter.common.c cVar2) {
        this.a = context;
        this.f15776b = cVar;
        this.f15777c = queryInfo;
        this.f15779e = cVar2;
    }

    public final void b(b bVar) {
        QueryInfo queryInfo = this.f15777c;
        c cVar = this.f15776b;
        if (queryInfo == null) {
            String strH = E0.a.h("Missing queryInfoMetadata for ad ", cVar.a);
            this.f15779e.handleError(new com.unity3d.scar.adapter.common.a(com.unity3d.scar.adapter.common.b.f10399G, strH, cVar.a, cVar.f15349b, strH));
        } else {
            AdRequest adRequestBuild = new AdRequest.Builder().setAdInfo(new AdInfo(this.f15777c, cVar.f15351d)).build();
            if (bVar != null) {
                this.f15778d.getClass();
            }
            c(adRequestBuild);
        }
    }

    public abstract void c(AdRequest adRequest);
}
