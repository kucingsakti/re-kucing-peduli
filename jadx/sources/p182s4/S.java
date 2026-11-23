package p182s4;

import N9.AbstractC0342z;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import o1.h;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class S implements ServiceConnection {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f14650s;

    public S(h hVar) {
        this.f14650s = hVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h hVar = this.f14650s;
        ((LinkedBlockingDeque) hVar.f13634u).size();
        hVar.f13633t = new Messenger(iBinder);
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) hVar.f13634u).drainTo(arrayList);
        AbstractC0342z.n(AbstractC0342z.b((i) hVar.f13632s), null, new Q(hVar, arrayList, null), 3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h hVar = this.f14650s;
        hVar.f13633t = null;
        hVar.getClass();
    }
}
