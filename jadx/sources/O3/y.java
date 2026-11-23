package O3;

import A1.C0099h;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonIOException;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y implements com.google.gson.internal.l, p106l0.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3597t;

    public static void a(C0099h c0099h, V3.d dVar) {
        String str = dVar.a;
        if (str != null) {
            c0099h.g("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c0099h.g("X-CRASHLYTICS-API-CLIENT-TYPE", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        c0099h.g("X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.3");
        c0099h.g("Accept", "application/json");
        String str2 = dVar.f5180b;
        if (str2 != null) {
            c0099h.g("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f5181c;
        if (str3 != null) {
            c0099h.g("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.f5182d;
        if (str4 != null) {
            c0099h.g("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.f5183e.c().a;
        if (str5 != null) {
            c0099h.g("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(V3.d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.f5186h);
        map.put("display_version", dVar.f5185g);
        map.put("source", Integer.toString(dVar.f5187i));
        String str = dVar.f5184f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(S3.a aVar) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        int i10 = aVar.f4529c;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            return null;
        }
        String str = aVar.f4528b;
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Failed to parse settings JSON from " + this.f3597t, e10);
            Log.w("FirebaseCrashlytics", "Settings response " + str, null);
            return null;
        }
    }

    @Override // p106l0.k
    public boolean k(CharSequence charSequence, int i10, int i11, p106l0.r rVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f3597t)) {
            return true;
        }
        rVar.f12884c = (rVar.f12884c & 3) | 4;
        return false;
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        switch (this.f3596s) {
            case 3:
                throw new JsonIOException(this.f3597t);
            default:
                throw new JsonIOException(this.f3597t);
        }
    }

    public String toString() {
        switch (this.f3596s) {
            case 1:
                return AbstractC0487g.j(new StringBuilder("<"), this.f3597t, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y(String str, int i10) {
        this.f3596s = i10;
        this.f3597t = str;
    }

    public y(String str, K3.d dVar) {
        this.f3596s = 2;
        if (str != null) {
            this.f3597t = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    @Override // p106l0.k
    public Object getResult() {
        return this;
    }
}
