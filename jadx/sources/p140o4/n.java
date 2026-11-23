package p140o4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final Bundle a;

    public n(Context context) {
        i.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static boolean g(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String i(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String strF = f(str);
        return "1".equals(strF) || Boolean.parseBoolean(strF);
    }

    public Integer b(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strF));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + i(str) + "(" + strF + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return new JSONArray(strF);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + i(str) + ": " + strF + ", falling back to default");
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String strF = f(str2);
        if (!TextUtils.isEmpty(strF)) {
            return strF;
        }
        String strF2 = f(str2.concat("_loc_key"));
        if (!TextUtils.isEmpty(strF2)) {
            int identifier = resources.getIdentifier(strF2, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", i(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            JSONArray jSONArrayC = c(str2.concat("_loc_args"));
            if (jSONArrayC == null) {
                strArr = null;
            } else {
                int length = jSONArrayC.length();
                strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    strArr[i10] = jSONArrayC.optString(i10);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e10) {
                Log.w("NotificationParams", "Missing format argument for " + i(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            }
        }
        return null;
    }

    public Boolean e() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public String f(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle h() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public n(Bundle bundle) {
        this.a = new Bundle(bundle);
    }
}
