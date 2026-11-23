package B6;

import I.J;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f757u;

    public j(i iVar, int i10) {
        this.f757u = i10;
        p210v8.i.f(iVar, "pb");
        this.f725s = iVar;
    }

    @Override // B6.b
    public final void p() {
        switch (this.f757u) {
            case 0:
                i iVar = (i) this.f725s;
                if (iVar.f751d.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    if (Build.VERSION.SDK_INT < 29) {
                        iVar.f751d.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                        iVar.f752e.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        f();
                    } else if (J.f.a(iVar.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                        f();
                    } else {
                        boolean z6 = J.f.a(iVar.a(), "android.permission.ACCESS_FINE_LOCATION") == 0;
                        boolean z10 = J.f.a(iVar.a(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
                        if (z6 || z10) {
                            i iVar2 = (i) this.f725s;
                            iVar2.getClass();
                            h hVarC = iVar2.c();
                            hVarC.f743u0 = iVar2;
                            hVarC.f744v0 = this;
                            hVarC.f746x0.a("android.permission.ACCESS_BACKGROUND_LOCATION");
                        }
                    }
                }
                f();
                break;
            case 1:
                i iVar3 = (i) this.f725s;
                if (iVar3.f751d.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                    if (Build.VERSION.SDK_INT < 33) {
                        iVar3.f751d.remove("android.permission.BODY_SENSORS_BACKGROUND");
                        iVar3.f752e.add("android.permission.BODY_SENSORS_BACKGROUND");
                        f();
                    } else if (J.f.a(iVar3.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                        f();
                    } else if (J.f.a(iVar3.a(), "android.permission.BODY_SENSORS") == 0) {
                        i iVar4 = (i) this.f725s;
                        iVar4.getClass();
                        h hVarC2 = iVar4.c();
                        hVarC2.f743u0 = iVar4;
                        hVarC2.f744v0 = this;
                        hVarC2.f741D0.a("android.permission.BODY_SENSORS_BACKGROUND");
                    }
                }
                f();
                break;
            case 2:
                i iVar5 = (i) this.f725s;
                if (!iVar5.f751d.contains("android.permission.REQUEST_INSTALL_PACKAGES") || Build.VERSION.SDK_INT < 26 || iVar5.d() < 26) {
                    f();
                } else if (iVar5.a().getPackageManager().canRequestPackageInstalls()) {
                    f();
                } else {
                    f();
                }
                break;
            case 3:
                if (!((i) this.f725s).f751d.contains("android.permission.MANAGE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT < 30) {
                    f();
                } else if (Environment.isExternalStorageManager()) {
                    f();
                } else {
                    f();
                }
                break;
            case 4:
                ArrayList arrayList = new ArrayList();
                i iVar6 = (i) this.f725s;
                for (String str : iVar6.f750c) {
                    if (J.f.a(iVar6.a(), str) == 0) {
                        iVar6.f753f.add(str);
                    } else {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    f();
                } else {
                    iVar6.f(iVar6.f750c, this);
                }
                break;
            case 5:
                i iVar7 = (i) this.f725s;
                if (iVar7.f751d.contains("android.permission.POST_NOTIFICATIONS") && new J(iVar7.a()).a()) {
                    f();
                } else {
                    f();
                }
                break;
            case 6:
                i iVar8 = (i) this.f725s;
                if (!iVar8.f751d.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
                    f();
                } else if (iVar8.d() < 23) {
                    iVar8.f753f.add("android.permission.SYSTEM_ALERT_WINDOW");
                    iVar8.f751d.remove("android.permission.SYSTEM_ALERT_WINDOW");
                    f();
                } else if (Settings.canDrawOverlays(iVar8.a())) {
                    f();
                } else {
                    f();
                }
                break;
            default:
                i iVar9 = (i) this.f725s;
                if (!iVar9.f751d.contains("android.permission.WRITE_SETTINGS")) {
                    f();
                } else if (iVar9.d() < 23) {
                    iVar9.f753f.add("android.permission.WRITE_SETTINGS");
                    iVar9.f751d.remove("android.permission.WRITE_SETTINGS");
                    f();
                } else if (Settings.System.canWrite(iVar9.a())) {
                    f();
                } else {
                    f();
                }
                break;
        }
    }

    @Override // B6.b
    public final void q(List list) {
        switch (this.f757u) {
            case 0:
                i iVar = (i) this.f725s;
                iVar.getClass();
                h hVarC = iVar.c();
                hVarC.f743u0 = iVar;
                hVarC.f744v0 = this;
                hVarC.f746x0.a("android.permission.ACCESS_BACKGROUND_LOCATION");
                break;
            case 1:
                i iVar2 = (i) this.f725s;
                iVar2.getClass();
                h hVarC2 = iVar2.c();
                hVarC2.f743u0 = iVar2;
                hVarC2.f744v0 = this;
                hVarC2.f741D0.a("android.permission.BODY_SENSORS_BACKGROUND");
                break;
            case 2:
                i iVar3 = (i) this.f725s;
                iVar3.getClass();
                h hVarC3 = iVar3.c();
                hVarC3.f743u0 = iVar3;
                hVarC3.f744v0 = this;
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                    intent.setData(Uri.parse("package:" + hVarC3.W().getPackageName()));
                    hVarC3.f739B0.a(intent);
                } else if (hVarC3.g0()) {
                    hVarC3.i0(new f(hVarC3, 0));
                }
                break;
            case 3:
                i iVar4 = (i) this.f725s;
                iVar4.getClass();
                h hVarC4 = iVar4.c();
                hVarC4.f743u0 = iVar4;
                hVarC4.f744v0 = this;
                if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
                    Intent intent2 = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                    intent2.setData(Uri.parse("package:" + hVarC4.W().getPackageName()));
                    if (intent2.resolveActivity(hVarC4.W().getPackageManager()) == null) {
                        intent2 = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                    }
                    hVarC4.f738A0.a(intent2);
                } else if (hVarC4.g0()) {
                    hVarC4.i0(new f(hVarC4, 1));
                }
                break;
            case 4:
                i iVar5 = (i) this.f725s;
                HashSet hashSet = new HashSet(iVar5.f753f);
                hashSet.addAll(list);
                if (!hashSet.isEmpty()) {
                    iVar5.f(hashSet, this);
                } else {
                    f();
                }
                break;
            case 5:
                i iVar6 = (i) this.f725s;
                iVar6.getClass();
                h hVarC5 = iVar6.c();
                hVarC5.f743u0 = iVar6;
                hVarC5.f744v0 = this;
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent3 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent3.putExtra("android.provider.extra.APP_PACKAGE", hVarC5.W().getPackageName());
                    hVarC5.f740C0.a(intent3);
                } else if (hVarC5.g0()) {
                    hVarC5.i0(new f(hVarC5, 0));
                }
                break;
            case 6:
                i iVar7 = (i) this.f725s;
                iVar7.getClass();
                h hVarC6 = iVar7.c();
                hVarC6.f743u0 = iVar7;
                hVarC6.f744v0 = this;
                if (!Settings.canDrawOverlays(hVarC6.X())) {
                    Intent intent4 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    intent4.setData(Uri.parse("package:" + hVarC6.W().getPackageName()));
                    hVarC6.f747y0.a(intent4);
                } else {
                    hVarC6.h0();
                }
                break;
            default:
                i iVar8 = (i) this.f725s;
                iVar8.getClass();
                h hVarC7 = iVar8.c();
                hVarC7.f743u0 = iVar8;
                hVarC7.f744v0 = this;
                if (!Settings.System.canWrite(hVarC7.X())) {
                    Intent intent5 = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent5.setData(Uri.parse("package:" + hVarC7.W().getPackageName()));
                    hVarC7.f748z0.a(intent5);
                } else if (hVarC7.g0()) {
                    hVarC7.i0(new f(hVarC7, 3));
                }
                break;
        }
    }
}
