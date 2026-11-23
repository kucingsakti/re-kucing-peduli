package com.google.android.gms.measurement.api;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.BinderC0593s;
import com.google.android.gms.internal.measurement.C0596u;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziu;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class AppMeasurementSdk {
    public final zzdq a;

    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzir {
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zziu {
    }

    public AppMeasurementSdk(zzdq zzdqVar) {
        this.a = zzdqVar;
    }

    public final void a(OnEventListener onEventListener) {
        zzdq zzdqVar = this.a;
        zzdqVar.getClass();
        synchronized (zzdqVar.f8569e) {
            for (int i10 = 0; i10 < zzdqVar.f8569e.size(); i10++) {
                try {
                    if (onEventListener.equals(((Pair) zzdqVar.f8569e.get(i10)).first)) {
                        Log.w(zzdqVar.a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0593s binderC0593s = new BinderC0593s(onEventListener);
            zzdqVar.f8569e.add(new Pair(onEventListener, binderC0593s));
            if (zzdqVar.f8572h != null) {
                try {
                    zzdqVar.f8572h.registerOnMeasurementEventListener(binderC0593s);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(zzdqVar.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzdqVar.b(new C0596u(zzdqVar, binderC0593s, 2));
        }
    }
}
