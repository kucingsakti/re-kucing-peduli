package p040e1;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f10693c = new HashSet();
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10694b;

    public c(String str, String str2) {
        this.a = str;
        this.f10694b = str2;
        f10693c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.a;
        String str = this.f10694b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
