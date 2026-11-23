package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f8197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f8199u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8200v;

    static {
        int i10 = zab.a;
    }

    public ApiFeatureRequest(ArrayList arrayList, boolean z6, String str, String str2) {
        Preconditions.i(arrayList);
        this.f8197s = arrayList;
        this.f8198t = z6;
        this.f8199u = str;
        this.f8200v = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f8198t == apiFeatureRequest.f8198t && Objects.a(this.f8197s, apiFeatureRequest.f8197s) && Objects.a(this.f8199u, apiFeatureRequest.f8199u) && Objects.a(this.f8200v, apiFeatureRequest.f8200v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8198t), this.f8197s, this.f8199u, this.f8200v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.h(parcel, 1, this.f8197s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(this.f8198t ? 1 : 0);
        SafeParcelWriter.e(parcel, 3, this.f8199u);
        SafeParcelWriter.e(parcel, 4, this.f8200v);
        SafeParcelWriter.j(parcel, i11);
    }
}
