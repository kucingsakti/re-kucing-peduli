package p031d;

import android.window.OnBackInvokedCallback;
import p200u8.a;
import p200u8.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final t a = new t();

    public final OnBackInvokedCallback a(b bVar, b bVar2, a aVar, a aVar2) {
        i.f(bVar, "onBackStarted");
        i.f(bVar2, "onBackProgressed");
        i.f(aVar, "onBackInvoked");
        i.f(aVar2, "onBackCancelled");
        return new s(bVar, bVar2, aVar, aVar2);
    }
}
