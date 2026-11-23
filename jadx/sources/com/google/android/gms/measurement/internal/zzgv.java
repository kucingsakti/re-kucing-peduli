package com.google.android.gms.measurement.internal;

import M2.C0298g;
import M2.C0309s;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzgv implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzgt f9098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f9099t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0298g c0298gY0 = this.f9098s.Y0();
        String str = this.f9099t;
        C0309s c0309sO1 = c0298gY0.O1(str);
        HashMap map = new HashMap();
        map.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        map.put("package_name", str);
        map.put("gmp_version", 97001L);
        if (c0309sO1 != null) {
            String strH = c0309sO1.h();
            if (strH != null) {
                map.put("app_version", strH);
            }
            map.put("app_version_int", Long.valueOf(c0309sO1.z()));
            map.put("dynamite_version", Long.valueOf(c0309sO1.O()));
        }
        return map;
    }
}
