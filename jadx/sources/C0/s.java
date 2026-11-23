package C0;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f884c;

    public s(Preference preference) {
        this.f884c = preference.getClass().getName();
        this.a = preference.f6824W;
        this.f883b = preference.f6825X;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.f883b == sVar.f883b && TextUtils.equals(this.f884c, sVar.f884c);
    }

    public final int hashCode() {
        return this.f884c.hashCode() + ((((527 + this.a) * 31) + this.f883b) * 31);
    }
}
