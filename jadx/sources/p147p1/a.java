package p147p1;

import android.app.Application;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final String a() {
        String processName = Application.getProcessName();
        i.e(processName, "getProcessName()");
        return processName;
    }
}
