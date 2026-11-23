package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                SafeParcelReader.q(parcel, i10);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, i10, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallIntentResponse[i10];
    }
}
