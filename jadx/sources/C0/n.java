package C0;

import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
