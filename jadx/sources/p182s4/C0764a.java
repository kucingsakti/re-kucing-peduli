package p182s4;

import android.os.Build;
import java.util.ArrayList;
import p210v8.i;
import p231y.a;

/* JADX INFO: renamed from: s4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0764a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0781s f14658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f14659e;

    public C0764a(String str, String str2, String str3, C0781s c0781s, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        i.f(str2, "versionName");
        i.f(str3, "appBuildVersion");
        i.f(str4, "deviceManufacturer");
        this.a = str;
        this.f14656b = str2;
        this.f14657c = str3;
        this.f14658d = c0781s;
        this.f14659e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0764a)) {
            return false;
        }
        C0764a c0764a = (C0764a) obj;
        if (!this.a.equals(c0764a.a) || !i.a(this.f14656b, c0764a.f14656b) || !i.a(this.f14657c, c0764a.f14657c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return i.a(str, str) && this.f14658d.equals(c0764a.f14658d) && this.f14659e.equals(c0764a.f14659e);
    }

    public final int hashCode() {
        return this.f14659e.hashCode() + ((this.f14658d.hashCode() + a.a(a.a(a.a(this.a.hashCode() * 31, this.f14656b, 31), this.f14657c, 31), Build.MANUFACTURER, 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.f14656b + ", appBuildVersion=" + this.f14657c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f14658d + ", appProcessDetails=" + this.f14659e + ')';
    }
}
