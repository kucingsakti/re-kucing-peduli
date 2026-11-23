package com.google.firebase.analytics.connector.internal;

import D3.g;
import F3.a;
import F3.b;
import I3.c;
import I3.j;
import I3.k;
import K3.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        p042e4.c cVar2 = (p042e4.c) cVar.a(p042e4.c.class);
        Preconditions.i(gVar);
        Preconditions.i(context);
        Preconditions.i(cVar2);
        Preconditions.i(context.getApplicationContext());
        if (b.f1484c == null) {
            synchronized (b.class) {
                try {
                    if (b.f1484c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f1049b)) {
                            ((k) cVar2).a(new F3.c(0), new p204v1.g(3));
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        b.f1484c = new b(zzdq.a(context, bundle).f8568d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b.f1484c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<I3.b> getComponents() {
        I3.a aVarB = I3.b.b(a.class);
        aVarB.a(j.b(g.class));
        aVarB.a(j.b(Context.class));
        aVarB.a(j.b(p042e4.c.class));
        aVarB.f2016f = new d(4);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), xa.d.g("fire-analytics", "22.0.2"));
    }
}
