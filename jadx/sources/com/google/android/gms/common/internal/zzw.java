package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends zza implements IAccountAccessor {
    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account a() {
        Parcel parcelG0 = g0(h0(), 2);
        Account account = (Account) com.google.android.gms.internal.common.zzc.a(parcelG0, Account.CREATOR);
        parcelG0.recycle();
        return account;
    }
}
