package Ia;

import B6.d;
import D3.g;
import F3.b;
import M2.RunnableC0293b;
import M2.RunnableC0304m;
import M2.V;
import M2.Z;
import M2.i0;
import Q3.u0;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0597v;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznp;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o1.r;
import p210v8.i;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2217t;

    public /* synthetic */ a(Object obj, int i10) {
        this.f2216s = i10;
        this.f2217t = obj;
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    F3.a aVar = (F3.a) g.c().b(F3.a.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (aVar != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        b bVar = (b) aVar;
                        if (!G3.b.f1692c.contains("fcm")) {
                            zzdq zzdqVar = bVar.a.a;
                            zzdqVar.getClass();
                            zzdqVar.b(new C0597v(zzdqVar, string, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        bVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            u0.i("_no", bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                r rVar = (r) this.f2217t;
                rVar.getClass();
                if (!i.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new IllegalStateException("Must in Main Thread!");
                }
                ((ArrayList) rVar.f13675t).add(new WeakReference(activity));
                return;
            case 1:
                zziv zzivVar = (zziv) this.f2217t;
                try {
                    zzivVar.i().f9052F.b("onActivityCreated");
                    Intent intent = activity.getIntent();
                    if (intent == null) {
                        zzivVar.Y0().f1(activity, bundle);
                        return;
                    }
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (TextUtils.isEmpty(string)) {
                                data = null;
                            } else {
                                data = Uri.parse(string);
                            }
                        } else {
                            data = null;
                        }
                    }
                    Uri uri = data;
                    if (uri == null || !uri.isHierarchical()) {
                        zzivVar.Y0().f1(activity, bundle);
                        return;
                    }
                    zzivVar.V0();
                    String str = zznp.D1(intent) ? "gs" : "auto";
                    String queryParameter = uri.getQueryParameter("referrer");
                    try {
                        try {
                            zzivVar.l().f1(new V(this, bundle == null, uri, str, queryParameter));
                            zzivVar.Y0().f1(activity, bundle);
                            return;
                        } catch (RuntimeException e10) {
                            e = e10;
                            zzivVar.i().f9056x.a(e, "Throwable caught in onActivityCreated");
                            zzivVar.Y0().f1(activity, bundle);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        zzivVar.Y0().f1(activity, bundle);
                        throw th;
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                } catch (Throwable th2) {
                    th = th2;
                    zzivVar.Y0().f1(activity, bundle);
                    throw th;
                }
                zzivVar.i().f9056x.a(e, "Throwable caught in onActivityCreated");
                zzivVar.Y0().f1(activity, bundle);
                return;
            default:
                Intent intent2 = activity.getIntent();
                if (intent2 == null || !((Set) this.f2217t).add(intent2)) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    new Handler(Looper.getMainLooper()).post(new d(this, intent2));
                    return;
                } else {
                    a(intent2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                r rVar = (r) this.f2217t;
                rVar.getClass();
                if (!i.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new IllegalStateException("Must in Main Thread!");
                }
                ArrayList arrayList = (ArrayList) rVar.f13675t;
                for (Object obj : arrayList) {
                    if (((WeakReference) obj).get() == activity) {
                        x.a(arrayList).remove((WeakReference) obj);
                        return;
                    }
                }
                obj = null;
                x.a(arrayList).remove((WeakReference) obj);
                return;
            case 1:
                zzks zzksVarY0 = ((zziv) this.f2217t).Y0();
                synchronized (zzksVarY0.f9234D) {
                    try {
                        if (activity == zzksVarY0.f9239y) {
                            zzksVarY0.f9239y = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (((zzhj) zzksVarY0.f577s).f9146y.k1()) {
                    zzksVarY0.f9238x.remove(activity);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                return;
            case 1:
                zzks zzksVarY0 = ((zziv) this.f2217t).Y0();
                synchronized (zzksVarY0.f9234D) {
                    zzksVarY0.f9233C = false;
                    zzksVarY0.f9240z = true;
                    break;
                }
                ((zzhj) zzksVarY0.f577s).f9120F.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (((zzhj) zzksVarY0.f577s).f9146y.k1()) {
                    zzkp zzkpVarJ1 = zzksVarY0.j1(activity);
                    zzksVarY0.f9236v = zzksVarY0.f9235u;
                    zzksVarY0.f9235u = null;
                    zzksVarY0.l().f1(new RunnableC0293b(zzksVarY0, zzkpVarJ1, jElapsedRealtime, 2));
                } else {
                    zzksVarY0.f9235u = null;
                    zzksVarY0.l().f1(new RunnableC0304m(zzksVarY0, jElapsedRealtime, 1));
                }
                zzmh zzmhVarZ0 = ((zziv) this.f2217t).Z0();
                ((zzhj) zzmhVarZ0.f577s).f9120F.getClass();
                zzmhVarZ0.l().f1(new i0(zzmhVarZ0, SystemClock.elapsedRealtime(), 0));
                return;
            default:
                if (activity.isFinishing()) {
                    ((Set) this.f2217t).remove(activity.getIntent());
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                return;
            case 1:
                zzmh zzmhVarZ0 = ((zziv) this.f2217t).Z0();
                ((zzhj) zzmhVarZ0.f577s).f9120F.getClass();
                zzmhVarZ0.l().f1(new i0(zzmhVarZ0, SystemClock.elapsedRealtime(), 1));
                zzks zzksVarY0 = ((zziv) this.f2217t).Y0();
                synchronized (zzksVarY0.f9234D) {
                    zzksVarY0.f9233C = true;
                    if (activity != zzksVarY0.f9239y) {
                        synchronized (zzksVarY0.f9234D) {
                            zzksVarY0.f9239y = activity;
                            zzksVarY0.f9240z = false;
                            break;
                        }
                        if (((zzhj) zzksVarY0.f577s).f9146y.k1()) {
                            zzksVarY0.f9231A = null;
                            zzksVarY0.l().f1(new Z(zzksVarY0, 1));
                        }
                    }
                }
                if (!((zzhj) zzksVarY0.f577s).f9146y.k1()) {
                    zzksVarY0.f9235u = zzksVarY0.f9231A;
                    zzksVarY0.l().f1(new Z(zzksVarY0, 0));
                    return;
                }
                zzksVarY0.g1(activity, zzksVarY0.j1(activity), false);
                zzb zzbVarM = ((zzhj) zzksVarY0.f577s).m();
                ((zzhj) zzbVarM.f577s).f9120F.getClass();
                zzbVarM.l().f1(new RunnableC0304m(zzbVarM, SystemClock.elapsedRealtime(), 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzkp zzkpVar;
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                break;
            case 1:
                zzks zzksVarY0 = ((zziv) this.f2217t).Y0();
                if (((zzhj) zzksVarY0.f577s).f9146y.k1() && bundle != null && (zzkpVar = (zzkp) zzksVarY0.f9238x.get(activity)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", zzkpVar.f9227c);
                    bundle2.putString(MediationMetaData.KEY_NAME, zzkpVar.a);
                    bundle2.putString("referrer_name", zzkpVar.f9226b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f2216s) {
            case 0:
                i.g(activity, "activity");
                break;
        }
    }

    public a() {
        this.f2216s = 2;
        this.f2217t = Collections.newSetFromMap(new WeakHashMap());
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
