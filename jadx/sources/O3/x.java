package O3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f3589g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3590h = Pattern.quote("/");
    public final y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p082i4.d f3593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fa.e f3594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f3595f;

    public x(Context context, String str, p082i4.d dVar, Fa.e eVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f3591b = context;
        this.f3592c = str;
        this.f3593d = dVar;
        this.f3594e = eVar;
        this.a = new y(0);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f3589g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z6) {
        String str;
        p082i4.d dVar = this.f3593d;
        String str2 = null;
        if (z6) {
            try {
                str = ((p082i4.a) B.a(((p082i4.c) dVar).e())).a;
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e10);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) B.a(((p082i4.c) dVar).d());
        } catch (Exception e11) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e11);
        }
        return new w(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f3595f;
        if (cVar != null && (cVar.f3519b != null || !this.f3594e.u())) {
            return this.f3595f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.f3591b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f3594e.u()) {
            w wVarB = b(false);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (wVarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.a, string)) {
                this.f3595f = new c(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.a, wVarB.f3588b);
            } else {
                this.f3595f = new c(a(sharedPreferences, wVarB.a), wVarB.a, wVarB.f3588b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f3595f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f3595f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f3595f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f3595f;
    }

    public final String d() {
        String str;
        y yVar = this.a;
        Context context = this.f3591b;
        synchronized (yVar) {
            try {
                if (yVar.f3597t == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yVar.f3597t = installerPackageName;
                }
                str = "".equals(yVar.f3597t) ? null : yVar.f3597t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
