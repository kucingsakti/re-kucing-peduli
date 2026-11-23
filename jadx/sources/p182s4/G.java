package p182s4;

import D3.g;
import P0.d;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.Iterator;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class G {
    public static final G a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14614b;

    static {
        p024c4.d dVar = new p024c4.d();
        dVar.a(F.class, C0770g.a);
        dVar.a(N.class, C0771h.a);
        dVar.a(C0773j.class, C0768e.a);
        dVar.a(C0765b.class, C0767d.a);
        dVar.a(C0764a.class, C0766c.a);
        dVar.a(C0781s.class, C0769f.a);
        dVar.f7527d = true;
        f14614b = new d(dVar, 22);
    }

    public static C0765b a(g gVar) {
        Object next;
        String strA;
        gVar.a();
        Context context = gVar.a;
        i.e(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f1050c.f1063b;
        i.e(str, "firebaseApp.options.applicationId");
        i.e(Build.MODEL, "MODEL");
        i.e(Build.VERSION.RELEASE, "RELEASE");
        i.e(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        i.e(Build.MANUFACTURER, "MANUFACTURER");
        gVar.a();
        int iMyPid = Process.myPid();
        Iterator it = y.a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0781s) next).f14714b != iMyPid);
        C0781s c0781s = (C0781s) next;
        if (c0781s == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                strA = Process.myProcessName();
                i.e(strA, "myProcessName()");
            } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = ProcessUtils.a()) == null) {
                strA = "";
            }
            c0781s = new C0781s(iMyPid, 0, strA, false);
        }
        gVar.a();
        return new C0765b(str, new C0764a(packageName, str2, strValueOf, c0781s, y.a(context)));
    }
}
