package Q;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static String a(File file) {
        return Environment.getExternalStorageState(file);
    }
}
