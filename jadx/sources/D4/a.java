package D4;

import E4.w;
import E4.y;
import I3.m;
import I3.n;
import N9.AbstractC0342z;
import Q3.u0;
import android.app.job.JobParameters;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.PasscodeActivity;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import i2.p;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;
import p076h8.j;
import p078i.ExecutorC0659p;
import p086i8.C;
import p140o4.r;
import p147p1.o;
import p157q1.k;
import p188t1.F;
import p188t1.G;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1071u;

    public /* synthetic */ a(MainApp mainApp, r rVar) {
        this.f1069s = 23;
        this.f1071u = mainApp;
        this.f1070t = rVar;
    }

    private final void a() {
        p073h4.a aVar;
        n nVar = (n) this.f1070t;
        p073h4.b bVar = (p073h4.b) this.f1071u;
        if (nVar.f2045b != n.f2044d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (nVar) {
            aVar = nVar.a;
            nVar.a = null;
            nVar.f2045b = bVar;
        }
        aVar.c(bVar);
    }

    private final void b() {
        m mVar = (m) this.f1070t;
        p073h4.b bVar = (p073h4.b) this.f1071u;
        synchronized (mVar) {
            try {
                if (mVar.f2042b == null) {
                    mVar.a.add(bVar);
                } else {
                    mVar.f2042b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1070t;
        C3.d dVar = (C3.d) this.f1071u;
        i.f(constraintTrackingWorker, "this$0");
        synchronized (constraintTrackingWorker.f7236t) {
            try {
                if (constraintTrackingWorker.f7237u) {
                    k kVar = constraintTrackingWorker.f7238v;
                    i.e(kVar, "future");
                    int i10 = p179s1.a.a;
                    kVar.j(new p050f1.m());
                } else {
                    constraintTrackingWorker.f7238v.l(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        u0 u0Var;
        int i10 = 8;
        int i11 = 0;
        switch (this.f1069s) {
            case 0:
                i.f((b) this.f1070t, "this$0");
                MainApp mainApp = (MainApp) this.f1071u;
                i.f(mainApp, "this$1");
                if ((mainApp.a().contains("key_passcode") & (!mainApp.a().contains("app_locked"))) && (!mainApp.a().contains("is_splash"))) {
                    SharedPreferences.Editor editorEdit = mainApp.a().edit();
                    editorEdit.putBoolean("app_locked", true);
                    editorEdit.apply();
                    Intent intent = new Intent(mainApp, (Class<?>) PasscodeActivity.class);
                    intent.setFlags(268435456);
                    mainApp.startActivity(intent);
                    return;
                }
                return;
            case 1:
                int i12 = MainActivity.c0;
                MainActivity mainActivity = (MainActivity) this.f1070t;
                Handler handler = (Handler) this.f1071u;
                if (!mainActivity.y().contains("genreData")) {
                    AbstractC0342z.n(mainActivity, null, new y(mainActivity, null), 3);
                }
                handler.post(new w(i11));
                return;
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            case 4:
                J3.a aVar = (J3.a) this.f1070t;
                Process.setThreadPriority(aVar.f2369u);
                StrictMode.ThreadPolicy threadPolicy = aVar.f2370v;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f1071u).run();
                return;
            case 5:
                Callable callable = (Callable) this.f1070t;
                J3.i iVar = (J3.i) ((A1.r) this.f1071u).f167t;
                try {
                    iVar.o(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar.p(e10);
                    return;
                }
            case 6:
                ((K.b) this.f1070t).j((Typeface) this.f1071u);
                return;
            case 7:
                U3.c cVar = (U3.c) this.f1070t;
                cVar.getClass();
                try {
                    p.a().f12196d.a(((i2.i) cVar.f4903h.f1659t).b(p051f2.d.f11426u), 1);
                    break;
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f1071u).countDown();
                return;
            case 8:
                e2.b bVar = (e2.b) this.f1070t;
                Y1.c cVar2 = (Y1.c) this.f1071u;
                AbstractC0487g.p(3, "$version");
                G g8 = (G) cVar2.f5671u;
                int iA = p239z.e.a(3, 2);
                j jVar = (j) g8.f14983x;
                j jVar2 = (j) g8.f14982w;
                j jVar3 = (j) g8.f14981v;
                if (iA > 0 || p239z.e.a(3, 1) < 0) {
                    p002a2.c cVar3 = (p002a2.c) jVar3.getValue();
                    if (cVar3.f5999k.length() <= 0) {
                        cVar3 = null;
                    }
                    if (cVar3 != null) {
                        u0Var = cVar3;
                    } else {
                        p002a2.d dVar = (p002a2.d) jVar.getValue();
                        u0Var = dVar.f6000k.length() > 0 ? dVar : null;
                        if (u0Var == null) {
                            u0Var = (p002a2.a) jVar2.getValue();
                        }
                    }
                } else {
                    p002a2.c cVar4 = (p002a2.c) jVar3.getValue();
                    u0Var = cVar4.f5999k.length() > 0 ? cVar4 : null;
                    if (u0Var == null) {
                        u0Var = (p002a2.a) jVar2.getValue();
                    }
                }
                bVar.invoke(new Y1.a(u0Var.f(), ((p002a2.c) jVar3.getValue()).f5999k, ((p002a2.a) jVar2.getValue()).f5996k, ((p002a2.d) jVar.getValue()).f6000k));
                return;
            case 9:
                ((BiddingBaseManager) this.f1070t).lambda$uploadSignals$2((BiddingSignals) this.f1071u);
                return;
            case 10:
                ((BiddingBaseManager) this.f1070t).lambda$onUnityAdsTokenReady$0((String) this.f1071u);
                return;
            case 11:
                ((ShowOperationState) this.f1070t).lambda$onUnityAdsShowStart$2((String) this.f1071u);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ShowOperationState) this.f1070t).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) this.f1071u);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                t tVar = (t) this.f1070t;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1071u;
                tVar.f15466s = Integer.valueOf(Camera.getNumberOfCameras());
                countDownLatch.countDown();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((p061g1.e) this.f1070t).f((o1.i) this.f1071u, false);
                return;
            case 15:
                p061g1.p pVar = (p061g1.p) this.f1070t;
                k kVar = (k) this.f1071u;
                if (pVar.f11515I.f14401s instanceof p157q1.a) {
                    kVar.cancel(true);
                    return;
                }
                return;
            case 16:
                Runnable runnable = (Runnable) this.f1071u;
                ExecutorC0659p executorC0659p = (ExecutorC0659p) this.f1070t;
                executorC0659p.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0659p.c();
                }
            case 17:
                List<p107l1.b> list = (List) this.f1070t;
                B7.a aVar2 = (B7.a) this.f1071u;
                i.f(aVar2, "this$0");
                for (p107l1.b bVar2 : list) {
                    Object obj = aVar2.f761e;
                    bVar2.f12894d = obj;
                    bVar2.d(bVar2.f12895e, obj);
                }
                return;
            case 18:
                int i13 = JobInfoSchedulerService.f7699s;
                ((JobInfoSchedulerService) this.f1070t).jobFinished((JobParameters) this.f1071u, false);
                return;
            case 19:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1071u;
                p081i3.b bVar3 = FirebaseMessaging.f9984k;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1070t;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.b(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.a(e11);
                    return;
                }
            case 20:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f1071u;
                try {
                    taskCompletionSource2.b(((p140o4.m) this.f1070t).a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.a(e12);
                    return;
                }
            case MobileAdsBridge.CODE_21 /* 21 */:
                o oVar = (o) this.f1070t;
                k kVar2 = (k) this.f1071u;
                if (oVar.f14186s.f14401s instanceof p157q1.a) {
                    kVar2.cancel(true);
                    return;
                } else {
                    kVar2.l(oVar.f14189v.getForegroundInfoAsync());
                    return;
                }
            case 22:
                c();
                return;
            case 23:
                C.a(C.c("4461BBC71EE0DDB3"));
                MainApp mainApp2 = (MainApp) this.f1071u;
                String strA = C.a(C.c("146ABDDA4EB5"));
                r rVar = (r) this.f1070t;
                i.f(rVar, strA);
                ExecutorService executorService = (ExecutorService) rVar.f13785w;
                try {
                    Y1.c cVarF = qa.b.f(mainApp2);
                    ((ExecutorService) cVarF.f5672v).execute(new a(new e2.b(rVar, i10), i10, cVarF));
                    rVar.d(cVarF);
                    return;
                } catch (Exception unused2) {
                    C.a(C.c("2467A2C009E0ECA383791B019D447126D0"));
                    C.a(C.c("356CB5CB06E085B38937080D8F0D723DCDCEABF243C43B134EE7B77436EB2A48016CB7CC44"));
                    CountDownLatch countDownLatch2 = (CountDownLatch) rVar.f13784v;
                    long count = countDownLatch2.getCount();
                    long j = 0;
                    if (0 <= count) {
                        while (true) {
                            countDownLatch2.countDown();
                            if (j != count) {
                                j++;
                            }
                        }
                    }
                    return;
                } finally {
                    executorService.shutdown();
                }
            default:
                p188t1.u0 u0Var2 = (p188t1.u0) this.f1070t;
                String str = (String) this.f1071u;
                synchronized (u0Var2) {
                    long jNanoTime = System.nanoTime() / 1000000;
                    u0Var2.l(C.a(C.c("057AB1CA1FF1CCA888441B098F48")), str);
                    F f10 = new F(false, true, true);
                    f10.f14976d = Long.valueOf((System.nanoTime() / 1000000) - jNanoTime);
                    u0Var2.n(f10);
                    break;
                }
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f1069s = i10;
        this.f1070t = obj;
        this.f1071u = obj2;
    }
}
