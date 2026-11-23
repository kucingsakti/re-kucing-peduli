package androidx.work.impl.foreground;

import P2.g;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0526v;
import java.util.UUID;
import p050f1.q;
import p061g1.o;
import p127n1.a;
import p147p1.b;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0526v {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f7230x = q.c("SystemFgService");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f7231t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f7233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NotificationManager f7234w;

    public final void b() {
        this.f7231t = new Handler(Looper.getMainLooper());
        this.f7234w = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f7233v = aVar;
        if (aVar.f13301A != null) {
            q.a().getClass();
        } else {
            aVar.f13301A = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0526v, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.AbstractServiceC0526v, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7233v.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7232u) {
            q.a().b(f7230x, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f7233v.g();
            b();
            this.f7232u = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f7233v;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str = a.f13300B;
        if (zEquals) {
            q.a().b(str, "Started foreground service " + intent);
            aVar.f13303t.t(new g((Object) aVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), 20, false));
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            q.a().b(str, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f13301A;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f7232u = true;
            q.a().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        q.a().b(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        o oVar = aVar.f13302s;
        oVar.getClass();
        oVar.f11500d.t(new b(oVar, uuidFromString, 0));
        return 3;
    }
}
