package p082i4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p092j4.a;
import p170r3.e;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12281b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f12282c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i f12283d;
    public final e a;

    public i(e eVar) {
        this.a = eVar;
    }

    public final boolean a(a aVar) {
        if (TextUtils.isEmpty(aVar.f12499c)) {
            return true;
        }
        long j = aVar.f12502f + aVar.f12501e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f12281b;
    }
}
