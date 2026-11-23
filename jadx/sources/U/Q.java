package U;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements OnReceiveContentListener {
    public final InterfaceC0433t a;

    public Q(InterfaceC0433t interfaceC0433t) {
        this.a = interfaceC0433t;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0421g c0421g = new C0421g(new P0.d(contentInfo));
        C0421g c0421gA = ((p000a0.q) this.a).a(view, c0421g);
        if (c0421gA == null) {
            return null;
        }
        if (c0421gA == c0421g) {
            return contentInfo;
        }
        ContentInfo contentInfoL = c0421gA.a.l();
        Objects.requireNonNull(contentInfoL);
        return AbstractC0414c.i(contentInfoL);
    }
}
