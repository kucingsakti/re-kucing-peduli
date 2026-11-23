package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzc;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
            boolean z6;
            switch (i10) {
                case 2:
                    ObjectWrapper objectWrapperJ = j();
                    parcel2.writeNoException();
                    zzc.c(parcel2, objectWrapperJ);
                    return true;
                case 3:
                    Bundle bundleD = d();
                    parcel2.writeNoException();
                    int i11 = zzc.a;
                    if (bundleD == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        bundleD.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int iA = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(iA);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperE = e();
                    parcel2.writeNoException();
                    zzc.c(parcel2, iFragmentWrapperE);
                    return true;
                case 6:
                    ObjectWrapper objectWrapperG = g();
                    parcel2.writeNoException();
                    zzc.c(parcel2, objectWrapperG);
                    return true;
                case 7:
                    boolean zR = r();
                    parcel2.writeNoException();
                    int i12 = zzc.a;
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                case 8:
                    String strI = i();
                    parcel2.writeNoException();
                    parcel2.writeString(strI);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperF = f();
                    parcel2.writeNoException();
                    zzc.c(parcel2, iFragmentWrapperF);
                    return true;
                case 10:
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 11:
                    boolean zT = t();
                    parcel2.writeNoException();
                    int i13 = zzc.a;
                    parcel2.writeInt(zT ? 1 : 0);
                    return true;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    ObjectWrapper objectWrapperH = h();
                    parcel2.writeNoException();
                    zzc.c(parcel2, objectWrapperH);
                    return true;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    boolean zM = m();
                    parcel2.writeNoException();
                    int i14 = zzc.a;
                    parcel2.writeInt(zM ? 1 : 0);
                    return true;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    boolean zP = p();
                    parcel2.writeNoException();
                    int i15 = zzc.a;
                    parcel2.writeInt(zP ? 1 : 0);
                    return true;
                case 15:
                    boolean zQ = q();
                    parcel2.writeNoException();
                    int i16 = zzc.a;
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case 16:
                    boolean zS = s();
                    parcel2.writeNoException();
                    int i17 = zzc.a;
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 17:
                    boolean zK = k();
                    parcel2.writeNoException();
                    int i18 = zzc.a;
                    parcel2.writeInt(zK ? 1 : 0);
                    return true;
                case 18:
                    boolean zN = n();
                    parcel2.writeNoException();
                    int i19 = zzc.a;
                    parcel2.writeInt(zN ? 1 : 0);
                    return true;
                case 19:
                    boolean zE0 = e0();
                    parcel2.writeNoException();
                    int i20 = zzc.a;
                    parcel2.writeInt(zE0 ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                    zzc.b(parcel);
                    z(iObjectWrapperH0);
                    parcel2.writeNoException();
                    return true;
                case MobileAdsBridge.CODE_21 /* 21 */:
                    int i21 = zzc.a;
                    z6 = parcel.readInt() != 0;
                    zzc.b(parcel);
                    w(z6);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    int i22 = zzc.a;
                    z6 = parcel.readInt() != 0;
                    zzc.b(parcel);
                    B(z6);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int i23 = zzc.a;
                    z6 = parcel.readInt() != 0;
                    zzc.b(parcel);
                    M(z6);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int i24 = zzc.a;
                    z6 = parcel.readInt() != 0;
                    zzc.b(parcel);
                    Y(z6);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.a(parcel, Intent.CREATOR);
                    zzc.b(parcel);
                    U(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.a(parcel, Intent.CREATOR);
                    int i25 = parcel.readInt();
                    zzc.b(parcel);
                    Q(i25, intent2);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperH1 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                    zzc.b(parcel);
                    F(iObjectWrapperH1);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void B(boolean z6);

    void F(IObjectWrapper iObjectWrapper);

    void M(boolean z6);

    void Q(int i10, Intent intent);

    void U(Intent intent);

    void Y(boolean z6);

    int a();

    int c();

    Bundle d();

    IFragmentWrapper e();

    boolean e0();

    IFragmentWrapper f();

    ObjectWrapper g();

    ObjectWrapper h();

    String i();

    ObjectWrapper j();

    boolean k();

    boolean m();

    boolean n();

    boolean p();

    boolean q();

    boolean r();

    boolean s();

    boolean t();

    void w(boolean z6);

    void z(IObjectWrapper iObjectWrapper);
}
