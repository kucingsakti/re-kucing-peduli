package p040e1;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p033d1.d;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f10698d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f10698d = Pattern.compile("\\A\\d+");
    }

    @Override // p040e1.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // p040e1.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfoB;
        boolean zB = super.b();
        if (!zB || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i11 = d.a;
        if (i10 >= 26) {
            packageInfoB = d.a();
        } else {
            try {
                packageInfoB = d.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        if (packageInfoB == null) {
            return false;
        }
        Matcher matcher = this.f10698d.matcher(packageInfoB.versionName);
        return matcher.find() && Integer.parseInt(packageInfoB.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
