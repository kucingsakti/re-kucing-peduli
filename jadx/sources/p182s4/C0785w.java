package p182s4;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import com.google.android.gms.common.util.ProcessUtils;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: renamed from: s4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0785w extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0785w f14720s = new C0785w(1);

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        String strA;
        CorruptionException corruptionException = (CorruptionException) obj;
        i.f(corruptionException, "ex");
        StringBuilder sb = new StringBuilder("CorruptionException in sessions DataStore in ");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            strA = Process.myProcessName();
            i.e(strA, "myProcessName()");
        } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = ProcessUtils.a()) == null) {
            strA = "";
        }
        sb.append(strA);
        sb.append('.');
        Log.w("FirebaseSessionsRepo", sb.toString(), corruptionException);
        return new p070h0.b(true);
    }
}
