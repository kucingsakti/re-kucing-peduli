package p140o4;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import com.unity3d.services.core.device.reader.a;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !a.z(resources.getDrawable(i10, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
