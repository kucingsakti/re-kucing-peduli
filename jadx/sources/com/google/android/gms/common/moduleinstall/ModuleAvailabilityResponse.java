package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zaa();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8188t;

    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
    }

    public ModuleAvailabilityResponse(int i10, boolean z6) {
        this.f8187s = z6;
        this.f8188t = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8187s ? 1 : 0);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8188t);
        SafeParcelWriter.j(parcel, i11);
    }
}
