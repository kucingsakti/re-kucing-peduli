package O3;

import C8.E;
import M2.I;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.onesignal.core.activities.PermissionsActivity;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.core.webview.WebView;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p156q0.C0745d;
import p156q0.U;
import ya.C0891l;
import ya.InterfaceC0885f;
import ya.L;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3601v;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i10) {
        this.f3598s = i10;
        this.f3599t = obj;
        this.f3600u = obj2;
        this.f3601v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3598s) {
            case 0:
                I i10 = (I) this.f3599t;
                Executor executor = (Executor) this.f3600u;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3601v;
                try {
                    ((Task) i10.call()).d(executor, new A(taskCompletionSource, 2));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.a(e10);
                    return;
                }
            case 1:
                PermissionsActivity.m9onRequestPermissionsResult$lambda0((PermissionsActivity) this.f3599t, (String[]) this.f3600u, (int[]) this.f3601v);
                return;
            case 2:
                com.onesignal.core.internal.application.impl.a.m10decorViewReady$lambda1((com.onesignal.core.internal.application.impl.a) this.f3599t, (Runnable) this.f3600u, (com.onesignal.core.internal.application.impl.a) this.f3601v);
                return;
            case 3:
                ((LoadOperationState) this.f3599t).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.f3600u, (String) this.f3601v);
                return;
            case 4:
                ((ShowOperationState) this.f3599t).lambda$onUnityAdsShowFailure$0((UnityAds.UnityAdsShowError) this.f3600u, (String) this.f3601v);
                return;
            case 5:
                ((IUnityAdsInitializationListener) this.f3599t).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.f3600u, (String) this.f3601v);
                return;
            case 6:
                WebView.evaluateJavascript$lambda$1((WebView) this.f3599t, (String) this.f3600u, (ValueCallback) this.f3601v);
                return;
            case 7:
                E1.l lVar = (E1.l) this.f3599t;
                E e11 = (E) this.f3600u;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3601v;
                lVar.getClass();
                try {
                    p106l0.n nVarH = C4.a.h(lVar.f1318t);
                    if (nVarH == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p106l0.m mVar = (p106l0.m) ((p106l0.f) nVarH.f2347b);
                    synchronized (mVar.f12871v) {
                        mVar.f12873x = threadPoolExecutor;
                        break;
                    }
                    ((p106l0.f) nVarH.f2347b).a(new p106l0.i(e11, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    e11.x(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 8:
                Intent intent = (Intent) this.f3600u;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f3601v;
                p140o4.g gVar = (p140o4.g) this.f3599t;
                gVar.getClass();
                try {
                    gVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource2.b(null);
                }
            case 9:
                ViewGroup viewGroup = (ViewGroup) this.f3599t;
                p210v8.i.f(viewGroup, "$container");
                C0745d c0745d = (C0745d) this.f3601v;
                p210v8.i.f(c0745d, "this$0");
                viewGroup.endViewTransition((View) this.f3600u);
                ((U) c0745d.f14319c.f577s).c(c0745d);
                return;
            case 10:
                C0891l c0891l = (C0891l) ((o1.k) this.f3599t).f13639t;
                boolean zT = c0891l.f16212t.T();
                InterfaceC0885f interfaceC0885f = (InterfaceC0885f) this.f3600u;
                if (zT) {
                    interfaceC0885f.g(c0891l, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC0885f.m(c0891l, (L) this.f3601v);
                    return;
                }
            default:
                ((InterfaceC0885f) this.f3600u).g((C0891l) ((o1.k) this.f3599t).f13639t, (Throwable) this.f3601v);
                return;
        }
    }
}
