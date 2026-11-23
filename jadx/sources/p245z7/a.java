package p245z7;

import B7.b;
import B7.e;
import B7.h;
import B7.i;
import B7.m;
import android.content.Context;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import p122m7.d;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A7.a f16315e;

    @Override // com.unity3d.scar.adapter.common.d
    public final void a(Context context, c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        e eVar = new e(context, cVar, this.f16315e, this.f10427d);
        eVar.f760d = new h();
        C4.a.E(new d(eVar, 15));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void b(Context context, c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        i iVar = new i(context, cVar, this.f16315e, this.f10427d);
        iVar.f760d = new m();
        C4.a.E(new d(iVar, 16));
    }

    @Override // com.unity3d.scar.adapter.common.d
    public final void c(Context context, BannerView bannerView, c cVar, int i10, int i11, ScarBannerAdHandler scarBannerAdHandler) {
        C4.a.E(new d(new b(context, bannerView, this.f16315e, cVar, i10, i11, this.f10427d), 17));
    }
}
