package P3;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3872b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3873c;

    public d(int i10) {
        this.f3873c = i10;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean b(String str) {
        boolean zEquals;
        synchronized (this) {
            int i10 = this.f3873c;
            String strSubstring = 36 > i10 ? "com.crashlytics.version-control-info".substring(0, i10) : "com.crashlytics.version-control-info";
            if (this.a.size() >= this.f3872b && !this.a.containsKey(strSubstring)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f3872b, null);
                return false;
            }
            int i11 = this.f3873c;
            String strTrim = str.trim();
            if (strTrim.length() > i11) {
                strTrim = strTrim.substring(0, i11);
            }
            String str2 = (String) this.a.get(strSubstring);
            if (str2 == null) {
                zEquals = strTrim == null;
            } else {
                zEquals = str2.equals(strTrim);
            }
            if (zEquals) {
                return false;
            }
            this.a.put(strSubstring, strTrim);
            return true;
        }
    }

    public final synchronized void c(Map map) {
        String strTrim;
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strTrim2 = str.trim();
                int length = strTrim2.length();
                int i11 = this.f3873c;
                if (length > i11) {
                    strTrim2 = strTrim2.substring(0, i11);
                }
                if (this.a.size() < this.f3872b || this.a.containsKey(strTrim2)) {
                    String str2 = (String) entry.getValue();
                    HashMap map2 = this.a;
                    if (str2 == null) {
                        strTrim = "";
                    } else {
                        int i12 = this.f3873c;
                        strTrim = str2.trim();
                        if (strTrim.length() > i12) {
                            strTrim = strTrim.substring(0, i12);
                        }
                    }
                    map2.put(strTrim2, strTrim);
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f3872b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
