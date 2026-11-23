package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.TimeUnit;
import o1.k;
import p196u2.b;
import p196u2.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzj implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f7802s;

    public /* synthetic */ zzj(b bVar) {
        this.f7802s = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final b bVar = this.f7802s;
            synchronized (bVar) {
                try {
                    if (bVar.f15292s != 2) {
                        return;
                    }
                    if (bVar.f15295v.isEmpty()) {
                        bVar.c();
                        return;
                    }
                    final c cVar = (c) bVar.f15295v.poll();
                    bVar.f15296w.put(cVar.a, cVar);
                    bVar.f15297x.f7809b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                        @Override // java.lang.Runnable
                        public final void run() {
                            b bVar2 = bVar;
                            int i10 = cVar.a;
                            synchronized (bVar2) {
                                c cVar2 = (c) bVar2.f15296w.get(i10);
                                if (cVar2 != null) {
                                    Log.w("MessengerIpcClient", "Timing out request: " + i10);
                                    bVar2.f15296w.remove(i10);
                                    cVar2.b(new zzt("Timed out waiting for response", null));
                                    bVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(cVar));
                    }
                    zzv zzvVar = bVar.f15297x;
                    Messenger messenger = bVar.f15293t;
                    int i10 = cVar.f15299c;
                    Context context = zzvVar.a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = cVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", cVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(JsonStorageKeyNames.DATA_KEY, cVar.f15300d);
                    messageObtain.setData(bundle);
                    try {
                        k kVar = bVar.f15294u;
                        Messenger messenger2 = (Messenger) kVar.f13638s;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = (zzd) kVar.f13639t;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f7789s;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        bVar.a(e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
