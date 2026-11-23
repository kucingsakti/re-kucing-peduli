package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzad implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final zzae createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        String strF = null;
        String strF2 = null;
        zzno zznoVar = null;
        String strF3 = null;
        zzbd zzbdVar = null;
        zzbd zzbdVar2 = null;
        zzbd zzbdVar3 = null;
        long jN = 0;
        long jN2 = 0;
        long jN3 = 0;
        boolean zK = false;
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
                    zznoVar = (zzno) SafeParcelReader.e(parcel, i10, zzno.CREATOR);
                    break;
                case 5:
                    jN = SafeParcelReader.n(parcel, i10);
                    break;
                case 6:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, i10);
                    break;
                case '\b':
                    zzbdVar = (zzbd) SafeParcelReader.e(parcel, i10, zzbd.CREATOR);
                    break;
                case '\t':
                    jN2 = SafeParcelReader.n(parcel, i10);
                    break;
                case '\n':
                    zzbdVar2 = (zzbd) SafeParcelReader.e(parcel, i10, zzbd.CREATOR);
                    break;
                case 11:
                    jN3 = SafeParcelReader.n(parcel, i10);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    zzbdVar3 = (zzbd) SafeParcelReader.e(parcel, i10, zzbd.CREATOR);
                    break;
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new zzae(strF, strF2, zznoVar, jN, zK, strF3, zzbdVar, jN2, zzbdVar2, jN3, zzbdVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i10) {
        return new zzae[i10];
    }
}
