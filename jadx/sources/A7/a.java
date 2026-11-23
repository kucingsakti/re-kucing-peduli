package A7;

import O3.y;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public y a;

    public final AdRequest a() {
        return c().build();
    }

    public final AdRequest b(String str) {
        return c().setAdString(str).build();
    }

    public final AdRequest.Builder c() {
        AdRequest.Builder builder = new AdRequest.Builder();
        y yVar = this.a;
        AdRequest.Builder requestAgent = builder.setRequestAgent(yVar.f3597t);
        yVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        return requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
    }
}
