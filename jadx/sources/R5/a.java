package R5;

import Q5.b;
import U5.c;
import android.content.Context;
import android.os.Bundle;
import com.onesignal.common.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final C0002a Companion = new C0002a(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final p110l5.a _time;
    private final X5.b _workManager;

    /* JADX INFO: renamed from: R5.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        public /* synthetic */ C0002a(e eVar) {
            this();
        }

        private C0002a() {
        }
    }

    public a(X5.b bVar, p110l5.a aVar) {
        i.f(bVar, "_workManager");
        i.f(aVar, "_time");
        this._workManager = bVar;
        this._time = aVar;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String string;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject = jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                    i.e(jSONObject, "{\n                    cu…      )\n                }");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        string = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        string = string2;
                    }
                    jSONObject3.put("id", string);
                    jSONObject3.put("text", string2);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", DEFAULT_ACTION);
                if (!jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject2.put(PUSH_ADDITIONAL_DATA_KEY, jSONObject);
                }
                bundle.putString(c.PAYLOAD_OS_ROOT_CUSTOM, jSONObject2.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // Q5.b
    public Q5.a processBundleFromReceiver(Context context, Bundle bundle) {
        i.f(context, "context");
        i.f(bundle, "bundle");
        Q5.a aVar = new Q5.a();
        c cVar = c.INSTANCE;
        if (!cVar.isOneSignalBundle(bundle)) {
            return aVar;
        }
        aVar.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject jSONObjectBundleAsJSONObject = f.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z6 = bundle.getBoolean("is_restoring", false);
        String string = bundle.getString("pri", "0");
        i.e(string, "bundle.getString(\"pri\", \"0\")");
        boolean z10 = Integer.parseInt(string) > 9;
        String oSNotificationIdFromJson = cVar.getOSNotificationIdFromJson(jSONObjectBundleAsJSONObject);
        int i10 = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        X5.b bVar = this._workManager;
        i.c(oSNotificationIdFromJson);
        aVar.setWorkManagerProcessing(bVar.beginEnqueueingWork(context, oSNotificationIdFromJson, i10, jSONObjectBundleAsJSONObject, currentTimeMillis, z6, z10));
        return aVar;
    }
}
