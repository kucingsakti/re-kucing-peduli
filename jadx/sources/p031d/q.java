package p031d;

import android.window.OnBackInvokedCallback;
import p078i.D;
import p109l3.b;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10480b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.f10480b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                a aVar = (a) this.f10480b;
                i.f(aVar, "$onBackInvoked");
                aVar.invoke();
                break;
            case 1:
                ((D) this.f10480b).F();
                break;
            case 2:
                ((b) this.f10480b).b();
                break;
            default:
                ((Runnable) this.f10480b).run();
                break;
        }
    }
}
