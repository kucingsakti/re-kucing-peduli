package B4;

import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public final class v implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f716s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f718u;

    public v(B b3, EditText editText) {
        this.f718u = b3;
        this.f717t = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f716s) {
            case 0:
                B b3 = (B) this.f718u;
                DialogInterfaceC0653j dialogInterfaceC0653j = b3.f609g;
                if (dialogInterfaceC0653j != null && dialogInterfaceC0653j.isShowing()) {
                    dialogInterfaceC0653j.dismiss();
                }
                JsPromptResult jsPromptResult = b3.f607e;
                if (jsPromptResult != null) {
                    jsPromptResult.confirm(((EditText) this.f717t).getText().toString());
                }
                break;
            default:
                ((CancellationSignal) this.f717t).cancel();
                ((T7.b) this.f718u).c(new BiometricAuthenticationCancelledException());
                break;
        }
    }

    public v(CancellationSignal cancellationSignal, T7.b bVar) {
        this.f717t = cancellationSignal;
        this.f718u = bVar;
    }
}
