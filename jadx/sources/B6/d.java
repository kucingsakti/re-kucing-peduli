package B6;

import C8.E;
import E4.C0187a;
import I.AbstractC0243g;
import I.C0242f;
import L9.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.F;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.kcstream.cing.fragment.TabsDownloadsFragment;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.UrlRequest;
import p031d.l;
import p050f1.p;
import p050f1.q;
import p061g1.o;
import p078i.AbstractActivityC0655l;
import p106l0.m;
import p140o4.C;
import p140o4.r;
import p156q0.I;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f729t;

    public /* synthetic */ d(Ia.a aVar, Intent intent) {
        this.f728s = 24;
        this.f729t = intent;
    }

    private final void a() {
        m mVar = (m) this.f729t;
        synchronized (mVar.f12871v) {
            try {
                if (mVar.f12875z == null) {
                    return;
                }
                try {
                    R.h hVarD = mVar.d();
                    int i10 = hVarD.f4428e;
                    if (i10 == 2) {
                        synchronized (mVar.f12871v) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = Q.m.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        K3.d dVar = mVar.f12870u;
                        Context context = mVar.f12868s;
                        dVar.getClass();
                        Typeface typefaceJ = L.g.a.j(context, new R.h[]{hVarD}, 0);
                        MappedByteBuffer mappedByteBufferW = E.w(mVar.f12868s, hVarD.a);
                        if (mappedByteBufferW == null || typefaceJ == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            o1.h hVar = new o1.h(typefaceJ, J7.a.r(mappedByteBufferW));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (mVar.f12871v) {
                                try {
                                    E e10 = mVar.f12875z;
                                    if (e10 != null) {
                                        e10.y(hVar);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            mVar.b();
                        } catch (Throwable th2) {
                            int i12 = Q.m.a;
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        int i13 = Q.m.a;
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (mVar.f12871v) {
                        try {
                            E e11 = mVar.f12875z;
                            if (e11 != null) {
                                e11.x(th4);
                            }
                            mVar.b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    private final void b() {
        Fa.e eVar = (Fa.e) this.f729t;
        synchronized (((ArrayDeque) eVar.f1662w)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) eVar.f1659t).edit();
            String str = (String) eVar.f1660u;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) eVar.f1662w).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) eVar.f1661v);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u8.a, v8.k] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10 = 5;
        int i11 = 6;
        switch (this.f728s) {
            case 0:
                ((k) this.f729t).invoke();
                return;
            case 1:
                ((IUnityAdsTokenListener) this.f729t).onUnityAdsTokenReady(null);
                return;
            case 2:
                Activity activity = (Activity) this.f729t;
                if (activity.isFinishing()) {
                    return;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28) {
                    Class cls = AbstractC0243g.a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0243g.a;
                boolean z6 = i12 == 26 || i12 == 27;
                Method method = AbstractC0243g.f1970f;
                if ((!z6 || method != null) && (AbstractC0243g.f1969e != null || AbstractC0243g.f1968d != null)) {
                    Object obj2 = AbstractC0243g.f1967c.get(activity);
                    if (obj2 != null && (obj = AbstractC0243g.f1966b.get(activity)) != null) {
                        Application application = activity.getApplication();
                        C0242f c0242f = new C0242f(activity);
                        application.registerActivityLifecycleCallbacks(c0242f);
                        Handler handler = AbstractC0243g.f1971g;
                        handler.post(new C3.c(c0242f, i10, obj2));
                        try {
                            if (i12 == 26 || i12 == 27) {
                                Boolean bool = Boolean.FALSE;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            } else {
                                activity.recreate();
                            }
                            handler.post(new C3.c(application, i11, c0242f));
                            return;
                        } catch (Throwable th) {
                            handler.post(new C3.c(application, i11, c0242f));
                            throw th;
                        }
                    }
                }
                activity.recreate();
                return;
            case 3:
                TabsDownloadsFragment tabsDownloadsFragment = (TabsDownloadsFragment) this.f729t;
                p210v8.i.f(tabsDownloadsFragment, "this$0");
                tabsDownloadsFragment.f10251v0.clear();
                File file = tabsDownloadsFragment.f10253x0;
                if (file == null) {
                    p210v8.i.n("path");
                    throw null;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                    for (File file2 : fileArrListFiles) {
                        String name = file2.getName();
                        p210v8.i.e(name, "getName(...)");
                        String path = file2.getPath();
                        p210v8.i.e(path, "getPath(...)");
                        arrayList.add(new J4.e(file2.lastModified(), file2.length(), name, path));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (n.B(((J4.e) obj3).a, ".mp4")) {
                            arrayList2.add(obj3);
                        }
                    }
                    Ca.c cVar = tabsDownloadsFragment.f10250u0;
                    if (cVar != null) {
                        cVar.m(arrayList2);
                    }
                }
                Ca.c cVar2 = tabsDownloadsFragment.f10250u0;
                if (cVar2 != null) {
                    cVar2.q();
                    return;
                }
                return;
            case 4:
                ((CarouselLayoutManager) this.f729t).u0();
                return;
            case 5:
                F f10 = (F) this.f729t;
                p210v8.i.f(f10, "this$0");
                int i13 = f10.f6716t;
                C0525u c0525u = f10.f6720x;
                if (i13 == 0) {
                    f10.f6717u = true;
                    c0525u.d(EnumC0518m.ON_PAUSE);
                }
                if (f10.f6715s == 0 && f10.f6717u) {
                    c0525u.d(EnumC0518m.ON_STOP);
                    f10.f6718v = true;
                    return;
                }
                return;
            case 6:
                ((com.google.android.material.timepicker.e) this.f729t).m();
                return;
            case 7:
                com.onesignal.core.internal.application.impl.a.m11waitUntilActivityReady$lambda0((com.onesignal.common.threading.b) this.f729t);
                return;
            case 8:
                com.onesignal.core.internal.purchases.impl.c.m12queryBoughtItems$lambda0((com.onesignal.core.internal.purchases.impl.c) this.f729t);
                return;
            case 9:
                ((BiddingBaseManager) this.f729t).lambda$fetchSignals$1();
                return;
            case 10:
                ((LoadOperationState) this.f729t).lambda$onUnityAdsAdLoaded$1();
                return;
            case 11:
                ((ShowOperationState) this.f729t).lambda$onUnityAdsShowClick$1();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((BannerView) this.f729t).lambda$addScarContainer$0();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.f729t);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((IUnityAdsInitializationListener) this.f729t).onInitializationComplete();
                return;
            case 15:
                ((AbstractActivityC0655l) this.f729t).invalidateOptionsMenu();
                return;
            case 16:
                l lVar = (l) this.f729t;
                Runnable runnable = lVar.f10454t;
                if (runnable != null) {
                    runnable.run();
                    lVar.f10454t = null;
                    return;
                }
                return;
            case 17:
                p031d.n.b((p031d.n) this.f729t);
                return;
            case 18:
                CoroutineWorker.a((CoroutineWorker) this.f729t);
                return;
            case 19:
                View view = (View) this.f729t;
                ((InputMethodManager) J.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 20:
                p100k5.c.m70scheduleStart$lambda2((p100k5.c) this.f729t);
                return;
            case MobileAdsBridge.CODE_21 /* 21 */:
                a();
                return;
            case 22:
                Y1.c cVar3 = (Y1.c) this.f729t;
                p109l3.c cVar4 = (p109l3.c) cVar3.f5670t;
                if (cVar4 != null) {
                    cVar4.b((p109l3.b) cVar3.f5671u, (View) cVar3.f5672v, true);
                    return;
                }
                return;
            case 23:
                p138o2.i iVar = (p138o2.i) this.f729t;
                iVar.getClass();
                ((p148p2.g) iVar.f13706d).i(new C0187a(iVar, 20));
                return;
            case 24:
                Ia.a.a((Intent) this.f729t);
                return;
            case 25:
                b();
                return;
            case 26:
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                C c10 = (C) this.f729t;
                sb.append(c10.a.getAction());
                sb.append(" finishing.");
                Log.w("FirebaseMessaging", sb.toString());
                c10.f13729b.d(null);
                return;
            case 27:
                androidx.fragment.app.b bVar = (androidx.fragment.app.b) this.f729t;
                bVar.f6644m0.f14281w.f(bVar.f6653v);
                bVar.f6653v = null;
                return;
            case 28:
                Iterator it = ((androidx.fragment.app.e) this.f729t).f6687n.iterator();
                while (it.hasNext()) {
                    ((I) it.next()).getClass();
                }
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f729t;
                p210v8.i.f(constraintTrackingWorker, "this$0");
                if (constraintTrackingWorker.f7238v.f14401s instanceof p157q1.a) {
                    return;
                }
                String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                p210v8.i.e(q.a(), "get()");
                if (strB == null || strB.length() == 0) {
                    int i14 = p179s1.a.a;
                    p157q1.k kVar = constraintTrackingWorker.f7238v;
                    p210v8.i.e(kVar, "future");
                    kVar.j(new p050f1.l());
                    return;
                }
                p pVarA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f7235s);
                constraintTrackingWorker.f7239w = pVarA;
                if (pVarA == null) {
                    int i15 = p179s1.a.a;
                    p157q1.k kVar2 = constraintTrackingWorker.f7238v;
                    p210v8.i.e(kVar2, "future");
                    kVar2.j(new p050f1.l());
                    return;
                }
                o oVarB = o.b(constraintTrackingWorker.getApplicationContext());
                o1.p pVarV = oVarB.f11499c.v();
                String string = constraintTrackingWorker.getId().toString();
                p210v8.i.e(string, "id.toString()");
                o1.o oVarG = pVarV.g(string);
                if (oVarG == null) {
                    p157q1.k kVar3 = constraintTrackingWorker.f7238v;
                    p210v8.i.e(kVar3, "future");
                    int i16 = p179s1.a.a;
                    kVar3.j(new p050f1.l());
                    return;
                }
                r rVar = oVarB.j;
                p210v8.i.e(rVar, "workManagerImpl.trackers");
                Y1.c cVar5 = new Y1.c(rVar, constraintTrackingWorker);
                cVar5.K(com.bumptech.glide.d.u(oVarG));
                String string2 = constraintTrackingWorker.getId().toString();
                p210v8.i.e(string2, "id.toString()");
                if (!cVar5.j(string2)) {
                    int i17 = p179s1.a.a;
                    p157q1.k kVar4 = constraintTrackingWorker.f7238v;
                    p210v8.i.e(kVar4, "future");
                    kVar4.j(new p050f1.m());
                    return;
                }
                int i18 = p179s1.a.a;
                try {
                    p pVar = constraintTrackingWorker.f7239w;
                    p210v8.i.c(pVar);
                    C3.d dVarStartWork = pVar.startWork();
                    p210v8.i.e(dVarStartWork, "delegate!!.startWork()");
                    dVarStartWork.f(new D4.a(constraintTrackingWorker, 22, dVarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable unused) {
                    int i19 = p179s1.a.a;
                    synchronized (constraintTrackingWorker.f7236t) {
                        try {
                            if (constraintTrackingWorker.f7237u) {
                                p157q1.k kVar5 = constraintTrackingWorker.f7238v;
                                p210v8.i.e(kVar5, "future");
                                kVar5.j(new p050f1.m());
                                return;
                            } else {
                                p157q1.k kVar6 = constraintTrackingWorker.f7238v;
                                p210v8.i.e(kVar6, "future");
                                kVar6.j(new p050f1.l());
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
        }
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f728s = i10;
        this.f729t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(p200u8.a aVar) {
        this.f728s = 0;
        this.f729t = (k) aVar;
    }
}
