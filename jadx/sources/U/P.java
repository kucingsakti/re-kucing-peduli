package U;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0421g b(View view, C0421g c0421g) {
        ContentInfo contentInfoL = c0421g.a.l();
        Objects.requireNonNull(contentInfoL);
        ContentInfo contentInfoI = AbstractC0414c.i(contentInfoL);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoI);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoI ? c0421g : new C0421g(new P0.d(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0433t interfaceC0433t) {
        if (interfaceC0433t == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new Q(interfaceC0433t));
        }
    }
}
