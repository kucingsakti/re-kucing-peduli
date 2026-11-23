package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        int iM = 0;
        int iM2 = 0;
        int iM3 = 0;
        int iM4 = 0;
        boolean zK = false;
        String strF = null;
        ArrayList arrayListG = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jN = 0;
        long jN2 = 0;
        long jN3 = 0;
        float f10 = 0.0f;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 5:
                    iM3 = SafeParcelReader.m(parcel, i10);
                    break;
                case 6:
                    arrayListG = SafeParcelReader.g(parcel, i10);
                    break;
                case '\b':
                    jN2 = SafeParcelReader.n(parcel, i10);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                case 11:
                    iM2 = SafeParcelReader.m(parcel, i10);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    strF4 = SafeParcelReader.f(parcel, i10);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    iM4 = SafeParcelReader.m(parcel, i10);
                    break;
                case 15:
                    SafeParcelReader.t(parcel, i10, 4);
                    f10 = parcel.readFloat();
                    break;
                case 16:
                    jN3 = SafeParcelReader.n(parcel, i10);
                    break;
                case 17:
                    strF5 = SafeParcelReader.f(parcel, i10);
                    break;
                case 18:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new WakeLockEvent(iM, jN, iM2, strF, iM3, arrayListG, strF2, jN2, iM4, strF3, strF4, f10, jN3, strF5, zK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
