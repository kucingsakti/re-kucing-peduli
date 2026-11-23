package U5;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final Context context;
    private final JSONObject fcmPayload;

    public g(Context context, JSONObject jSONObject) {
        i.f(context, "context");
        i.f(jSONObject, "fcmPayload");
        this.context = context;
        this.fcmPayload = jSONObject;
    }

    public final boolean getShouldOpenApp() {
        return f.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        f fVar = f.INSTANCE;
        if (!fVar.getShouldOpenActivity(this.context) || fVar.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String strOptString = jSONObject.optString("u");
            if (!i.a(strOptString, "")) {
                i.e(strOptString, "url");
                int length = strOptString.length() - 1;
                int i10 = 0;
                boolean z6 = false;
                while (i10 <= length) {
                    boolean z10 = i.h(strOptString.charAt(!z6 ? i10 : length), 32) <= 0;
                    if (z6) {
                        if (!z10) {
                            break;
                        }
                        length--;
                    } else if (z10) {
                        i10++;
                    } else {
                        z6 = true;
                    }
                }
                return Uri.parse(strOptString.subSequence(i10, length + 1).toString());
            }
        }
        return null;
    }
}
