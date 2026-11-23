package p061g1;

import android.content.Context;
import java.io.File;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final File a(Context context) {
        i.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        i.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
