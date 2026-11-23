package p140o4;

import Fa.e;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f13796d;
    public final SharedPreferences a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f13797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f13798c;

    public v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f13798c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized u a() {
        u uVar;
        String strW = this.f13797b.w();
        Pattern pattern = u.f13793d;
        uVar = null;
        if (!TextUtils.isEmpty(strW)) {
            String[] strArrSplit = strW.split("!", -1);
            if (strArrSplit.length == 2) {
                uVar = new u(strArrSplit[0], strArrSplit[1]);
            }
        }
        return uVar;
    }

    public final synchronized void b() {
        this.f13797b = e.l(this.a, this.f13798c);
    }

    public final synchronized void c(u uVar) {
        this.f13797b.x(uVar.f13795c);
    }
}
