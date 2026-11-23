package com.google.android.gms.measurement.internal;

import M2.C0303l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbc extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbe();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f8922s;

    public zzbc(Bundle bundle) {
        this.f8922s = bundle;
    }

    public final Double K() {
        return Double.valueOf(this.f8922s.getDouble("value"));
    }

    public final Bundle T() {
        return new Bundle(this.f8922s);
    }

    public final String W() {
        return this.f8922s.getString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        C0303l c0303l = new C0303l(0);
        c0303l.f3047t = this.f8922s.keySet().iterator();
        return c0303l;
    }

    public final String toString() {
        return this.f8922s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.a(parcel, 2, T());
        SafeParcelWriter.j(parcel, i11);
    }
}
