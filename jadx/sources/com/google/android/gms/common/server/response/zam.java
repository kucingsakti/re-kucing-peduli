package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@SafeParcelable.Class
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FastJsonResponse.Field f8236u;

    public zam(int i10, String str, FastJsonResponse.Field field) {
        this.f8234s = i10;
        this.f8235t = str;
        this.f8236u = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8234s);
        SafeParcelWriter.e(parcel, 2, this.f8235t);
        SafeParcelWriter.d(parcel, 3, this.f8236u, i10);
        SafeParcelWriter.j(parcel, i11);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f8234s = 1;
        this.f8235t = str;
        this.f8236u = field;
    }
}
