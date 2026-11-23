package P4;

import android.content.Context;
import p076h8.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final j a = D3.b.s(c.f3896s);

    public static U4.b a() {
        a aVar = (a) a.getValue();
        i.d(aVar, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (U4.b) aVar;
    }

    public static final boolean b(Context context) {
        return ((a) a.getValue()).initWithContext(context, null);
    }
}
