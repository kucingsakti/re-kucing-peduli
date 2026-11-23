package U5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final a create(Context context, JSONObject jSONObject) {
        i.f(context, "context");
        i.f(jSONObject, "fcmPayload");
        g gVar = new g(context, jSONObject);
        return new a(context, openBrowserIntent(gVar.getUri()), gVar.getShouldOpenApp());
    }
}
