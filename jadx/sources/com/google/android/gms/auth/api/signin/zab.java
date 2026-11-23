package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jN = 0;
        int iM = 0;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, i10);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, i10, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\b':
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case '\t':
                    strF6 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\n':
                    arrayListI = SafeParcelReader.i(parcel, i10, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = SafeParcelReader.f(parcel, i10);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strF8 = SafeParcelReader.f(parcel, i10);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new GoogleSignInAccount(iM, strF, strF2, strF3, strF4, uri, strF5, jN, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
