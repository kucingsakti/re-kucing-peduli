package p224x2;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class h extends zau {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.f15762b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i10 = message.what;
                zabe zabeVar = (zabe) this.f15762b;
                if (i10 != 1) {
                    if (i10 == 2) {
                        zabe.c(zabeVar);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                ReentrantLock reentrantLock = zabeVar.f7971t;
                reentrantLock.lock();
                try {
                    if (zabeVar.d()) {
                        zabeVar.g();
                        break;
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i11);
                    return;
                }
                j jVar = (j) message.obj;
                zabi zabiVar = (zabi) this.f15762b;
                jVar.getClass();
                zabiVar.f7978b.lock();
                try {
                    if (zabiVar.f7987l == jVar.a) {
                        jVar.a();
                        break;
                    }
                    return;
                } finally {
                    zabiVar.f7978b.unlock();
                }
        }
    }
}
