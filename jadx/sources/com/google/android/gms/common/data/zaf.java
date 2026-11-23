package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleB = null;
        int iM = 0;
        int iM2 = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                int iP = SafeParcelReader.p(parcel, i10);
                int iDataPosition = parcel.dataPosition();
                if (iP == 0) {
                    strArr = null;
                } else {
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    parcel.setDataPosition(iDataPosition + iP);
                    strArr = strArrCreateStringArray;
                }
            } else if (c10 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.h(parcel, i10, CursorWindow.CREATOR);
            } else if (c10 == 3) {
                iM2 = SafeParcelReader.m(parcel, i10);
            } else if (c10 == 4) {
                bundleB = SafeParcelReader.b(parcel, i10);
            } else if (c10 != 1000) {
                SafeParcelReader.q(parcel, i10);
            } else {
                iM = SafeParcelReader.m(parcel, i10);
            }
        }
        SafeParcelReader.j(parcel, iR);
        DataHolder dataHolder = new DataHolder(iM, strArr, cursorWindowArr, iM2, bundleB);
        dataHolder.f8034u = new Bundle();
        int i11 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f8033t;
            if (i11 >= strArr2.length) {
                break;
            }
            dataHolder.f8034u.putInt(strArr2[i11], i11);
            i11++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.f8035v;
        dataHolder.f8038y = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i12 = 0; i12 < cursorWindowArr2.length; i12++) {
            dataHolder.f8038y[i12] = numRows;
            numRows += cursorWindowArr2[i12].getNumRows() - (numRows - cursorWindowArr2[i12].getStartPosition());
        }
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
