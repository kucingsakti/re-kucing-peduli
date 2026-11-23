package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Account f8152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GoogleSignInAccount f8154v;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f8151s = i10;
        this.f8152t = account;
        this.f8153u = i11;
        this.f8154v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8151s);
        SafeParcelWriter.d(parcel, 2, this.f8152t, i10);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(this.f8153u);
        SafeParcelWriter.d(parcel, 4, this.f8154v, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
