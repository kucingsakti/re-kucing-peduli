package M2;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2963s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zzo f2966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zzkx f2968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2969y;

    public a0(zzkx zzkxVar, String str, String str2, zzo zzoVar, boolean z6, zzdg zzdgVar) {
        this.f2964t = str;
        this.f2965u = str2;
        this.f2966v = zzoVar;
        this.f2967w = z6;
        this.f2969y = zzdgVar;
        this.f2968x = zzkxVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e7 -> B:52:0x00ee). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2963s) {
            case 0:
                zzo zzoVar = this.f2966v;
                String str = this.f2964t;
                zzdg zzdgVar = (zzdg) this.f2969y;
                zzkx zzkxVar = this.f2968x;
                Bundle bundle = new Bundle();
                try {
                    try {
                        zzfl zzflVar = zzkxVar.f9243v;
                        String str2 = this.f2965u;
                        if (zzflVar == null) {
                            zzkxVar.i().f9056x.c("Failed to get user properties; not connected to service", str, str2);
                            zzkxVar.V0().t1(zzdgVar, bundle);
                        } else {
                            bundle = zznp.h1(zzflVar.O(str, str2, this.f2967w, zzoVar));
                            zzkxVar.o1();
                            zzkxVar.V0().t1(zzdgVar, bundle);
                        }
                    } catch (Throwable th) {
                        zzkxVar.V0().t1(zzdgVar, bundle);
                        throw th;
                    }
                } catch (RemoteException e10) {
                    zzkxVar.i().f9056x.c("Failed to get user properties; remote exception", str, e10);
                    zzkxVar.V0().t1(zzdgVar, bundle);
                }
                return;
            default:
                synchronized (((AtomicReference) this.f2969y)) {
                    try {
                        try {
                            zzkx zzkxVar2 = this.f2968x;
                            zzfl zzflVar2 = zzkxVar2.f9243v;
                            if (zzflVar2 == null) {
                                zzkxVar2.i().f9056x.d("(legacy) Failed to get user properties; not connected to service", null, this.f2964t, this.f2965u);
                                ((AtomicReference) this.f2969y).set(Collections.EMPTY_LIST);
                                ((AtomicReference) this.f2969y).notify();
                                return;
                            } else {
                                if (TextUtils.isEmpty(null)) {
                                    ((AtomicReference) this.f2969y).set(zzflVar2.O(this.f2964t, this.f2965u, this.f2967w, this.f2966v));
                                } else {
                                    ((AtomicReference) this.f2969y).set(zzflVar2.H(null, this.f2964t, this.f2965u, this.f2967w));
                                }
                                this.f2968x.o1();
                                ((AtomicReference) this.f2969y).notify();
                                return;
                            }
                        } catch (RemoteException e11) {
                            this.f2968x.i().f9056x.d("(legacy) Failed to get user properties; remote exception", null, this.f2964t, e11);
                            ((AtomicReference) this.f2969y).set(Collections.EMPTY_LIST);
                            ((AtomicReference) this.f2969y).notify();
                        }
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f2969y).notify();
                        throw th2;
                    }
                }
                break;
        }
    }

    public a0(zzkx zzkxVar, AtomicReference atomicReference, String str, String str2, zzo zzoVar, boolean z6) {
        this.f2969y = atomicReference;
        this.f2964t = str;
        this.f2965u = str2;
        this.f2966v = zzoVar;
        this.f2967w = z6;
        this.f2968x = zzkxVar;
    }
}
