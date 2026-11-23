package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f9373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9374t;

    public zag(String str, ArrayList arrayList) {
        this.f9373s = arrayList;
        this.f9374t = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return this.f9374t != null ? Status.f7876w : Status.f7879z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.f(parcel, 1, this.f9373s);
        SafeParcelWriter.e(parcel, 2, this.f9374t);
        SafeParcelWriter.j(parcel, i11);
    }
}
