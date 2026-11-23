package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p224x2.k;
import p224x2.l;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class BaseGmsClient<T extends IInterface> {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Feature[] f8045U = new Feature[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p233y2.d f8046A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f8047B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final d f8048C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public IGmsServiceBroker f8051F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ConnectionProgressReportCallbacks f8052G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public IInterface f8053H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public zze f8055J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final BaseConnectionCallbacks f8057L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final BaseOnConnectionFailedListener f8058M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f8059N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f8060O;
    public volatile String P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8068v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f8069w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public zzv f8071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f8072z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile String f8070x = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f8049D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f8050E = new Object();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f8054I = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f8056K = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ConnectionResult f8061Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f8062R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public volatile zzk f8063S = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final AtomicInteger f8064T = new AtomicInteger(0);

    @KeepForSdk
    public interface BaseConnectionCallbacks {
        void onConnected();

        void onConnectionSuspended(int i10);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        void a(ConnectionResult connectionResult);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void a(ConnectionResult connectionResult) {
            boolean zT = connectionResult.T();
            BaseGmsClient baseGmsClient = BaseGmsClient.this;
            if (zT) {
                baseGmsClient.d(null, baseGmsClient.z());
                return;
            }
            BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.f8058M;
            if (baseOnConnectionFailedListener != null) {
                baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
    }

    public BaseGmsClient(Context context, Looper looper, p233y2.d dVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i10, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        Preconditions.j(context, "Context must not be null");
        this.f8072z = context;
        Preconditions.j(looper, "Looper must not be null");
        Preconditions.j(dVar, "Supervisor must not be null");
        this.f8046A = dVar;
        Preconditions.j(googleApiAvailabilityLight, "API availability must not be null");
        this.f8047B = googleApiAvailabilityLight;
        this.f8048C = new d(this, looper);
        this.f8059N = i10;
        this.f8057L = baseConnectionCallbacks;
        this.f8058M = baseOnConnectionFailedListener;
        this.f8060O = str;
    }

    public static /* bridge */ /* synthetic */ void E(BaseGmsClient baseGmsClient) {
        int i10;
        int i11;
        synchronized (baseGmsClient.f8049D) {
            i10 = baseGmsClient.f8056K;
        }
        if (i10 == 3) {
            baseGmsClient.f8062R = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        d dVar = baseGmsClient.f8048C;
        dVar.sendMessage(dVar.obtainMessage(i11, baseGmsClient.f8064T.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean F(BaseGmsClient baseGmsClient, int i10, int i11, IInterface iInterface) {
        synchronized (baseGmsClient.f8049D) {
            try {
                if (baseGmsClient.f8056K != i10) {
                    return false;
                }
                baseGmsClient.G(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IInterface A() {
        IInterface iInterface;
        synchronized (this.f8049D) {
            try {
                if (this.f8056K == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f8053H;
                Preconditions.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String B();

    public abstract String C();

    public boolean D() {
        return i() >= 211700000;
    }

    public final void G(int i10, IInterface iInterface) {
        zzv zzvVar;
        Preconditions.b((i10 == 4) == (iInterface != null));
        synchronized (this.f8049D) {
            try {
                this.f8056K = i10;
                this.f8053H = iInterface;
                if (i10 == 1) {
                    zze zzeVar = this.f8055J;
                    if (zzeVar != null) {
                        p233y2.d dVar = this.f8046A;
                        String str = this.f8071y.a;
                        Preconditions.i(str);
                        this.f8071y.getClass();
                        if (this.f8060O == null) {
                            this.f8072z.getClass();
                        }
                        boolean z6 = this.f8071y.f8185b;
                        dVar.getClass();
                        dVar.c(new zzo(str, z6), zzeVar);
                        this.f8055J = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    zze zzeVar2 = this.f8055J;
                    if (zzeVar2 != null && (zzvVar = this.f8071y) != null) {
                        String str2 = zzvVar.a;
                        p233y2.d dVar2 = this.f8046A;
                        Preconditions.i(str2);
                        this.f8071y.getClass();
                        if (this.f8060O == null) {
                            this.f8072z.getClass();
                        }
                        boolean z10 = this.f8071y.f8185b;
                        dVar2.getClass();
                        dVar2.c(new zzo(str2, z10), zzeVar2);
                        this.f8064T.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.f8064T.get());
                    this.f8055J = zzeVar3;
                    String strC = C();
                    boolean zD = D();
                    this.f8071y = new zzv(strC, zD);
                    if (zD && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8071y.a)));
                    }
                    p233y2.d dVar3 = this.f8046A;
                    String str3 = this.f8071y.a;
                    Preconditions.i(str3);
                    this.f8071y.getClass();
                    String name = this.f8060O;
                    if (name == null) {
                        name = this.f8072z.getClass().getName();
                    }
                    if (!dVar3.d(new zzo(str3, this.f8071y.f8185b), zzeVar3, name, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f8071y.a + " on com.google.android.gms");
                        int i11 = this.f8064T.get();
                        zzg zzgVar = new zzg(this, 16);
                        d dVar4 = this.f8048C;
                        dVar4.sendMessage(dVar4.obtainMessage(7, i11, -1, zzgVar));
                    }
                } else if (i10 == 4) {
                    Preconditions.i(iInterface);
                    this.f8067u = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f8049D) {
            z6 = this.f8056K == 4;
        }
        return z6;
    }

    public final void d(IAccountAccessor iAccountAccessor, Set set) {
        Bundle bundleY = y();
        String str = this.P;
        int i10 = GoogleApiAvailabilityLight.a;
        Scope[] scopeArr = GetServiceRequest.f8092G;
        Bundle bundle = new Bundle();
        int i11 = this.f8059N;
        Feature[] featureArr = GetServiceRequest.f8093H;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i10, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f8103v = this.f8072z.getPackageName();
        getServiceRequest.f8106y = bundleY;
        if (set != null) {
            getServiceRequest.f8105x = (Scope[]) set.toArray(new Scope[0]);
        }
        if (s()) {
            Account accountW = w();
            if (accountW == null) {
                accountW = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f8107z = accountW;
            if (iAccountAccessor != null) {
                getServiceRequest.f8104w = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.f8094A = f8045U;
        getServiceRequest.f8095B = x();
        if (this instanceof com.google.android.gms.common.moduleinstall.internal.zaz) {
            getServiceRequest.f8098E = true;
        }
        try {
            synchronized (this.f8050E) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.f8051F;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.D(new zzd(this, this.f8064T.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.f8064T.get();
            d dVar = this.f8048C;
            dVar.sendMessage(dVar.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f8064T.get();
            zzf zzfVar = new zzf(this, 8, null, null);
            d dVar2 = this.f8048C;
            dVar2.sendMessage(dVar2.obtainMessage(1, i13, -1, zzfVar));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i14 = this.f8064T.get();
            zzf zzfVar2 = new zzf(this, 8, null, null);
            d dVar3 = this.f8048C;
            dVar3.sendMessage(dVar3.obtainMessage(1, i14, -1, zzfVar2));
        }
    }

    public final void e(l lVar) {
        lVar.a.f8001m.f7910F.post(new k(lVar));
    }

    public final void f(String str) {
        this.f8070x = str;
        q();
    }

    public final boolean g() {
        return true;
    }

    public int i() {
        return GoogleApiAvailabilityLight.a;
    }

    public final boolean j() {
        boolean z6;
        synchronized (this.f8049D) {
            int i10 = this.f8056K;
            z6 = true;
            if (i10 != 2 && i10 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    public final void k(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.f8049D) {
            i10 = this.f8056K;
            iInterface = this.f8053H;
        }
        synchronized (this.f8050E) {
            iGmsServiceBroker = this.f8051F;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) B()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f8067u > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f8067u;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.f8066t > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f8065s;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.f8066t;
            printWriterAppend2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f8069w > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.a(this.f8068v));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j11 = this.f8069w;
            printWriterAppend3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    public final Feature[] l() {
        zzk zzkVar = this.f8063S;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f8179t;
    }

    public final String m() {
        if (!a() || this.f8071y == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public final String o() {
        return this.f8070x;
    }

    public final void p(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.j(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f8052G = connectionProgressReportCallbacks;
        G(2, null);
    }

    public final void q() {
        this.f8064T.incrementAndGet();
        synchronized (this.f8054I) {
            try {
                int size = this.f8054I.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((zzc) this.f8054I.get(i10)).b();
                }
                this.f8054I.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f8050E) {
            this.f8051F = null;
        }
        G(1, null);
    }

    public final Intent r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean s() {
        return false;
    }

    public final void u() {
        int iB = this.f8047B.b(this.f8072z, i());
        if (iB == 0) {
            p(new LegacyClientCallbackAdapter());
            return;
        }
        G(1, null);
        this.f8052G = new LegacyClientCallbackAdapter();
        int i10 = this.f8064T.get();
        d dVar = this.f8048C;
        dVar.sendMessage(dVar.obtainMessage(3, i10, iB, null));
    }

    public abstract IInterface v(IBinder iBinder);

    public Account w() {
        return null;
    }

    public Feature[] x() {
        return f8045U;
    }

    public Bundle y() {
        return new Bundle();
    }

    public Set z() {
        return Collections.EMPTY_SET;
    }
}
