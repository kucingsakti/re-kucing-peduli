package E6;

import E.g;
import android.os.Build;
import com.rollbar.api.payload.data.Client;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements I6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1453u = 0;

    public a(g gVar) {
        this.f1451s = gVar.f1164s;
        this.f1452t = (String) gVar.f1166u;
    }

    @Override // I6.a
    public final Object b() {
        HashMap map = new HashMap();
        map.put("phone_model", Build.MODEL);
        map.put("android_version", Build.VERSION.RELEASE);
        String str = this.f1452t;
        map.put("code_version", str);
        int i10 = this.f1451s;
        map.put("version_code", Integer.valueOf(i10));
        map.put("version_name", str);
        Client.Builder builderAddTopLevel = new Client.Builder().addClient(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, map).addTopLevel("code_version", Integer.valueOf(i10)).addTopLevel("name_version", str).addTopLevel("version_code", Integer.valueOf(i10)).addTopLevel("version_name", str).addTopLevel("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        int i11 = this.f1453u;
        if (i11 == 0) {
            builderAddTopLevel.addTopLevel("user_ip", "$remote_ip");
        } else if (i11 == 1) {
            builderAddTopLevel.addTopLevel("user_ip", "$remote_ip_anonymize");
        }
        return builderAddTopLevel.build();
    }
}
