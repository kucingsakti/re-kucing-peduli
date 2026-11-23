package p093j5;

import android.content.Context;
import android.os.Build;
import com.onesignal.debug.internal.logging.b;
import java.io.File;
import p210v8.i;
import s8.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] fileArrListFiles;
        i.f(context, "context");
        try {
            File file = Build.VERSION.SDK_INT >= 24 ? new File(context.getDataDir(), "shared_prefs") : new File(context.getFilesDir().getParentFile(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    i.e(file3, "prefsFile");
                    if (context.getSharedPreferences(h.C(file3), 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            b.log(p131n5.b.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
