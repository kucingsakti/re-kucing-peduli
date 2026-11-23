package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayListI = null;
        ArrayList arrayListI2 = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        int iM = 0;
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    arrayListI2 = SafeParcelReader.i(parcel, i10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.e(parcel, i10, Account.CREATOR);
                    break;
                case 4:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 5:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 6:
                    zK3 = SafeParcelReader.k(parcel, i10);
                    break;
                case 7:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case '\b':
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\t':
                    arrayListI = SafeParcelReader.i(parcel, i10, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        HashMap map = new HashMap();
        if (arrayListI != null) {
            for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : arrayListI) {
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f7767t), googleSignInOptionsExtensionParcelable);
            }
        }
        return new GoogleSignInOptions(iM, arrayListI2, account, zK, zK2, zK3, strF, strF2, map, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
