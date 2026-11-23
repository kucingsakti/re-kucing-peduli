package B6;

import E1.r;
import E1.s;
import E1.x;
import E4.P;
import E4.Q;
import E4.S;
import I.J;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.util.SparseIntArray;
import android.view.MenuItem;
import com.kcstream.cing.activity.SplashActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p076h8.m;
import p078i.D;
import p156q0.C0742a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f726t;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f725s = obj;
        this.f726t = obj2;
    }

    @Override // E1.s
    public r D(x xVar) {
        Class cls = (Class) this.f726t;
        return new F1.d((Context) this.f725s, xVar.b(File.class, cls), xVar.b(Uri.class, cls), cls);
    }

    public abstract void c();

    public void d() {
        J4.j jVar = (J4.j) this.f725s;
        if (jVar != null) {
            try {
                ((D) this.f726t).f11922C.unregisterReceiver(jVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f725s = null;
        }
    }

    public abstract IntentFilter e();

    public void f() {
        m mVar;
        int i10 = 1;
        b bVar = (b) this.f726t;
        if (bVar != null) {
            bVar.p();
            mVar = m.a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            ArrayList arrayList = new ArrayList();
            i iVar = (i) this.f725s;
            arrayList.addAll(iVar.f754g);
            arrayList.addAll(iVar.f755h);
            arrayList.addAll(iVar.f752e);
            if (iVar.f751d.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (J.f.a(iVar.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    iVar.f753f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (iVar.f751d.contains("android.permission.SYSTEM_ALERT_WINDOW") && iVar.d() >= 23) {
                if (Settings.canDrawOverlays(iVar.a())) {
                    iVar.f753f.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (iVar.f751d.contains("android.permission.WRITE_SETTINGS") && iVar.d() >= 23) {
                if (Settings.System.canWrite(iVar.a())) {
                    iVar.f753f.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (iVar.f751d.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    iVar.f753f.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (iVar.f751d.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT < 26 || iVar.d() < 26 || !iVar.a().getPackageManager().canRequestPackageInstalls()) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    iVar.f753f.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            if (iVar.f751d.contains("android.permission.POST_NOTIFICATIONS")) {
                if (new J(iVar.a()).a()) {
                    iVar.f753f.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (iVar.f751d.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                if (J.f.a(iVar.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                    iVar.f753f.add("android.permission.BODY_SENSORS_BACKGROUND");
                } else {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
            }
            S s9 = iVar.j;
            if (s9 != null) {
                arrayList.isEmpty();
                new ArrayList(iVar.f753f);
                switch (s9.a) {
                    case 0:
                        SplashActivity splashActivity = s9.f1391b;
                        int i11 = SplashActivity.f10231Z;
                        splashActivity.f10234X = new Q();
                        new Handler().postDelayed(new P(splashActivity, i10), 1000L);
                        break;
                    default:
                        SplashActivity splashActivity2 = s9.f1391b;
                        int i12 = SplashActivity.f10231Z;
                        splashActivity2.f10234X = new Q();
                        new Handler().postDelayed(new P(splashActivity2, i10), 1000L);
                        break;
                }
            }
            androidx.fragment.app.b bVarE = iVar.b().E("InvisibleFragment");
            if (bVarE != null) {
                C0742a c0742a = new C0742a(iVar.b());
                c0742a.l(bVarE);
                if (c0742a.f14299g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c0742a.f14300h = false;
                c0742a.f14309r.A(c0742a, true);
            }
            if (Build.VERSION.SDK_INT != 26) {
                iVar.a().setRequestedOrientation(iVar.f749b);
            }
        }
    }

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof O.a)) {
            return menuItem;
        }
        O.a aVar = (O.a) menuItem;
        if (((p212w.i) this.f726t) == null) {
            this.f726t = new p212w.i(0);
        }
        MenuItem menuItem2 = (MenuItem) ((p212w.i) this.f726t).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p136o.s sVar = new p136o.s((Context) this.f725s, aVar);
        ((p212w.i) this.f726t).put(aVar, sVar);
        return sVar;
    }

    public int i(int i10, int i11) {
        int iK = k(i10);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int iK2 = k(i14);
            i12 += iK2;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = iK2;
            }
        }
        return i12 + iK > i11 ? i13 + 1 : i13;
    }

    public int j(int i10, int i11) {
        int iK = k(i10);
        if (iK == i11) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int iK2 = k(i13);
            i12 += iK2;
            if (i12 == i11) {
                i12 = 0;
            } else if (i12 > i11) {
                i12 = iK2;
            }
        }
        if (iK + i12 <= i11) {
            return i12;
        }
        return 0;
    }

    public abstract int k(int i10);

    public void l() {
        ((SparseIntArray) this.f725s).clear();
    }

    public abstract void m();

    public abstract void n();

    public abstract void o(p129n3.c cVar);

    public abstract void p();

    public abstract void q(List list);

    public abstract void r();

    public void s() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((J4.j) this.f725s) == null) {
            this.f725s = new J4.j(this, 3);
        }
        ((D) this.f726t).f11922C.registerReceiver((J4.j) this.f725s, intentFilterE);
    }

    public abstract void t();

    public abstract void u();

    public b(Context context) {
        this.f725s = context;
    }

    public b(int i10) {
        this.f726t = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            ((ArrayList) this.f726t).add(new p129n3.i());
        }
    }

    public b() {
        this.f725s = new SparseIntArray();
        this.f726t = new SparseIntArray();
    }

    public b(D d3) {
        this.f726t = d3;
    }
}
