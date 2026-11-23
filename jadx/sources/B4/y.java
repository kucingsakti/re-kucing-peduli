package B4;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f724t;

    public /* synthetic */ y(r rVar, int i10) {
        this.f723s = i10;
        this.f724t = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f723s) {
            case 0:
                this.f724t.handleMessage(Message.obtain((Handler) null, 1));
                break;
            default:
                this.f724t.handleMessage(Message.obtain((Handler) null, -1));
                break;
        }
    }
}
