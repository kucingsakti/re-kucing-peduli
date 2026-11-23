package B4;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f708u;

    public /* synthetic */ r(Object obj, String str, int i10) {
        this.f706s = i10;
        this.f708u = obj;
        this.f707t = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f706s) {
            case 0:
                ((t) this.f708u).b(this.f707t);
                break;
            default:
                if (message.what == 1) {
                    ((D) this.f708u).d(this.f707t);
                }
                break;
        }
        return true;
    }
}
