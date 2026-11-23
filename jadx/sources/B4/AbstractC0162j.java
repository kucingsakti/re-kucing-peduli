package B4;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: B4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0162j {
    public static final String a = E0.a.l(new StringBuilder(), File.separator, "agentweb-cache");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f691b = false;

    public static String a(Context context) {
        return context.getCacheDir().getAbsolutePath() + a;
    }
}
