package C7;

import A1.l;
import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import o1.c;
import p199u7.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A7.a f948e;

    public final AdFormat I(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return AdFormat.INTERSTITIAL;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? AdFormat.UNKNOWN : AdFormat.BANNER;
        }
        return AdFormat.REWARDED;
    }

    @Override // C4.a
    public final void x(Context context, String str, d dVar) {
        QueryInfo.generate(context, I(dVar), this.f948e.a(), new a());
    }

    @Override // C4.a
    public final void y(Context context, d dVar, l lVar, c cVar) {
        String str;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            str = "gmaScarBiddingInterstitialSignal";
        } else if (iOrdinal != 1) {
            str = iOrdinal != 2 ? "" : "gmaScarBiddingBannerSignal";
        } else {
            str = "gmaScarBiddingRewardedSignal";
        }
        x(context, str, dVar);
    }
}
