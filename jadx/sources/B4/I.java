package B4;

import O3.C0344b;
import U.j0;
import U.n0;
import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.aheaditec.talsec.security.t2;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C0588p;
import com.google.android.gms.internal.measurement.zzac;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbc;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zzkj;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import com.kcstream.cing.MainApp;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;
import p188t1.C0841d;
import p188t1.C0861y;
import p188t1.EnumC0840c;
import p188t1.V;
import p188t1.i0;
import p188t1.o0;
import p188t1.p0;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f633v;

    public /* synthetic */ I(int i10) {
        this.f630s = i10;
    }

    private final void a() {
        synchronized (((AtomicReference) this.f631t)) {
            try {
                try {
                    if (!((zzkx) this.f633v).U0().h1().i(zzin.zza.ANALYTICS_STORAGE)) {
                        ((zzkx) this.f633v).i().f9049C.b("Analytics storage consent denied; will not get app instance id");
                        ((zzkx) this.f633v).X0().A1(null);
                        ((zzkx) this.f633v).U0().f3152z.b(null);
                        ((AtomicReference) this.f631t).set(null);
                        ((AtomicReference) this.f631t).notify();
                        return;
                    }
                    zzkx zzkxVar = (zzkx) this.f633v;
                    zzfl zzflVar = zzkxVar.f9243v;
                    if (zzflVar == null) {
                        zzkxVar.i().f9056x.b("Failed to get app instance id");
                        ((AtomicReference) this.f631t).notify();
                        return;
                    }
                    ((AtomicReference) this.f631t).set(zzflVar.T((zzo) this.f632u));
                    String str = (String) ((AtomicReference) this.f631t).get();
                    if (str != null) {
                        ((zzkx) this.f633v).X0().A1(str);
                        ((zzkx) this.f633v).U0().f3152z.b(str);
                    }
                    ((zzkx) this.f633v).o1();
                    ((AtomicReference) this.f631t).notify();
                } catch (RemoteException e10) {
                    ((zzkx) this.f633v).i().f9056x.a(e10, "Failed to get app instance id");
                    ((AtomicReference) this.f631t).notify();
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f631t).notify();
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((V3.b) ((J4.c) this.f631t).f2406b).a) {
            Iterator it = ((ArrayList) ((V3.b) ((J4.c) this.f631t).f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((N4.e) it.next()).f((DownloadInfo) this.f632u);
            }
        }
    }

    public void c(int i10, IOException iOException, byte[] bArr, Map map) {
        zzhc zzhcVarL = ((zzkj) this.f633v).l();
        zzko zzkoVar = new zzko();
        zzkoVar.f9222s = this;
        zzkoVar.f9223t = i10;
        zzkoVar.f9224u = iOException;
        zzkoVar.f9225v = bArr;
        zzhcVarL.f1(zzkoVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzfi.zzd zzdVar;
        zzbc zzbcVar;
        Map<String, List<String>> headerFields;
        HttpURLConnection httpURLConnection;
        C0588p c0588p;
        S2.d dVar;
        OverScroller overScroller;
        boolean z6;
        int i10 = 2;
        Object objCall = null;
        boolean zBooleanValue = true;
        int responseCode = 0;
        boolean zB = false;
        responseCode = 0;
        responseCode = 0;
        responseCode = 0;
        switch (this.f630s) {
            case 0:
                ((o1.c) this.f633v).t((String) this.f631t, (Map) this.f632u);
                return;
            case 1:
                zzhn zzhnVar = (zzhn) this.f633v;
                zzhnVar.f9150b.b0();
                zzae zzaeVar = (zzae) this.f631t;
                Object objB = zzaeVar.f8888u.b();
                zzo zzoVar = (zzo) this.f632u;
                if (objB == null) {
                    zzhnVar.f9150b.t(zzaeVar, zzoVar);
                    return;
                } else {
                    zzhnVar.f9150b.L(zzaeVar, zzoVar);
                    return;
                }
            case 2:
                zzhn zzhnVar2 = (zzhn) this.f633v;
                zzhnVar2.f9150b.b0();
                zzhnVar2.f9150b.v((zzbd) this.f632u, (String) this.f631t);
                return;
            case 3:
                zzhn zzhnVar3 = (zzhn) this.f633v;
                zzhnVar3.getClass();
                zzbd zzbdVar = (zzbd) this.f631t;
                boolean zEquals = "_cmp".equals(zzbdVar.f8923s);
                zznc zzncVar = zzhnVar3.f9150b;
                if (zEquals && (zzbcVar = zzbdVar.f8924t) != null) {
                    Bundle bundle = zzbcVar.f8922s;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            zzncVar.i().f9050D.a(zzbdVar.toString(), "Event has been filtered ");
                            zzbdVar = new zzbd("_cmpx", zzbdVar.f8924t, zzbdVar.f8925u, zzbdVar.f8926v);
                        }
                    }
                }
                String str = zzbdVar.f8923s;
                zzgt zzgtVar = zzncVar.f9304s;
                zznl zznlVar = zzncVar.f9310y;
                zznc.n(zzgtVar);
                zzo zzoVar2 = (zzo) this.f632u;
                String str2 = zzoVar2.f9350s;
                if (TextUtils.isEmpty(str2) || (zzdVar = (zzfi.zzd) zzgtVar.f9095z.get(str2)) == null || zzdVar.z() == 0) {
                    zzhnVar3.l0(zzbdVar, zzoVar2);
                    return;
                }
                zzfy zzfyVar = zzncVar.i().f9052F;
                String str3 = zzoVar2.f9350s;
                zzfyVar.a(str3, "EES config found for");
                zzgt zzgtVar2 = zzncVar.f9304s;
                zznc.n(zzgtVar2);
                zzb zzbVar = TextUtils.isEmpty(str3) ? null : (zzb) zzgtVar2.f9086B.g(str3);
                if (zzbVar == null) {
                    zzncVar.i().f9052F.a(str3, "EES not loaded for");
                    zzhnVar3.l0(zzbdVar, zzoVar2);
                    return;
                }
                try {
                    zznc.n(zznlVar);
                    HashMap mapQ1 = zznl.q1(zzbdVar.f8924t.T(), true);
                    String strA = zzkq.a(str, zziq.f9180c, zziq.a);
                    if (strA == null) {
                        strA = str;
                    }
                    zB = zzbVar.b(new zzad(strA, zzbdVar.f8926v, mapQ1));
                    break;
                } catch (zzc unused) {
                    zzncVar.i().f9056x.c("EES error. appId, eventName", zzoVar2.f9351t, str);
                }
                if (!zB) {
                    zzncVar.i().f9052F.a(str, "EES was not applied to event");
                    zzhnVar3.l0(zzbdVar, zzoVar2);
                    return;
                }
                zzac zzacVar = zzbVar.f8479c;
                boolean zEquals2 = zzacVar.f8451b.equals(zzacVar.a);
                zzac zzacVar2 = zzbVar.f8479c;
                if (zEquals2) {
                    zzhnVar3.l0(zzbdVar, zzoVar2);
                } else {
                    zzncVar.i().f9052F.a(str, "EES edited event");
                    zznc.n(zznlVar);
                    zzhnVar3.l0(zznl.l1(zzacVar2.f8451b), zzoVar2);
                }
                if (zzbVar.f8479c.f8452c.isEmpty()) {
                    return;
                }
                for (zzad zzadVar : zzacVar2.f8452c) {
                    zzncVar.i().f9052F.a(zzadVar.a, "EES logging created event");
                    zznc.n(zznlVar);
                    zzhnVar3.l0(zznl.l1(zzadVar), zzoVar2);
                }
                return;
            case 4:
                zzhn zzhnVar4 = (zzhn) this.f633v;
                zzhnVar4.f9150b.b0();
                zzno zznoVar = (zzno) this.f631t;
                Object objB2 = zznoVar.b();
                zzo zzoVar3 = (zzo) this.f632u;
                if (objB2 == null) {
                    zzhnVar4.f9150b.z(zznoVar.f9313t, zzoVar3);
                    return;
                } else {
                    zzhnVar4.f9150b.w(zznoVar, zzoVar3);
                    return;
                }
            case 5:
                zzhc zzhcVar = ((zzhj) ((zzkj) this.f633v).f577s).f9116B;
                zzhj.g(zzhcVar);
                zzhcVar.i1();
                try {
                    URL url = (URL) this.f631t;
                    C0588p c0588p2 = zzcq.a;
                    synchronized (zzcq.class) {
                        c0588p = zzcq.a;
                    }
                    c0588p.getClass();
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                        headerFields = httpURLConnection.getHeaderFields();
                        try {
                            byte[] bArrA1 = zzkj.a1(httpURLConnection);
                            httpURLConnection.disconnect();
                            c(responseCode, null, bArrA1, headerFields);
                            return;
                        } catch (IOException e10) {
                            e = e10;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c(responseCode, e, null, headerFields);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c(responseCode, null, null, headerFields);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        headerFields = null;
                    } catch (Throwable th2) {
                        th = th2;
                        headerFields = null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    headerFields = null;
                    httpURLConnection = null;
                } catch (Throwable th3) {
                    th = th3;
                    headerFields = null;
                    httpURLConnection = null;
                }
                break;
            case 6:
                zzo zzoVar4 = (zzo) this.f631t;
                zzdg zzdgVar = (zzdg) this.f632u;
                zzkx zzkxVar = (zzkx) this.f633v;
                try {
                    try {
                        if (!zzkxVar.U0().h1().i(zzin.zza.ANALYTICS_STORAGE)) {
                            zzkxVar.i().f9049C.b("Analytics storage consent denied; will not get app instance id");
                            zzkxVar.X0().A1(null);
                            zzkxVar.U0().f3152z.b(null);
                            zzkxVar.V0().z1(null, zzdgVar);
                            return;
                        }
                        zzfl zzflVar = zzkxVar.f9243v;
                        if (zzflVar == null) {
                            zzkxVar.i().f9056x.b("Failed to get app instance id");
                            zzkxVar.V0().z1(null, zzdgVar);
                            return;
                        }
                        String strT = zzflVar.T(zzoVar4);
                        if (strT != null) {
                            zzkxVar.X0().A1(strT);
                            zzkxVar.U0().f3152z.b(strT);
                        }
                        zzkxVar.o1();
                        zzkxVar.V0().z1(strT, zzdgVar);
                        return;
                    } catch (RemoteException e13) {
                        zzkxVar.i().f9056x.a(e13, "Failed to get app instance id");
                        zzkxVar.V0().z1(null, zzdgVar);
                        return;
                    }
                } catch (Throwable th4) {
                    zzkxVar.V0().z1(null, zzdgVar);
                    throw th4;
                }
            case 7:
                a();
                return;
            case 8:
                zzo zzoVar5 = (zzo) this.f631t;
                zzkx zzkxVar2 = (zzkx) this.f633v;
                zzfl zzflVar2 = zzkxVar2.f9243v;
                if (zzflVar2 == null) {
                    zzkxVar2.i().f9056x.b("Failed to send default event parameters to service");
                    return;
                }
                try {
                    zzflVar2.mo5o((Bundle) this.f632u, zzoVar5);
                    return;
                } catch (RemoteException e14) {
                    zzkxVar2.i().f9056x.a(e14, "Failed to send default event parameters to service");
                    return;
                }
            case 9:
                try {
                    objCall = ((R.d) this.f631t).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f633v).post(new P2.g((R.e) this.f632u, i10, objCall));
                return;
            case 10:
                View view = (View) this.f632u;
                if (view == null || (overScroller = (dVar = (S2.d) this.f633v).f4517v) == null) {
                    return;
                }
                boolean zComputeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f631t;
                if (zComputeScrollOffset) {
                    dVar.A(coordinatorLayout, view, dVar.f4517v.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) dVar).G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f9401C) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                    return;
                }
                return;
            case 11:
                j0.h((View) this.f631t, (o1.e) this.f632u);
                ((ValueAnimator) this.f633v).start();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                U3.c cVar = (U3.c) this.f633v;
                C0344b c0344b = (C0344b) this.f631t;
                cVar.b(c0344b, (TaskCompletionSource) this.f632u);
                ((AtomicInteger) cVar.f4904i.f13639t).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(cVar.f4897b, cVar.a()) * (60000.0d / cVar.a));
                String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
                String str4 = c0344b.f3517b;
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                try {
                    zBooleanValue = ((Boolean) ((p157q1.k) this.f633v).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused4) {
                }
                ((p061g1.e) this.f631t).f((o1.i) this.f632u, zBooleanValue);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f633v;
                Context context = (Context) this.f632u;
                Intent intent = (Intent) this.f631t;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    p050f1.q qVarA = p050f1.q.a();
                    int i11 = ConstraintProxyUpdateReceiver.a;
                    qVarA.getClass();
                    p147p1.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    p147p1.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    p147p1.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    p147p1.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 15:
                b();
                return;
            case 16:
                ((p061g1.o) this.f631t).f11502f.j((p061g1.i) this.f632u, (Y1.c) this.f633v);
                return;
            default:
                p188t1.j0 j0Var = (p188t1.j0) this.f632u;
                j0Var.getClass();
                MainApp mainApp = (MainApp) this.f633v;
                p188t1.B b3 = j0Var.a;
                b3.getClass();
                p188t1.F fB = p204v1.d.b(new p128n2.b(b3, mainApp, mainApp.getPackageManager(), 5));
                p204v1.j jVar = b3.f14969h;
                p204v1.d.f(jVar.f15407c, 1);
                jVar.f15406b.getClass();
                b3.f14968g.j(EnumC0840c.f15020u, fB.a());
                b3.e(p086i8.C.a(p086i8.C.c("1070BDDF03E9C0A083732E0B98486727")), fB);
                if (fB.b()) {
                    b3.c(null, p086i8.C.a(p086i8.C.c("1070BDDF03E9C0A083732E0B98486727")));
                }
                if (fB.a()) {
                    jVar.b(p086i8.C.a(p086i8.C.c("126DBBDD")));
                }
                p188t1.K k3 = j0Var.f15053b;
                k3.getClass();
                p188t1.F fB2 = p204v1.d.b(new E4.B(k3, 17, mainApp));
                p204v1.j jVar2 = k3.f14985h;
                p204v1.d.f(jVar2.f15407c, 2);
                p204v1.e eVar = jVar2.f15406b;
                eVar.a();
                k3.f14984g.j(EnumC0840c.f15021v, fB2.b());
                k3.e(p086i8.C.a(p086i8.C.c("0467B6DC0D")), fB2);
                if (fB2.b()) {
                    k3.c(eVar.a(), p086i8.C.a(p086i8.C.c("0467B6DC0D")));
                }
                if (fB2.a()) {
                    jVar2.a(eVar.a(), p086i8.C.a(p086i8.C.c("0467B6DC0D")));
                }
                j0Var.f15055d.s(mainApp);
                o0 o0Var = j0Var.f15065o;
                if (o0Var != null) {
                    o0Var.d();
                }
                i0 i0Var = (i0) this.f631t;
                if (i0Var != null) {
                    j0Var.f15066p.b();
                    o0 o0Var2 = j0Var.f15065o;
                    if (o0Var2 != null) {
                        o0Var2.getClass();
                        try {
                            if (!i0Var.a()) {
                                i0Var.d();
                            }
                            break;
                        } catch (t2 unused5) {
                        }
                        o0 o0Var3 = j0Var.f15065o;
                        if (((KeyguardManager) o0Var3.f15074c.f12743s).isDeviceSecure()) {
                            try {
                                i0Var.f();
                                z6 = false;
                            } catch (t2 e15) {
                                try {
                                    if (e15.f7584s != -7779) {
                                        throw e15;
                                    }
                                    z6 = true;
                                } catch (t2 unused6) {
                                    z6 = false;
                                }
                            }
                            if (z6) {
                                try {
                                    if (i0Var.a()) {
                                        try {
                                            i0Var.f15042b.deleteEntry((String) i0Var.a.f13641s);
                                        } catch (KeyStoreException e16) {
                                            throw new t2(-7772, p086i8.C.a(p086i8.C.c("2570A6C618A5CAA485621D1A9E493423CBC0A2E513C4371055F4AC3A38A53D5D1463F4CF18EAC8E78D72161B8F426631")), e16);
                                        }
                                    }
                                    if (!i0Var.a()) {
                                        i0Var.d();
                                    }
                                    break;
                                } catch (t2 unused7) {
                                }
                            }
                            o0Var3.b(z6);
                        } else {
                            o0Var3.b(false);
                        }
                    }
                }
                V v4 = j0Var.j;
                v4.getClass();
                p188t1.F fB3 = p204v1.d.b(new E4.B(v4, 19, mainApp));
                p204v1.j jVar3 = v4.f14990g;
                boolean z10 = jVar3.f15406b.a.a;
                v4.e(p086i8.C.a(p086i8.C.c("0467A2E405E1C0")), fB3);
                boolean zB2 = fB3.b();
                p204v1.e eVar2 = jVar3.f15406b;
                if (zB2) {
                    v4.c(!eVar2.a.a ? 0 : 1, p086i8.C.a(p086i8.C.c("0467A2E405E1C0")));
                }
                if (fB3.a()) {
                    jVar3.a(!eVar2.a.a ? 0 : 1, p086i8.C.a(p086i8.C.c("0467A2E405E1C0")));
                }
                C0841d c0841d = j0Var.f15061k;
                c0841d.getClass();
                p188t1.F fB4 = p204v1.d.b(new E4.B(c0841d, 11, mainApp));
                p204v1.j jVar4 = c0841d.f15030g;
                boolean z11 = jVar4.f15406b.a.a;
                c0841d.e(p086i8.C.a(p086i8.C.c("0166B6EC04E4C7AB8373")), fB4);
                boolean zB3 = fB4.b();
                p204v1.e eVar3 = jVar4.f15406b;
                if (zB3) {
                    c0841d.c(!eVar3.a.a ? 0 : 1, p086i8.C.a(p086i8.C.c("0166B6EC04E4C7AB8373")));
                }
                if (fB4.a()) {
                    jVar4.a(!eVar3.a.a ? 0 : 1, p086i8.C.a(p086i8.C.c("0166B6EC04E4C7AB8373")));
                }
                C0861y c0861y = j0Var.f15062l;
                c0861y.getClass();
                p188t1.F fB5 = p204v1.d.b(new E4.B(c0861y, 16, mainApp));
                p204v1.j jVar5 = c0861y.f15137g;
                jVar5.f15406b.getClass();
                c0861y.e(p086i8.C.a(p086i8.C.c("137BA7DD0FE8F397A8")), fB5);
                boolean zB4 = fB5.b();
                p204v1.e eVar4 = jVar5.f15406b;
                if (zB4) {
                    String strA2 = p086i8.C.a(p086i8.C.c("137BA7DD0FE8F397A8"));
                    eVar4.getClass();
                    c0861y.c(1, strA2);
                }
                if (fB5.a()) {
                    eVar4.getClass();
                    jVar5.a(1, p086i8.C.a(p086i8.C.c("137BA7DD0FE8F397A8")));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ I(Object obj, Object obj2, Object obj3, int i10) {
        this.f630s = i10;
        this.f633v = obj;
        this.f631t = obj2;
        this.f632u = obj3;
    }

    public /* synthetic */ I(Object obj, Object obj2, Object obj3, int i10, boolean z6) {
        this.f630s = i10;
        this.f631t = obj;
        this.f632u = obj2;
        this.f633v = obj3;
    }

    public I(zzhn zzhnVar, zzbd zzbdVar, String str) {
        this.f630s = 2;
        this.f632u = zzbdVar;
        this.f631t = str;
        this.f633v = zzhnVar;
    }

    public I(zzkj zzkjVar, String str, URL url, zzhl zzhlVar) {
        this.f630s = 5;
        this.f633v = zzkjVar;
        Preconditions.e(str);
        this.f631t = url;
        this.f632u = zzhlVar;
    }

    public I(p188t1.j0 j0Var, MainApp mainApp) {
        i0 i0VarB;
        this.f630s = 17;
        this.f632u = j0Var;
        this.f633v = mainApp;
        try {
            i0VarB = p0.b();
        } catch (t2 unused) {
            i0VarB = null;
        }
        this.f631t = i0VarB;
    }

    public I(View view, n0 n0Var, o1.e eVar, ValueAnimator valueAnimator) {
        this.f630s = 11;
        this.f631t = view;
        this.f632u = eVar;
        this.f633v = valueAnimator;
    }
}
