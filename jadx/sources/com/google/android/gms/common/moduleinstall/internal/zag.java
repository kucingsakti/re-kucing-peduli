package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag extends com.google.android.gms.internal.base.zab implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        com.google.android.gms.internal.base.zac.b(parcel);
        f0();
        return true;
    }
}
