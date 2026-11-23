package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
public class ClientIdentity extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8075t;

    public ClientIdentity(int i10, String str) {
        this.f8074s = i10;
        this.f8075t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f8074s == this.f8074s && Objects.a(clientIdentity.f8075t, this.f8075t);
    }

    public final int hashCode() {
        return this.f8074s;
    }

    public final String toString() {
        return this.f8074s + ":" + this.f8075t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8074s);
        SafeParcelWriter.e(parcel, 2, this.f8075t);
        SafeParcelWriter.j(parcel, i11);
    }
}
