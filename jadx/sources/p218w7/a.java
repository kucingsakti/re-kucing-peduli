package p218w7;

import android.content.Context;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import java.util.concurrent.ConcurrentHashMap;
import p102k7.e;
import p122m7.d;
import p199u7.c;
import p229x7.b;
import p229x7.h;
import p229x7.i;
import p229x7.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f15652e;

    @Override // com.unity3d.scar.adapter.common.d
    public final void a(Context context, c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        p229x7.e eVar = new p229x7.e(context, cVar, (QueryInfo) ((ConcurrentHashMap) this.f15652e.f12743s).get(cVar.a), this.f10427d);
        eVar.f15778d = new h();
        C4.a.E(new d(eVar, 9));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void b(Context context, c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        i iVar = new i(context, cVar, (QueryInfo) ((ConcurrentHashMap) this.f15652e.f12743s).get(cVar.a), this.f10427d);
        iVar.f15778d = new m();
        C4.a.E(new d(iVar, 10));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void c(Context context, BannerView bannerView, c cVar, int i10, int i11, ScarBannerAdHandler scarBannerAdHandler) {
        C4.a.E(new d(new b(context, (QueryInfo) ((ConcurrentHashMap) this.f15652e.f12743s).get(cVar.a), bannerView, cVar, i10, i11, this.f10427d), 11));
    }
}
