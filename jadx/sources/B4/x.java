package B4;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

/* JADX INFO: loaded from: classes.dex */
public final class x implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SslErrorHandler f722t;

    public /* synthetic */ x(SslErrorHandler sslErrorHandler, int i10) {
        this.f721s = i10;
        this.f722t = sslErrorHandler;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f721s) {
            case 0:
                this.f722t.proceed();
                break;
            default:
                this.f722t.cancel();
                break;
        }
    }
}
