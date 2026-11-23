package p237y7;

import A1.l;
import C4.a;
import P2.g;
import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import o1.c;
import p199u7.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public final AdFormat I(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return AdFormat.INTERSTITIAL;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? AdFormat.BANNER : AdFormat.BANNER;
        }
        return AdFormat.REWARDED;
    }

    @Override // C4.a
    public final void x(Context context, String str, d dVar) {
        QueryInfo.generate(context, I(dVar), new AdRequest.Builder().build(), new a());
    }

    @Override // C4.a
    public final void y(Context context, d dVar, l lVar, c cVar) {
        g gVar;
        cVar.f13624u = "Operation Not supported: GMA v2000 - SCAR signal retrieval without a placementId not relevant.";
        synchronized (lVar) {
            int i10 = lVar.f122s - 1;
            lVar.f122s = i10;
            if (i10 <= 0 && (gVar = (g) lVar.f123t) != null) {
                gVar.run();
            }
        }
    }
}
