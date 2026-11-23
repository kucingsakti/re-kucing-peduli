package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zao;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p212w.f;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Status f7901H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Status f7902I = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Object f7903J = new Object();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static GoogleApiManager f7904K;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f7910F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile boolean f7911G;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TelemetryData f7914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zao f7915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f7916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GoogleApiAvailability f7917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zal f7918y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7912s = 10000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7913t = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicInteger f7919z = new AtomicInteger(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AtomicInteger f7905A = new AtomicInteger(0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ConcurrentHashMap f7906B = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public zaae f7907C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final f f7908D = new f(0);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final f f7909E = new f(0);

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f7911G = true;
        this.f7916w = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.f7910F = zauVar;
        this.f7917x = googleApiAvailability;
        this.f7918y = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (DeviceProperties.f8259d == null) {
            DeviceProperties.f8259d = Boolean.valueOf(PlatformVersion.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DeviceProperties.f8259d.booleanValue()) {
            this.f7911G = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static Status c(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(17, "API: " + apiKey.f7885b.f7848c + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.f7823u, connectionResult);
    }

    public static GoogleApiManager e(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f7903J) {
            try {
                if (f7904K == null) {
                    f7904K = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.b().getLooper(), GoogleApiAvailability.f7832d);
                }
                googleApiManager = f7904K;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    public final boolean a() {
        if (this.f7913t) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f8126t) {
            return false;
        }
        int i10 = this.f7918y.a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean b(ConnectionResult connectionResult, int i10) {
        PendingIntent activity;
        GoogleApiAvailability googleApiAvailability = this.f7917x;
        googleApiAvailability.getClass();
        Context context = this.f7916w;
        if (!InstantApps.a(context)) {
            boolean zK = connectionResult.K();
            int i11 = connectionResult.f7822t;
            if (zK) {
                activity = connectionResult.f7823u;
            } else {
                activity = null;
                Intent intentA = googleApiAvailability.a(i11, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f7860t;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                googleApiAvailability.f(context, i11, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zap.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final zabq d(GoogleApi googleApi) {
        ConcurrentHashMap concurrentHashMap = this.f7906B;
        ApiKey apiKey = googleApi.f7854e;
        zabq zabqVar = (zabq) concurrentHashMap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            concurrentHashMap.put(apiKey, zabqVar);
        }
        if (zabqVar.f7992c.s()) {
            this.f7909E.add(apiKey);
        }
        zabqVar.j();
        return zabqVar;
    }

    public final void f(ConnectionResult connectionResult, int i10) {
        if (b(connectionResult, i10)) {
            return;
        }
        com.google.android.gms.internal.base.zau zauVar = this.f7910F;
        zauVar.sendMessage(zauVar.obtainMessage(5, i10, 0, connectionResult));
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0301  */
    /* JADX WARN: Code duplicated, block: B:156:0x0307  */
    /* JADX WARN: Code duplicated, block: B:158:0x032e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0338  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 com.google.android.gms.common.api.internal.zabq, still in use, count: 2, list:
          (r2v6 com.google.android.gms.common.api.internal.zabq) from 0x02f9: IGET (r2v6 com.google.android.gms.common.api.internal.zabq) A[WRAPPED] (LINE:762) com.google.android.gms.common.api.internal.zabq.h int
          (r2v6 com.google.android.gms.common.api.internal.zabq) from 0x02ff: PHI (r2 I:??) = (r2v3 com.google.android.gms.common.api.internal.zabq), (r2v6 com.google.android.gms.common.api.internal.zabq) binds: [B:152:0x02fe, B:206:0x02ff] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.GoogleApiManager.handleMessage(android.os.Message):boolean");
    }
}
