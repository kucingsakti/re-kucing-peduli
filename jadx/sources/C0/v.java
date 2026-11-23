package C0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f896b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f897c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceScreen f901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f903i;
    public r j;

    public v(Context context) {
        this.a = context;
        this.f900f = a(context);
    }

    public static String a(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor b() {
        if (!this.f899e) {
            return d().edit();
        }
        if (this.f898d == null) {
            this.f898d = d().edit();
        }
        return this.f898d;
    }

    public final long c() {
        long j;
        synchronized (this) {
            j = this.f896b;
            this.f896b = 1 + j;
        }
        return j;
    }

    public final SharedPreferences d() {
        if (this.f897c == null) {
            this.f897c = this.a.getSharedPreferences(this.f900f, 0);
        }
        return this.f897c;
    }
}
