package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Scope[] f8092G = new Scope[0];

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Feature[] f8093H = new Feature[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Feature[] f8094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Feature[] f8095B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f8096C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f8097D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8098E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f8099F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f8103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public IBinder f8104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Scope[] f8105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f8106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Account f8107z;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z6, int i13, boolean z10, String str2) {
        scopeArr = scopeArr == null ? f8092G : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f8093H;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f8100s = i10;
        this.f8101t = i11;
        this.f8102u = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f8103v = "com.google.android.gms";
        } else {
            this.f8103v = str;
        }
        if (i10 < 2) {
            Account accountA = null;
            if (iBinder != null) {
                int i14 = IAccountAccessor.Stub.f8112b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IAccountAccessor zzwVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i15 = AccountAccessor.f8044c;
                if (zzwVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountA = zzwVar.a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f8107z = accountA;
        } else {
            this.f8104w = iBinder;
            this.f8107z = account;
        }
        this.f8105x = scopeArr;
        this.f8106y = bundle;
        this.f8094A = featureArr;
        this.f8095B = featureArr2;
        this.f8096C = z6;
        this.f8097D = i13;
        this.f8098E = z10;
        this.f8099F = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzn.a(this, parcel, i10);
    }
}
