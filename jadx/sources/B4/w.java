package B4;

import android.content.DialogInterface;
import android.webkit.JsResult;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public final class w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f720t;

    public /* synthetic */ w(B b3, int i10) {
        this.f719s = i10;
        this.f720t = b3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f719s) {
            case 0:
                B b3 = this.f720t;
                DialogInterfaceC0653j dialogInterfaceC0653j = b3.f609g;
                if (dialogInterfaceC0653j != null && dialogInterfaceC0653j.isShowing()) {
                    dialogInterfaceC0653j.dismiss();
                }
                B.n(b3.f607e);
                break;
            case 1:
                B b7 = this.f720t;
                DialogInterfaceC0653j dialogInterfaceC0653j2 = b7.f606d;
                if (dialogInterfaceC0653j2 != null && dialogInterfaceC0653j2.isShowing()) {
                    dialogInterfaceC0653j2.dismiss();
                }
                JsResult jsResult = b7.f608f;
                if (jsResult != null) {
                    jsResult.confirm();
                }
                break;
            default:
                B b10 = this.f720t;
                DialogInterfaceC0653j dialogInterfaceC0653j3 = b10.f606d;
                if (dialogInterfaceC0653j3 != null && dialogInterfaceC0653j3.isShowing()) {
                    dialogInterfaceC0653j3.dismiss();
                }
                B.n(b10.f608f);
                break;
        }
    }
}
