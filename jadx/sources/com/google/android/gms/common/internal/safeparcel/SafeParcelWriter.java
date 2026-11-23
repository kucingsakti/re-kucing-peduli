package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static void a(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i11 = i(parcel, i10);
        parcel.writeBundle(bundle);
        j(parcel, i11);
    }

    public static void b(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int i11 = i(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        j(parcel, i11);
    }

    public static void c(Parcel parcel, int i10, Long l4) {
        if (l4 == null) {
            return;
        }
        k(parcel, i10, 8);
        parcel.writeLong(l4.longValue());
    }

    public static void d(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int i12 = i(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        j(parcel, i12);
    }

    public static void e(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int i11 = i(parcel, i10);
        parcel.writeString(str);
        j(parcel, i11);
    }

    public static void f(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i(parcel, i10);
        parcel.writeStringList(list);
        j(parcel, i11);
    }

    public static void g(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int i12 = i(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        j(parcel, i12);
    }

    public static void h(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcelable parcelable = (Parcelable) list.get(i12);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        j(parcel, i11);
    }

    public static int i(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void j(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void k(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
