package com.google.android.gms.measurement.internal;

import C3.c;
import M2.C0292a;
import M2.H;
import M2.N;
import M2.P;
import M2.RunnableC0315y;
import M2.S;
import M2.V;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o1.r;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzde {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzhj f8881b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f8882c = new e(0);

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        h0();
        this.f8881b.m().c1(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.p1(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void clearMeasurementEnabled(long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.a1();
        zzivVar.l().f1(new c(zzivVar, null, 17, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        h0();
        this.f8881b.m().f1(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void generateEventId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zznp zznpVar = this.f8881b.f9118D;
        zzhj.e(zznpVar);
        long jH2 = zznpVar.h2();
        h0();
        zznp zznpVar2 = this.f8881b.f9118D;
        zzhj.e(zznpVar2);
        zznpVar2.s1(zzdgVar, jH2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.f1(new H(this, zzdgVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        i0((String) zzivVar.f9208y.get(), zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.f1(new RunnableC0315y((Object) this, (Object) zzdgVar, str, str2, 4));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzks zzksVar = ((zzhj) zzivVar.f577s).f9121G;
        zzhj.f(zzksVar);
        zzkp zzkpVar = zzksVar.f9235u;
        i0(zzkpVar != null ? zzkpVar.f9226b : null, zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzks zzksVar = ((zzhj) zzivVar.f577s).f9121G;
        zzhj.f(zzksVar);
        zzkp zzkpVar = zzksVar.f9235u;
        i0(zzkpVar != null ? zzkpVar.a : null, zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzhj zzhjVar = (zzhj) zzivVar.f577s;
        String strA = zzhjVar.f9141t;
        if (strA == null) {
            try {
                strA = new zzhd(zzhjVar.f9140s, zzhjVar.f9125K).a("google_app_id");
            } catch (IllegalStateException e10) {
                zzfw zzfwVar = zzhjVar.f9115A;
                zzhj.g(zzfwVar);
                zzfwVar.f9056x.a(e10, "getGoogleAppId failed with exception");
                strA = null;
            }
        }
        i0(strA, zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zzhj.f(this.f8881b.f9122H);
        Preconditions.e(str);
        h0();
        zznp zznpVar = this.f8881b.f9118D;
        zzhj.e(zznpVar);
        zznpVar.r1(zzdgVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getSessionId(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.l().f1(new c(zzivVar, zzdgVar, 15, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getTestFlag(com.google.android.gms.internal.measurement.zzdg zzdgVar, int i10) throws RemoteException {
        h0();
        if (i10 == 0) {
            zznp zznpVar = this.f8881b.f9118D;
            zzhj.e(zznpVar);
            zziv zzivVar = this.f8881b.f9122H;
            zzhj.f(zzivVar);
            AtomicReference atomicReference = new AtomicReference();
            zznpVar.z1((String) zzivVar.l().b1(atomicReference, 15000L, "String test flag value", new N(zzivVar, atomicReference, 1)), zzdgVar);
            return;
        }
        if (i10 == 1) {
            zznp zznpVar2 = this.f8881b.f9118D;
            zzhj.e(zznpVar2);
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            zznpVar2.s1(zzdgVar, ((Long) zzivVar2.l().b1(atomicReference2, 15000L, "long test flag value", new N(zzivVar2, atomicReference2, 2))).longValue());
            return;
        }
        if (i10 == 2) {
            zznp zznpVar3 = this.f8881b.f9118D;
            zzhj.e(zznpVar3);
            zziv zzivVar3 = this.f8881b.f9122H;
            zzhj.f(zzivVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) zzivVar3.l().b1(atomicReference3, 15000L, "double test flag value", new N(zzivVar3, atomicReference3, 3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zzdgVar.l(bundle);
                return;
            } catch (RemoteException e10) {
                zzfw zzfwVar = ((zzhj) zznpVar3.f577s).f9115A;
                zzhj.g(zzfwVar);
                zzfwVar.f9047A.a(e10, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            zznp zznpVar4 = this.f8881b.f9118D;
            zzhj.e(zznpVar4);
            zziv zzivVar4 = this.f8881b.f9122H;
            zzhj.f(zzivVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            zznpVar4.r1(zzdgVar, ((Integer) zzivVar4.l().b1(atomicReference4, 15000L, "int test flag value", new N(zzivVar4, atomicReference4, 4))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        zznp zznpVar5 = this.f8881b.f9118D;
        zzhj.e(zznpVar5);
        zziv zzivVar5 = this.f8881b.f9122H;
        zzhj.f(zzivVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        zznpVar5.v1(zzdgVar, ((Boolean) zzivVar5.l().b1(atomicReference5, 15000L, "boolean test flag value", new N(zzivVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void getUserProperties(String str, String str2, boolean z6, com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.f1(new V(this, zzdgVar, str, str2, z6, 1));
    }

    public final void h0() {
        if (this.f8881b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void i0(String str, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        h0();
        zznp zznpVar = this.f8881b.f9118D;
        zzhj.e(zznpVar);
        zznpVar.z1(str, zzdgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void initForTests(Map map) throws RemoteException {
        h0();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdo zzdoVar, long j) throws RemoteException {
        zzhj zzhjVar = this.f8881b;
        if (zzhjVar == null) {
            Context context = (Context) ObjectWrapper.i0(iObjectWrapper);
            Preconditions.i(context);
            this.f8881b = zzhj.c(context, zzdoVar, Long.valueOf(j));
        } else {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        h0();
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.f1(new H(this, zzdgVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z10, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.q1(str, str2, bundle, z6, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j) throws RemoteException {
        h0();
        Preconditions.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbd zzbdVar = new zzbd(str2, new zzbc(bundle), "app", j);
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.f1(new RunnableC0315y(this, zzdgVar, zzbdVar, str, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        h0();
        Object objI0 = iObjectWrapper == null ? null : ObjectWrapper.i0(iObjectWrapper);
        Object objI1 = iObjectWrapper2 == null ? null : ObjectWrapper.i0(iObjectWrapper2);
        Object objI2 = iObjectWrapper3 != null ? ObjectWrapper.i0(iObjectWrapper3) : null;
        zzfw zzfwVar = this.f8881b.f9115A;
        zzhj.g(zzfwVar);
        zzfwVar.d1(i10, true, false, str, objI0, objI1, objI2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws Throwable {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Ia.a aVar = zzivVar.f9204u;
        if (aVar != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
            aVar.onActivityCreated((Activity) ObjectWrapper.i0(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Ia.a aVar = zzivVar.f9204u;
        if (aVar != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
            aVar.onActivityDestroyed((Activity) ObjectWrapper.i0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Ia.a aVar = zzivVar.f9204u;
        if (aVar != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
            aVar.onActivityPaused((Activity) ObjectWrapper.i0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Ia.a aVar = zzivVar.f9204u;
        if (aVar != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
            aVar.onActivityResumed((Activity) ObjectWrapper.i0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Ia.a aVar = zzivVar.f9204u;
        Bundle bundle = new Bundle();
        if (aVar != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
            aVar.onActivitySaveInstanceState((Activity) ObjectWrapper.i0(iObjectWrapper), bundle);
        }
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = this.f8881b.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        if (zzivVar.f9204u != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        if (zzivVar.f9204u != null) {
            zziv zzivVar2 = this.f8881b.f9122H;
            zzhj.f(zzivVar2);
            zzivVar2.u1();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzdg zzdgVar, long j) throws RemoteException {
        h0();
        zzdgVar.l(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        Object c0292a;
        h0();
        synchronized (this.f8882c) {
            try {
                c0292a = (zziu) this.f8882c.get(Integer.valueOf(zzdhVar.b()));
                if (c0292a == null) {
                    c0292a = new C0292a(this, zzdhVar);
                    this.f8882c.put(Integer.valueOf(zzdhVar.b()), c0292a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.a1();
        if (zzivVar.f9206w.add(c0292a)) {
            return;
        }
        zzivVar.i().f9047A.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void resetAnalyticsData(long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.A1(null);
        zzivVar.l().f1(new S(zzivVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        h0();
        if (bundle == null) {
            zzfw zzfwVar = this.f8881b.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9056x.b("Conditional user property must not be null");
        } else {
            zziv zzivVar = this.f8881b.f9122H;
            zzhj.f(zzivVar);
            zzivVar.z1(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzhc zzhcVarL = zzivVar.l();
        zzjb zzjbVar = new zzjb();
        zzjbVar.f9214s = zzivVar;
        zzjbVar.f9215t = bundle;
        zzjbVar.f9216u = j;
        zzhcVarL.g1(zzjbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.g1(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        h0();
        zzks zzksVar = this.f8881b.f9121G;
        zzhj.f(zzksVar);
        Activity activity = (Activity) ObjectWrapper.i0(iObjectWrapper);
        if (!((zzhj) zzksVar.f577s).f9146y.k1()) {
            zzksVar.i().f9049C.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzkp zzkpVar = zzksVar.f9235u;
        if (zzkpVar == null) {
            zzksVar.i().f9049C.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (zzksVar.f9238x.get(activity) == null) {
            zzksVar.i().f9049C.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzksVar.e1(activity.getClass());
        }
        boolean zEquals = Objects.equals(zzkpVar.f9226b, str2);
        boolean zEquals2 = Objects.equals(zzkpVar.a, str);
        if (zEquals && zEquals2) {
            zzksVar.i().f9049C.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ((zzhj) zzksVar.f577s).f9146y.Y0(null, false))) {
            zzksVar.i().f9049C.a(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > ((zzhj) zzksVar.f577s).f9146y.Y0(null, false))) {
            zzksVar.i().f9049C.a(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        zzksVar.i().f9052F.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzkp zzkpVar2 = new zzkp(str, str2, zzksVar.V0().h2());
        zzksVar.f9238x.put(activity, zzkpVar2);
        zzksVar.g1(activity, zzkpVar2, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setDataCollectionEnabled(boolean z6) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.a1();
        zzivVar.l().f1(new P(zzivVar, z6, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setDefaultEventParameters(Bundle bundle) {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzhc zzhcVarL = zzivVar.l();
        zzjc zzjcVar = new zzjc();
        zzjcVar.f9217s = zzivVar;
        zzjcVar.f9218t = bundle2;
        zzhcVarL.f1(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        h0();
        r rVar = new r(this, zzdhVar, 6, false);
        zzhc zzhcVar = this.f8881b.f9116B;
        zzhj.g(zzhcVar);
        if (!zzhcVar.h1()) {
            zzhc zzhcVar2 = this.f8881b.f9116B;
            zzhj.g(zzhcVar2);
            zzhcVar2.f1(new c(this, rVar, 14, false));
            return;
        }
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.W0();
        zzivVar.a1();
        zzir zzirVar = zzivVar.f9205v;
        if (rVar != zzirVar) {
            Preconditions.k("EventInterceptor already set.", zzirVar == null);
        }
        zzivVar.f9205v = rVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdm zzdmVar) throws RemoteException {
        h0();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setMeasurementEnabled(boolean z6, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        Boolean boolValueOf = Boolean.valueOf(z6);
        zzivVar.a1();
        zzivVar.l().f1(new c(zzivVar, boolValueOf, 17, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setMinimumSessionDuration(long j) throws RemoteException {
        h0();
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.l().f1(new S(zzivVar, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzpn.a();
        zzhj zzhjVar = (zzhj) zzivVar.f577s;
        if (zzhjVar.f9146y.h1(null, zzbf.f9010t0)) {
            Uri data = intent.getData();
            if (data == null) {
                zzivVar.i().f9050D.b("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            zzag zzagVar = zzhjVar.f9146y;
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzivVar.i().f9050D.b("Preview Mode was not enabled.");
                zzagVar.f8895u = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzivVar.i().f9050D.a(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
            zzagVar.f8895u = queryParameter2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setUserId(String str, long j) throws RemoteException {
        h0();
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        if (str != null && TextUtils.isEmpty(str)) {
            zzfw zzfwVar = ((zzhj) zzivVar.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.b("User ID must be non-empty or null");
        } else {
            zzhc zzhcVarL = zzivVar.l();
            zzjg zzjgVar = new zzjg();
            zzjgVar.f9220s = zzivVar;
            zzjgVar.f9221t = str;
            zzhcVarL.f1(zzjgVar);
            zzivVar.r1(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z6, long j) throws RemoteException {
        h0();
        Object objI0 = ObjectWrapper.i0(iObjectWrapper);
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.r1(str, str2, objI0, z6, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzdh zzdhVar) throws RemoteException {
        Object c0292a;
        h0();
        synchronized (this.f8882c) {
            c0292a = (zziu) this.f8882c.remove(Integer.valueOf(zzdhVar.b()));
        }
        if (c0292a == null) {
            c0292a = new C0292a(this, zzdhVar);
        }
        zziv zzivVar = this.f8881b.f9122H;
        zzhj.f(zzivVar);
        zzivVar.a1();
        if (zzivVar.f9206w.remove(c0292a)) {
            return;
        }
        zzivVar.i().f9047A.b("OnEventListener had not been registered");
    }
}
