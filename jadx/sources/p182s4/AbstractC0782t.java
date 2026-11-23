package p182s4;

import L9.a;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.google.android.gms.common.util.ProcessUtils;
import p210v8.i;

/* JADX INFO: renamed from: s4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0782t {
    public static final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14717b;

    static {
        String strA;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            strA = Process.myProcessName();
            i.e(strA, "myProcessName()");
        } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = ProcessUtils.a()) == null) {
            strA = "";
        }
        byte[] bytes = strA.getBytes(a.a);
        i.e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        a = E0.a.i("firebase_session_", strEncodeToString, "_data");
        f14717b = E0.a.i("firebase_session_", strEncodeToString, "_settings");
    }
}
