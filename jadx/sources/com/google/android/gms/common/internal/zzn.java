package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(getServiceRequest.f8100s);
        SafeParcelWriter.k(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.f8101t);
        SafeParcelWriter.k(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.f8102u);
        SafeParcelWriter.e(parcel, 4, getServiceRequest.f8103v);
        SafeParcelWriter.b(parcel, 5, getServiceRequest.f8104w);
        SafeParcelWriter.g(parcel, 6, getServiceRequest.f8105x, i10);
        SafeParcelWriter.a(parcel, 7, getServiceRequest.f8106y);
        SafeParcelWriter.d(parcel, 8, getServiceRequest.f8107z, i10);
        SafeParcelWriter.g(parcel, 10, getServiceRequest.f8094A, i10);
        SafeParcelWriter.g(parcel, 11, getServiceRequest.f8095B, i10);
        SafeParcelWriter.k(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f8096C ? 1 : 0);
        SafeParcelWriter.k(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.f8097D);
        boolean z6 = getServiceRequest.f8098E;
        SafeParcelWriter.k(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        SafeParcelWriter.e(parcel, 15, getServiceRequest.f8099F);
        SafeParcelWriter.j(parcel, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = SafeParcelReader.r(parcel);
        Scope[] scopeArr = GetServiceRequest.f8092G;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f8093H;
        Feature[] featureArr2 = featureArr;
        String strF = null;
        IBinder iBinderL = null;
        Account account = null;
        String strF2 = null;
        int iM = 0;
        int iM2 = 0;
        int iM3 = 0;
        boolean zK = false;
        int iM4 = 0;
        boolean zK2 = false;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM = SafeParcelReader.m(parcel, i10);
                    break;
                case 2:
                    iM2 = SafeParcelReader.m(parcel, i10);
                    break;
                case 3:
                    iM3 = SafeParcelReader.m(parcel, i10);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i10);
                    break;
                case 5:
                    iBinderL = SafeParcelReader.l(parcel, i10);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.h(parcel, i10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, i10);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, i10, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.q(parcel, i10);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.h(parcel, i10, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.h(parcel, i10, Feature.CREATOR);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    zK = SafeParcelReader.k(parcel, i10);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iM4 = SafeParcelReader.m(parcel, i10);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zK2 = SafeParcelReader.k(parcel, i10);
                    break;
                case 15:
                    strF2 = SafeParcelReader.f(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.j(parcel, iR);
        return new GetServiceRequest(iM, iM2, iM3, strF, iBinderL, scopeArr, bundle, account, featureArr, featureArr2, zK, iM4, zK2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
