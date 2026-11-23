package p182s4;

import android.os.Build;
import p210v8.i;
import p231y.a;

/* JADX INFO: renamed from: s4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0764a f14660b;

    public C0765b(String str, C0764a c0764a) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        i.f(str, "appId");
        i.f(str2, "deviceModel");
        i.f(str3, "osVersion");
        this.a = str;
        this.f14660b = c0764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0765b)) {
            return false;
        }
        C0765b c0765b = (C0765b) obj;
        if (!i.a(this.a, c0765b.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!i.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return i.a(str2, str2) && this.f14660b.equals(c0765b.f14660b);
    }

    public final int hashCode() {
        return this.f14660b.hashCode() + ((r.LOG_ENVIRONMENT_PROD.hashCode() + a.a((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 47594041) * 31, Build.VERSION.RELEASE, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + r.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f14660b + ')';
    }
}
