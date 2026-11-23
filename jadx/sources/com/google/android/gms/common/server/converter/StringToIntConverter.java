package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f8206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f8207u;

    @KeepForSdk
    public StringToIntConverter() {
        this.f8205s = 1;
        this.f8206t = new HashMap();
        this.f8207u = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8205s);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f8206t;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        SafeParcelWriter.h(parcel, 2, arrayList);
        SafeParcelWriter.j(parcel, i11);
    }

    public StringToIntConverter(int i10, ArrayList arrayList) {
        this.f8205s = i10;
        this.f8206t = new HashMap();
        this.f8207u = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            String str = zacVar.f8211t;
            int i12 = zacVar.f8212u;
            this.f8206t.put(str, Integer.valueOf(i12));
            this.f8207u.put(i12, str);
        }
    }
}
