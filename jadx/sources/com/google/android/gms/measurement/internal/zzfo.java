package com.google.android.gms.measurement.internal;

import B4.I;
import C3.c;
import M2.s0;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzfo extends com.google.android.gms.internal.measurement.zzbx implements zzfl {
    public zzfo() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z6;
        ArrayList arrayList;
        switch (i10) {
            case 1:
                zzbd zzbdVar = (zzbd) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbd.CREATOR);
                zzo zzoVar = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).P(zzbdVar, zzoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzno zznoVar = (zzno) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzno.CREATOR);
                zzo zzoVar2 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).A(zznoVar, zzoVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzo zzoVar3 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).b0(zzoVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbd zzbdVar2 = (zzbd) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbd.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                zzhn zzhnVar = (zzhn) this;
                Preconditions.i(zzbdVar2);
                Preconditions.e(string);
                zzhnVar.i0(string, true);
                zzhnVar.k0(new I(zzhnVar, zzbdVar2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                zzo zzoVar4 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).W(zzoVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzo zzoVar5 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                z6 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                zzhn zzhnVar2 = (zzhn) this;
                zzhnVar2.j0(zzoVar5);
                String str = zzoVar5.f9350s;
                Preconditions.i(str);
                zznc zzncVar = zzhnVar2.f9150b;
                try {
                    List<s0> list = (List) zzncVar.l().a1(new M2.I(zzhnVar2, 1, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (s0 s0Var : list) {
                        if (z6 || !zznp.c2(s0Var.f3112c)) {
                            arrayList.add(new zzno(s0Var));
                        }
                        break;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    zzncVar.i().f9056x.c("Failed to get user properties. appId", zzfw.a1(str), e);
                    arrayList = null;
                } catch (ExecutionException e11) {
                    e = e11;
                    zzncVar.i().f9056x.c("Failed to get user properties. appId", zzfw.a1(str), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbd zzbdVar3 = (zzbd) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbd.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                byte[] bArrC = ((zzhn) this).C(zzbdVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrC);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).Z(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzo zzoVar6 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                String strT = ((zzhn) this).T(zzoVar6);
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zzae zzaeVar = (zzae) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzae.CREATOR);
                zzo zzoVar7 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).X(zzaeVar, zzoVar7);
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                zzae zzaeVar2 = (zzae) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzae.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                zzhn zzhnVar3 = (zzhn) this;
                Preconditions.i(zzaeVar2);
                Preconditions.i(zzaeVar2.f8888u);
                Preconditions.e(zzaeVar2.f8886s);
                zzhnVar3.i0(zzaeVar2.f8886s, true);
                zzhnVar3.k0(new c(zzhnVar3, new zzae(zzaeVar2), 13, false));
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbw.a;
                z6 = parcel.readInt() != 0;
                zzo zzoVar8 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                List listO = ((zzhn) this).O(string6, string7, z6, zzoVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.zzbw.a;
                z6 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                List listH = ((zzhn) this).H(string8, string9, string10, z6);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzo zzoVar9 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                List listV = ((zzhn) this).v(string11, string12, zzoVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listV);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                List listC0 = ((zzhn) this).c0(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC0);
                return true;
            case 18:
                zzo zzoVar10 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).y(zzoVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.zzbw.a(parcel, Bundle.CREATOR);
                zzo zzoVar11 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).mo5o(bundle, zzoVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzo zzoVar12 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).I(zzoVar12);
                parcel2.writeNoException();
                return true;
            case MobileAdsBridge.CODE_21 /* 21 */:
                zzo zzoVar13 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                zzaj zzajVarG = ((zzhn) this).G(zzoVar13);
                parcel2.writeNoException();
                if (zzajVarG == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzajVarG.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzo zzoVar14 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.zzbw.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                List listO2 = ((zzhn) this).o(bundle2, zzoVar14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO2);
                return true;
            case 25:
                zzo zzoVar15 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).d0(zzoVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzo zzoVar16 = (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR);
                com.google.android.gms.internal.measurement.zzbw.d(parcel);
                ((zzhn) this).J(zzoVar16);
                parcel2.writeNoException();
                return true;
        }
    }
}
