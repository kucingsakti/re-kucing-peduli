package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.internal.common.zzi {
    public final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
        Looper.getMainLooper();
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0180  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.a.f8064T.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                zzc zzcVar = (zzc) message.obj;
                zzcVar.getClass();
                zzcVar.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 1 && i11 != 7) {
            if (i11 == 4) {
                this.a.getClass();
            } else if (i11 == 5) {
            }
            if (!this.a.j()) {
                zzc zzcVar2 = (zzc) message.obj;
                zzcVar2.getClass();
                zzcVar2.c();
                return;
            }
        } else if (!this.a.j()) {
            zzc zzcVar3 = (zzc) message.obj;
            zzcVar3.getClass();
            zzcVar3.c();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.a.f8061Q = new ConnectionResult(message.arg2);
            BaseGmsClient baseGmsClient = this.a;
            if (!baseGmsClient.f8062R && !TextUtils.isEmpty(baseGmsClient.B()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.B());
                    BaseGmsClient baseGmsClient2 = this.a;
                    if (!baseGmsClient2.f8062R) {
                        baseGmsClient2.G(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = this.a.f8061Q;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            this.a.f8052G.a(connectionResult);
            BaseGmsClient baseGmsClient3 = this.a;
            baseGmsClient3.getClass();
            baseGmsClient3.f8068v = connectionResult.f7822t;
            baseGmsClient3.f8069w = System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            ConnectionResult connectionResult2 = this.a.f8061Q;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            this.a.f8052G.a(connectionResult2);
            BaseGmsClient baseGmsClient4 = this.a;
            baseGmsClient4.getClass();
            baseGmsClient4.f8068v = connectionResult2.f7822t;
            baseGmsClient4.f8069w = System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.f8052G.a(connectionResult3);
            BaseGmsClient baseGmsClient5 = this.a;
            baseGmsClient5.getClass();
            baseGmsClient5.f8068v = connectionResult3.f7822t;
            baseGmsClient5.f8069w = System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.a.G(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = this.a.f8057L;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.onConnectionSuspended(message.arg2);
            }
            BaseGmsClient baseGmsClient6 = this.a;
            baseGmsClient6.f8065s = message.arg2;
            baseGmsClient6.f8066t = System.currentTimeMillis();
            BaseGmsClient.F(this.a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.a.a()) {
            zzc zzcVar4 = (zzc) message.obj;
            zzcVar4.getClass();
            zzcVar4.c();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", AbstractC0487g.g(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        zzc zzcVar5 = (zzc) message.obj;
        synchronized (zzcVar5) {
            try {
                bool = zzcVar5.a;
                if (zzcVar5.f8169b) {
                    Log.w("GmsClient", "Callback proxy " + zzcVar5.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            zzcVar5.a();
        }
        synchronized (zzcVar5) {
            zzcVar5.f8169b = true;
        }
        zzcVar5.c();
    }
}
