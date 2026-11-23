package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f7830u;

    public Feature(int i10, long j, String str) {
        this.f7828s = str;
        this.f7829t = i10;
        this.f7830u = j;
    }

    public final long K() {
        long j = this.f7830u;
        return j == -1 ? this.f7829t : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f7828s;
            if (((str != null && str.equals(feature.f7828s)) || (str == null && feature.f7828s == null)) && K() == feature.K()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7828s, Long.valueOf(K())});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f7828s, MediationMetaData.KEY_NAME);
        toStringHelper.a(Long.valueOf(K()), MediationMetaData.KEY_VERSION);
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.e(parcel, 1, this.f7828s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f7829t);
        long jK = K();
        SafeParcelWriter.k(parcel, 3, 8);
        parcel.writeLong(jK);
        SafeParcelWriter.j(parcel, i11);
    }

    public Feature(String str, long j) {
        this.f7828s = str;
        this.f7830u = j;
        this.f7829t = -1;
    }
}
