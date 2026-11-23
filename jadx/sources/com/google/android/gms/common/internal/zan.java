package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = -1;
        int iM2 = 0;
        int iM3 = 0;
        int iM4 = 0;
        int iM5 = 0;
        String strF = null;
        String strF2 = null;
        long jN = 0;
        long jN2 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM2 = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    iM3 = SafeParcelReader.m(parcel, i10);
                    break;
                case 3:
                    iM4 = SafeParcelReader.m(parcel, i10);
                    break;
                case 4:
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 5:
                    jN2 = SafeParcelReader.n(parcel, i10);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\b':
                    iM5 = SafeParcelReader.m(parcel, i10);
                    break;
                case '\t':
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new MethodInvocation(iM2, iM3, iM4, jN, jN2, strF, strF2, iM5, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
