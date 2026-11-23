package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f9366X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ClientSettings f9367Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Bundle f9368Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Integer f9369a0;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f9366X = true;
        this.f9367Y = clientSettings;
        this.f9368Z = bundle;
        this.f9369a0 = clientSettings.f8082h;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.signin.zae
    public final void b(zac zacVar) {
        GoogleSignInAccount googleSignInAccountT;
        try {
            Account account = this.f9367Y.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f8072z;
                ReentrantLock reentrantLock = Storage.f7769c;
                Preconditions.i(context);
                ReentrantLock reentrantLock2 = Storage.f7769c;
                reentrantLock2.lock();
                try {
                    if (Storage.f7770d == null) {
                        Storage.f7770d = new Storage(context.getApplicationContext());
                    }
                    Storage storage = Storage.f7770d;
                    reentrantLock2.unlock();
                    String strA = storage.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = storage.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountT = GoogleSignInAccount.T(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountT = null;
                            }
                        }
                    }
                    googleSignInAccountT = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountT = null;
            }
            Integer num = this.f9369a0;
            Preconditions.i(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountT);
            zaf zafVar = (zaf) A();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelG0 = zafVar.g0();
            com.google.android.gms.internal.base.zac.c(parcelG0, zaiVar);
            com.google.android.gms.internal.base.zac.d(parcelG0, zacVar);
            zafVar.h0(parcelG0, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zacVar.K(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void h() {
        try {
            zaf zafVar = (zaf) A();
            Integer num = this.f9369a0;
            Preconditions.i(num);
            int iIntValue = num.intValue();
            Parcel parcelG0 = zafVar.g0();
            parcelG0.writeInt(iIntValue);
            zafVar.h0(parcelG0, 7);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int i() {
        return 12451000;
    }

    @Override // com.google.android.gms.signin.zae
    public final void n(IAccountAccessor iAccountAccessor, boolean z6) {
        try {
            zaf zafVar = (zaf) A();
            Integer num = this.f9369a0;
            Preconditions.i(num);
            int iIntValue = num.intValue();
            Parcel parcelG0 = zafVar.g0();
            com.google.android.gms.internal.base.zac.d(parcelG0, iAccountAccessor);
            parcelG0.writeInt(iIntValue);
            parcelG0.writeInt(z6 ? 1 : 0);
            zafVar.h0(parcelG0, 9);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean s() {
        return this.f9366X;
    }

    @Override // com.google.android.gms.signin.zae
    public final void t() {
        p(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle y() {
        ClientSettings clientSettings = this.f9367Y;
        boolean zEquals = this.f8072z.getPackageName().equals(clientSettings.f8079e);
        Bundle bundle = this.f9368Z;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.f8079e);
        }
        return bundle;
    }
}
