package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends zzb implements IAccountAccessor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f8112b = 0;

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
            if (i10 != 2) {
                return false;
            }
            throw null;
        }
    }

    Account a();
}
