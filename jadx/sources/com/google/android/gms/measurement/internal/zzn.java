package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final zzo createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolValueOf = null;
        ArrayList arrayListG = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        long jN = 0;
        long jN2 = 0;
        long jN3 = 0;
        long jN4 = 0;
        long jN5 = 0;
        long jN6 = 0;
        long jN7 = 0;
        boolean zK = true;
        boolean zK2 = true;
        boolean zK3 = false;
        int iM = 0;
        boolean zK4 = false;
        boolean zK5 = false;
        int iM2 = 0;
        long jN8 = -2147483648L;
        String strF11 = "";
        String strF12 = strF11;
        String strF13 = strF12;
        String strF14 = strF13;
        int iM3 = 100;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
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
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 7:
                    jN2 = SafeParcelReader.n(parcel, i10);
                    break;
                case '\b':
                    strF5 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\t':
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case '\n':
                    zK3 = SafeParcelReader.k(parcel, i10);
                    break;
                case 11:
                    jN8 = SafeParcelReader.n(parcel, i10);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strF6 = SafeParcelReader.f(parcel, i10);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    jN3 = SafeParcelReader.n(parcel, i10);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    jN4 = SafeParcelReader.n(parcel, i10);
                    break;
                case 15:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 16:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 17:
                case 20:
                case '!':
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
                case 18:
                    zK4 = SafeParcelReader.k(parcel, i10);
                    break;
                case 19:
                    strF7 = SafeParcelReader.f(parcel, i10);
                    break;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    int iP = SafeParcelReader.p(parcel, i10);
                    if (iP != 0) {
                        SafeParcelReader.s(parcel, iP, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jN5 = SafeParcelReader.n(parcel, i10);
                    break;
                case 23:
                    arrayListG = SafeParcelReader.g(parcel, i10);
                    break;
                case 24:
                    strF8 = SafeParcelReader.f(parcel, i10);
                    break;
                case 25:
                    strF11 = SafeParcelReader.f(parcel, i10);
                    break;
                case 26:
                    strF12 = SafeParcelReader.f(parcel, i10);
                    break;
                case 27:
                    strF9 = SafeParcelReader.f(parcel, i10);
                    break;
                case 28:
                    zK5 = SafeParcelReader.k(parcel, i10);
                    break;
                case 29:
                    jN6 = SafeParcelReader.n(parcel, i10);
                    break;
                case 30:
                    iM3 = SafeParcelReader.m(parcel, i10);
                    break;
                case 31:
                    strF13 = SafeParcelReader.f(parcel, i10);
                    break;
                case ' ':
                    iM2 = SafeParcelReader.m(parcel, i10);
                    break;
                case '\"':
                    jN7 = SafeParcelReader.n(parcel, i10);
                    break;
                case '#':
                    strF10 = SafeParcelReader.f(parcel, i10);
                    break;
                case '$':
                    strF14 = SafeParcelReader.f(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzo(strF, strF2, strF3, strF4, jN, jN2, strF5, zK, zK3, jN8, strF6, jN3, jN4, iM, zK2, zK4, strF7, boolValueOf, jN5, arrayListG, strF8, strF11, strF12, strF9, zK5, jN6, iM3, strF13, iM2, jN7, strF10, strF14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i10) {
        return new zzo[i10];
    }
}
