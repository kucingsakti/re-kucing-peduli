package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8191t;

    public ModuleInstallResponse(int i10, boolean z6) {
        this.f8190s = i10;
        this.f8191t = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8190s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8191t ? 1 : 0);
        SafeParcelWriter.j(parcel, i11);
    }
}
