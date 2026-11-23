package K0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class k extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public k(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        p210v8.i.f((e) iInterface, "callback");
        p210v8.i.f(obj, "cookie");
        this.a.f7145t.remove((Integer) obj);
    }
}
