package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.service.zam;
import com.google.android.gms.common.internal.service.zao;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class d extends TaskApiCall {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskApiCall.Builder f7934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaskApiCall.Builder builder, Feature[] featureArr, boolean z6) {
        super(featureArr, z6);
        this.f7934c = builder;
    }

    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zam zamVar = this.f7934c.a;
        zamVar.getClass();
        Api api = zao.f8138i;
        com.google.android.gms.common.internal.service.zai zaiVar = (com.google.android.gms.common.internal.service.zai) ((com.google.android.gms.common.internal.service.zap) anyClient).A();
        Parcel parcelG0 = zaiVar.g0();
        com.google.android.gms.internal.base.zac.c(parcelG0, zamVar.a);
        try {
            zaiVar.f8308b.transact(1, parcelG0, null, 1);
            parcelG0.recycle();
            taskCompletionSource.b(null);
        } catch (Throwable th) {
            parcelG0.recycle();
            throw th;
        }
    }
}
