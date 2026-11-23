package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.kcstream.cing.R;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0590q extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f8405z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0590q(zzdq zzdqVar, Object obj, Object obj2, int i10) {
        super(zzdqVar, true);
        this.f8402w = i10;
        this.f8404y = obj;
        this.f8405z = obj2;
        this.f8403x = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        zzdb zzdbVarAsInterface;
        String packageName;
        Bundle bundle;
        switch (this.f8402w) {
            case 0:
                try {
                    ((zzdq) this.f8403x).getClass();
                    Preconditions.i((Context) this.f8404y);
                    zzdq zzdqVar = (zzdq) this.f8403x;
                    Context context = (Context) this.f8404y;
                    zzdqVar.getClass();
                    try {
                        zzdbVarAsInterface = zzde.asInterface(DynamiteModule.c(context, DynamiteModule.f8292c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule.LoadingException e10) {
                        zzdqVar.c(e10, true, false);
                        zzdbVarAsInterface = null;
                    }
                    zzdqVar.f8572h = zzdbVarAsInterface;
                    if (((zzdq) this.f8403x).f8572h != null) {
                        int iA = DynamiteModule.a((Context) this.f8404y, ModuleDescriptor.MODULE_ID);
                        int iD = DynamiteModule.d((Context) this.f8404y, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z6 = iD < iA;
                        long j = iMax;
                        Bundle bundle2 = (Bundle) this.f8405z;
                        Context context2 = (Context) this.f8404y;
                        try {
                            packageName = context2.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                        } catch (Resources.NotFoundException unused) {
                            packageName = context2.getPackageName();
                        }
                        zzdo zzdoVar = new zzdo(97001L, j, z6, null, null, null, bundle2, packageName);
                        zzdb zzdbVar = ((zzdq) this.f8403x).f8572h;
                        Preconditions.i(zzdbVar);
                        zzdbVar.initialize(new ObjectWrapper((Context) this.f8404y), zzdoVar, this.f8407s);
                    } else {
                        Log.w(((zzdq) this.f8403x).a, "Failed to connect to measurement client.");
                    }
                } catch (Exception e11) {
                    ((zzdq) this.f8403x).c(e11, true, false);
                    return;
                }
                break;
            case 1:
                zzdb zzdbVar2 = ((zzdq) this.f8403x).f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.getMaxUserProperties((String) this.f8404y, (zzdc) this.f8405z);
                break;
            case 2:
                if (((Bundle) this.f8405z) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f8405z).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f8405z).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                zzdb zzdbVar3 = ((C0595t) this.f8403x).f8416s.f8572h;
                Preconditions.i(zzdbVar3);
                zzdbVar3.onActivityCreated(new ObjectWrapper((Activity) this.f8404y), bundle, this.f8408t);
                break;
            default:
                zzdb zzdbVar4 = ((C0595t) this.f8403x).f8416s.f8572h;
                Preconditions.i(zzdbVar4);
                zzdbVar4.onActivitySaveInstanceState(new ObjectWrapper((Activity) this.f8404y), (zzdc) this.f8405z, this.f8408t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public void b() {
        switch (this.f8402w) {
            case 1:
                ((zzdc) this.f8405z).l(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590q(C0595t c0595t, Activity activity, zzdc zzdcVar) {
        super(c0595t.f8416s, true);
        this.f8402w = 3;
        this.f8404y = activity;
        this.f8405z = zzdcVar;
        this.f8403x = c0595t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590q(C0595t c0595t, Bundle bundle, Activity activity) {
        super(c0595t.f8416s, true);
        this.f8402w = 2;
        this.f8405z = bundle;
        this.f8404y = activity;
        this.f8403x = c0595t;
    }
}
