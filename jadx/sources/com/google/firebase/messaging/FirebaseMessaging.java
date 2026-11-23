package com.google.firebase.messaging;

import D3.g;
import E4.B;
import I3.f;
import Ia.a;
import Q3.u0;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p042e4.c;
import p081i3.b;
import p082i4.d;
import p140o4.j;
import p140o4.l;
import p140o4.s;
import p140o4.t;
import p140o4.x;
import p188t1.G;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static b f9984k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f9986m;
    public final g a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f9988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f9989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K0.g f9990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f9991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f9992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X2.j f9993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9994i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static p073h4.b f9985l = new f(6);

    public FirebaseMessaging(g gVar, p073h4.b bVar, p073h4.b bVar2, d dVar, p073h4.b bVar3, c cVar) {
        final int i10 = 1;
        final int i11 = 0;
        gVar.a();
        Context context = gVar.a;
        final X2.j jVar = new X2.j();
        jVar.f5408b = 0;
        jVar.f5409c = context;
        final G g8 = new G(gVar, jVar, bVar, bVar2, dVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f9994i = false;
        f9985l = bVar3;
        this.a = gVar;
        this.f9990e = new K0.g(this, cVar);
        gVar.a();
        final Context context2 = gVar.a;
        this.f9987b = context2;
        a aVar = new a();
        this.f9993h = jVar;
        this.f9988c = g8;
        this.f9989d = new j(executorServiceNewSingleThreadExecutor);
        this.f9991f = scheduledThreadPoolExecutor;
        this.f9992g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(aVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: o4.k

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f13767t;

            {
                this.f13767t = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f13767t;
                if (firebaseMessaging.f9990e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.f9994i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                P2.f fVarD;
                int i12;
                switch (i11) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f13767t;
                        final Context context3 = firebaseMessaging.f9987b;
                        p181s3.a.n(context3);
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesG = com.bumptech.glide.c.g(context3);
                            if (!sharedPreferencesG.contains("proxy_retention") || sharedPreferencesG.getBoolean("proxy_retention", false) != zG) {
                                Rpc rpc = (Rpc) firebaseMessaging.f9988c.f14980u;
                                if (rpc.f7778c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    zzv zzvVarA = zzv.a(rpc.f7777b);
                                    synchronized (zzvVarA) {
                                        i12 = zzvVarA.f7811d;
                                        zzvVarA.f7811d = i12 + 1;
                                    }
                                    fVarD = zzvVarA.b(new p196u2.c(i12, 4, bundle, 0));
                                } else {
                                    fVarD = Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                fVarD.c(new G0.b(0), new OnSuccessListener() { // from class: o4.q
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = com.bumptech.glide.c.g(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i12 = x.j;
        Tasks.c(scheduledThreadPoolExecutor2, new Callable() { // from class: o4.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                X2.j jVar2 = jVar;
                G g10 = g8;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f13796d;
                        vVar = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar == null) {
                            v vVar2 = new v(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            vVar2.b();
                            v.f13796d = new WeakReference(vVar2);
                            vVar = vVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new x(firebaseMessaging, jVar2, vVar, g10, context3, scheduledThreadPoolExecutor3);
            }
        }).c(scheduledThreadPoolExecutor, new l(this, i11));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: o4.k

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f13767t;

            {
                this.f13767t = this;
            }

            private final void a() {
                FirebaseMessaging firebaseMessaging = this.f13767t;
                if (firebaseMessaging.f9990e.i() && firebaseMessaging.i(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.f9994i) {
                            firebaseMessaging.h(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                P2.f fVarD;
                int i13;
                switch (i10) {
                    case 0:
                        a();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f13767t;
                        final Context context3 = firebaseMessaging.f9987b;
                        p181s3.a.n(context3);
                        final boolean zG = firebaseMessaging.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesG = com.bumptech.glide.c.g(context3);
                            if (!sharedPreferencesG.contains("proxy_retention") || sharedPreferencesG.getBoolean("proxy_retention", false) != zG) {
                                Rpc rpc = (Rpc) firebaseMessaging.f9988c.f14980u;
                                if (rpc.f7778c.a() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    zzv zzvVarA = zzv.a(rpc.f7777b);
                                    synchronized (zzvVarA) {
                                        i13 = zzvVarA.f7811d;
                                        zzvVarA.f7811d = i13 + 1;
                                    }
                                    fVarD = zzvVarA.b(new p196u2.c(i13, 4, bundle, 0));
                                } else {
                                    fVarD = Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                fVarD.c(new G0.b(0), new OnSuccessListener() { // from class: o4.q
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void c(Object obj) {
                                        SharedPreferences.Editor editorEdit = com.bumptech.glide.c.g(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging.g()) {
                            firebaseMessaging.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f9986m == null) {
                    f9986m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f9986m.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized b c(Context context) {
        try {
            if (f9984k == null) {
                f9984k = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9984k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        Preconditions.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskE;
        s sVarD = d();
        if (!i(sVarD)) {
            return sVarD.a;
        }
        String strC = X2.j.c(this.a);
        j jVar = this.f9989d;
        synchronized (jVar) {
            taskE = (Task) ((e) jVar.f13765b).get(strC);
            if (taskE != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                G g8 = this.f9988c;
                taskE = g8.j(g8.D(X2.j.c((g) g8.f14978s), "*", new Bundle())).l(this.f9992g, new p128n2.b(this, strC, sVarD, 1)).e((ExecutorService) jVar.a, new B(jVar, 8, strC));
                ((e) jVar.f13765b).put(strC, taskE);
            }
        }
        try {
            return (String) Tasks.a(taskE);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final s d() {
        s sVarB;
        b bVarC = c(this.f9987b);
        g gVar = this.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f1049b) ? "" : gVar.d();
        String strC = X2.j.c(this.a);
        synchronized (bVarC) {
            sVarB = s.b(((SharedPreferences) bVarC.f12212t).getString(strD + "|T|" + strC + "|*", null));
        }
        return sVarB;
    }

    public final void e() {
        Task taskD;
        int i10;
        Rpc rpc = (Rpc) this.f9988c.f14980u;
        if (rpc.f7778c.a() >= 241100000) {
            zzv zzvVarA = zzv.a(rpc.f7777b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (zzvVarA) {
                i10 = zzvVarA.f7811d;
                zzvVarA.f7811d = i10 + 1;
            }
            taskD = zzvVarA.b(new p196u2.c(i10, 5, bundle, 1)).d(Rpc.j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
                @Override // com.google.android.gms.tasks.Continuation
                public final Object C(Task task) {
                    Intent intent = (Intent) ((Bundle) task.g()).getParcelable("notification_data");
                    if (intent != null) {
                        return new CloudMessage(intent);
                    }
                    return null;
                }
            });
        } else {
            taskD = Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskD.c(this.f9991f, new l(this, 1));
    }

    public final synchronized void f(boolean z6) {
        this.f9994i = z6;
    }

    public final boolean g() {
        Context context = this.f9987b;
        p181s3.a.n(context);
        if (!(Build.VERSION.SDK_INT >= 29)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            Log.isLoggable("FirebaseMessaging", 3);
            if (this.a.b(F3.a.class) != null || (u0.b() && f9985l != null)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void h(long j10) {
        b(new t(this, Math.min(Math.max(30L, 2 * j10), j)), j10);
        this.f9994i = true;
    }

    public final boolean i(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.f13788c + s.f13786d || !this.f9993h.a().equals(sVar.f13787b);
        }
        return true;
    }
}
