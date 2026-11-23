package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzhb implements z3.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Context f8661s;

    @Override // java.util.function.Supplier
    public final Object get() {
        z3.b bVar;
        z3.b bVarB;
        Context contextCreateDeviceProtectedStorageContext = this.f8661s;
        Object obj = zzgz.f8651f;
        z3.b bVar2 = zzgv.zza.a;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (zzgv.zza.class) {
            try {
                bVar = zzgv.zza.a;
                if (bVar == null) {
                    new zzgv();
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    p212w.e eVar = zzgw.a;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (zzgi.a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        bVarB = zzgv.b(contextCreateDeviceProtectedStorageContext);
                    } else {
                        bVarB = z3.a.f16304s;
                    }
                    bVar = bVarB;
                    zzgv.zza.a = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
