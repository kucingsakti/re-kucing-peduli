package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new zab();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PendingIntent f8189s;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f8189s = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.d(parcel, 1, this.f8189s, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
