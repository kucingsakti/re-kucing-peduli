package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Status f7876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f7877x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Status f7878y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Status f7879z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PendingIntent f7882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConnectionResult f7883v;

    static {
        new Status(-1, null, null, null);
        f7876w = new Status(0, null, null, null);
        new Status(14, null, null, null);
        f7877x = new Status(8, null, null, null);
        f7878y = new Status(15, null, null, null);
        f7879z = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new zzb();
    }

    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f7880s = i10;
        this.f7881t = str;
        this.f7882u = pendingIntent;
        this.f7883v = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7880s == status.f7880s && Objects.a(this.f7881t, status.f7881t) && Objects.a(this.f7882u, status.f7882u) && Objects.a(this.f7883v, status.f7883v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7880s), this.f7881t, this.f7882u, this.f7883v});
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status n() {
        return this;
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        String strA = this.f7881t;
        if (strA == null) {
            strA = CommonStatusCodes.a(this.f7880s);
        }
        toStringHelper.a(strA, "statusCode");
        toStringHelper.a(this.f7882u, "resolution");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f7880s);
        SafeParcelWriter.e(parcel, 2, this.f7881t);
        SafeParcelWriter.d(parcel, 3, this.f7882u, i10);
        SafeParcelWriter.d(parcel, 4, this.f7883v, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
