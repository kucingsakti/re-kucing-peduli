package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: loaded from: classes.dex */
public final class zah extends GmsClient<zal> {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String B() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String C() {
        return "com.google.android.gms.common.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof zal ? (zal) iInterfaceQueryLocalInterface : new zal(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }
}
