package F5;

import J.f;
import android.content.Context;
import com.google.android.gms.location.LocationListener;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    public final boolean hasGMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasHMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasLocationPermission(Context context) {
        i.f(context, "context");
        return f.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || f.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
