package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@SafeParcelable.Class
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8233u;

    public zal(int i10, String str, ArrayList arrayList) {
        this.f8231s = i10;
        this.f8232t = str;
        this.f8233u = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8231s);
        SafeParcelWriter.e(parcel, 2, this.f8232t);
        SafeParcelWriter.h(parcel, 3, this.f8233u);
        SafeParcelWriter.j(parcel, i11);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f8231s = 1;
        this.f8232t = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f8233u = arrayList;
    }
}
