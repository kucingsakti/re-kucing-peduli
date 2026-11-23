package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzac extends zzb implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.b(parcel);
            zzd zzdVar = (zzd) this;
            Preconditions.j(zzdVar.f8171b, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient = zzdVar.f8171b;
            baseGmsClient.getClass();
            zzf zzfVar = new zzf(baseGmsClient, i11, strongBinder, bundle);
            d dVar = baseGmsClient.f8048C;
            dVar.sendMessage(dVar.obtainMessage(1, zzdVar.f8172c, -1, zzfVar));
            zzdVar.f8171b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.zzc.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) com.google.android.gms.internal.common.zzc.a(parcel, zzk.CREATOR);
            com.google.android.gms.internal.common.zzc.b(parcel);
            zzd zzdVar2 = (zzd) this;
            BaseGmsClient baseGmsClient2 = zzdVar2.f8171b;
            Preconditions.j(baseGmsClient2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.i(zzkVar);
            baseGmsClient2.f8063S = zzkVar;
            if (baseGmsClient2 instanceof com.google.android.gms.common.moduleinstall.internal.zaz) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f8181v;
                RootTelemetryConfigManager rootTelemetryConfigManagerA = RootTelemetryConfigManager.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f8086s;
                synchronized (rootTelemetryConfigManagerA) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = RootTelemetryConfigManager.f8124c;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfigManagerA.a;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f8125s < rootTelemetryConfiguration.f8125s) {
                            }
                        }
                        rootTelemetryConfigManagerA.a = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzkVar.f8178s;
            Preconditions.j(zzdVar2.f8171b, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient3 = zzdVar2.f8171b;
            baseGmsClient3.getClass();
            zzf zzfVar2 = new zzf(baseGmsClient3, i12, strongBinder2, bundle2);
            d dVar2 = baseGmsClient3.f8048C;
            dVar2.sendMessage(dVar2.obtainMessage(1, zzdVar2.f8172c, -1, zzfVar2));
            zzdVar2.f8171b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
