package P3;

import android.util.Log;
import com.rollbar.notifier.sender.SyncSender;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f3877b = Charset.forName(SyncSender.UTF_8);
    public final T3.c a;

    public g(T3.c cVar) {
        this.a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(m.a(string));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(m.a.s(list.get(i10))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Map c(String str, boolean z6) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        T3.c cVar = this.a;
        File fileB = z6 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        if (fileB.exists()) {
            ?? length = fileB.length();
            if (length != 0) {
                ?? r10 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            HashMap mapA = a(O3.g.j(fileInputStream));
                            O3.g.c(fileInputStream);
                            return mapA;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            f(fileB);
                            O3.g.c(fileInputStream);
                            return Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r10 = length;
                        O3.g.c(r10);
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th2) {
                    th = th2;
                    O3.g.c(r10);
                    throw th;
                }
            }
        }
        f(fileB);
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileB = this.a.b(str, "user-data");
        ?? r10 = 0;
        if (fileB.exists()) {
            ?? r11 = (fileB.length() > 0L ? 1 : (fileB.length() == 0L ? 0 : -1));
            try {
                if (r11 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            JSONObject jSONObject = new JSONObject(O3.g.j(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            O3.g.c(fileInputStream);
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileB);
                            O3.g.c(fileInputStream);
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        O3.g.c(r10);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = r11;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        f(fileB);
        return null;
    }

    public final void g(String str, Map map, boolean z6) throws Throwable {
        T3.c cVar = this.a;
        File fileB = z6 ? cVar.b(str, "internal-keys") : cVar.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f3877b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    O3.g.c(bufferedWriter2);
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileB);
                    O3.g.c(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    O3.g.c(bufferedWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void h(String str, List list) throws Throwable {
        File fileB = this.a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            f(fileB);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strE = e(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f3877b));
                try {
                    bufferedWriter2.write(strE);
                    bufferedWriter2.flush();
                    O3.g.c(bufferedWriter2);
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(fileB);
                    O3.g.c(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    O3.g.c(bufferedWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File fileB = this.a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                f fVar = new f();
                fVar.put("userId", str2);
                String string = fVar.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f3877b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    O3.g.c(bufferedWriter2);
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    O3.g.c(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    O3.g.c(bufferedWriter);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
