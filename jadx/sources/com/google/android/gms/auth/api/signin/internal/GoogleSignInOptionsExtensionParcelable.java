package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f7768u;

    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f7766s = i10;
        this.f7767t = i11;
        this.f7768u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7766s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f7767t);
        SafeParcelWriter.a(parcel, 3, this.f7768u);
        SafeParcelWriter.j(parcel, i11);
    }
}
