package p204v1;

import D4.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0522q;
import androidx.lifecycle.InterfaceC0523s;
import com.kcstream.cing.MainApp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p086i8.C;
import p188t1.r0;
import p188t1.u0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends BroadcastReceiver implements InterfaceC0522q {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final IntentFilter f15381x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u0 f15382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f15383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MainApp f15384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15385v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0525u f15386w = F.f6714A.f6720x;

    static {
        C.a(C.c("2840"));
        C.a(C.c("036DB9870DEACAA08A72412694597D32CACAAFF45AD93C2E5FF0B33D3CE0"));
        C.a(C.c("214180E025CBFA8FA4"));
        C.a(C.c("214180E025CBFA82BE522C"));
        C.a(C.c("214180E025CBFA94B2563B2D"));
        f15381x = new IntentFilter(C.a(C.c("036DB9870DEACAA08A72412694597D32CACAAFF45AD93C2E5FF0B33D3CE0")));
    }

    public b(MainApp mainApp, u0 u0Var, r0 r0Var) {
        this.f15384u = mainApp;
        this.f15382s = u0Var;
        this.f15383t = r0Var;
    }

    public final synchronized void a(MainApp mainApp) {
        Context applicationContext;
        if (mainApp != null) {
            try {
                if (!this.f15385v && (applicationContext = mainApp.getApplicationContext()) != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        applicationContext.registerReceiver(this, f15381x, 4);
                    } else {
                        applicationContext.registerReceiver(this, f15381x);
                    }
                    this.f15385v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b(Context context) {
        Context applicationContext;
        if (context != null) {
            try {
                if (this.f15385v && (applicationContext = context.getApplicationContext()) != null) {
                    applicationContext.unregisterReceiver(this);
                    this.f15385v = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u0 u0Var = this.f15382s;
        ScheduledFuture scheduledFuture = u0Var.f15098i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            u0Var.f15098i = null;
        }
        ScheduledExecutorService scheduledExecutorService = u0Var.f15097h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent != null) {
            boolean zHasExtra = intent.hasExtra(C.a(C.c("214180E025CBFA8FA4")));
            u0 u0Var = this.f15382s;
            if (zHasExtra) {
                String stringExtra2 = intent.getStringExtra(C.a(C.c("214180E025CBFA8FA4")));
                if (stringExtra2 != null) {
                    if (!AbstractC0487g.s("2840", stringExtra2) || u0Var == null) {
                        AbstractC0487g.r("2840", "356CBFC705F2CBE7AE554F059E5E6735C4CCEEF256D537144CE7A17A71AB");
                        return;
                    } else {
                        u0Var.f15096g = System.currentTimeMillis();
                        return;
                    }
                }
                return;
            }
            if (intent.hasExtra(C.a(C.c("214180E025CBFA82BE522C")))) {
                String stringExtra3 = intent.getStringExtra(C.a(C.c("214180E025CBFA82BE522C")));
                if (stringExtra3 == null || u0Var == null) {
                    return;
                }
                new Thread(new a(u0Var, 24, stringExtra3)).start();
                return;
            }
            if (intent.hasExtra(C.a(C.c("214180E025CBFA94B2563B2D"))) && (stringExtra = intent.getStringExtra(C.a(C.c("214180E025CBFA94B2563B2D")))) != null && AbstractC0487g.s("2245", stringExtra)) {
                b(context);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        int i10 = a.a[enumC0518m.ordinal()];
        MainApp mainApp = this.f15384u;
        if (i10 == 1) {
            b(mainApp);
            return;
        }
        if (i10 != 2) {
            return;
        }
        r0 r0Var = this.f15383t;
        r0Var.getClass();
        String.format(C.a(C.c("2663BDC50FE185B389370E0497427735D7CCEEE246D0341848A2E8746FFD7C0C5134AC")), Integer.valueOf(r0Var.f15080b));
        C.a(C.c("236EB5C70D"));
        r0Var.a(C.a(C.c("255A91EA4AA885")) + r0Var.f15080b);
        r0Var.b();
        a(mainApp);
    }
}
