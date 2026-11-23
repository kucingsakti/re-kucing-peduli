package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.HashMap;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzde extends zzbx implements zzdb {
    public zzde() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzdd(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean g0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z6;
        zzdg zzdiVar = null;
        zzdg zzdiVar2 = null;
        zzdg zzdiVar3 = null;
        zzdg zzdiVar4 = null;
        zzdh zzdjVar = null;
        zzdh zzdjVar2 = null;
        zzdh zzdjVar3 = null;
        zzdg zzdiVar5 = null;
        zzdg zzdiVar6 = null;
        zzdg zzdiVar7 = null;
        zzdg zzdiVar8 = null;
        zzdg zzdiVar9 = null;
        zzdg zzdiVar10 = null;
        zzdm zzdlVar = null;
        zzdg zzdiVar11 = null;
        zzdg zzdiVar12 = null;
        zzdg zzdiVar13 = null;
        zzdg zzdiVar14 = null;
        zzdg zzdiVar15 = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperH0 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                zzdo zzdoVar = (zzdo) zzbw.a(parcel, zzdo.CREATOR);
                long j = parcel.readLong();
                zzbw.d(parcel);
                initialize(iObjectWrapperH0, zzdoVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                long j10 = parcel.readLong();
                zzbw.d(parcel);
                logEvent(string, string2, bundle, z10, z11, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar = iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzdi(strongBinder);
                }
                zzdg zzdgVar = zzdiVar;
                long j11 = parcel.readLong();
                zzbw.d(parcel);
                logEventAndBundle(string3, string4, bundle2, zzdgVar, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperH1 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                ClassLoader classLoader = zzbw.a;
                z6 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                zzbw.d(parcel);
                setUserProperty(string5, string6, iObjectWrapperH1, z6, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = zzbw.a;
                z6 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar15 = iInterfaceQueryLocalInterface2 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface2 : new zzdi(strongBinder2);
                }
                zzbw.d(parcel);
                getUserProperties(string7, string8, z6, zzdiVar15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar14 = iInterfaceQueryLocalInterface3 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface3 : new zzdi(strongBinder3);
                }
                zzbw.d(parcel);
                getMaxUserProperties(string9, zzdiVar14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                zzbw.d(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                zzbw.d(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                zzbw.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar13 = iInterfaceQueryLocalInterface4 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface4 : new zzdi(strongBinder4);
                }
                zzbw.d(parcel);
                getConditionalUserProperties(string13, string14, zzdiVar13);
                break;
            case 11:
                ClassLoader classLoader3 = zzbw.a;
                z6 = parcel.readInt() != 0;
                long j15 = parcel.readLong();
                zzbw.d(parcel);
                setMeasurementEnabled(z6, j15);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                long j16 = parcel.readLong();
                zzbw.d(parcel);
                resetAnalyticsData(j16);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                long j17 = parcel.readLong();
                zzbw.d(parcel);
                setMinimumSessionDuration(j17);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                long j18 = parcel.readLong();
                zzbw.d(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case 15:
                IObjectWrapper iObjectWrapperH2 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                zzbw.d(parcel);
                setCurrentScreen(iObjectWrapperH2, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar12 = iInterfaceQueryLocalInterface5 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface5 : new zzdi(strongBinder5);
                }
                zzbw.d(parcel);
                getCurrentScreenName(zzdiVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar11 = iInterfaceQueryLocalInterface6 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface6 : new zzdi(strongBinder6);
                }
                zzbw.d(parcel);
                getCurrentScreenClass(zzdiVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdlVar = iInterfaceQueryLocalInterface7 instanceof zzdm ? (zzdm) iInterfaceQueryLocalInterface7 : new zzdl(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                zzbw.d(parcel);
                setInstanceIdProvider(zzdlVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar10 = iInterfaceQueryLocalInterface8 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface8 : new zzdi(strongBinder8);
                }
                zzbw.d(parcel);
                getCachedAppInstanceId(zzdiVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar9 = iInterfaceQueryLocalInterface9 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface9 : new zzdi(strongBinder9);
                }
                zzbw.d(parcel);
                getAppInstanceId(zzdiVar9);
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar8 = iInterfaceQueryLocalInterface10 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface10 : new zzdi(strongBinder10);
                }
                zzbw.d(parcel);
                getGmpAppId(zzdiVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar7 = iInterfaceQueryLocalInterface11 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface11 : new zzdi(strongBinder11);
                }
                zzbw.d(parcel);
                generateEventId(zzdiVar7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                zzbw.d(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case 24:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                zzbw.d(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                IObjectWrapper iObjectWrapperH3 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                zzbw.d(parcel);
                onActivityStarted(iObjectWrapperH3, j22);
                break;
            case 26:
                IObjectWrapper iObjectWrapperH4 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                zzbw.d(parcel);
                onActivityStopped(iObjectWrapperH4, j23);
                break;
            case 27:
                IObjectWrapper iObjectWrapperH5 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbw.d(parcel);
                onActivityCreated(iObjectWrapperH5, bundle5, j24);
                break;
            case 28:
                IObjectWrapper iObjectWrapperH6 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                zzbw.d(parcel);
                onActivityDestroyed(iObjectWrapperH6, j25);
                break;
            case 29:
                IObjectWrapper iObjectWrapperH7 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                zzbw.d(parcel);
                onActivityPaused(iObjectWrapperH7, j26);
                break;
            case 30:
                IObjectWrapper iObjectWrapperH8 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                zzbw.d(parcel);
                onActivityResumed(iObjectWrapperH8, j27);
                break;
            case 31:
                IObjectWrapper iObjectWrapperH9 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar6 = iInterfaceQueryLocalInterface12 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface12 : new zzdi(strongBinder12);
                }
                long j28 = parcel.readLong();
                zzbw.d(parcel);
                onActivitySaveInstanceState(iObjectWrapperH9, zzdiVar6, j28);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar5 = iInterfaceQueryLocalInterface13 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface13 : new zzdi(strongBinder13);
                }
                long j29 = parcel.readLong();
                zzbw.d(parcel);
                performAction(bundle6, zzdiVar5, j29);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperH10 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperH11 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperH12 = IObjectWrapper.Stub.h0(parcel.readStrongBinder());
                zzbw.d(parcel);
                logHealthData(i11, string19, iObjectWrapperH10, iObjectWrapperH11, iObjectWrapperH12);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdjVar3 = iInterfaceQueryLocalInterface14 instanceof zzdh ? (zzdh) iInterfaceQueryLocalInterface14 : new zzdj(strongBinder14);
                }
                zzbw.d(parcel);
                setEventInterceptor(zzdjVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdjVar2 = iInterfaceQueryLocalInterface15 instanceof zzdh ? (zzdh) iInterfaceQueryLocalInterface15 : new zzdj(strongBinder15);
                }
                zzbw.d(parcel);
                registerOnMeasurementEventListener(zzdjVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdjVar = iInterfaceQueryLocalInterface16 instanceof zzdh ? (zzdh) iInterfaceQueryLocalInterface16 : new zzdj(strongBinder16);
                }
                zzbw.d(parcel);
                unregisterOnMeasurementEventListener(zzdjVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(zzbw.a);
                zzbw.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar4 = iInterfaceQueryLocalInterface17 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface17 : new zzdi(strongBinder17);
                }
                int i12 = parcel.readInt();
                zzbw.d(parcel);
                getTestFlag(zzdiVar4, i12);
                break;
            case 39:
                ClassLoader classLoader4 = zzbw.a;
                z6 = parcel.readInt() != 0;
                zzbw.d(parcel);
                setDataCollectionEnabled(z6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar3 = iInterfaceQueryLocalInterface18 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface18 : new zzdi(strongBinder18);
                }
                zzbw.d(parcel);
                isDataCollectionEnabled(zzdiVar3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                zzbw.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                zzbw.d(parcel);
                clearMeasurementEnabled(j30);
                break;
            case 44:
                Bundle bundle8 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                zzbw.d(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbw.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                zzbw.d(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdiVar2 = iInterfaceQueryLocalInterface19 instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface19 : new zzdi(strongBinder19);
                }
                zzbw.d(parcel);
                getSessionId(zzdiVar2);
                break;
            case 48:
                Intent intent = (Intent) zzbw.a(parcel, Intent.CREATOR);
                zzbw.d(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
