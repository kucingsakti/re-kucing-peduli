package p140o4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13786d = TimeUnit.DAYS.toMillis(7);
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13788c;

    public s(String str, String str2, long j) {
        this.a = str;
        this.f13787b = str2;
        this.f13788c = j;
    }

    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static s b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new s(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new s(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}
